/*
 * Copyright (c) 2012, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.gemoc.miniexpr.runtime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;

import org.gemoc.miniexpr.MiniExprLanguage;
import org.graalvm.polyglot.Context;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.library.ExportLibrary;
import com.oracle.truffle.api.library.ExportMessage;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.object.Layout;
import com.oracle.truffle.api.source.Source;

public final class MiniExprContext {

	static final Layout LAYOUT = Layout.createLayout();

	private final Env env;
	private final BufferedReader input;
	private final PrintWriter output;
	private final Iterable<Scope> topScopes;

	public MiniExprContext(TruffleLanguage.Env env) {
		this.env = env;
		this.input = new BufferedReader(new InputStreamReader(env.in()));
		this.output = new PrintWriter(env.out(), true);
		this.topScopes = Collections.singleton(Scope.newBuilder("global", new GlobalObject()).build());
	}

	public Env getEnv() {
		return env;
	}

	public BufferedReader getInput() {
		return input;
	}

	public PrintWriter getOutput() {
		return output;
	}

	public Iterable<Scope> getTopScopes() {
		return topScopes;
	}

	public static NodeInfo lookupNodeInfo(Class<?> clazz) {
		if (clazz == null) {
			return null;
		}
		NodeInfo info = clazz.getAnnotation(NodeInfo.class);
		if (info != null) {
			return info;
		} else {
			return lookupNodeInfo(clazz.getSuperclass());
		}
	}

	public static Object fromForeignValue(Object a) {
		if (a instanceof Long || a instanceof Double || a instanceof Boolean) {
			return a;
		} else if (a instanceof Character) {
			return fromForeignCharacter((Character) a);
		} else if (a instanceof Number) {
			return fromForeignNumber(a);
		} else if (a instanceof TruffleObject) {
			return a;
		} else if (a instanceof MiniExprContext) {
			return a;
		}
		CompilerDirectives.transferToInterpreter();
		throw new IllegalStateException(a + " is not a Truffle value");
	}

	@TruffleBoundary
	private static double fromForeignNumber(Object a) {
		return ((Number) a).doubleValue();
	}

	@TruffleBoundary
	private static String fromForeignCharacter(char c) {
		return String.valueOf(c);
	}

	public CallTarget parse(Source source) {
		return env.parsePublic(source);
	}

	/**
	 * Returns an object that contains bindings that were exported across all used
	 * languages. To read or write from this object the {@link TruffleObject
	 * interop} API can be used.
	 */
	public TruffleObject getPolyglotBindings() {
		return (TruffleObject) env.getPolyglotBindings();
	}

	public static MiniExprContext getCurrent() {
		return MiniExprLanguage.getCurrentContext();
	}

	@ExportLibrary(InteropLibrary.class)
	static final class GlobalObject extends HashMap<String, Object> implements TruffleObject {

		private static final long serialVersionUID = -1819761630725295341L;

		@ExportMessage
		public boolean hasMembers() {
			return true;
		}

		@ExportMessage
		@TruffleBoundary
		boolean isMemberReadable(String member) {
			return containsKey(member);
		}

		@ExportMessage
		boolean isMemberModifiable(String member) {
			return true;
		}

		@ExportMessage
		boolean isMemberInsertable(String member) {
			return true;
		}

		@ExportMessage
		@TruffleBoundary
		public final Object getMembers(boolean includeInternal) {
			return Context.getCurrent().asValue(keySet());
		}

		@ExportMessage
		@TruffleBoundary
		public Object readMember(String member) {
			return get(member);
		}

		@ExportMessage
		@TruffleBoundary
		public void writeMember(String member, Object value) {
			put(member, value);
		}
		
	}

}
