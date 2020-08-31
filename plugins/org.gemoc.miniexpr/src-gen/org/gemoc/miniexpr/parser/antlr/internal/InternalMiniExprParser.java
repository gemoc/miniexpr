package org.gemoc.miniexpr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.miniexpr.services.MiniExprGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniExprParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'!'", "'true'", "'false'", "'['", "','", "']'", "'.'", "'|'"
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private MiniExprGrammarAccess grammarAccess;

        public InternalMiniExprParser(TokenStream input, MiniExprGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MiniExprGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMiniExpr.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMiniExpr.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalMiniExpr.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMiniExpr.g:77:1: ruleModel returns [EObject current=null] : ( (lv_expressions_0_0= ruleExpression ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:83:2: ( ( (lv_expressions_0_0= ruleExpression ) )* )
            // InternalMiniExpr.g:84:2: ( (lv_expressions_0_0= ruleExpression ) )*
            {
            // InternalMiniExpr.g:84:2: ( (lv_expressions_0_0= ruleExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_NUMBER && LA1_0<=RULE_ID)||LA1_0==23||LA1_0==27||(LA1_0>=29 && LA1_0<=32)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniExpr.g:85:3: (lv_expressions_0_0= ruleExpression )
            	    {
            	    // InternalMiniExpr.g:85:3: (lv_expressions_0_0= ruleExpression )
            	    // InternalMiniExpr.g:86:4: lv_expressions_0_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"expressions",
            	      					lv_expressions_0_0,
            	      					"org.gemoc.miniexpr.MiniExpr.Expression");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniExpr.g:106:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniExpr.g:106:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniExpr.g:107:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniExpr.g:113:1: ruleExpression returns [EObject current=null] : this_ContractedIf_0= ruleContractedIf ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ContractedIf_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:119:2: (this_ContractedIf_0= ruleContractedIf )
            // InternalMiniExpr.g:120:2: this_ContractedIf_0= ruleContractedIf
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getContractedIfParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ContractedIf_0=ruleContractedIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ContractedIf_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleContractedIf"
    // InternalMiniExpr.g:134:1: entryRuleContractedIf returns [EObject current=null] : iv_ruleContractedIf= ruleContractedIf EOF ;
    public final EObject entryRuleContractedIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractedIf = null;


        try {
            // InternalMiniExpr.g:134:53: (iv_ruleContractedIf= ruleContractedIf EOF )
            // InternalMiniExpr.g:135:2: iv_ruleContractedIf= ruleContractedIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractedIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContractedIf=ruleContractedIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContractedIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContractedIf"


    // $ANTLR start "ruleContractedIf"
    // InternalMiniExpr.g:141:1: ruleContractedIf returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* ) ;
    public final EObject ruleContractedIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:147:2: ( (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* ) )
            // InternalMiniExpr.g:148:2: (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* )
            {
            // InternalMiniExpr.g:148:2: (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* )
            // InternalMiniExpr.g:149:3: this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getContractedIfAccess().getOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_4);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Or_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:160:3: ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMiniExpr.g:161:4: () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) )
            	    {
            	    // InternalMiniExpr.g:161:4: ()
            	    // InternalMiniExpr.g:162:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getContractedIfAccess().getContractedIfConditionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getContractedIfAccess().getQuestionMarkKeyword_1_1());
            	      			
            	    }
            	    // InternalMiniExpr.g:175:4: ( (lv_then_3_0= ruleOr ) )
            	    // InternalMiniExpr.g:176:5: (lv_then_3_0= ruleOr )
            	    {
            	    // InternalMiniExpr.g:176:5: (lv_then_3_0= ruleOr )
            	    // InternalMiniExpr.g:177:6: lv_then_3_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContractedIfAccess().getThenOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_then_3_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContractedIfRule());
            	      						}
            	      						set(
            	      							current,
            	      							"then",
            	      							lv_then_3_0,
            	      							"org.gemoc.miniexpr.MiniExpr.Or");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getContractedIfAccess().getColonKeyword_1_3());
            	      			
            	    }
            	    // InternalMiniExpr.g:198:4: ( (lv_else_5_0= ruleOr ) )
            	    // InternalMiniExpr.g:199:5: (lv_else_5_0= ruleOr )
            	    {
            	    // InternalMiniExpr.g:199:5: (lv_else_5_0= ruleOr )
            	    // InternalMiniExpr.g:200:6: lv_else_5_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContractedIfAccess().getElseOrParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_else_5_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContractedIfRule());
            	      						}
            	      						set(
            	      							current,
            	      							"else",
            	      							lv_else_5_0,
            	      							"org.gemoc.miniexpr.MiniExpr.Or");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContractedIf"


    // $ANTLR start "entryRuleOr"
    // InternalMiniExpr.g:222:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMiniExpr.g:222:43: (iv_ruleOr= ruleOr EOF )
            // InternalMiniExpr.g:223:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMiniExpr.g:229:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:235:2: ( (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMiniExpr.g:236:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMiniExpr.g:236:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMiniExpr.g:237:3: this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:248:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniExpr.g:249:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMiniExpr.g:249:4: ()
            	    // InternalMiniExpr.g:250:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniExpr.g:259:4: ( (lv_op_2_0= '||' ) )
            	    // InternalMiniExpr.g:260:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalMiniExpr.g:260:5: (lv_op_2_0= '||' )
            	    // InternalMiniExpr.g:261:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMiniExpr.g:273:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMiniExpr.g:274:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMiniExpr.g:274:5: (lv_right_3_0= ruleAnd )
            	    // InternalMiniExpr.g:275:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.miniexpr.MiniExpr.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMiniExpr.g:297:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMiniExpr.g:297:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMiniExpr.g:298:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMiniExpr.g:304:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:310:2: ( (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMiniExpr.g:311:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMiniExpr.g:311:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMiniExpr.g:312:3: this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:323:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMiniExpr.g:324:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMiniExpr.g:324:4: ()
            	    // InternalMiniExpr.g:325:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniExpr.g:334:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalMiniExpr.g:335:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalMiniExpr.g:335:5: (lv_op_2_0= '&&' )
            	    // InternalMiniExpr.g:336:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMiniExpr.g:348:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMiniExpr.g:349:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMiniExpr.g:349:5: (lv_right_3_0= ruleEquality )
            	    // InternalMiniExpr.g:350:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.miniexpr.MiniExpr.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMiniExpr.g:372:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMiniExpr.g:372:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMiniExpr.g:373:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMiniExpr.g:379:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:385:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalMiniExpr.g:386:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalMiniExpr.g:386:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalMiniExpr.g:387:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:398:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMiniExpr.g:399:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalMiniExpr.g:399:4: ()
            	    // InternalMiniExpr.g:400:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniExpr.g:409:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalMiniExpr.g:410:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalMiniExpr.g:410:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalMiniExpr.g:411:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalMiniExpr.g:411:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==16) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==17) ) {
            	        alt5=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMiniExpr.g:412:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,16,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniExpr.g:423:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMiniExpr.g:436:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalMiniExpr.g:437:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalMiniExpr.g:437:5: (lv_right_3_0= ruleComparison )
            	    // InternalMiniExpr.g:438:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.miniexpr.MiniExpr.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMiniExpr.g:460:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMiniExpr.g:460:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMiniExpr.g:461:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMiniExpr.g:467:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:473:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMiniExpr.g:474:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMiniExpr.g:474:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMiniExpr.g:475:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:486:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=21)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMiniExpr.g:487:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMiniExpr.g:487:4: ()
            	    // InternalMiniExpr.g:488:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniExpr.g:497:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalMiniExpr.g:498:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalMiniExpr.g:498:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalMiniExpr.g:499:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalMiniExpr.g:499:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt7=4;
            	    switch ( input.LA(1) ) {
            	    case 18:
            	        {
            	        alt7=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt7=2;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt7=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt7=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt7) {
            	        case 1 :
            	            // InternalMiniExpr.g:500:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniExpr.g:511:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMiniExpr.g:522:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMiniExpr.g:533:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMiniExpr.g:546:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMiniExpr.g:547:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMiniExpr.g:547:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMiniExpr.g:548:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.miniexpr.MiniExpr.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMiniExpr.g:570:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMiniExpr.g:570:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMiniExpr.g:571:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMiniExpr.g:577:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:583:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMiniExpr.g:584:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMiniExpr.g:584:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMiniExpr.g:585:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:596:3: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalMiniExpr.g:597:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMiniExpr.g:597:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==22) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==23) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMiniExpr.g:598:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            {
            	            // InternalMiniExpr.g:598:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            // InternalMiniExpr.g:599:6: () ( (lv_op_2_0= '+' ) )
            	            {
            	            // InternalMiniExpr.g:599:6: ()
            	            // InternalMiniExpr.g:600:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMiniExpr.g:609:6: ( (lv_op_2_0= '+' ) )
            	            // InternalMiniExpr.g:610:7: (lv_op_2_0= '+' )
            	            {
            	            // InternalMiniExpr.g:610:7: (lv_op_2_0= '+' )
            	            // InternalMiniExpr.g:611:8: lv_op_2_0= '+'
            	            {
            	            lv_op_2_0=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_0, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_0, "+");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniExpr.g:625:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            {
            	            // InternalMiniExpr.g:625:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            // InternalMiniExpr.g:626:6: () ( (lv_op_4_0= '-' ) )
            	            {
            	            // InternalMiniExpr.g:626:6: ()
            	            // InternalMiniExpr.g:627:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMiniExpr.g:636:6: ( (lv_op_4_0= '-' ) )
            	            // InternalMiniExpr.g:637:7: (lv_op_4_0= '-' )
            	            {
            	            // InternalMiniExpr.g:637:7: (lv_op_4_0= '-' )
            	            // InternalMiniExpr.g:638:8: lv_op_4_0= '-'
            	            {
            	            lv_op_4_0=(Token)match(input,23,FOLLOW_17); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_4_0, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_4_0, "-");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniExpr.g:652:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMiniExpr.g:653:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMiniExpr.g:653:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMiniExpr.g:654:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.gemoc.miniexpr.MiniExpr.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMiniExpr.g:676:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMiniExpr.g:676:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMiniExpr.g:677:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMiniExpr.g:683:1: ruleMulOrDiv returns [EObject current=null] : (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_Modulo_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:689:2: ( (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* ) )
            // InternalMiniExpr.g:690:2: (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* )
            {
            // InternalMiniExpr.g:690:2: (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* )
            // InternalMiniExpr.g:691:3: this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getModuloParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_Modulo_0=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Modulo_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:702:3: ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMiniExpr.g:703:4: ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) )
            	    {
            	    // InternalMiniExpr.g:703:4: ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==24) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==25) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMiniExpr.g:704:5: ( () ( (lv_op_2_0= '*' ) ) )
            	            {
            	            // InternalMiniExpr.g:704:5: ( () ( (lv_op_2_0= '*' ) ) )
            	            // InternalMiniExpr.g:705:6: () ( (lv_op_2_0= '*' ) )
            	            {
            	            // InternalMiniExpr.g:705:6: ()
            	            // InternalMiniExpr.g:706:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMulLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMiniExpr.g:715:6: ( (lv_op_2_0= '*' ) )
            	            // InternalMiniExpr.g:716:7: (lv_op_2_0= '*' )
            	            {
            	            // InternalMiniExpr.g:716:7: (lv_op_2_0= '*' )
            	            // InternalMiniExpr.g:717:8: lv_op_2_0= '*'
            	            {
            	            lv_op_2_0=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_0, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMulOrDivRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_0, "*");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMiniExpr.g:731:5: ( () ( (lv_op_4_0= '/' ) ) )
            	            {
            	            // InternalMiniExpr.g:731:5: ( () ( (lv_op_4_0= '/' ) ) )
            	            // InternalMiniExpr.g:732:6: () ( (lv_op_4_0= '/' ) )
            	            {
            	            // InternalMiniExpr.g:732:6: ()
            	            // InternalMiniExpr.g:733:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMiniExpr.g:742:6: ( (lv_op_4_0= '/' ) )
            	            // InternalMiniExpr.g:743:7: (lv_op_4_0= '/' )
            	            {
            	            // InternalMiniExpr.g:743:7: (lv_op_4_0= '/' )
            	            // InternalMiniExpr.g:744:8: lv_op_4_0= '/'
            	            {
            	            lv_op_4_0=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_4_0, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMulOrDivRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_4_0, "/");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMiniExpr.g:758:4: ( (lv_right_5_0= ruleModulo ) )
            	    // InternalMiniExpr.g:759:5: (lv_right_5_0= ruleModulo )
            	    {
            	    // InternalMiniExpr.g:759:5: (lv_right_5_0= ruleModulo )
            	    // InternalMiniExpr.g:760:6: lv_right_5_0= ruleModulo
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightModuloParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_right_5_0=ruleModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.gemoc.miniexpr.MiniExpr.Modulo");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleModulo"
    // InternalMiniExpr.g:782:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalMiniExpr.g:782:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalMiniExpr.g:783:2: iv_ruleModulo= ruleModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuloRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMiniExpr.g:789:1: ruleModulo returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:795:2: ( (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMiniExpr.g:796:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMiniExpr.g:796:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMiniExpr.g:797:3: this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuloAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:808:3: ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMiniExpr.g:809:4: () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMiniExpr.g:809:4: ()
            	    // InternalMiniExpr.g:810:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModuloAccess().getModuloLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMiniExpr.g:819:4: ( (lv_op_2_0= '%' ) )
            	    // InternalMiniExpr.g:820:5: (lv_op_2_0= '%' )
            	    {
            	    // InternalMiniExpr.g:820:5: (lv_op_2_0= '%' )
            	    // InternalMiniExpr.g:821:6: lv_op_2_0= '%'
            	    {
            	    lv_op_2_0=(Token)match(input,26,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getModuloAccess().getOpPercentSignKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getModuloRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "%");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMiniExpr.g:833:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMiniExpr.g:834:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMiniExpr.g:834:5: (lv_right_3_0= rulePrimary )
            	    // InternalMiniExpr.g:835:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModuloAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModuloRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.miniexpr.MiniExpr.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRulePrimary"
    // InternalMiniExpr.g:857:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMiniExpr.g:857:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMiniExpr.g:858:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMiniExpr.g:864:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject this_Atomic_10 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:870:2: ( ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic ) )
            // InternalMiniExpr.g:871:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic )
            {
            // InternalMiniExpr.g:871:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case RULE_NUMBER:
            case RULE_ID:
            case 30:
            case 31:
            case 32:
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMiniExpr.g:872:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalMiniExpr.g:872:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalMiniExpr.g:873:4: () otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalMiniExpr.g:873:4: ()
                    // InternalMiniExpr.g:874:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getParenthesisAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,27,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalMiniExpr.g:887:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalMiniExpr.g:888:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalMiniExpr.g:888:5: (lv_expression_2_0= ruleExpression )
                    // InternalMiniExpr.g:889:6: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.gemoc.miniexpr.MiniExpr.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:912:3: ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalMiniExpr.g:912:3: ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalMiniExpr.g:913:4: () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalMiniExpr.g:913:4: ()
                    // InternalMiniExpr.g:914:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalMiniExpr.g:927:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalMiniExpr.g:928:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalMiniExpr.g:928:5: (lv_expression_6_0= rulePrimary )
                    // InternalMiniExpr.g:929:6: lv_expression_6_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"org.gemoc.miniexpr.MiniExpr.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniExpr.g:948:3: ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) )
                    {
                    // InternalMiniExpr.g:948:3: ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) )
                    // InternalMiniExpr.g:949:4: () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) )
                    {
                    // InternalMiniExpr.g:949:4: ()
                    // InternalMiniExpr.g:950:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1());
                      			
                    }
                    // InternalMiniExpr.g:963:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalMiniExpr.g:964:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalMiniExpr.g:964:5: (lv_expression_9_0= rulePrimary )
                    // InternalMiniExpr.g:965:6: lv_expression_9_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_9_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"org.gemoc.miniexpr.MiniExpr.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniExpr.g:984:3: this_Atomic_10= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_10=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMiniExpr.g:999:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMiniExpr.g:999:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMiniExpr.g:1000:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMiniExpr.g:1006:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']' ) | this_Ref_11= ruleRef | this_ArraySize_12= ruleArraySize ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_values_7_0 = null;

        EObject lv_values_9_0 = null;

        EObject this_Ref_11 = null;

        EObject this_ArraySize_12 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:1012:2: ( ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']' ) | this_Ref_11= ruleRef | this_ArraySize_12= ruleArraySize ) )
            // InternalMiniExpr.g:1013:2: ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']' ) | this_Ref_11= ruleRef | this_ArraySize_12= ruleArraySize )
            {
            // InternalMiniExpr.g:1013:2: ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']' ) | this_Ref_11= ruleRef | this_ArraySize_12= ruleArraySize )
            int alt17=5;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt17=1;
                }
                break;
            case 30:
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case RULE_ID:
                {
                alt17=4;
                }
                break;
            case 36:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMiniExpr.g:1014:3: ( () ( (lv_value_1_0= RULE_NUMBER ) ) )
                    {
                    // InternalMiniExpr.g:1014:3: ( () ( (lv_value_1_0= RULE_NUMBER ) ) )
                    // InternalMiniExpr.g:1015:4: () ( (lv_value_1_0= RULE_NUMBER ) )
                    {
                    // InternalMiniExpr.g:1015:4: ()
                    // InternalMiniExpr.g:1016:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getNumberConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniExpr.g:1025:4: ( (lv_value_1_0= RULE_NUMBER ) )
                    // InternalMiniExpr.g:1026:5: (lv_value_1_0= RULE_NUMBER )
                    {
                    // InternalMiniExpr.g:1026:5: (lv_value_1_0= RULE_NUMBER )
                    // InternalMiniExpr.g:1027:6: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueNUMBERTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.gemoc.miniexpr.MiniExpr.NUMBER");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniExpr.g:1045:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // InternalMiniExpr.g:1045:3: ( () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // InternalMiniExpr.g:1046:4: () ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // InternalMiniExpr.g:1046:4: ()
                    // InternalMiniExpr.g:1047:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMiniExpr.g:1056:4: ( ( (lv_value_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==30) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==31) ) {
                        alt15=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMiniExpr.g:1057:5: ( (lv_value_3_0= 'true' ) )
                            {
                            // InternalMiniExpr.g:1057:5: ( (lv_value_3_0= 'true' ) )
                            // InternalMiniExpr.g:1058:6: (lv_value_3_0= 'true' )
                            {
                            // InternalMiniExpr.g:1058:6: (lv_value_3_0= 'true' )
                            // InternalMiniExpr.g:1059:7: lv_value_3_0= 'true'
                            {
                            lv_value_3_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_3_0 != null, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMiniExpr.g:1072:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getFalseKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniExpr.g:1079:3: ( () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']' )
                    {
                    // InternalMiniExpr.g:1079:3: ( () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']' )
                    // InternalMiniExpr.g:1080:4: () otherlv_6= '[' ( (lv_values_7_0= ruleExpression ) ) (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )* otherlv_10= ']'
                    {
                    // InternalMiniExpr.g:1080:4: ()
                    // InternalMiniExpr.g:1081:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVectorConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_2_1());
                      			
                    }
                    // InternalMiniExpr.g:1094:4: ( (lv_values_7_0= ruleExpression ) )
                    // InternalMiniExpr.g:1095:5: (lv_values_7_0= ruleExpression )
                    {
                    // InternalMiniExpr.g:1095:5: (lv_values_7_0= ruleExpression )
                    // InternalMiniExpr.g:1096:6: lv_values_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getValuesExpressionParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_values_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						add(
                      							current,
                      							"values",
                      							lv_values_7_0,
                      							"org.gemoc.miniexpr.MiniExpr.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMiniExpr.g:1113:4: (otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==33) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMiniExpr.g:1114:5: otherlv_8= ',' ( (lv_values_9_0= ruleExpression ) )
                    	    {
                    	    otherlv_8=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getAtomicAccess().getCommaKeyword_2_3_0());
                    	      				
                    	    }
                    	    // InternalMiniExpr.g:1118:5: ( (lv_values_9_0= ruleExpression ) )
                    	    // InternalMiniExpr.g:1119:6: (lv_values_9_0= ruleExpression )
                    	    {
                    	    // InternalMiniExpr.g:1119:6: (lv_values_9_0= ruleExpression )
                    	    // InternalMiniExpr.g:1120:7: lv_values_9_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAtomicAccess().getValuesExpressionParserRuleCall_2_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_values_9_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"values",
                    	      								lv_values_9_0,
                    	      								"org.gemoc.miniexpr.MiniExpr.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_2_4());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniExpr.g:1144:3: this_Ref_11= ruleRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getRefParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Ref_11=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Ref_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMiniExpr.g:1156:3: this_ArraySize_12= ruleArraySize
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getArraySizeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArraySize_12=ruleArraySize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArraySize_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleRef"
    // InternalMiniExpr.g:1171:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalMiniExpr.g:1171:44: (iv_ruleRef= ruleRef EOF )
            // InternalMiniExpr.g:1172:2: iv_ruleRef= ruleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalMiniExpr.g:1178:1: ruleRef returns [EObject current=null] : (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_property_9_0=null;
        EObject this_SimpleVarRef_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_indices_5_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:1184:2: ( (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* ) )
            // InternalMiniExpr.g:1185:2: (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* )
            {
            // InternalMiniExpr.g:1185:2: (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* )
            // InternalMiniExpr.g:1186:3: this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefAccess().getSimpleVarRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_SimpleVarRef_0=ruleSimpleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleVarRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMiniExpr.g:1197:3: ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )*
            loop19:
            do {
                int alt19=3;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalMiniExpr.g:1198:4: ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' )
            	    {
            	    // InternalMiniExpr.g:1198:4: ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' )
            	    // InternalMiniExpr.g:1199:5: () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']'
            	    {
            	    // InternalMiniExpr.g:1199:5: ()
            	    // InternalMiniExpr.g:1200:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRefAccess().getArrayRefArrayAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftSquareBracketKeyword_1_0_1());
            	      				
            	    }
            	    // InternalMiniExpr.g:1213:5: ( (lv_indices_3_0= ruleExpression ) )
            	    // InternalMiniExpr.g:1214:6: (lv_indices_3_0= ruleExpression )
            	    {
            	    // InternalMiniExpr.g:1214:6: (lv_indices_3_0= ruleExpression )
            	    // InternalMiniExpr.g:1215:7: lv_indices_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_indices_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRefRule());
            	      							}
            	      							add(
            	      								current,
            	      								"indices",
            	      								lv_indices_3_0,
            	      								"org.gemoc.miniexpr.MiniExpr.Expression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalMiniExpr.g:1232:5: (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==33) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalMiniExpr.g:1233:6: otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,33,FOLLOW_25); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getRefAccess().getCommaKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalMiniExpr.g:1237:6: ( (lv_indices_5_0= ruleExpression ) )
            	    	    // InternalMiniExpr.g:1238:7: (lv_indices_5_0= ruleExpression )
            	    	    {
            	    	    // InternalMiniExpr.g:1238:7: (lv_indices_5_0= ruleExpression )
            	    	    // InternalMiniExpr.g:1239:8: lv_indices_5_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_indices_5_0=ruleExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getRefRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"indices",
            	    	      									lv_indices_5_0,
            	    	      									"org.gemoc.miniexpr.MiniExpr.Expression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,34,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getRefAccess().getRightSquareBracketKeyword_1_0_4());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMiniExpr.g:1263:4: ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) )
            	    {
            	    // InternalMiniExpr.g:1263:4: ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) )
            	    // InternalMiniExpr.g:1264:5: () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) )
            	    {
            	    // InternalMiniExpr.g:1264:5: ()
            	    // InternalMiniExpr.g:1265:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRefAccess().getPropertyRefObjectAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getRefAccess().getFullStopKeyword_1_1_1());
            	      				
            	    }
            	    // InternalMiniExpr.g:1278:5: ( (lv_property_9_0= RULE_ID ) )
            	    // InternalMiniExpr.g:1279:6: (lv_property_9_0= RULE_ID )
            	    {
            	    // InternalMiniExpr.g:1279:6: (lv_property_9_0= RULE_ID )
            	    // InternalMiniExpr.g:1280:7: lv_property_9_0= RULE_ID
            	    {
            	    lv_property_9_0=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_property_9_0, grammarAccess.getRefAccess().getPropertyIDTerminalRuleCall_1_1_2_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getRefRule());
            	      							}
            	      							setWithLastConsumed(
            	      								current,
            	      								"property",
            	      								lv_property_9_0,
            	      								"org.eclipse.xtext.common.Terminals.ID");
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleSimpleVarRef"
    // InternalMiniExpr.g:1302:1: entryRuleSimpleVarRef returns [EObject current=null] : iv_ruleSimpleVarRef= ruleSimpleVarRef EOF ;
    public final EObject entryRuleSimpleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleVarRef = null;


        try {
            // InternalMiniExpr.g:1302:53: (iv_ruleSimpleVarRef= ruleSimpleVarRef EOF )
            // InternalMiniExpr.g:1303:2: iv_ruleSimpleVarRef= ruleSimpleVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleVarRef=ruleSimpleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleVarRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleVarRef"


    // $ANTLR start "ruleSimpleVarRef"
    // InternalMiniExpr.g:1309:1: ruleSimpleVarRef returns [EObject current=null] : ( (lv_target_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleVarRef() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;


        	enterRule();

        try {
            // InternalMiniExpr.g:1315:2: ( ( (lv_target_0_0= RULE_ID ) ) )
            // InternalMiniExpr.g:1316:2: ( (lv_target_0_0= RULE_ID ) )
            {
            // InternalMiniExpr.g:1316:2: ( (lv_target_0_0= RULE_ID ) )
            // InternalMiniExpr.g:1317:3: (lv_target_0_0= RULE_ID )
            {
            // InternalMiniExpr.g:1317:3: (lv_target_0_0= RULE_ID )
            // InternalMiniExpr.g:1318:4: lv_target_0_0= RULE_ID
            {
            lv_target_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_target_0_0, grammarAccess.getSimpleVarRefAccess().getTargetIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSimpleVarRefRule());
              				}
              				setWithLastConsumed(
              					current,
              					"target",
              					lv_target_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleVarRef"


    // $ANTLR start "entryRuleArraySize"
    // InternalMiniExpr.g:1337:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // InternalMiniExpr.g:1337:50: (iv_ruleArraySize= ruleArraySize EOF )
            // InternalMiniExpr.g:1338:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalMiniExpr.g:1344:1: ruleArraySize returns [EObject current=null] : (otherlv_0= '|' ( (lv_array_1_0= ruleRef ) ) otherlv_2= '|' ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_array_1_0 = null;



        	enterRule();

        try {
            // InternalMiniExpr.g:1350:2: ( (otherlv_0= '|' ( (lv_array_1_0= ruleRef ) ) otherlv_2= '|' ) )
            // InternalMiniExpr.g:1351:2: (otherlv_0= '|' ( (lv_array_1_0= ruleRef ) ) otherlv_2= '|' )
            {
            // InternalMiniExpr.g:1351:2: (otherlv_0= '|' ( (lv_array_1_0= ruleRef ) ) otherlv_2= '|' )
            // InternalMiniExpr.g:1352:3: otherlv_0= '|' ( (lv_array_1_0= ruleRef ) ) otherlv_2= '|'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySizeAccess().getVerticalLineKeyword_0());
              		
            }
            // InternalMiniExpr.g:1356:3: ( (lv_array_1_0= ruleRef ) )
            // InternalMiniExpr.g:1357:4: (lv_array_1_0= ruleRef )
            {
            // InternalMiniExpr.g:1357:4: (lv_array_1_0= ruleRef )
            // InternalMiniExpr.g:1358:5: lv_array_1_0= ruleRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArraySizeAccess().getArrayRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_array_1_0=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArraySizeRule());
              					}
              					set(
              						current,
              						"array",
              						lv_array_1_0,
              						"org.gemoc.miniexpr.MiniExpr.Ref");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArraySizeAccess().getVerticalLineKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySize"

    // $ANTLR start synpred12_InternalMiniExpr
    public final void synpred12_InternalMiniExpr_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject lv_right_5_0 = null;


        // InternalMiniExpr.g:597:4: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )
        // InternalMiniExpr.g:597:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
        {
        // InternalMiniExpr.g:597:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) )
        int alt22=2;
        int LA22_0 = input.LA(1);

        if ( (LA22_0==22) ) {
            alt22=1;
        }
        else if ( (LA22_0==23) ) {
            alt22=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 22, 0, input);

            throw nvae;
        }
        switch (alt22) {
            case 1 :
                // InternalMiniExpr.g:598:5: ( () ( (lv_op_2_0= '+' ) ) )
                {
                // InternalMiniExpr.g:598:5: ( () ( (lv_op_2_0= '+' ) ) )
                // InternalMiniExpr.g:599:6: () ( (lv_op_2_0= '+' ) )
                {
                // InternalMiniExpr.g:599:6: ()
                // InternalMiniExpr.g:600:7: 
                {
                if ( state.backtracking==0 ) {

                  							/* */
                  						
                }

                }

                // InternalMiniExpr.g:609:6: ( (lv_op_2_0= '+' ) )
                // InternalMiniExpr.g:610:7: (lv_op_2_0= '+' )
                {
                // InternalMiniExpr.g:610:7: (lv_op_2_0= '+' )
                // InternalMiniExpr.g:611:8: lv_op_2_0= '+'
                {
                lv_op_2_0=(Token)match(input,22,FOLLOW_24); if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // InternalMiniExpr.g:625:5: ( () ( (lv_op_4_0= '-' ) ) )
                {
                // InternalMiniExpr.g:625:5: ( () ( (lv_op_4_0= '-' ) ) )
                // InternalMiniExpr.g:626:6: () ( (lv_op_4_0= '-' ) )
                {
                // InternalMiniExpr.g:626:6: ()
                // InternalMiniExpr.g:627:7: 
                {
                if ( state.backtracking==0 ) {

                  							/* */
                  						
                }

                }

                // InternalMiniExpr.g:636:6: ( (lv_op_4_0= '-' ) )
                // InternalMiniExpr.g:637:7: (lv_op_4_0= '-' )
                {
                // InternalMiniExpr.g:637:7: (lv_op_4_0= '-' )
                // InternalMiniExpr.g:638:8: lv_op_4_0= '-'
                {
                lv_op_4_0=(Token)match(input,23,FOLLOW_24); if (state.failed) return ;

                }


                }


                }


                }
                break;

        }

        // InternalMiniExpr.g:652:4: ( (lv_right_5_0= ruleMulOrDiv ) )
        // InternalMiniExpr.g:653:5: (lv_right_5_0= ruleMulOrDiv )
        {
        // InternalMiniExpr.g:653:5: (lv_right_5_0= ruleMulOrDiv )
        // InternalMiniExpr.g:654:6: lv_right_5_0= ruleMulOrDiv
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_right_5_0=ruleMulOrDiv();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalMiniExpr

    // $ANTLR start synpred26_InternalMiniExpr
    public final void synpred26_InternalMiniExpr_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_indices_3_0 = null;

        EObject lv_indices_5_0 = null;


        // InternalMiniExpr.g:1198:4: ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) )
        // InternalMiniExpr.g:1198:4: ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' )
        {
        // InternalMiniExpr.g:1198:4: ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' )
        // InternalMiniExpr.g:1199:5: () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']'
        {
        // InternalMiniExpr.g:1199:5: ()
        // InternalMiniExpr.g:1200:6: 
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }

        }

        otherlv_2=(Token)match(input,32,FOLLOW_25); if (state.failed) return ;
        // InternalMiniExpr.g:1213:5: ( (lv_indices_3_0= ruleExpression ) )
        // InternalMiniExpr.g:1214:6: (lv_indices_3_0= ruleExpression )
        {
        // InternalMiniExpr.g:1214:6: (lv_indices_3_0= ruleExpression )
        // InternalMiniExpr.g:1215:7: lv_indices_3_0= ruleExpression
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_2_0());
          						
        }
        pushFollow(FOLLOW_26);
        lv_indices_3_0=ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalMiniExpr.g:1232:5: (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )*
        loop26:
        do {
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }


            switch (alt26) {
        	case 1 :
        	    // InternalMiniExpr.g:1233:6: otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) )
        	    {
        	    otherlv_4=(Token)match(input,33,FOLLOW_25); if (state.failed) return ;
        	    // InternalMiniExpr.g:1237:6: ( (lv_indices_5_0= ruleExpression ) )
        	    // InternalMiniExpr.g:1238:7: (lv_indices_5_0= ruleExpression )
        	    {
        	    // InternalMiniExpr.g:1238:7: (lv_indices_5_0= ruleExpression )
        	    // InternalMiniExpr.g:1239:8: lv_indices_5_0= ruleExpression
        	    {
        	    if ( state.backtracking==0 ) {

        	      								newCompositeNode(grammarAccess.getRefAccess().getIndicesExpressionParserRuleCall_1_0_3_1_0());
        	      							
        	    }
        	    pushFollow(FOLLOW_26);
        	    lv_indices_5_0=ruleExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop26;
            }
        } while (true);

        otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalMiniExpr

    // Delegated rules

    public final boolean synpred12_InternalMiniExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMiniExpr_fragment(); // can never throw exception
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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\1\30\uffff";
    static final String dfa_3s = "\1\4\13\uffff\1\0\14\uffff";
    static final String dfa_4s = "\1\44\13\uffff\1\0\14\uffff";
    static final String dfa_5s = "\1\uffff\1\2\26\uffff\1\1";
    static final String dfa_6s = "\14\uffff\1\0\14\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\6\uffff\12\1\1\30\1\14\3\uffff\10\1\1\uffff\1\1",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 596:3: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_12 = input.LA(1);

                         
                        int index10_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalMiniExpr()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index10_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\36\uffff";
    static final String dfa_9s = "\1\1\35\uffff";
    static final String dfa_10s = "\1\4\24\uffff\1\0\10\uffff";
    static final String dfa_11s = "\1\44\24\uffff\1\0\10\uffff";
    static final String dfa_12s = "\1\uffff\1\3\32\uffff\1\2\1\1";
    static final String dfa_13s = "\25\uffff\1\0\10\uffff}>";
    static final String[] dfa_14s = {
            "\2\1\6\uffff\24\1\1\25\2\1\1\34\1\1",
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
            return "()* loopback of 1197:3: ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )*";
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
                        if ( (synpred26_InternalMiniExpr()) ) {s = 29;}

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000011E8800032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000011E8802030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000011E8801030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000011E8804030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000011E8808030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000011E8830030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000011E8BC0030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000011E8C00030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000011EB800030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000011EC800030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000011F8800030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000011E8800030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000017E8800030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000900000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});

}