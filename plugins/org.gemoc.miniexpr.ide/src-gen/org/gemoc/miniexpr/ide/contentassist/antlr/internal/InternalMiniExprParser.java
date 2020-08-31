package org.gemoc.miniexpr.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gemoc.miniexpr.services.MiniExprGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniExprParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'false'", "'?'", "':'", "'('", "')'", "'-'", "'!'", "'['", "']'", "','", "'.'", "'|'", "'||'", "'&&'", "'+'", "'*'", "'/'", "'%'", "'true'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_NUMBER=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMiniExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniExprParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniExpr.g"; }


    	private MiniExprGrammarAccess grammarAccess;

    	public void setGrammarAccess(MiniExprGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMiniExpr.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMiniExpr.g:55:1: ( ruleModel EOF )
            // InternalMiniExpr.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMiniExpr.g:63:1: ruleModel : ( ( rule__Model__ExpressionsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:67:2: ( ( ( rule__Model__ExpressionsAssignment )* ) )
            // InternalMiniExpr.g:68:2: ( ( rule__Model__ExpressionsAssignment )* )
            {
            // InternalMiniExpr.g:68:2: ( ( rule__Model__ExpressionsAssignment )* )
            // InternalMiniExpr.g:69:3: ( rule__Model__ExpressionsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getExpressionsAssignment()); 
            }
            // InternalMiniExpr.g:70:3: ( rule__Model__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_NUMBER && LA1_0<=RULE_ID)||LA1_0==18||LA1_0==21||(LA1_0>=23 && LA1_0<=25)||LA1_0==29||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniExpr.g:70:4: rule__Model__ExpressionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ExpressionsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getExpressionsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniExpr.g:79:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniExpr.g:80:1: ( ruleExpression EOF )
            // InternalMiniExpr.g:81:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniExpr.g:88:1: ruleExpression : ( ruleContractedIf ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:92:2: ( ( ruleContractedIf ) )
            // InternalMiniExpr.g:93:2: ( ruleContractedIf )
            {
            // InternalMiniExpr.g:93:2: ( ruleContractedIf )
            // InternalMiniExpr.g:94:3: ruleContractedIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getContractedIfParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleContractedIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getContractedIfParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleContractedIf"
    // InternalMiniExpr.g:104:1: entryRuleContractedIf : ruleContractedIf EOF ;
    public final void entryRuleContractedIf() throws RecognitionException {
        try {
            // InternalMiniExpr.g:105:1: ( ruleContractedIf EOF )
            // InternalMiniExpr.g:106:1: ruleContractedIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleContractedIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContractedIf"


    // $ANTLR start "ruleContractedIf"
    // InternalMiniExpr.g:113:1: ruleContractedIf : ( ( rule__ContractedIf__Group__0 ) ) ;
    public final void ruleContractedIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:117:2: ( ( ( rule__ContractedIf__Group__0 ) ) )
            // InternalMiniExpr.g:118:2: ( ( rule__ContractedIf__Group__0 ) )
            {
            // InternalMiniExpr.g:118:2: ( ( rule__ContractedIf__Group__0 ) )
            // InternalMiniExpr.g:119:3: ( rule__ContractedIf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getGroup()); 
            }
            // InternalMiniExpr.g:120:3: ( rule__ContractedIf__Group__0 )
            // InternalMiniExpr.g:120:4: rule__ContractedIf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContractedIf"


    // $ANTLR start "entryRuleOr"
    // InternalMiniExpr.g:129:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMiniExpr.g:130:1: ( ruleOr EOF )
            // InternalMiniExpr.g:131:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMiniExpr.g:138:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:142:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMiniExpr.g:143:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMiniExpr.g:143:2: ( ( rule__Or__Group__0 ) )
            // InternalMiniExpr.g:144:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalMiniExpr.g:145:3: ( rule__Or__Group__0 )
            // InternalMiniExpr.g:145:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMiniExpr.g:154:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMiniExpr.g:155:1: ( ruleAnd EOF )
            // InternalMiniExpr.g:156:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMiniExpr.g:163:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:167:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMiniExpr.g:168:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMiniExpr.g:168:2: ( ( rule__And__Group__0 ) )
            // InternalMiniExpr.g:169:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalMiniExpr.g:170:3: ( rule__And__Group__0 )
            // InternalMiniExpr.g:170:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMiniExpr.g:179:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalMiniExpr.g:180:1: ( ruleEquality EOF )
            // InternalMiniExpr.g:181:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMiniExpr.g:188:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:192:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalMiniExpr.g:193:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalMiniExpr.g:193:2: ( ( rule__Equality__Group__0 ) )
            // InternalMiniExpr.g:194:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalMiniExpr.g:195:3: ( rule__Equality__Group__0 )
            // InternalMiniExpr.g:195:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMiniExpr.g:204:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMiniExpr.g:205:1: ( ruleComparison EOF )
            // InternalMiniExpr.g:206:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiniExpr.g:213:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:217:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMiniExpr.g:218:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMiniExpr.g:218:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMiniExpr.g:219:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalMiniExpr.g:220:3: ( rule__Comparison__Group__0 )
            // InternalMiniExpr.g:220:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMiniExpr.g:229:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMiniExpr.g:230:1: ( rulePlusOrMinus EOF )
            // InternalMiniExpr.g:231:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMiniExpr.g:238:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:242:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMiniExpr.g:243:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMiniExpr.g:243:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMiniExpr.g:244:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalMiniExpr.g:245:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMiniExpr.g:245:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMiniExpr.g:254:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalMiniExpr.g:255:1: ( ruleMulOrDiv EOF )
            // InternalMiniExpr.g:256:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMiniExpr.g:263:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:267:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalMiniExpr.g:268:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalMiniExpr.g:268:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalMiniExpr.g:269:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalMiniExpr.g:270:3: ( rule__MulOrDiv__Group__0 )
            // InternalMiniExpr.g:270:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleModulo"
    // InternalMiniExpr.g:279:1: entryRuleModulo : ruleModulo EOF ;
    public final void entryRuleModulo() throws RecognitionException {
        try {
            // InternalMiniExpr.g:280:1: ( ruleModulo EOF )
            // InternalMiniExpr.g:281:1: ruleModulo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModulo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMiniExpr.g:288:1: ruleModulo : ( ( rule__Modulo__Group__0 ) ) ;
    public final void ruleModulo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:292:2: ( ( ( rule__Modulo__Group__0 ) ) )
            // InternalMiniExpr.g:293:2: ( ( rule__Modulo__Group__0 ) )
            {
            // InternalMiniExpr.g:293:2: ( ( rule__Modulo__Group__0 ) )
            // InternalMiniExpr.g:294:3: ( rule__Modulo__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getGroup()); 
            }
            // InternalMiniExpr.g:295:3: ( rule__Modulo__Group__0 )
            // InternalMiniExpr.g:295:4: rule__Modulo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniExpr.g:304:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMiniExpr.g:305:1: ( rulePrimary EOF )
            // InternalMiniExpr.g:306:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniExpr.g:313:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:317:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMiniExpr.g:318:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMiniExpr.g:318:2: ( ( rule__Primary__Alternatives ) )
            // InternalMiniExpr.g:319:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalMiniExpr.g:320:3: ( rule__Primary__Alternatives )
            // InternalMiniExpr.g:320:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMiniExpr.g:329:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalMiniExpr.g:330:1: ( ruleAtomic EOF )
            // InternalMiniExpr.g:331:1: ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMiniExpr.g:338:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:342:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalMiniExpr.g:343:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalMiniExpr.g:343:2: ( ( rule__Atomic__Alternatives ) )
            // InternalMiniExpr.g:344:3: ( rule__Atomic__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives()); 
            }
            // InternalMiniExpr.g:345:3: ( rule__Atomic__Alternatives )
            // InternalMiniExpr.g:345:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleRef"
    // InternalMiniExpr.g:354:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // InternalMiniExpr.g:355:1: ( ruleRef EOF )
            // InternalMiniExpr.g:356:1: ruleRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalMiniExpr.g:363:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:367:2: ( ( ( rule__Ref__Group__0 ) ) )
            // InternalMiniExpr.g:368:2: ( ( rule__Ref__Group__0 ) )
            {
            // InternalMiniExpr.g:368:2: ( ( rule__Ref__Group__0 ) )
            // InternalMiniExpr.g:369:3: ( rule__Ref__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getGroup()); 
            }
            // InternalMiniExpr.g:370:3: ( rule__Ref__Group__0 )
            // InternalMiniExpr.g:370:4: rule__Ref__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleSimpleVarRef"
    // InternalMiniExpr.g:379:1: entryRuleSimpleVarRef : ruleSimpleVarRef EOF ;
    public final void entryRuleSimpleVarRef() throws RecognitionException {
        try {
            // InternalMiniExpr.g:380:1: ( ruleSimpleVarRef EOF )
            // InternalMiniExpr.g:381:1: ruleSimpleVarRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSimpleVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleVarRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleVarRef"


    // $ANTLR start "ruleSimpleVarRef"
    // InternalMiniExpr.g:388:1: ruleSimpleVarRef : ( ( rule__SimpleVarRef__TargetAssignment ) ) ;
    public final void ruleSimpleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:392:2: ( ( ( rule__SimpleVarRef__TargetAssignment ) ) )
            // InternalMiniExpr.g:393:2: ( ( rule__SimpleVarRef__TargetAssignment ) )
            {
            // InternalMiniExpr.g:393:2: ( ( rule__SimpleVarRef__TargetAssignment ) )
            // InternalMiniExpr.g:394:3: ( rule__SimpleVarRef__TargetAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleVarRefAccess().getTargetAssignment()); 
            }
            // InternalMiniExpr.g:395:3: ( rule__SimpleVarRef__TargetAssignment )
            // InternalMiniExpr.g:395:4: rule__SimpleVarRef__TargetAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SimpleVarRef__TargetAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleVarRefAccess().getTargetAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleVarRef"


    // $ANTLR start "entryRuleArraySize"
    // InternalMiniExpr.g:404:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // InternalMiniExpr.g:405:1: ( ruleArraySize EOF )
            // InternalMiniExpr.g:406:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalMiniExpr.g:413:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:417:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // InternalMiniExpr.g:418:2: ( ( rule__ArraySize__Group__0 ) )
            {
            // InternalMiniExpr.g:418:2: ( ( rule__ArraySize__Group__0 ) )
            // InternalMiniExpr.g:419:3: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // InternalMiniExpr.g:420:3: ( rule__ArraySize__Group__0 )
            // InternalMiniExpr.g:420:4: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArraySize"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalMiniExpr.g:428:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:432:1: ( ( '==' ) | ( '!=' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMiniExpr.g:433:2: ( '==' )
                    {
                    // InternalMiniExpr.g:433:2: ( '==' )
                    // InternalMiniExpr.g:434:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:439:2: ( '!=' )
                    {
                    // InternalMiniExpr.g:439:2: ( '!=' )
                    // InternalMiniExpr.g:440:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalMiniExpr.g:449:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:453:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMiniExpr.g:454:2: ( '>=' )
                    {
                    // InternalMiniExpr.g:454:2: ( '>=' )
                    // InternalMiniExpr.g:455:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:460:2: ( '<=' )
                    {
                    // InternalMiniExpr.g:460:2: ( '<=' )
                    // InternalMiniExpr.g:461:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniExpr.g:466:2: ( '>' )
                    {
                    // InternalMiniExpr.g:466:2: ( '>' )
                    // InternalMiniExpr.g:467:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniExpr.g:472:2: ( '<' )
                    {
                    // InternalMiniExpr.g:472:2: ( '<' )
                    // InternalMiniExpr.g:473:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalMiniExpr.g:482:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:486:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniExpr.g:487:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMiniExpr.g:487:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalMiniExpr.g:488:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniExpr.g:489:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalMiniExpr.g:489:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:493:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMiniExpr.g:493:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalMiniExpr.g:494:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniExpr.g:495:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalMiniExpr.g:495:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__Alternatives_1_0"
    // InternalMiniExpr.g:503:1: rule__MulOrDiv__Alternatives_1_0 : ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulOrDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:507:1: ( ( ( rule__MulOrDiv__Group_1_0_0__0 ) ) | ( ( rule__MulOrDiv__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniExpr.g:508:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    {
                    // InternalMiniExpr.g:508:2: ( ( rule__MulOrDiv__Group_1_0_0__0 ) )
                    // InternalMiniExpr.g:509:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }
                    // InternalMiniExpr.g:510:3: ( rule__MulOrDiv__Group_1_0_0__0 )
                    // InternalMiniExpr.g:510:4: rule__MulOrDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:514:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    {
                    // InternalMiniExpr.g:514:2: ( ( rule__MulOrDiv__Group_1_0_1__0 ) )
                    // InternalMiniExpr.g:515:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }
                    // InternalMiniExpr.g:516:3: ( rule__MulOrDiv__Group_1_0_1__0 )
                    // InternalMiniExpr.g:516:4: rule__MulOrDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulOrDiv__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMiniExpr.g:524:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:528:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) | ( ruleAtomic ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case RULE_NUMBER:
            case RULE_ID:
            case 18:
            case 25:
            case 29:
            case 36:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMiniExpr.g:529:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMiniExpr.g:529:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMiniExpr.g:530:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalMiniExpr.g:531:3: ( rule__Primary__Group_0__0 )
                    // InternalMiniExpr.g:531:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:535:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMiniExpr.g:535:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMiniExpr.g:536:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalMiniExpr.g:537:3: ( rule__Primary__Group_1__0 )
                    // InternalMiniExpr.g:537:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniExpr.g:541:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMiniExpr.g:541:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMiniExpr.g:542:3: ( rule__Primary__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }
                    // InternalMiniExpr.g:543:3: ( rule__Primary__Group_2__0 )
                    // InternalMiniExpr.g:543:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniExpr.g:547:2: ( ruleAtomic )
                    {
                    // InternalMiniExpr.g:547:2: ( ruleAtomic )
                    // InternalMiniExpr.g:548:3: ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalMiniExpr.g:557:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ruleRef ) | ( ruleArraySize ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:561:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ruleRef ) | ( ruleArraySize ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt7=1;
                }
                break;
            case 18:
            case 36:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMiniExpr.g:562:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalMiniExpr.g:562:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalMiniExpr.g:563:3: ( rule__Atomic__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }
                    // InternalMiniExpr.g:564:3: ( rule__Atomic__Group_0__0 )
                    // InternalMiniExpr.g:564:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:568:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalMiniExpr.g:568:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalMiniExpr.g:569:3: ( rule__Atomic__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }
                    // InternalMiniExpr.g:570:3: ( rule__Atomic__Group_1__0 )
                    // InternalMiniExpr.g:570:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniExpr.g:574:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalMiniExpr.g:574:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalMiniExpr.g:575:3: ( rule__Atomic__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }
                    // InternalMiniExpr.g:576:3: ( rule__Atomic__Group_2__0 )
                    // InternalMiniExpr.g:576:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniExpr.g:580:2: ( ruleRef )
                    {
                    // InternalMiniExpr.g:580:2: ( ruleRef )
                    // InternalMiniExpr.g:581:3: ruleRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getRefParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getRefParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniExpr.g:586:2: ( ruleArraySize )
                    {
                    // InternalMiniExpr.g:586:2: ( ruleArraySize )
                    // InternalMiniExpr.g:587:3: ruleArraySize
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getArraySizeParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleArraySize();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getArraySizeParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives_1_1"
    // InternalMiniExpr.g:596:1: rule__Atomic__Alternatives_1_1 : ( ( ( rule__Atomic__ValueAssignment_1_1_0 ) ) | ( 'false' ) );
    public final void rule__Atomic__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:600:1: ( ( ( rule__Atomic__ValueAssignment_1_1_0 ) ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniExpr.g:601:2: ( ( rule__Atomic__ValueAssignment_1_1_0 ) )
                    {
                    // InternalMiniExpr.g:601:2: ( ( rule__Atomic__ValueAssignment_1_1_0 ) )
                    // InternalMiniExpr.g:602:3: ( rule__Atomic__ValueAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getValueAssignment_1_1_0()); 
                    }
                    // InternalMiniExpr.g:603:3: ( rule__Atomic__ValueAssignment_1_1_0 )
                    // InternalMiniExpr.g:603:4: rule__Atomic__ValueAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__ValueAssignment_1_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getValueAssignment_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:607:2: ( 'false' )
                    {
                    // InternalMiniExpr.g:607:2: ( 'false' )
                    // InternalMiniExpr.g:608:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicAccess().getFalseKeyword_1_1_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicAccess().getFalseKeyword_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives_1_1"


    // $ANTLR start "rule__Ref__Alternatives_1"
    // InternalMiniExpr.g:617:1: rule__Ref__Alternatives_1 : ( ( ( rule__Ref__Group_1_0__0 ) ) | ( ( rule__Ref__Group_1_1__0 ) ) );
    public final void rule__Ref__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:621:1: ( ( ( rule__Ref__Group_1_0__0 ) ) | ( ( rule__Ref__Group_1_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniExpr.g:622:2: ( ( rule__Ref__Group_1_0__0 ) )
                    {
                    // InternalMiniExpr.g:622:2: ( ( rule__Ref__Group_1_0__0 ) )
                    // InternalMiniExpr.g:623:3: ( rule__Ref__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRefAccess().getGroup_1_0()); 
                    }
                    // InternalMiniExpr.g:624:3: ( rule__Ref__Group_1_0__0 )
                    // InternalMiniExpr.g:624:4: rule__Ref__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ref__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRefAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:628:2: ( ( rule__Ref__Group_1_1__0 ) )
                    {
                    // InternalMiniExpr.g:628:2: ( ( rule__Ref__Group_1_1__0 ) )
                    // InternalMiniExpr.g:629:3: ( rule__Ref__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRefAccess().getGroup_1_1()); 
                    }
                    // InternalMiniExpr.g:630:3: ( rule__Ref__Group_1_1__0 )
                    // InternalMiniExpr.g:630:4: rule__Ref__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ref__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRefAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Alternatives_1"


    // $ANTLR start "rule__ContractedIf__Group__0"
    // InternalMiniExpr.g:638:1: rule__ContractedIf__Group__0 : rule__ContractedIf__Group__0__Impl rule__ContractedIf__Group__1 ;
    public final void rule__ContractedIf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:642:1: ( rule__ContractedIf__Group__0__Impl rule__ContractedIf__Group__1 )
            // InternalMiniExpr.g:643:2: rule__ContractedIf__Group__0__Impl rule__ContractedIf__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContractedIf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group__0"


    // $ANTLR start "rule__ContractedIf__Group__0__Impl"
    // InternalMiniExpr.g:650:1: rule__ContractedIf__Group__0__Impl : ( ruleOr ) ;
    public final void rule__ContractedIf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:654:1: ( ( ruleOr ) )
            // InternalMiniExpr.g:655:1: ( ruleOr )
            {
            // InternalMiniExpr.g:655:1: ( ruleOr )
            // InternalMiniExpr.g:656:2: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getOrParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group__0__Impl"


    // $ANTLR start "rule__ContractedIf__Group__1"
    // InternalMiniExpr.g:665:1: rule__ContractedIf__Group__1 : rule__ContractedIf__Group__1__Impl ;
    public final void rule__ContractedIf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:669:1: ( rule__ContractedIf__Group__1__Impl )
            // InternalMiniExpr.g:670:2: rule__ContractedIf__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group__1"


    // $ANTLR start "rule__ContractedIf__Group__1__Impl"
    // InternalMiniExpr.g:676:1: rule__ContractedIf__Group__1__Impl : ( ( rule__ContractedIf__Group_1__0 )* ) ;
    public final void rule__ContractedIf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:680:1: ( ( ( rule__ContractedIf__Group_1__0 )* ) )
            // InternalMiniExpr.g:681:1: ( ( rule__ContractedIf__Group_1__0 )* )
            {
            // InternalMiniExpr.g:681:1: ( ( rule__ContractedIf__Group_1__0 )* )
            // InternalMiniExpr.g:682:2: ( rule__ContractedIf__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:683:2: ( rule__ContractedIf__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMiniExpr.g:683:3: rule__ContractedIf__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ContractedIf__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group__1__Impl"


    // $ANTLR start "rule__ContractedIf__Group_1__0"
    // InternalMiniExpr.g:692:1: rule__ContractedIf__Group_1__0 : rule__ContractedIf__Group_1__0__Impl rule__ContractedIf__Group_1__1 ;
    public final void rule__ContractedIf__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:696:1: ( rule__ContractedIf__Group_1__0__Impl rule__ContractedIf__Group_1__1 )
            // InternalMiniExpr.g:697:2: rule__ContractedIf__Group_1__0__Impl rule__ContractedIf__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__ContractedIf__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__0"


    // $ANTLR start "rule__ContractedIf__Group_1__0__Impl"
    // InternalMiniExpr.g:704:1: rule__ContractedIf__Group_1__0__Impl : ( () ) ;
    public final void rule__ContractedIf__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:708:1: ( ( () ) )
            // InternalMiniExpr.g:709:1: ( () )
            {
            // InternalMiniExpr.g:709:1: ( () )
            // InternalMiniExpr.g:710:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getContractedIfConditionAction_1_0()); 
            }
            // InternalMiniExpr.g:711:2: ()
            // InternalMiniExpr.g:711:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getContractedIfConditionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__0__Impl"


    // $ANTLR start "rule__ContractedIf__Group_1__1"
    // InternalMiniExpr.g:719:1: rule__ContractedIf__Group_1__1 : rule__ContractedIf__Group_1__1__Impl rule__ContractedIf__Group_1__2 ;
    public final void rule__ContractedIf__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:723:1: ( rule__ContractedIf__Group_1__1__Impl rule__ContractedIf__Group_1__2 )
            // InternalMiniExpr.g:724:2: rule__ContractedIf__Group_1__1__Impl rule__ContractedIf__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__ContractedIf__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__1"


    // $ANTLR start "rule__ContractedIf__Group_1__1__Impl"
    // InternalMiniExpr.g:731:1: rule__ContractedIf__Group_1__1__Impl : ( '?' ) ;
    public final void rule__ContractedIf__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:735:1: ( ( '?' ) )
            // InternalMiniExpr.g:736:1: ( '?' )
            {
            // InternalMiniExpr.g:736:1: ( '?' )
            // InternalMiniExpr.g:737:2: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getQuestionMarkKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getQuestionMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__1__Impl"


    // $ANTLR start "rule__ContractedIf__Group_1__2"
    // InternalMiniExpr.g:746:1: rule__ContractedIf__Group_1__2 : rule__ContractedIf__Group_1__2__Impl rule__ContractedIf__Group_1__3 ;
    public final void rule__ContractedIf__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:750:1: ( rule__ContractedIf__Group_1__2__Impl rule__ContractedIf__Group_1__3 )
            // InternalMiniExpr.g:751:2: rule__ContractedIf__Group_1__2__Impl rule__ContractedIf__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__ContractedIf__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__2"


    // $ANTLR start "rule__ContractedIf__Group_1__2__Impl"
    // InternalMiniExpr.g:758:1: rule__ContractedIf__Group_1__2__Impl : ( ( rule__ContractedIf__ThenAssignment_1_2 ) ) ;
    public final void rule__ContractedIf__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:762:1: ( ( ( rule__ContractedIf__ThenAssignment_1_2 ) ) )
            // InternalMiniExpr.g:763:1: ( ( rule__ContractedIf__ThenAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:763:1: ( ( rule__ContractedIf__ThenAssignment_1_2 ) )
            // InternalMiniExpr.g:764:2: ( rule__ContractedIf__ThenAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getThenAssignment_1_2()); 
            }
            // InternalMiniExpr.g:765:2: ( rule__ContractedIf__ThenAssignment_1_2 )
            // InternalMiniExpr.g:765:3: rule__ContractedIf__ThenAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ContractedIf__ThenAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getThenAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__2__Impl"


    // $ANTLR start "rule__ContractedIf__Group_1__3"
    // InternalMiniExpr.g:773:1: rule__ContractedIf__Group_1__3 : rule__ContractedIf__Group_1__3__Impl rule__ContractedIf__Group_1__4 ;
    public final void rule__ContractedIf__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:777:1: ( rule__ContractedIf__Group_1__3__Impl rule__ContractedIf__Group_1__4 )
            // InternalMiniExpr.g:778:2: rule__ContractedIf__Group_1__3__Impl rule__ContractedIf__Group_1__4
            {
            pushFollow(FOLLOW_6);
            rule__ContractedIf__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__3"


    // $ANTLR start "rule__ContractedIf__Group_1__3__Impl"
    // InternalMiniExpr.g:785:1: rule__ContractedIf__Group_1__3__Impl : ( ':' ) ;
    public final void rule__ContractedIf__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:789:1: ( ( ':' ) )
            // InternalMiniExpr.g:790:1: ( ':' )
            {
            // InternalMiniExpr.g:790:1: ( ':' )
            // InternalMiniExpr.g:791:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getColonKeyword_1_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getColonKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__3__Impl"


    // $ANTLR start "rule__ContractedIf__Group_1__4"
    // InternalMiniExpr.g:800:1: rule__ContractedIf__Group_1__4 : rule__ContractedIf__Group_1__4__Impl ;
    public final void rule__ContractedIf__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:804:1: ( rule__ContractedIf__Group_1__4__Impl )
            // InternalMiniExpr.g:805:2: rule__ContractedIf__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContractedIf__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__4"


    // $ANTLR start "rule__ContractedIf__Group_1__4__Impl"
    // InternalMiniExpr.g:811:1: rule__ContractedIf__Group_1__4__Impl : ( ( rule__ContractedIf__ElseAssignment_1_4 ) ) ;
    public final void rule__ContractedIf__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:815:1: ( ( ( rule__ContractedIf__ElseAssignment_1_4 ) ) )
            // InternalMiniExpr.g:816:1: ( ( rule__ContractedIf__ElseAssignment_1_4 ) )
            {
            // InternalMiniExpr.g:816:1: ( ( rule__ContractedIf__ElseAssignment_1_4 ) )
            // InternalMiniExpr.g:817:2: ( rule__ContractedIf__ElseAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getElseAssignment_1_4()); 
            }
            // InternalMiniExpr.g:818:2: ( rule__ContractedIf__ElseAssignment_1_4 )
            // InternalMiniExpr.g:818:3: rule__ContractedIf__ElseAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__ContractedIf__ElseAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getElseAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__Group_1__4__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalMiniExpr.g:827:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:831:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMiniExpr.g:832:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalMiniExpr.g:839:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:843:1: ( ( ruleAnd ) )
            // InternalMiniExpr.g:844:1: ( ruleAnd )
            {
            // InternalMiniExpr.g:844:1: ( ruleAnd )
            // InternalMiniExpr.g:845:2: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalMiniExpr.g:854:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:858:1: ( rule__Or__Group__1__Impl )
            // InternalMiniExpr.g:859:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalMiniExpr.g:865:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:869:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMiniExpr.g:870:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMiniExpr.g:870:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMiniExpr.g:871:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:872:2: ( rule__Or__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMiniExpr.g:872:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMiniExpr.g:881:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:885:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMiniExpr.g:886:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMiniExpr.g:893:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:897:1: ( ( () ) )
            // InternalMiniExpr.g:898:1: ( () )
            {
            // InternalMiniExpr.g:898:1: ( () )
            // InternalMiniExpr.g:899:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalMiniExpr.g:900:2: ()
            // InternalMiniExpr.g:900:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMiniExpr.g:908:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:912:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMiniExpr.g:913:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMiniExpr.g:920:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__OpAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:924:1: ( ( ( rule__Or__OpAssignment_1_1 ) ) )
            // InternalMiniExpr.g:925:1: ( ( rule__Or__OpAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:925:1: ( ( rule__Or__OpAssignment_1_1 ) )
            // InternalMiniExpr.g:926:2: ( rule__Or__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOpAssignment_1_1()); 
            }
            // InternalMiniExpr.g:927:2: ( rule__Or__OpAssignment_1_1 )
            // InternalMiniExpr.g:927:3: rule__Or__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMiniExpr.g:935:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:939:1: ( rule__Or__Group_1__2__Impl )
            // InternalMiniExpr.g:940:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMiniExpr.g:946:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:950:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMiniExpr.g:951:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:951:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMiniExpr.g:952:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniExpr.g:953:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMiniExpr.g:953:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMiniExpr.g:962:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:966:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMiniExpr.g:967:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalMiniExpr.g:974:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:978:1: ( ( ruleEquality ) )
            // InternalMiniExpr.g:979:1: ( ruleEquality )
            {
            // InternalMiniExpr.g:979:1: ( ruleEquality )
            // InternalMiniExpr.g:980:2: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalMiniExpr.g:989:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:993:1: ( rule__And__Group__1__Impl )
            // InternalMiniExpr.g:994:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalMiniExpr.g:1000:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1004:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMiniExpr.g:1005:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMiniExpr.g:1005:1: ( ( rule__And__Group_1__0 )* )
            // InternalMiniExpr.g:1006:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:1007:2: ( rule__And__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMiniExpr.g:1007:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMiniExpr.g:1016:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1020:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMiniExpr.g:1021:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMiniExpr.g:1028:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1032:1: ( ( () ) )
            // InternalMiniExpr.g:1033:1: ( () )
            {
            // InternalMiniExpr.g:1033:1: ( () )
            // InternalMiniExpr.g:1034:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalMiniExpr.g:1035:2: ()
            // InternalMiniExpr.g:1035:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMiniExpr.g:1043:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1047:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMiniExpr.g:1048:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMiniExpr.g:1055:1: rule__And__Group_1__1__Impl : ( ( rule__And__OpAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1059:1: ( ( ( rule__And__OpAssignment_1_1 ) ) )
            // InternalMiniExpr.g:1060:1: ( ( rule__And__OpAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:1060:1: ( ( rule__And__OpAssignment_1_1 ) )
            // InternalMiniExpr.g:1061:2: ( rule__And__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOpAssignment_1_1()); 
            }
            // InternalMiniExpr.g:1062:2: ( rule__And__OpAssignment_1_1 )
            // InternalMiniExpr.g:1062:3: rule__And__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__And__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMiniExpr.g:1070:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1074:1: ( rule__And__Group_1__2__Impl )
            // InternalMiniExpr.g:1075:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMiniExpr.g:1081:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1085:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMiniExpr.g:1086:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:1086:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMiniExpr.g:1087:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniExpr.g:1088:2: ( rule__And__RightAssignment_1_2 )
            // InternalMiniExpr.g:1088:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalMiniExpr.g:1097:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1101:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMiniExpr.g:1102:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Equality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalMiniExpr.g:1109:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1113:1: ( ( ruleComparison ) )
            // InternalMiniExpr.g:1114:1: ( ruleComparison )
            {
            // InternalMiniExpr.g:1114:1: ( ruleComparison )
            // InternalMiniExpr.g:1115:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalMiniExpr.g:1124:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1128:1: ( rule__Equality__Group__1__Impl )
            // InternalMiniExpr.g:1129:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalMiniExpr.g:1135:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1139:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMiniExpr.g:1140:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMiniExpr.g:1140:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMiniExpr.g:1141:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:1142:2: ( rule__Equality__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=13)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMiniExpr.g:1142:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalMiniExpr.g:1151:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1155:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMiniExpr.g:1156:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalMiniExpr.g:1163:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1167:1: ( ( () ) )
            // InternalMiniExpr.g:1168:1: ( () )
            {
            // InternalMiniExpr.g:1168:1: ( () )
            // InternalMiniExpr.g:1169:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            }
            // InternalMiniExpr.g:1170:2: ()
            // InternalMiniExpr.g:1170:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalMiniExpr.g:1178:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1182:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalMiniExpr.g:1183:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalMiniExpr.g:1190:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1194:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalMiniExpr.g:1195:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:1195:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalMiniExpr.g:1196:2: ( rule__Equality__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            }
            // InternalMiniExpr.g:1197:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalMiniExpr.g:1197:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalMiniExpr.g:1205:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1209:1: ( rule__Equality__Group_1__2__Impl )
            // InternalMiniExpr.g:1210:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalMiniExpr.g:1216:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1220:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalMiniExpr.g:1221:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:1221:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalMiniExpr.g:1222:2: ( rule__Equality__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniExpr.g:1223:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalMiniExpr.g:1223:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMiniExpr.g:1232:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1236:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMiniExpr.g:1237:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMiniExpr.g:1244:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1248:1: ( ( rulePlusOrMinus ) )
            // InternalMiniExpr.g:1249:1: ( rulePlusOrMinus )
            {
            // InternalMiniExpr.g:1249:1: ( rulePlusOrMinus )
            // InternalMiniExpr.g:1250:2: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMiniExpr.g:1259:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1263:1: ( rule__Comparison__Group__1__Impl )
            // InternalMiniExpr.g:1264:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMiniExpr.g:1270:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1274:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMiniExpr.g:1275:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMiniExpr.g:1275:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMiniExpr.g:1276:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:1277:2: ( rule__Comparison__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=14 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMiniExpr.g:1277:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalMiniExpr.g:1286:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1290:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMiniExpr.g:1291:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalMiniExpr.g:1298:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1302:1: ( ( () ) )
            // InternalMiniExpr.g:1303:1: ( () )
            {
            // InternalMiniExpr.g:1303:1: ( () )
            // InternalMiniExpr.g:1304:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            }
            // InternalMiniExpr.g:1305:2: ()
            // InternalMiniExpr.g:1305:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalMiniExpr.g:1313:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1317:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalMiniExpr.g:1318:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalMiniExpr.g:1325:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1329:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalMiniExpr.g:1330:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:1330:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalMiniExpr.g:1331:2: ( rule__Comparison__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            }
            // InternalMiniExpr.g:1332:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalMiniExpr.g:1332:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalMiniExpr.g:1340:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1344:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalMiniExpr.g:1345:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalMiniExpr.g:1351:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1355:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalMiniExpr.g:1356:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:1356:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalMiniExpr.g:1357:2: ( rule__Comparison__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniExpr.g:1358:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalMiniExpr.g:1358:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMiniExpr.g:1367:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1371:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMiniExpr.g:1372:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMiniExpr.g:1379:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1383:1: ( ( ruleMulOrDiv ) )
            // InternalMiniExpr.g:1384:1: ( ruleMulOrDiv )
            {
            // InternalMiniExpr.g:1384:1: ( ruleMulOrDiv )
            // InternalMiniExpr.g:1385:2: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMiniExpr.g:1394:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1398:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMiniExpr.g:1399:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMiniExpr.g:1405:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1409:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMiniExpr.g:1410:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMiniExpr.g:1410:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMiniExpr.g:1411:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:1412:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalMiniExpr.g:1412:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMiniExpr.g:1421:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1425:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMiniExpr.g:1426:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMiniExpr.g:1433:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1437:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalMiniExpr.g:1438:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalMiniExpr.g:1438:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalMiniExpr.g:1439:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }
            // InternalMiniExpr.g:1440:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalMiniExpr.g:1440:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMiniExpr.g:1448:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1452:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMiniExpr.g:1453:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMiniExpr.g:1459:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1463:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMiniExpr.g:1464:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:1464:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMiniExpr.g:1465:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniExpr.g:1466:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMiniExpr.g:1466:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalMiniExpr.g:1475:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1479:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalMiniExpr.g:1480:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_18);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalMiniExpr.g:1487:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1491:1: ( ( () ) )
            // InternalMiniExpr.g:1492:1: ( () )
            {
            // InternalMiniExpr.g:1492:1: ( () )
            // InternalMiniExpr.g:1493:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalMiniExpr.g:1494:2: ()
            // InternalMiniExpr.g:1494:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalMiniExpr.g:1502:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1506:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalMiniExpr.g:1507:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalMiniExpr.g:1513:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( ( rule__PlusOrMinus__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1517:1: ( ( ( rule__PlusOrMinus__OpAssignment_1_0_0_1 ) ) )
            // InternalMiniExpr.g:1518:1: ( ( rule__PlusOrMinus__OpAssignment_1_0_0_1 ) )
            {
            // InternalMiniExpr.g:1518:1: ( ( rule__PlusOrMinus__OpAssignment_1_0_0_1 ) )
            // InternalMiniExpr.g:1519:2: ( rule__PlusOrMinus__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalMiniExpr.g:1520:2: ( rule__PlusOrMinus__OpAssignment_1_0_0_1 )
            // InternalMiniExpr.g:1520:3: rule__PlusOrMinus__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalMiniExpr.g:1529:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1533:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalMiniExpr.g:1534:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_16);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalMiniExpr.g:1541:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1545:1: ( ( () ) )
            // InternalMiniExpr.g:1546:1: ( () )
            {
            // InternalMiniExpr.g:1546:1: ( () )
            // InternalMiniExpr.g:1547:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalMiniExpr.g:1548:2: ()
            // InternalMiniExpr.g:1548:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalMiniExpr.g:1556:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1560:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalMiniExpr.g:1561:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalMiniExpr.g:1567:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( ( rule__PlusOrMinus__OpAssignment_1_0_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1571:1: ( ( ( rule__PlusOrMinus__OpAssignment_1_0_1_1 ) ) )
            // InternalMiniExpr.g:1572:1: ( ( rule__PlusOrMinus__OpAssignment_1_0_1_1 ) )
            {
            // InternalMiniExpr.g:1572:1: ( ( rule__PlusOrMinus__OpAssignment_1_0_1_1 ) )
            // InternalMiniExpr.g:1573:2: ( rule__PlusOrMinus__OpAssignment_1_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_1_1()); 
            }
            // InternalMiniExpr.g:1574:2: ( rule__PlusOrMinus__OpAssignment_1_0_1_1 )
            // InternalMiniExpr.g:1574:3: rule__PlusOrMinus__OpAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OpAssignment_1_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalMiniExpr.g:1583:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1587:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalMiniExpr.g:1588:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalMiniExpr.g:1595:1: rule__MulOrDiv__Group__0__Impl : ( ruleModulo ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1599:1: ( ( ruleModulo ) )
            // InternalMiniExpr.g:1600:1: ( ruleModulo )
            {
            // InternalMiniExpr.g:1600:1: ( ruleModulo )
            // InternalMiniExpr.g:1601:2: ruleModulo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getModuloParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModulo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getModuloParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalMiniExpr.g:1610:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1614:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalMiniExpr.g:1615:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalMiniExpr.g:1621:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1625:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalMiniExpr.g:1626:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalMiniExpr.g:1626:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalMiniExpr.g:1627:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:1628:2: ( rule__MulOrDiv__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=33 && LA16_0<=34)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniExpr.g:1628:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalMiniExpr.g:1637:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1641:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalMiniExpr.g:1642:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalMiniExpr.g:1649:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1653:1: ( ( ( rule__MulOrDiv__Alternatives_1_0 ) ) )
            // InternalMiniExpr.g:1654:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            {
            // InternalMiniExpr.g:1654:1: ( ( rule__MulOrDiv__Alternatives_1_0 ) )
            // InternalMiniExpr.g:1655:2: ( rule__MulOrDiv__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }
            // InternalMiniExpr.g:1656:2: ( rule__MulOrDiv__Alternatives_1_0 )
            // InternalMiniExpr.g:1656:3: rule__MulOrDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalMiniExpr.g:1664:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1668:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalMiniExpr.g:1669:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalMiniExpr.g:1675:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1679:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalMiniExpr.g:1680:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:1680:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalMiniExpr.g:1681:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }
            // InternalMiniExpr.g:1682:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalMiniExpr.g:1682:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0"
    // InternalMiniExpr.g:1691:1: rule__MulOrDiv__Group_1_0_0__0 : rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 ;
    public final void rule__MulOrDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1695:1: ( rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1 )
            // InternalMiniExpr.g:1696:2: rule__MulOrDiv__Group_1_0_0__0__Impl rule__MulOrDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_21);
            rule__MulOrDiv__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__0__Impl"
    // InternalMiniExpr.g:1703:1: rule__MulOrDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1707:1: ( ( () ) )
            // InternalMiniExpr.g:1708:1: ( () )
            {
            // InternalMiniExpr.g:1708:1: ( () )
            // InternalMiniExpr.g:1709:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMulLeftAction_1_0_0_0()); 
            }
            // InternalMiniExpr.g:1710:2: ()
            // InternalMiniExpr.g:1710:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMulLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1"
    // InternalMiniExpr.g:1718:1: rule__MulOrDiv__Group_1_0_0__1 : rule__MulOrDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1722:1: ( rule__MulOrDiv__Group_1_0_0__1__Impl )
            // InternalMiniExpr.g:1723:2: rule__MulOrDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_0__1__Impl"
    // InternalMiniExpr.g:1729:1: rule__MulOrDiv__Group_1_0_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1733:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_0_1 ) ) )
            // InternalMiniExpr.g:1734:1: ( ( rule__MulOrDiv__OpAssignment_1_0_0_1 ) )
            {
            // InternalMiniExpr.g:1734:1: ( ( rule__MulOrDiv__OpAssignment_1_0_0_1 ) )
            // InternalMiniExpr.g:1735:2: ( rule__MulOrDiv__OpAssignment_1_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_0_1()); 
            }
            // InternalMiniExpr.g:1736:2: ( rule__MulOrDiv__OpAssignment_1_0_0_1 )
            // InternalMiniExpr.g:1736:3: rule__MulOrDiv__OpAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0"
    // InternalMiniExpr.g:1745:1: rule__MulOrDiv__Group_1_0_1__0 : rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 ;
    public final void rule__MulOrDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1749:1: ( rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1 )
            // InternalMiniExpr.g:1750:2: rule__MulOrDiv__Group_1_0_1__0__Impl rule__MulOrDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_19);
            rule__MulOrDiv__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__0__Impl"
    // InternalMiniExpr.g:1757:1: rule__MulOrDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1761:1: ( ( () ) )
            // InternalMiniExpr.g:1762:1: ( () )
            {
            // InternalMiniExpr.g:1762:1: ( () )
            // InternalMiniExpr.g:1763:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0()); 
            }
            // InternalMiniExpr.g:1764:2: ()
            // InternalMiniExpr.g:1764:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1"
    // InternalMiniExpr.g:1772:1: rule__MulOrDiv__Group_1_0_1__1 : rule__MulOrDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1776:1: ( rule__MulOrDiv__Group_1_0_1__1__Impl )
            // InternalMiniExpr.g:1777:2: rule__MulOrDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0_1__1__Impl"
    // InternalMiniExpr.g:1783:1: rule__MulOrDiv__Group_1_0_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1787:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1_1 ) ) )
            // InternalMiniExpr.g:1788:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1_1 ) )
            {
            // InternalMiniExpr.g:1788:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1_1 ) )
            // InternalMiniExpr.g:1789:2: ( rule__MulOrDiv__OpAssignment_1_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1_1()); 
            }
            // InternalMiniExpr.g:1790:2: ( rule__MulOrDiv__OpAssignment_1_0_1_1 )
            // InternalMiniExpr.g:1790:3: rule__MulOrDiv__OpAssignment_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Modulo__Group__0"
    // InternalMiniExpr.g:1799:1: rule__Modulo__Group__0 : rule__Modulo__Group__0__Impl rule__Modulo__Group__1 ;
    public final void rule__Modulo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1803:1: ( rule__Modulo__Group__0__Impl rule__Modulo__Group__1 )
            // InternalMiniExpr.g:1804:2: rule__Modulo__Group__0__Impl rule__Modulo__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Modulo__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0"


    // $ANTLR start "rule__Modulo__Group__0__Impl"
    // InternalMiniExpr.g:1811:1: rule__Modulo__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Modulo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1815:1: ( ( rulePrimary ) )
            // InternalMiniExpr.g:1816:1: ( rulePrimary )
            {
            // InternalMiniExpr.g:1816:1: ( rulePrimary )
            // InternalMiniExpr.g:1817:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__0__Impl"


    // $ANTLR start "rule__Modulo__Group__1"
    // InternalMiniExpr.g:1826:1: rule__Modulo__Group__1 : rule__Modulo__Group__1__Impl ;
    public final void rule__Modulo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1830:1: ( rule__Modulo__Group__1__Impl )
            // InternalMiniExpr.g:1831:2: rule__Modulo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1"


    // $ANTLR start "rule__Modulo__Group__1__Impl"
    // InternalMiniExpr.g:1837:1: rule__Modulo__Group__1__Impl : ( ( rule__Modulo__Group_1__0 )* ) ;
    public final void rule__Modulo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1841:1: ( ( ( rule__Modulo__Group_1__0 )* ) )
            // InternalMiniExpr.g:1842:1: ( ( rule__Modulo__Group_1__0 )* )
            {
            // InternalMiniExpr.g:1842:1: ( ( rule__Modulo__Group_1__0 )* )
            // InternalMiniExpr.g:1843:2: ( rule__Modulo__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getGroup_1()); 
            }
            // InternalMiniExpr.g:1844:2: ( rule__Modulo__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniExpr.g:1844:3: rule__Modulo__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Modulo__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group__1__Impl"


    // $ANTLR start "rule__Modulo__Group_1__0"
    // InternalMiniExpr.g:1853:1: rule__Modulo__Group_1__0 : rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 ;
    public final void rule__Modulo__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1857:1: ( rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1 )
            // InternalMiniExpr.g:1858:2: rule__Modulo__Group_1__0__Impl rule__Modulo__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Modulo__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__0"


    // $ANTLR start "rule__Modulo__Group_1__0__Impl"
    // InternalMiniExpr.g:1865:1: rule__Modulo__Group_1__0__Impl : ( () ) ;
    public final void rule__Modulo__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1869:1: ( ( () ) )
            // InternalMiniExpr.g:1870:1: ( () )
            {
            // InternalMiniExpr.g:1870:1: ( () )
            // InternalMiniExpr.g:1871:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getModuloLeftAction_1_0()); 
            }
            // InternalMiniExpr.g:1872:2: ()
            // InternalMiniExpr.g:1872:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getModuloLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__0__Impl"


    // $ANTLR start "rule__Modulo__Group_1__1"
    // InternalMiniExpr.g:1880:1: rule__Modulo__Group_1__1 : rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 ;
    public final void rule__Modulo__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1884:1: ( rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2 )
            // InternalMiniExpr.g:1885:2: rule__Modulo__Group_1__1__Impl rule__Modulo__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Modulo__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__1"


    // $ANTLR start "rule__Modulo__Group_1__1__Impl"
    // InternalMiniExpr.g:1892:1: rule__Modulo__Group_1__1__Impl : ( ( rule__Modulo__OpAssignment_1_1 ) ) ;
    public final void rule__Modulo__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1896:1: ( ( ( rule__Modulo__OpAssignment_1_1 ) ) )
            // InternalMiniExpr.g:1897:1: ( ( rule__Modulo__OpAssignment_1_1 ) )
            {
            // InternalMiniExpr.g:1897:1: ( ( rule__Modulo__OpAssignment_1_1 ) )
            // InternalMiniExpr.g:1898:2: ( rule__Modulo__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getOpAssignment_1_1()); 
            }
            // InternalMiniExpr.g:1899:2: ( rule__Modulo__OpAssignment_1_1 )
            // InternalMiniExpr.g:1899:3: rule__Modulo__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getOpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__1__Impl"


    // $ANTLR start "rule__Modulo__Group_1__2"
    // InternalMiniExpr.g:1907:1: rule__Modulo__Group_1__2 : rule__Modulo__Group_1__2__Impl ;
    public final void rule__Modulo__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1911:1: ( rule__Modulo__Group_1__2__Impl )
            // InternalMiniExpr.g:1912:2: rule__Modulo__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__2"


    // $ANTLR start "rule__Modulo__Group_1__2__Impl"
    // InternalMiniExpr.g:1918:1: rule__Modulo__Group_1__2__Impl : ( ( rule__Modulo__RightAssignment_1_2 ) ) ;
    public final void rule__Modulo__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1922:1: ( ( ( rule__Modulo__RightAssignment_1_2 ) ) )
            // InternalMiniExpr.g:1923:1: ( ( rule__Modulo__RightAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:1923:1: ( ( rule__Modulo__RightAssignment_1_2 ) )
            // InternalMiniExpr.g:1924:2: ( rule__Modulo__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getRightAssignment_1_2()); 
            }
            // InternalMiniExpr.g:1925:2: ( rule__Modulo__RightAssignment_1_2 )
            // InternalMiniExpr.g:1925:3: rule__Modulo__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Modulo__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMiniExpr.g:1934:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1938:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMiniExpr.g:1939:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMiniExpr.g:1946:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1950:1: ( ( () ) )
            // InternalMiniExpr.g:1951:1: ( () )
            {
            // InternalMiniExpr.g:1951:1: ( () )
            // InternalMiniExpr.g:1952:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getParenthesisAction_0_0()); 
            }
            // InternalMiniExpr.g:1953:2: ()
            // InternalMiniExpr.g:1953:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getParenthesisAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMiniExpr.g:1961:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1965:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMiniExpr.g:1966:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMiniExpr.g:1973:1: rule__Primary__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1977:1: ( ( '(' ) )
            // InternalMiniExpr.g:1978:1: ( '(' )
            {
            // InternalMiniExpr.g:1978:1: ( '(' )
            // InternalMiniExpr.g:1979:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMiniExpr.g:1988:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:1992:1: ( rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 )
            // InternalMiniExpr.g:1993:2: rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMiniExpr.g:2000:1: rule__Primary__Group_0__2__Impl : ( ( rule__Primary__ExpressionAssignment_0_2 ) ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2004:1: ( ( ( rule__Primary__ExpressionAssignment_0_2 ) ) )
            // InternalMiniExpr.g:2005:1: ( ( rule__Primary__ExpressionAssignment_0_2 ) )
            {
            // InternalMiniExpr.g:2005:1: ( ( rule__Primary__ExpressionAssignment_0_2 ) )
            // InternalMiniExpr.g:2006:2: ( rule__Primary__ExpressionAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_0_2()); 
            }
            // InternalMiniExpr.g:2007:2: ( rule__Primary__ExpressionAssignment_0_2 )
            // InternalMiniExpr.g:2007:3: rule__Primary__ExpressionAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__3"
    // InternalMiniExpr.g:2015:1: rule__Primary__Group_0__3 : rule__Primary__Group_0__3__Impl ;
    public final void rule__Primary__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2019:1: ( rule__Primary__Group_0__3__Impl )
            // InternalMiniExpr.g:2020:2: rule__Primary__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__3"


    // $ANTLR start "rule__Primary__Group_0__3__Impl"
    // InternalMiniExpr.g:2026:1: rule__Primary__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2030:1: ( ( ')' ) )
            // InternalMiniExpr.g:2031:1: ( ')' )
            {
            // InternalMiniExpr.g:2031:1: ( ')' )
            // InternalMiniExpr.g:2032:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__3__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMiniExpr.g:2042:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2046:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMiniExpr.g:2047:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMiniExpr.g:2054:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2058:1: ( ( () ) )
            // InternalMiniExpr.g:2059:1: ( () )
            {
            // InternalMiniExpr.g:2059:1: ( () )
            // InternalMiniExpr.g:2060:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0()); 
            }
            // InternalMiniExpr.g:2061:2: ()
            // InternalMiniExpr.g:2061:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMiniExpr.g:2069:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2073:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMiniExpr.g:2074:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMiniExpr.g:2081:1: rule__Primary__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2085:1: ( ( '-' ) )
            // InternalMiniExpr.g:2086:1: ( '-' )
            {
            // InternalMiniExpr.g:2086:1: ( '-' )
            // InternalMiniExpr.g:2087:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMiniExpr.g:2096:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2100:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMiniExpr.g:2101:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMiniExpr.g:2107:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2111:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalMiniExpr.g:2112:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalMiniExpr.g:2112:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalMiniExpr.g:2113:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalMiniExpr.g:2114:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalMiniExpr.g:2114:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMiniExpr.g:2123:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2127:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMiniExpr.g:2128:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_27);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMiniExpr.g:2135:1: rule__Primary__Group_2__0__Impl : ( () ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2139:1: ( ( () ) )
            // InternalMiniExpr.g:2140:1: ( () )
            {
            // InternalMiniExpr.g:2140:1: ( () )
            // InternalMiniExpr.g:2141:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_2_0()); 
            }
            // InternalMiniExpr.g:2142:2: ()
            // InternalMiniExpr.g:2142:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNotAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMiniExpr.g:2150:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2154:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMiniExpr.g:2155:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMiniExpr.g:2162:1: rule__Primary__Group_2__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2166:1: ( ( '!' ) )
            // InternalMiniExpr.g:2167:1: ( '!' )
            {
            // InternalMiniExpr.g:2167:1: ( '!' )
            // InternalMiniExpr.g:2168:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMiniExpr.g:2177:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2181:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMiniExpr.g:2182:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMiniExpr.g:2188:1: rule__Primary__Group_2__2__Impl : ( ( rule__Primary__ExpressionAssignment_2_2 ) ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2192:1: ( ( ( rule__Primary__ExpressionAssignment_2_2 ) ) )
            // InternalMiniExpr.g:2193:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            {
            // InternalMiniExpr.g:2193:1: ( ( rule__Primary__ExpressionAssignment_2_2 ) )
            // InternalMiniExpr.g:2194:2: ( rule__Primary__ExpressionAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }
            // InternalMiniExpr.g:2195:2: ( rule__Primary__ExpressionAssignment_2_2 )
            // InternalMiniExpr.g:2195:3: rule__Primary__ExpressionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalMiniExpr.g:2204:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2208:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalMiniExpr.g:2209:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalMiniExpr.g:2216:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2220:1: ( ( () ) )
            // InternalMiniExpr.g:2221:1: ( () )
            {
            // InternalMiniExpr.g:2221:1: ( () )
            // InternalMiniExpr.g:2222:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getNumberConstantAction_0_0()); 
            }
            // InternalMiniExpr.g:2223:2: ()
            // InternalMiniExpr.g:2223:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getNumberConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalMiniExpr.g:2231:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2235:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalMiniExpr.g:2236:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalMiniExpr.g:2242:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2246:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalMiniExpr.g:2247:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalMiniExpr.g:2247:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalMiniExpr.g:2248:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }
            // InternalMiniExpr.g:2249:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalMiniExpr.g:2249:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalMiniExpr.g:2258:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2262:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalMiniExpr.g:2263:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalMiniExpr.g:2270:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2274:1: ( ( () ) )
            // InternalMiniExpr.g:2275:1: ( () )
            {
            // InternalMiniExpr.g:2275:1: ( () )
            // InternalMiniExpr.g:2276:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getBoolConstantAction_1_0()); 
            }
            // InternalMiniExpr.g:2277:2: ()
            // InternalMiniExpr.g:2277:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getBoolConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalMiniExpr.g:2285:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2289:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalMiniExpr.g:2290:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalMiniExpr.g:2296:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__Alternatives_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2300:1: ( ( ( rule__Atomic__Alternatives_1_1 ) ) )
            // InternalMiniExpr.g:2301:1: ( ( rule__Atomic__Alternatives_1_1 ) )
            {
            // InternalMiniExpr.g:2301:1: ( ( rule__Atomic__Alternatives_1_1 ) )
            // InternalMiniExpr.g:2302:2: ( rule__Atomic__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getAlternatives_1_1()); 
            }
            // InternalMiniExpr.g:2303:2: ( rule__Atomic__Alternatives_1_1 )
            // InternalMiniExpr.g:2303:3: rule__Atomic__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalMiniExpr.g:2312:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2316:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalMiniExpr.g:2317:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalMiniExpr.g:2324:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2328:1: ( ( () ) )
            // InternalMiniExpr.g:2329:1: ( () )
            {
            // InternalMiniExpr.g:2329:1: ( () )
            // InternalMiniExpr.g:2330:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getVectorConstantAction_2_0()); 
            }
            // InternalMiniExpr.g:2331:2: ()
            // InternalMiniExpr.g:2331:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getVectorConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalMiniExpr.g:2339:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl rule__Atomic__Group_2__2 ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2343:1: ( rule__Atomic__Group_2__1__Impl rule__Atomic__Group_2__2 )
            // InternalMiniExpr.g:2344:2: rule__Atomic__Group_2__1__Impl rule__Atomic__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Atomic__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalMiniExpr.g:2351:1: rule__Atomic__Group_2__1__Impl : ( '[' ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2355:1: ( ( '[' ) )
            // InternalMiniExpr.g:2356:1: ( '[' )
            {
            // InternalMiniExpr.g:2356:1: ( '[' )
            // InternalMiniExpr.g:2357:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_2_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__2"
    // InternalMiniExpr.g:2366:1: rule__Atomic__Group_2__2 : rule__Atomic__Group_2__2__Impl rule__Atomic__Group_2__3 ;
    public final void rule__Atomic__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2370:1: ( rule__Atomic__Group_2__2__Impl rule__Atomic__Group_2__3 )
            // InternalMiniExpr.g:2371:2: rule__Atomic__Group_2__2__Impl rule__Atomic__Group_2__3
            {
            pushFollow(FOLLOW_31);
            rule__Atomic__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__2"


    // $ANTLR start "rule__Atomic__Group_2__2__Impl"
    // InternalMiniExpr.g:2378:1: rule__Atomic__Group_2__2__Impl : ( ( rule__Atomic__ValuesAssignment_2_2 ) ) ;
    public final void rule__Atomic__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2382:1: ( ( ( rule__Atomic__ValuesAssignment_2_2 ) ) )
            // InternalMiniExpr.g:2383:1: ( ( rule__Atomic__ValuesAssignment_2_2 ) )
            {
            // InternalMiniExpr.g:2383:1: ( ( rule__Atomic__ValuesAssignment_2_2 ) )
            // InternalMiniExpr.g:2384:2: ( rule__Atomic__ValuesAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValuesAssignment_2_2()); 
            }
            // InternalMiniExpr.g:2385:2: ( rule__Atomic__ValuesAssignment_2_2 )
            // InternalMiniExpr.g:2385:3: rule__Atomic__ValuesAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValuesAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValuesAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__2__Impl"


    // $ANTLR start "rule__Atomic__Group_2__3"
    // InternalMiniExpr.g:2393:1: rule__Atomic__Group_2__3 : rule__Atomic__Group_2__3__Impl rule__Atomic__Group_2__4 ;
    public final void rule__Atomic__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2397:1: ( rule__Atomic__Group_2__3__Impl rule__Atomic__Group_2__4 )
            // InternalMiniExpr.g:2398:2: rule__Atomic__Group_2__3__Impl rule__Atomic__Group_2__4
            {
            pushFollow(FOLLOW_31);
            rule__Atomic__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__3"


    // $ANTLR start "rule__Atomic__Group_2__3__Impl"
    // InternalMiniExpr.g:2405:1: rule__Atomic__Group_2__3__Impl : ( ( rule__Atomic__Group_2_3__0 )* ) ;
    public final void rule__Atomic__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2409:1: ( ( ( rule__Atomic__Group_2_3__0 )* ) )
            // InternalMiniExpr.g:2410:1: ( ( rule__Atomic__Group_2_3__0 )* )
            {
            // InternalMiniExpr.g:2410:1: ( ( rule__Atomic__Group_2_3__0 )* )
            // InternalMiniExpr.g:2411:2: ( rule__Atomic__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getGroup_2_3()); 
            }
            // InternalMiniExpr.g:2412:2: ( rule__Atomic__Group_2_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMiniExpr.g:2412:3: rule__Atomic__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Atomic__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getGroup_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__3__Impl"


    // $ANTLR start "rule__Atomic__Group_2__4"
    // InternalMiniExpr.g:2420:1: rule__Atomic__Group_2__4 : rule__Atomic__Group_2__4__Impl ;
    public final void rule__Atomic__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2424:1: ( rule__Atomic__Group_2__4__Impl )
            // InternalMiniExpr.g:2425:2: rule__Atomic__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__4"


    // $ANTLR start "rule__Atomic__Group_2__4__Impl"
    // InternalMiniExpr.g:2431:1: rule__Atomic__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Atomic__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2435:1: ( ( ']' ) )
            // InternalMiniExpr.g:2436:1: ( ']' )
            {
            // InternalMiniExpr.g:2436:1: ( ']' )
            // InternalMiniExpr.g:2437:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_2_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__4__Impl"


    // $ANTLR start "rule__Atomic__Group_2_3__0"
    // InternalMiniExpr.g:2447:1: rule__Atomic__Group_2_3__0 : rule__Atomic__Group_2_3__0__Impl rule__Atomic__Group_2_3__1 ;
    public final void rule__Atomic__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2451:1: ( rule__Atomic__Group_2_3__0__Impl rule__Atomic__Group_2_3__1 )
            // InternalMiniExpr.g:2452:2: rule__Atomic__Group_2_3__0__Impl rule__Atomic__Group_2_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Atomic__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2_3__0"


    // $ANTLR start "rule__Atomic__Group_2_3__0__Impl"
    // InternalMiniExpr.g:2459:1: rule__Atomic__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Atomic__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2463:1: ( ( ',' ) )
            // InternalMiniExpr.g:2464:1: ( ',' )
            {
            // InternalMiniExpr.g:2464:1: ( ',' )
            // InternalMiniExpr.g:2465:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getCommaKeyword_2_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getCommaKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2_3__1"
    // InternalMiniExpr.g:2474:1: rule__Atomic__Group_2_3__1 : rule__Atomic__Group_2_3__1__Impl ;
    public final void rule__Atomic__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2478:1: ( rule__Atomic__Group_2_3__1__Impl )
            // InternalMiniExpr.g:2479:2: rule__Atomic__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2_3__1"


    // $ANTLR start "rule__Atomic__Group_2_3__1__Impl"
    // InternalMiniExpr.g:2485:1: rule__Atomic__Group_2_3__1__Impl : ( ( rule__Atomic__ValuesAssignment_2_3_1 ) ) ;
    public final void rule__Atomic__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2489:1: ( ( ( rule__Atomic__ValuesAssignment_2_3_1 ) ) )
            // InternalMiniExpr.g:2490:1: ( ( rule__Atomic__ValuesAssignment_2_3_1 ) )
            {
            // InternalMiniExpr.g:2490:1: ( ( rule__Atomic__ValuesAssignment_2_3_1 ) )
            // InternalMiniExpr.g:2491:2: ( rule__Atomic__ValuesAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValuesAssignment_2_3_1()); 
            }
            // InternalMiniExpr.g:2492:2: ( rule__Atomic__ValuesAssignment_2_3_1 )
            // InternalMiniExpr.g:2492:3: rule__Atomic__ValuesAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValuesAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValuesAssignment_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2_3__1__Impl"


    // $ANTLR start "rule__Ref__Group__0"
    // InternalMiniExpr.g:2501:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2505:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // InternalMiniExpr.g:2506:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Ref__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__0"


    // $ANTLR start "rule__Ref__Group__0__Impl"
    // InternalMiniExpr.g:2513:1: rule__Ref__Group__0__Impl : ( ruleSimpleVarRef ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2517:1: ( ( ruleSimpleVarRef ) )
            // InternalMiniExpr.g:2518:1: ( ruleSimpleVarRef )
            {
            // InternalMiniExpr.g:2518:1: ( ruleSimpleVarRef )
            // InternalMiniExpr.g:2519:2: ruleSimpleVarRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getSimpleVarRefParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSimpleVarRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getSimpleVarRefParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__0__Impl"


    // $ANTLR start "rule__Ref__Group__1"
    // InternalMiniExpr.g:2528:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2532:1: ( rule__Ref__Group__1__Impl )
            // InternalMiniExpr.g:2533:2: rule__Ref__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__1"


    // $ANTLR start "rule__Ref__Group__1__Impl"
    // InternalMiniExpr.g:2539:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__Alternatives_1 )* ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2543:1: ( ( ( rule__Ref__Alternatives_1 )* ) )
            // InternalMiniExpr.g:2544:1: ( ( rule__Ref__Alternatives_1 )* )
            {
            // InternalMiniExpr.g:2544:1: ( ( rule__Ref__Alternatives_1 )* )
            // InternalMiniExpr.g:2545:2: ( rule__Ref__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getAlternatives_1()); 
            }
            // InternalMiniExpr.g:2546:2: ( rule__Ref__Alternatives_1 )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalMiniExpr.g:2546:3: rule__Ref__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Ref__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__1__Impl"


    // $ANTLR start "rule__Ref__Group_1_0__0"
    // InternalMiniExpr.g:2555:1: rule__Ref__Group_1_0__0 : rule__Ref__Group_1_0__0__Impl rule__Ref__Group_1_0__1 ;
    public final void rule__Ref__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2559:1: ( rule__Ref__Group_1_0__0__Impl rule__Ref__Group_1_0__1 )
            // InternalMiniExpr.g:2560:2: rule__Ref__Group_1_0__0__Impl rule__Ref__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Ref__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__0"


    // $ANTLR start "rule__Ref__Group_1_0__0__Impl"
    // InternalMiniExpr.g:2567:1: rule__Ref__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Ref__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2571:1: ( ( () ) )
            // InternalMiniExpr.g:2572:1: ( () )
            {
            // InternalMiniExpr.g:2572:1: ( () )
            // InternalMiniExpr.g:2573:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getArrayRefArrayAction_1_0_0()); 
            }
            // InternalMiniExpr.g:2574:2: ()
            // InternalMiniExpr.g:2574:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getArrayRefArrayAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__0__Impl"


    // $ANTLR start "rule__Ref__Group_1_0__1"
    // InternalMiniExpr.g:2582:1: rule__Ref__Group_1_0__1 : rule__Ref__Group_1_0__1__Impl rule__Ref__Group_1_0__2 ;
    public final void rule__Ref__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2586:1: ( rule__Ref__Group_1_0__1__Impl rule__Ref__Group_1_0__2 )
            // InternalMiniExpr.g:2587:2: rule__Ref__Group_1_0__1__Impl rule__Ref__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Ref__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__1"


    // $ANTLR start "rule__Ref__Group_1_0__1__Impl"
    // InternalMiniExpr.g:2594:1: rule__Ref__Group_1_0__1__Impl : ( '[' ) ;
    public final void rule__Ref__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2598:1: ( ( '[' ) )
            // InternalMiniExpr.g:2599:1: ( '[' )
            {
            // InternalMiniExpr.g:2599:1: ( '[' )
            // InternalMiniExpr.g:2600:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_1_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getLeftSquareBracketKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__1__Impl"


    // $ANTLR start "rule__Ref__Group_1_0__2"
    // InternalMiniExpr.g:2609:1: rule__Ref__Group_1_0__2 : rule__Ref__Group_1_0__2__Impl rule__Ref__Group_1_0__3 ;
    public final void rule__Ref__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2613:1: ( rule__Ref__Group_1_0__2__Impl rule__Ref__Group_1_0__3 )
            // InternalMiniExpr.g:2614:2: rule__Ref__Group_1_0__2__Impl rule__Ref__Group_1_0__3
            {
            pushFollow(FOLLOW_31);
            rule__Ref__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__2"


    // $ANTLR start "rule__Ref__Group_1_0__2__Impl"
    // InternalMiniExpr.g:2621:1: rule__Ref__Group_1_0__2__Impl : ( ( rule__Ref__IndicesAssignment_1_0_2 ) ) ;
    public final void rule__Ref__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2625:1: ( ( ( rule__Ref__IndicesAssignment_1_0_2 ) ) )
            // InternalMiniExpr.g:2626:1: ( ( rule__Ref__IndicesAssignment_1_0_2 ) )
            {
            // InternalMiniExpr.g:2626:1: ( ( rule__Ref__IndicesAssignment_1_0_2 ) )
            // InternalMiniExpr.g:2627:2: ( rule__Ref__IndicesAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getIndicesAssignment_1_0_2()); 
            }
            // InternalMiniExpr.g:2628:2: ( rule__Ref__IndicesAssignment_1_0_2 )
            // InternalMiniExpr.g:2628:3: rule__Ref__IndicesAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Ref__IndicesAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getIndicesAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__2__Impl"


    // $ANTLR start "rule__Ref__Group_1_0__3"
    // InternalMiniExpr.g:2636:1: rule__Ref__Group_1_0__3 : rule__Ref__Group_1_0__3__Impl rule__Ref__Group_1_0__4 ;
    public final void rule__Ref__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2640:1: ( rule__Ref__Group_1_0__3__Impl rule__Ref__Group_1_0__4 )
            // InternalMiniExpr.g:2641:2: rule__Ref__Group_1_0__3__Impl rule__Ref__Group_1_0__4
            {
            pushFollow(FOLLOW_31);
            rule__Ref__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__3"


    // $ANTLR start "rule__Ref__Group_1_0__3__Impl"
    // InternalMiniExpr.g:2648:1: rule__Ref__Group_1_0__3__Impl : ( ( rule__Ref__Group_1_0_3__0 )* ) ;
    public final void rule__Ref__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2652:1: ( ( ( rule__Ref__Group_1_0_3__0 )* ) )
            // InternalMiniExpr.g:2653:1: ( ( rule__Ref__Group_1_0_3__0 )* )
            {
            // InternalMiniExpr.g:2653:1: ( ( rule__Ref__Group_1_0_3__0 )* )
            // InternalMiniExpr.g:2654:2: ( rule__Ref__Group_1_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getGroup_1_0_3()); 
            }
            // InternalMiniExpr.g:2655:2: ( rule__Ref__Group_1_0_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMiniExpr.g:2655:3: rule__Ref__Group_1_0_3__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Ref__Group_1_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getGroup_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__3__Impl"


    // $ANTLR start "rule__Ref__Group_1_0__4"
    // InternalMiniExpr.g:2663:1: rule__Ref__Group_1_0__4 : rule__Ref__Group_1_0__4__Impl ;
    public final void rule__Ref__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2667:1: ( rule__Ref__Group_1_0__4__Impl )
            // InternalMiniExpr.g:2668:2: rule__Ref__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__4"


    // $ANTLR start "rule__Ref__Group_1_0__4__Impl"
    // InternalMiniExpr.g:2674:1: rule__Ref__Group_1_0__4__Impl : ( ']' ) ;
    public final void rule__Ref__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2678:1: ( ( ']' ) )
            // InternalMiniExpr.g:2679:1: ( ']' )
            {
            // InternalMiniExpr.g:2679:1: ( ']' )
            // InternalMiniExpr.g:2680:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getRightSquareBracketKeyword_1_0_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getRightSquareBracketKeyword_1_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0__4__Impl"


    // $ANTLR start "rule__Ref__Group_1_0_3__0"
    // InternalMiniExpr.g:2690:1: rule__Ref__Group_1_0_3__0 : rule__Ref__Group_1_0_3__0__Impl rule__Ref__Group_1_0_3__1 ;
    public final void rule__Ref__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2694:1: ( rule__Ref__Group_1_0_3__0__Impl rule__Ref__Group_1_0_3__1 )
            // InternalMiniExpr.g:2695:2: rule__Ref__Group_1_0_3__0__Impl rule__Ref__Group_1_0_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Ref__Group_1_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0_3__0"


    // $ANTLR start "rule__Ref__Group_1_0_3__0__Impl"
    // InternalMiniExpr.g:2702:1: rule__Ref__Group_1_0_3__0__Impl : ( ',' ) ;
    public final void rule__Ref__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2706:1: ( ( ',' ) )
            // InternalMiniExpr.g:2707:1: ( ',' )
            {
            // InternalMiniExpr.g:2707:1: ( ',' )
            // InternalMiniExpr.g:2708:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getCommaKeyword_1_0_3_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getCommaKeyword_1_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Ref__Group_1_0_3__1"
    // InternalMiniExpr.g:2717:1: rule__Ref__Group_1_0_3__1 : rule__Ref__Group_1_0_3__1__Impl ;
    public final void rule__Ref__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2721:1: ( rule__Ref__Group_1_0_3__1__Impl )
            // InternalMiniExpr.g:2722:2: rule__Ref__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0_3__1"


    // $ANTLR start "rule__Ref__Group_1_0_3__1__Impl"
    // InternalMiniExpr.g:2728:1: rule__Ref__Group_1_0_3__1__Impl : ( ( rule__Ref__IndicesAssignment_1_0_3_1 ) ) ;
    public final void rule__Ref__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2732:1: ( ( ( rule__Ref__IndicesAssignment_1_0_3_1 ) ) )
            // InternalMiniExpr.g:2733:1: ( ( rule__Ref__IndicesAssignment_1_0_3_1 ) )
            {
            // InternalMiniExpr.g:2733:1: ( ( rule__Ref__IndicesAssignment_1_0_3_1 ) )
            // InternalMiniExpr.g:2734:2: ( rule__Ref__IndicesAssignment_1_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getIndicesAssignment_1_0_3_1()); 
            }
            // InternalMiniExpr.g:2735:2: ( rule__Ref__IndicesAssignment_1_0_3_1 )
            // InternalMiniExpr.g:2735:3: rule__Ref__IndicesAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ref__IndicesAssignment_1_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getIndicesAssignment_1_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Ref__Group_1_1__0"
    // InternalMiniExpr.g:2744:1: rule__Ref__Group_1_1__0 : rule__Ref__Group_1_1__0__Impl rule__Ref__Group_1_1__1 ;
    public final void rule__Ref__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2748:1: ( rule__Ref__Group_1_1__0__Impl rule__Ref__Group_1_1__1 )
            // InternalMiniExpr.g:2749:2: rule__Ref__Group_1_1__0__Impl rule__Ref__Group_1_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Ref__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_1__0"


    // $ANTLR start "rule__Ref__Group_1_1__0__Impl"
    // InternalMiniExpr.g:2756:1: rule__Ref__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Ref__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2760:1: ( ( () ) )
            // InternalMiniExpr.g:2761:1: ( () )
            {
            // InternalMiniExpr.g:2761:1: ( () )
            // InternalMiniExpr.g:2762:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getPropertyRefObjectAction_1_1_0()); 
            }
            // InternalMiniExpr.g:2763:2: ()
            // InternalMiniExpr.g:2763:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getPropertyRefObjectAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_1__0__Impl"


    // $ANTLR start "rule__Ref__Group_1_1__1"
    // InternalMiniExpr.g:2771:1: rule__Ref__Group_1_1__1 : rule__Ref__Group_1_1__1__Impl rule__Ref__Group_1_1__2 ;
    public final void rule__Ref__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2775:1: ( rule__Ref__Group_1_1__1__Impl rule__Ref__Group_1_1__2 )
            // InternalMiniExpr.g:2776:2: rule__Ref__Group_1_1__1__Impl rule__Ref__Group_1_1__2
            {
            pushFollow(FOLLOW_35);
            rule__Ref__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_1__1"


    // $ANTLR start "rule__Ref__Group_1_1__1__Impl"
    // InternalMiniExpr.g:2783:1: rule__Ref__Group_1_1__1__Impl : ( '.' ) ;
    public final void rule__Ref__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2787:1: ( ( '.' ) )
            // InternalMiniExpr.g:2788:1: ( '.' )
            {
            // InternalMiniExpr.g:2788:1: ( '.' )
            // InternalMiniExpr.g:2789:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getFullStopKeyword_1_1_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getFullStopKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_1__1__Impl"


    // $ANTLR start "rule__Ref__Group_1_1__2"
    // InternalMiniExpr.g:2798:1: rule__Ref__Group_1_1__2 : rule__Ref__Group_1_1__2__Impl ;
    public final void rule__Ref__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2802:1: ( rule__Ref__Group_1_1__2__Impl )
            // InternalMiniExpr.g:2803:2: rule__Ref__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ref__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_1__2"


    // $ANTLR start "rule__Ref__Group_1_1__2__Impl"
    // InternalMiniExpr.g:2809:1: rule__Ref__Group_1_1__2__Impl : ( ( rule__Ref__PropertyAssignment_1_1_2 ) ) ;
    public final void rule__Ref__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2813:1: ( ( ( rule__Ref__PropertyAssignment_1_1_2 ) ) )
            // InternalMiniExpr.g:2814:1: ( ( rule__Ref__PropertyAssignment_1_1_2 ) )
            {
            // InternalMiniExpr.g:2814:1: ( ( rule__Ref__PropertyAssignment_1_1_2 ) )
            // InternalMiniExpr.g:2815:2: ( rule__Ref__PropertyAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getPropertyAssignment_1_1_2()); 
            }
            // InternalMiniExpr.g:2816:2: ( rule__Ref__PropertyAssignment_1_1_2 )
            // InternalMiniExpr.g:2816:3: rule__Ref__PropertyAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Ref__PropertyAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getPropertyAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_1__2__Impl"


    // $ANTLR start "rule__ArraySize__Group__0"
    // InternalMiniExpr.g:2825:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2829:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // InternalMiniExpr.g:2830:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__0"


    // $ANTLR start "rule__ArraySize__Group__0__Impl"
    // InternalMiniExpr.g:2837:1: rule__ArraySize__Group__0__Impl : ( '|' ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2841:1: ( ( '|' ) )
            // InternalMiniExpr.g:2842:1: ( '|' )
            {
            // InternalMiniExpr.g:2842:1: ( '|' )
            // InternalMiniExpr.g:2843:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getVerticalLineKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getVerticalLineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__0__Impl"


    // $ANTLR start "rule__ArraySize__Group__1"
    // InternalMiniExpr.g:2852:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2856:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // InternalMiniExpr.g:2857:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__1"


    // $ANTLR start "rule__ArraySize__Group__1__Impl"
    // InternalMiniExpr.g:2864:1: rule__ArraySize__Group__1__Impl : ( ( rule__ArraySize__ArrayAssignment_1 ) ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2868:1: ( ( ( rule__ArraySize__ArrayAssignment_1 ) ) )
            // InternalMiniExpr.g:2869:1: ( ( rule__ArraySize__ArrayAssignment_1 ) )
            {
            // InternalMiniExpr.g:2869:1: ( ( rule__ArraySize__ArrayAssignment_1 ) )
            // InternalMiniExpr.g:2870:2: ( rule__ArraySize__ArrayAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArrayAssignment_1()); 
            }
            // InternalMiniExpr.g:2871:2: ( rule__ArraySize__ArrayAssignment_1 )
            // InternalMiniExpr.g:2871:3: rule__ArraySize__ArrayAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArraySize__ArrayAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getArrayAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__1__Impl"


    // $ANTLR start "rule__ArraySize__Group__2"
    // InternalMiniExpr.g:2879:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2883:1: ( rule__ArraySize__Group__2__Impl )
            // InternalMiniExpr.g:2884:2: rule__ArraySize__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__2"


    // $ANTLR start "rule__ArraySize__Group__2__Impl"
    // InternalMiniExpr.g:2890:1: rule__ArraySize__Group__2__Impl : ( '|' ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2894:1: ( ( '|' ) )
            // InternalMiniExpr.g:2895:1: ( '|' )
            {
            // InternalMiniExpr.g:2895:1: ( '|' )
            // InternalMiniExpr.g:2896:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getVerticalLineKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getVerticalLineKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__Group__2__Impl"


    // $ANTLR start "rule__Model__ExpressionsAssignment"
    // InternalMiniExpr.g:2906:1: rule__Model__ExpressionsAssignment : ( ruleExpression ) ;
    public final void rule__Model__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2910:1: ( ( ruleExpression ) )
            // InternalMiniExpr.g:2911:2: ( ruleExpression )
            {
            // InternalMiniExpr.g:2911:2: ( ruleExpression )
            // InternalMiniExpr.g:2912:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ExpressionsAssignment"


    // $ANTLR start "rule__ContractedIf__ThenAssignment_1_2"
    // InternalMiniExpr.g:2921:1: rule__ContractedIf__ThenAssignment_1_2 : ( ruleOr ) ;
    public final void rule__ContractedIf__ThenAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2925:1: ( ( ruleOr ) )
            // InternalMiniExpr.g:2926:2: ( ruleOr )
            {
            // InternalMiniExpr.g:2926:2: ( ruleOr )
            // InternalMiniExpr.g:2927:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getThenOrParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getThenOrParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__ThenAssignment_1_2"


    // $ANTLR start "rule__ContractedIf__ElseAssignment_1_4"
    // InternalMiniExpr.g:2936:1: rule__ContractedIf__ElseAssignment_1_4 : ( ruleOr ) ;
    public final void rule__ContractedIf__ElseAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2940:1: ( ( ruleOr ) )
            // InternalMiniExpr.g:2941:2: ( ruleOr )
            {
            // InternalMiniExpr.g:2941:2: ( ruleOr )
            // InternalMiniExpr.g:2942:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContractedIfAccess().getElseOrParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContractedIfAccess().getElseOrParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContractedIf__ElseAssignment_1_4"


    // $ANTLR start "rule__Or__OpAssignment_1_1"
    // InternalMiniExpr.g:2951:1: rule__Or__OpAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__Or__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2955:1: ( ( ( '||' ) ) )
            // InternalMiniExpr.g:2956:2: ( ( '||' ) )
            {
            // InternalMiniExpr.g:2956:2: ( ( '||' ) )
            // InternalMiniExpr.g:2957:3: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            // InternalMiniExpr.g:2958:3: ( '||' )
            // InternalMiniExpr.g:2959:4: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__OpAssignment_1_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMiniExpr.g:2970:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2974:1: ( ( ruleAnd ) )
            // InternalMiniExpr.g:2975:2: ( ruleAnd )
            {
            // InternalMiniExpr.g:2975:2: ( ruleAnd )
            // InternalMiniExpr.g:2976:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__OpAssignment_1_1"
    // InternalMiniExpr.g:2985:1: rule__And__OpAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__And__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:2989:1: ( ( ( '&&' ) ) )
            // InternalMiniExpr.g:2990:2: ( ( '&&' ) )
            {
            // InternalMiniExpr.g:2990:2: ( ( '&&' ) )
            // InternalMiniExpr.g:2991:3: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            // InternalMiniExpr.g:2992:3: ( '&&' )
            // InternalMiniExpr.g:2993:4: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__OpAssignment_1_1"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMiniExpr.g:3004:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3008:1: ( ( ruleEquality ) )
            // InternalMiniExpr.g:3009:2: ( ruleEquality )
            {
            // InternalMiniExpr.g:3009:2: ( ruleEquality )
            // InternalMiniExpr.g:3010:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalMiniExpr.g:3019:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3023:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalMiniExpr.g:3024:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalMiniExpr.g:3024:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalMiniExpr.g:3025:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalMiniExpr.g:3026:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalMiniExpr.g:3026:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalMiniExpr.g:3034:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3038:1: ( ( ruleComparison ) )
            // InternalMiniExpr.g:3039:2: ( ruleComparison )
            {
            // InternalMiniExpr.g:3039:2: ( ruleComparison )
            // InternalMiniExpr.g:3040:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalMiniExpr.g:3049:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3053:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalMiniExpr.g:3054:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalMiniExpr.g:3054:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalMiniExpr.g:3055:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalMiniExpr.g:3056:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalMiniExpr.g:3056:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalMiniExpr.g:3064:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3068:1: ( ( rulePlusOrMinus ) )
            // InternalMiniExpr.g:3069:2: ( rulePlusOrMinus )
            {
            // InternalMiniExpr.g:3069:2: ( rulePlusOrMinus )
            // InternalMiniExpr.g:3070:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__OpAssignment_1_0_0_1"
    // InternalMiniExpr.g:3079:1: rule__PlusOrMinus__OpAssignment_1_0_0_1 : ( ( '+' ) ) ;
    public final void rule__PlusOrMinus__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3083:1: ( ( ( '+' ) ) )
            // InternalMiniExpr.g:3084:2: ( ( '+' ) )
            {
            // InternalMiniExpr.g:3084:2: ( ( '+' ) )
            // InternalMiniExpr.g:3085:3: ( '+' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); 
            }
            // InternalMiniExpr.g:3086:3: ( '+' )
            // InternalMiniExpr.g:3087:4: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__PlusOrMinus__OpAssignment_1_0_1_1"
    // InternalMiniExpr.g:3098:1: rule__PlusOrMinus__OpAssignment_1_0_1_1 : ( ( '-' ) ) ;
    public final void rule__PlusOrMinus__OpAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3102:1: ( ( ( '-' ) ) )
            // InternalMiniExpr.g:3103:2: ( ( '-' ) )
            {
            // InternalMiniExpr.g:3103:2: ( ( '-' ) )
            // InternalMiniExpr.g:3104:3: ( '-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); 
            }
            // InternalMiniExpr.g:3105:3: ( '-' )
            // InternalMiniExpr.g:3106:4: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__OpAssignment_1_0_1_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMiniExpr.g:3117:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3121:1: ( ( ruleMulOrDiv ) )
            // InternalMiniExpr.g:3122:2: ( ruleMulOrDiv )
            {
            // InternalMiniExpr.g:3122:2: ( ruleMulOrDiv )
            // InternalMiniExpr.g:3123:3: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_0_1"
    // InternalMiniExpr.g:3132:1: rule__MulOrDiv__OpAssignment_1_0_0_1 : ( ( '*' ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3136:1: ( ( ( '*' ) ) )
            // InternalMiniExpr.g:3137:2: ( ( '*' ) )
            {
            // InternalMiniExpr.g:3137:2: ( ( '*' ) )
            // InternalMiniExpr.g:3138:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0()); 
            }
            // InternalMiniExpr.g:3139:3: ( '*' )
            // InternalMiniExpr.g:3140:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_0_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_1_1"
    // InternalMiniExpr.g:3151:1: rule__MulOrDiv__OpAssignment_1_0_1_1 : ( ( '/' ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3155:1: ( ( ( '/' ) ) )
            // InternalMiniExpr.g:3156:2: ( ( '/' ) )
            {
            // InternalMiniExpr.g:3156:2: ( ( '/' ) )
            // InternalMiniExpr.g:3157:3: ( '/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_1_0()); 
            }
            // InternalMiniExpr.g:3158:3: ( '/' )
            // InternalMiniExpr.g:3159:4: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalMiniExpr.g:3170:1: rule__MulOrDiv__RightAssignment_1_1 : ( ruleModulo ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3174:1: ( ( ruleModulo ) )
            // InternalMiniExpr.g:3175:2: ( ruleModulo )
            {
            // InternalMiniExpr.g:3175:2: ( ruleModulo )
            // InternalMiniExpr.g:3176:3: ruleModulo
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightModuloParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModulo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightModuloParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Modulo__OpAssignment_1_1"
    // InternalMiniExpr.g:3185:1: rule__Modulo__OpAssignment_1_1 : ( ( '%' ) ) ;
    public final void rule__Modulo__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3189:1: ( ( ( '%' ) ) )
            // InternalMiniExpr.g:3190:2: ( ( '%' ) )
            {
            // InternalMiniExpr.g:3190:2: ( ( '%' ) )
            // InternalMiniExpr.g:3191:3: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getOpPercentSignKeyword_1_1_0()); 
            }
            // InternalMiniExpr.g:3192:3: ( '%' )
            // InternalMiniExpr.g:3193:4: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getOpPercentSignKeyword_1_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getOpPercentSignKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getOpPercentSignKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__OpAssignment_1_1"


    // $ANTLR start "rule__Modulo__RightAssignment_1_2"
    // InternalMiniExpr.g:3204:1: rule__Modulo__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Modulo__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3208:1: ( ( rulePrimary ) )
            // InternalMiniExpr.g:3209:2: ( rulePrimary )
            {
            // InternalMiniExpr.g:3209:2: ( rulePrimary )
            // InternalMiniExpr.g:3210:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuloAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuloAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modulo__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_0_2"
    // InternalMiniExpr.g:3219:1: rule__Primary__ExpressionAssignment_0_2 : ( ruleExpression ) ;
    public final void rule__Primary__ExpressionAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3223:1: ( ( ruleExpression ) )
            // InternalMiniExpr.g:3224:2: ( ruleExpression )
            {
            // InternalMiniExpr.g:3224:2: ( ruleExpression )
            // InternalMiniExpr.g:3225:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_0_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalMiniExpr.g:3234:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3238:1: ( ( rulePrimary ) )
            // InternalMiniExpr.g:3239:2: ( rulePrimary )
            {
            // InternalMiniExpr.g:3239:2: ( rulePrimary )
            // InternalMiniExpr.g:3240:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_2_2"
    // InternalMiniExpr.g:3249:1: rule__Primary__ExpressionAssignment_2_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3253:1: ( ( rulePrimary ) )
            // InternalMiniExpr.g:3254:2: ( rulePrimary )
            {
            // InternalMiniExpr.g:3254:2: ( rulePrimary )
            // InternalMiniExpr.g:3255:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_2_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalMiniExpr.g:3264:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_NUMBER ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3268:1: ( ( RULE_NUMBER ) )
            // InternalMiniExpr.g:3269:2: ( RULE_NUMBER )
            {
            // InternalMiniExpr.g:3269:2: ( RULE_NUMBER )
            // InternalMiniExpr.g:3270:3: RULE_NUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1_0"
    // InternalMiniExpr.g:3279:1: rule__Atomic__ValueAssignment_1_1_0 : ( ( 'true' ) ) ;
    public final void rule__Atomic__ValueAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3283:1: ( ( ( 'true' ) ) )
            // InternalMiniExpr.g:3284:2: ( ( 'true' ) )
            {
            // InternalMiniExpr.g:3284:2: ( ( 'true' ) )
            // InternalMiniExpr.g:3285:3: ( 'true' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0()); 
            }
            // InternalMiniExpr.g:3286:3: ( 'true' )
            // InternalMiniExpr.g:3287:4: 'true'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1_0"


    // $ANTLR start "rule__Atomic__ValuesAssignment_2_2"
    // InternalMiniExpr.g:3298:1: rule__Atomic__ValuesAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Atomic__ValuesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3302:1: ( ( ruleExpression ) )
            // InternalMiniExpr.g:3303:2: ( ruleExpression )
            {
            // InternalMiniExpr.g:3303:2: ( ruleExpression )
            // InternalMiniExpr.g:3304:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValuesExpressionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValuesExpressionParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValuesAssignment_2_2"


    // $ANTLR start "rule__Atomic__ValuesAssignment_2_3_1"
    // InternalMiniExpr.g:3313:1: rule__Atomic__ValuesAssignment_2_3_1 : ( ruleExpression ) ;
    public final void rule__Atomic__ValuesAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3317:1: ( ( ruleExpression ) )
            // InternalMiniExpr.g:3318:2: ( ruleExpression )
            {
            // InternalMiniExpr.g:3318:2: ( ruleExpression )
            // InternalMiniExpr.g:3319:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicAccess().getValuesExpressionParserRuleCall_2_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicAccess().getValuesExpressionParserRuleCall_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValuesAssignment_2_3_1"


    // $ANTLR start "rule__Ref__IndicesAssignment_1_0_2"
    // InternalMiniExpr.g:3328:1: rule__Ref__IndicesAssignment_1_0_2 : ( ruleExpression ) ;
    public final void rule__Ref__IndicesAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3332:1: ( ( ruleExpression ) )
            // InternalMiniExpr.g:3333:2: ( ruleExpression )
            {
            // InternalMiniExpr.g:3333:2: ( ruleExpression )
            // InternalMiniExpr.g:3334:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__IndicesAssignment_1_0_2"


    // $ANTLR start "rule__Ref__IndicesAssignment_1_0_3_1"
    // InternalMiniExpr.g:3343:1: rule__Ref__IndicesAssignment_1_0_3_1 : ( ruleExpression ) ;
    public final void rule__Ref__IndicesAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3347:1: ( ( ruleExpression ) )
            // InternalMiniExpr.g:3348:2: ( ruleExpression )
            {
            // InternalMiniExpr.g:3348:2: ( ruleExpression )
            // InternalMiniExpr.g:3349:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__IndicesAssignment_1_0_3_1"


    // $ANTLR start "rule__Ref__PropertyAssignment_1_1_2"
    // InternalMiniExpr.g:3358:1: rule__Ref__PropertyAssignment_1_1_2 : ( RULE_ID ) ;
    public final void rule__Ref__PropertyAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3362:1: ( ( RULE_ID ) )
            // InternalMiniExpr.g:3363:2: ( RULE_ID )
            {
            // InternalMiniExpr.g:3363:2: ( RULE_ID )
            // InternalMiniExpr.g:3364:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefAccess().getPropertyIDTerminalRuleCall_1_1_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefAccess().getPropertyIDTerminalRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__PropertyAssignment_1_1_2"


    // $ANTLR start "rule__SimpleVarRef__TargetAssignment"
    // InternalMiniExpr.g:3373:1: rule__SimpleVarRef__TargetAssignment : ( RULE_ID ) ;
    public final void rule__SimpleVarRef__TargetAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3377:1: ( ( RULE_ID ) )
            // InternalMiniExpr.g:3378:2: ( RULE_ID )
            {
            // InternalMiniExpr.g:3378:2: ( RULE_ID )
            // InternalMiniExpr.g:3379:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSimpleVarRefAccess().getTargetIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSimpleVarRefAccess().getTargetIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleVarRef__TargetAssignment"


    // $ANTLR start "rule__ArraySize__ArrayAssignment_1"
    // InternalMiniExpr.g:3388:1: rule__ArraySize__ArrayAssignment_1 : ( ruleRef ) ;
    public final void rule__ArraySize__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniExpr.g:3392:1: ( ( ruleRef ) )
            // InternalMiniExpr.g:3393:2: ( ruleRef )
            {
            // InternalMiniExpr.g:3393:2: ( ruleRef )
            // InternalMiniExpr.g:3394:3: ruleRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArrayRefParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeAccess().getArrayRefParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySize__ArrayAssignment_1"

    // $ANTLR start synpred22_InternalMiniExpr
    public final void synpred22_InternalMiniExpr_fragment() throws RecognitionException {   
        // InternalMiniExpr.g:1412:3: ( rule__PlusOrMinus__Group_1__0 )
        // InternalMiniExpr.g:1412:3: rule__PlusOrMinus__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__PlusOrMinus__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalMiniExpr

    // $ANTLR start synpred26_InternalMiniExpr
    public final void synpred26_InternalMiniExpr_fragment() throws RecognitionException {   
        // InternalMiniExpr.g:2546:3: ( rule__Ref__Alternatives_1 )
        // InternalMiniExpr.g:2546:3: rule__Ref__Alternatives_1
        {
        pushFollow(FOLLOW_2);
        rule__Ref__Alternatives_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalMiniExpr

    // Delegated rules

    public final boolean synpred22_InternalMiniExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalMiniExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalMiniExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalMiniExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\1\30\uffff";
    static final String dfa_3s = "\1\4\13\uffff\1\0\14\uffff";
    static final String dfa_4s = "\1\44\13\uffff\1\0\14\uffff";
    static final String dfa_5s = "\1\uffff\1\2\26\uffff\1\1";
    static final String dfa_6s = "\14\uffff\1\0\14\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\6\uffff\13\1\1\14\4\1\1\uffff\3\1\1\30\3\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1412:2: ( rule__PlusOrMinus__Group_1__0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_12 = input.LA(1);

                         
                        int index15_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMiniExpr()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index15_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\35\uffff";
    static final String dfa_9s = "\1\1\34\uffff";
    static final String dfa_10s = "\1\4\24\uffff\1\0\7\uffff";
    static final String dfa_11s = "\1\44\24\uffff\1\0\7\uffff";
    static final String dfa_12s = "\1\uffff\1\2\32\uffff\1\1";
    static final String dfa_13s = "\25\uffff\1\0\7\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\6\uffff\15\1\1\25\2\1\1\34\10\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 2546:2: ( rule__Ref__Alternatives_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_21 = input.LA(1);

                         
                        int index19_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalMiniExpr()) ) {s = 28;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index19_21);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001023A40032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001023A40030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003C002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020000000L});

}