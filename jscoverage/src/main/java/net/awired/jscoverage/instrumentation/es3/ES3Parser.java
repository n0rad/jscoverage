// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 com/google/jstestdriver/coverage/es3/ES3.g 2012-01-25 23:23:53
package net.awired.jscoverage.instrumentation.es3;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ES3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "Identifier", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int VT=134;
    public static final int LOR=95;
    public static final int FUNCTION=17;
    public static final int PACKAGE=52;
    public static final int SHR=87;
    public static final int RegularExpressionChar=170;
    public static final int LT=72;
    public static final int WHILE=30;
    public static final int MOD=83;
    public static final int SHL=86;
    public static final int CONST=37;
    public static final int BackslashSequence=168;
    public static final int LS=142;
    public static final int CASE=8;
    public static final int CHAR=35;
    public static final int NEW=21;
    public static final int DQUOTE=131;
    public static final int DO=13;
    public static final int NOT=92;
    public static final int DecimalDigit=152;
    public static final int BYFIELD=114;
    public static final int EOF=-1;
    public static final int CEXPR=117;
    public static final int BREAK=7;
    public static final int Identifier=148;
    public static final int DIVASS=110;
    public static final int BYINDEX=115;
    public static final int FORSTEP=120;
    public static final int FINAL=43;
    public static final int RPAREN=66;
    public static final int INC=84;
    public static final int IMPORT=47;
    public static final int EOL=145;
    public static final int POS=129;
    public static final int OctalDigit=156;
    public static final int THIS=24;
    public static final int RETURN=22;
    public static final int ExponentPart=157;
    public static final int ARGS=111;
    public static final int DOUBLE=39;
    public static final int WhiteSpace=139;
    public static final int VAR=28;
    public static final int EXPORT=41;
    public static final int VOID=29;
    public static final int LABELLED=122;
    public static final int SUPER=58;
    public static final int GOTO=45;
    public static final int EQ=76;
    public static final int XORASS=108;
    public static final int ADDASS=99;
    public static final int ARRAY=112;
    public static final int SHU=88;
    public static final int RBRACK=68;
    public static final int RBRACE=64;
    public static final int PRIVATE=53;
    public static final int STATIC=57;
    public static final int INV=93;
    public static final int SWITCH=23;
    public static final int NULL=4;
    public static final int ELSE=14;
    public static final int NATIVE=51;
    public static final int THROWS=60;
    public static final int INT=48;
    public static final int DELETE=12;
    public static final int MUL=82;
    public static final int IdentifierStartASCII=151;
    public static final int TRY=26;
    public static final int FF=135;
    public static final int SHLASS=103;
    public static final int OctalEscapeSequence=164;
    public static final int USP=138;
    public static final int RegularExpressionFirstChar=169;
    public static final int ANDASS=106;
    public static final int TYPEOF=27;
    public static final int IdentifierNameASCIIStart=154;
    public static final int QUE=96;
    public static final int OR=90;
    public static final int DEBUGGER=38;
    public static final int GT=73;
    public static final int PDEC=127;
    public static final int CALL=116;
    public static final int CharacterEscapeSequence=162;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=167;
    public static final int LAND=94;
    public static final int MULASS=101;
    public static final int THROW=25;
    public static final int PINC=128;
    public static final int OctalIntegerLiteral=160;
    public static final int PROTECTED=54;
    public static final int DEC=85;
    public static final int CLASS=36;
    public static final int LBRACK=67;
    public static final int HexEscapeSequence=165;
    public static final int ORASS=107;
    public static final int SingleLineComment=147;
    public static final int NAMEDVALUE=123;
    public static final int LBRACE=63;
    public static final int GTE=75;
    public static final int FOR=16;
    public static final int RegularExpressionLiteral=155;
    public static final int SUB=81;
    public static final int FLOAT=44;
    public static final int ABSTRACT=32;
    public static final int AND=89;
    public static final int DecimalIntegerLiteral=158;
    public static final int HexDigit=150;
    public static final int LTE=74;
    public static final int LPAREN=65;
    public static final int IF=18;
    public static final int SUBASS=100;
    public static final int EXPR=118;
    public static final int BOOLEAN=33;
    public static final int SYNCHRONIZED=59;
    public static final int IN=19;
    public static final int IMPLEMENTS=46;
    public static final int OBJECT=125;
    public static final int CONTINUE=10;
    public static final int COMMA=71;
    public static final int FORITER=119;
    public static final int TRANSIENT=61;
    public static final int SHRASS=104;
    public static final int MODASS=102;
    public static final int PS=143;
    public static final int DOT=69;
    public static final int IdentifierPart=153;
    public static final int MultiLineComment=146;
    public static final int WITH=31;
    public static final int ADD=80;
    public static final int BYTE=34;
    public static final int XOR=91;
    public static final int ZeroToThree=163;
    public static final int ITEM=121;
    public static final int VOLATILE=62;
    public static final int UnicodeEscapeSequence=166;
    public static final int SHUASS=105;
    public static final int DEFAULT=11;
    public static final int NSAME=79;
    public static final int TAB=133;
    public static final int SHORT=56;
    public static final int INSTANCEOF=20;
    public static final int SQUOTE=132;
    public static final int DecimalLiteral=159;
    public static final int TRUE=5;
    public static final int SAME=78;
    public static final int StringLiteral=149;
    public static final int COLON=97;
    public static final int PAREXPR=126;
    public static final int NEQ=77;
    public static final int ENUM=40;
    public static final int FINALLY=15;
    public static final int HexIntegerLiteral=161;
    public static final int NBSP=137;
    public static final int SP=136;
    public static final int BLOCK=113;
    public static final int LineTerminator=144;
    public static final int NEG=124;
    public static final int ASSIGN=98;
    public static final int INTERFACE=49;
    public static final int DIV=109;
    public static final int SEMIC=70;
    public static final int CR=141;
    public static final int LONG=50;
    public static final int EXTENDS=42;
    public static final int PUBLIC=55;
    public static final int BSLASH=130;
    public static final int LF=140;

    // delegates
    // delegators


        public ES3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ES3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ES3Parser.tokenNames; }
    public String getGrammarFileName() { return "com/google/jstestdriver/coverage/es3/ES3.g"; }


    private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result;
    	if (isLeftHandSideExpression(lhs))
    	{
    		switch (input.LA(1))
    		{
    			case ASSIGN:
    			case MULASS:
    			case DIVASS:
    			case MODASS:
    			case ADDASS:
    			case SUBASS:
    			case SHLASS:
    			case SHRASS:
    			case SHUASS:
    			case ANDASS:
    			case XORASS:
    			case ORASS:
    				result = true;
    				break;
    			default:
    				result = false;
    				break;
    		}
    	}
    	else
    	{
    		result = false;
    	}
    	
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
    {
    	if (lhs.getTree() == null) // e.g. during backtracking
    	{
    		return true;
    	}
    	else
    	{
    		switch (((Tree)lhs.getTree()).getType())
    		{
    		// primaryExpression
    			case THIS:
    			case Identifier:
    			case NULL:
    			case TRUE:
    			case FALSE:
    			case DecimalLiteral:
    			case OctalIntegerLiteral:
    			case HexIntegerLiteral:
    			case StringLiteral:
    			case RegularExpressionLiteral:
    			case ARRAY:
    			case OBJECT:
    			case PAREXPR:
    		// functionExpression
    			case FUNCTION:
    		// newExpression
    			case NEW:
    		// leftHandSideExpression
    			case CALL:
    			case BYFIELD:
    			case BYINDEX:
    				return true;
    			
    			default:
    				return false;
    		}
    	}
    }
    	
    private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final void promoteEOL(ParserRuleReturnScope rule)
    {
    	// Get current token and its type (the possibly offending token).
    	Token lt = input.LT(1);
    	int la = lt.getType();
    	
    	// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL).
    	// EOL is not offending as it's already promoted in a previous call to this method.
    	// Promoting an EOL means switching it from off channel to on channel.
    	if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL ))
    	{
    		// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
    		for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
    		{
    			lt = input.get(ix);
    			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
    			{
    				// On channel token found: stop scanning.
    				break;
    			}
    			else if (lt.getType() == EOL )
    			{
    				// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
    				lt.setChannel(Token.DEFAULT_CHANNEL);
    				input.seek(lt.getTokenIndex());
    				if (rule != null)
    				{
    					rule.start = lt;
    				}
    				break;
    			}
    		}
    	}
    }	


    public static class token_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token"
    // com/google/jstestdriver/coverage/es3/ES3.g:508:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral );
    public final ES3Parser.token_return token() throws RecognitionException {
        ES3Parser.token_return retval = new ES3Parser.token_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier2=null;
        Token StringLiteral5=null;
        ES3Parser.reservedWord_return reservedWord1 = null;

        ES3Parser.punctuator_return punctuator3 = null;

        ES3Parser.numericLiteral_return numericLiteral4 = null;


        Object Identifier2_tree=null;
        Object StringLiteral5_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:509:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral )
            int alt1=5;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt1=1;
                }
                break;
            case Identifier:
                {
                alt1=2;
                }
                break;
            case LBRACE:
            case RBRACE:
            case LPAREN:
            case RPAREN:
            case LBRACK:
            case RBRACK:
            case DOT:
            case SEMIC:
            case COMMA:
            case LT:
            case GT:
            case LTE:
            case GTE:
            case EQ:
            case NEQ:
            case SAME:
            case NSAME:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case INC:
            case DEC:
            case SHL:
            case SHR:
            case SHU:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case INV:
            case LAND:
            case LOR:
            case QUE:
            case COLON:
            case ASSIGN:
            case ADDASS:
            case SUBASS:
            case MULASS:
            case MODASS:
            case SHLASS:
            case SHRASS:
            case SHUASS:
            case ANDASS:
            case ORASS:
            case XORASS:
            case DIV:
            case DIVASS:
                {
                alt1=3;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=4;
                }
                break;
            case StringLiteral:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:509:4: reservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token1752);
                    reservedWord1=reservedWord();

                    state._fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:510:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_token1757); 
                    Identifier2_tree = (Object)adaptor.create(Identifier2);
                    adaptor.addChild(root_0, Identifier2_tree);


                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:511:4: punctuator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token1762);
                    punctuator3=punctuator();

                    state._fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:512:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token1767);
                    numericLiteral4=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:513:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral5=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_token1772); 
                    StringLiteral5_tree = (Object)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "token"

    public static class reservedWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reservedWord"
    // com/google/jstestdriver/coverage/es3/ES3.g:518:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final ES3Parser.reservedWord_return reservedWord() throws RecognitionException {
        ES3Parser.reservedWord_return retval = new ES3Parser.reservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL8=null;
        ES3Parser.keyword_return keyword6 = null;

        ES3Parser.futureReservedWord_return futureReservedWord7 = null;

        ES3Parser.booleanLiteral_return booleanLiteral9 = null;


        Object NULL8_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:519:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt2=2;
                }
                break;
            case NULL:
                {
                alt2=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:519:4: keyword
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord1785);
                    keyword6=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword6.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:520:4: futureReservedWord
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord1790);
                    futureReservedWord7=futureReservedWord();

                    state._fsp--;

                    adaptor.addChild(root_0, futureReservedWord7.getTree());

                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:521:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL8=(Token)match(input,NULL,FOLLOW_NULL_in_reservedWord1795); 
                    NULL8_tree = (Object)adaptor.create(NULL8);
                    adaptor.addChild(root_0, NULL8_tree);


                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:522:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord1800);
                    booleanLiteral9=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reservedWord"

    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // com/google/jstestdriver/coverage/es3/ES3.g:529:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH );
    public final ES3Parser.keyword_return keyword() throws RecognitionException {
        ES3Parser.keyword_return retval = new ES3Parser.keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:530:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH )
            // com/google/jstestdriver/coverage/es3/ES3.g:
            {
            root_0 = (Object)adaptor.nil();

            set10=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=WITH) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set10));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class futureReservedWord_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "futureReservedWord"
    // com/google/jstestdriver/coverage/es3/ES3.g:561:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final ES3Parser.futureReservedWord_return futureReservedWord() throws RecognitionException {
        ES3Parser.futureReservedWord_return retval = new ES3Parser.futureReservedWord_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:562:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // com/google/jstestdriver/coverage/es3/ES3.g:
            {
            root_0 = (Object)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set11));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "futureReservedWord"

    public static class punctuator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "punctuator"
    // com/google/jstestdriver/coverage/es3/ES3.g:639:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS );
    public final ES3Parser.punctuator_return punctuator() throws RecognitionException {
        ES3Parser.punctuator_return retval = new ES3Parser.punctuator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set12=null;

        Object set12_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:640:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS )
            // com/google/jstestdriver/coverage/es3/ES3.g:
            {
            root_0 = (Object)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set12));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "punctuator"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // com/google/jstestdriver/coverage/es3/ES3.g:694:1: literal : ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral );
    public final ES3Parser.literal_return literal() throws RecognitionException {
        ES3Parser.literal_return retval = new ES3Parser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL13=null;
        Token StringLiteral16=null;
        Token RegularExpressionLiteral17=null;
        ES3Parser.booleanLiteral_return booleanLiteral14 = null;

        ES3Parser.numericLiteral_return numericLiteral15 = null;


        Object NULL13_tree=null;
        Object StringLiteral16_tree=null;
        Object RegularExpressionLiteral17_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:695:2: ( NULL | booleanLiteral | numericLiteral | StringLiteral | RegularExpressionLiteral )
            int alt3=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt3=3;
                }
                break;
            case StringLiteral:
                {
                alt3=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:695:4: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL13=(Token)match(input,NULL,FOLLOW_NULL_in_literal2481); 
                    NULL13_tree = (Object)adaptor.create(NULL13);
                    adaptor.addChild(root_0, NULL13_tree);


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:696:4: booleanLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_literal2486);
                    booleanLiteral14=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral14.getTree());

                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:697:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal2491);
                    numericLiteral15=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral15.getTree());

                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:698:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral16=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2496); 
                    StringLiteral16_tree = (Object)adaptor.create(StringLiteral16);
                    adaptor.addChild(root_0, StringLiteral16_tree);


                    }
                    break;
                case 5 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:699:4: RegularExpressionLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    RegularExpressionLiteral17=(Token)match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2501); 
                    RegularExpressionLiteral17_tree = (Object)adaptor.create(RegularExpressionLiteral17);
                    adaptor.addChild(root_0, RegularExpressionLiteral17_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // com/google/jstestdriver/coverage/es3/ES3.g:702:1: booleanLiteral : ( TRUE | FALSE );
    public final ES3Parser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        ES3Parser.booleanLiteral_return retval = new ES3Parser.booleanLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set18=null;

        Object set18_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:703:2: ( TRUE | FALSE )
            // com/google/jstestdriver/coverage/es3/ES3.g:
            {
            root_0 = (Object)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set18));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // com/google/jstestdriver/coverage/es3/ES3.g:749:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final ES3Parser.numericLiteral_return numericLiteral() throws RecognitionException {
        ES3Parser.numericLiteral_return retval = new ES3Parser.numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set19=null;

        Object set19_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:750:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // com/google/jstestdriver/coverage/es3/ES3.g:
            {
            root_0 = (Object)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numericLiteral"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:837:1: primaryExpression : ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) );
    public final ES3Parser.primaryExpression_return primaryExpression() throws RecognitionException {
        ES3Parser.primaryExpression_return retval = new ES3Parser.primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lpar=null;
        Token THIS20=null;
        Token Identifier21=null;
        Token RPAREN26=null;
        ES3Parser.literal_return literal22 = null;

        ES3Parser.arrayLiteral_return arrayLiteral23 = null;

        ES3Parser.objectLiteral_return objectLiteral24 = null;

        ES3Parser.expression_return expression25 = null;


        Object lpar_tree=null;
        Object THIS20_tree=null;
        Object Identifier21_tree=null;
        Object RPAREN26_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:838:2: ( THIS | Identifier | literal | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
            case Identifier:
                {
                alt4=2;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=3;
                }
                break;
            case LBRACK:
                {
                alt4=4;
                }
                break;
            case LBRACE:
                {
                alt4=5;
                }
                break;
            case LPAREN:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:838:4: THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS20=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpression3114); 
                    THIS20_tree = (Object)adaptor.create(THIS20);
                    adaptor.addChild(root_0, THIS20_tree);


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:839:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3119); 
                    Identifier21_tree = (Object)adaptor.create(Identifier21);
                    adaptor.addChild(root_0, Identifier21_tree);


                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:840:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression3124);
                    literal22=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal22.getTree());

                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:841:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3129);
                    arrayLiteral23=arrayLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayLiteral23.getTree());

                    }
                    break;
                case 5 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:842:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3134);
                    objectLiteral24=objectLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, objectLiteral24.getTree());

                    }
                    break;
                case 6 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:843:4: lpar= LPAREN expression RPAREN
                    {
                    lpar=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3141);  
                    stream_LPAREN.add(lpar);

                    pushFollow(FOLLOW_expression_in_primaryExpression3143);
                    expression25=expression();

                    state._fsp--;

                    stream_expression.add(expression25.getTree());
                    RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3145);  
                    stream_RPAREN.add(RPAREN26);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 843:34: -> ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
                    {
                        // com/google/jstestdriver/coverage/es3/ES3.g:843:37: ^( PAREXPR[$lpar, \"PAREXPR\"] expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAREXPR, lpar, "PAREXPR"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLiteral"
    // com/google/jstestdriver/coverage/es3/ES3.g:846:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final ES3Parser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        ES3Parser.arrayLiteral_return retval = new ES3Parser.arrayLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA28=null;
        Token RBRACK30=null;
        ES3Parser.arrayItem_return arrayItem27 = null;

        ES3Parser.arrayItem_return arrayItem29 = null;


        Object lb_tree=null;
        Object COMMA28_tree=null;
        Object RBRACK30_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:847:2: (lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:847:4: lb= LBRACK ( arrayItem ( COMMA ( arrayItem )? )* )? RBRACK
            {
            lb=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3169);  
            stream_LBRACK.add(lb);

            // com/google/jstestdriver/coverage/es3/ES3.g:847:14: ( arrayItem ( COMMA ( arrayItem )? )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||LA7_0==COMMA||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=Identifier && LA7_0<=StringLiteral)||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK) ) {
                int LA7_2 = input.LA(2);

                if ( (( input.LA(1) == COMMA )) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:847:16: arrayItem ( COMMA ( arrayItem )? )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3173);
                    arrayItem27=arrayItem();

                    state._fsp--;

                    stream_arrayItem.add(arrayItem27.getTree());
                    // com/google/jstestdriver/coverage/es3/ES3.g:847:26: ( COMMA ( arrayItem )? )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // com/google/jstestdriver/coverage/es3/ES3.g:847:28: COMMA ( arrayItem )?
                    	    {
                    	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3177);  
                    	    stream_COMMA.add(COMMA28);

                    	    // com/google/jstestdriver/coverage/es3/ES3.g:847:34: ( arrayItem )?
                    	    int alt5=2;
                    	    switch ( input.LA(1) ) {
                    	        case NULL:
                    	        case TRUE:
                    	        case FALSE:
                    	        case DELETE:
                    	        case FUNCTION:
                    	        case NEW:
                    	        case THIS:
                    	        case TYPEOF:
                    	        case VOID:
                    	        case LBRACE:
                    	        case LPAREN:
                    	        case LBRACK:
                    	        case ADD:
                    	        case SUB:
                    	        case INC:
                    	        case DEC:
                    	        case NOT:
                    	        case INV:
                    	        case Identifier:
                    	        case StringLiteral:
                    	        case RegularExpressionLiteral:
                    	        case DecimalLiteral:
                    	        case OctalIntegerLiteral:
                    	        case HexIntegerLiteral:
                    	            {
                    	            alt5=1;
                    	            }
                    	            break;
                    	        case RBRACK:
                    	            {
                    	            int LA5_2 = input.LA(2);

                    	            if ( (( input.LA(1) == COMMA )) ) {
                    	                alt5=1;
                    	            }
                    	            }
                    	            break;
                    	        case COMMA:
                    	            {
                    	            int LA5_3 = input.LA(2);

                    	            if ( (( input.LA(1) == COMMA )) ) {
                    	                alt5=1;
                    	            }
                    	            }
                    	            break;
                    	    }

                    	    switch (alt5) {
                    	        case 1 :
                    	            // com/google/jstestdriver/coverage/es3/ES3.g:847:35: arrayItem
                    	            {
                    	            pushFollow(FOLLOW_arrayItem_in_arrayLiteral3180);
                    	            arrayItem29=arrayItem();

                    	            state._fsp--;

                    	            stream_arrayItem.add(arrayItem29.getTree());

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK30=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3190);  
            stream_RBRACK.add(RBRACK30);



            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 848:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:848:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, lb, "ARRAY"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:848:28: ( arrayItem )*
                while ( stream_arrayItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayItem.nextTree());

                }
                stream_arrayItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"

    public static class arrayItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayItem"
    // com/google/jstestdriver/coverage/es3/ES3.g:851:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final ES3Parser.arrayItem_return arrayItem() throws RecognitionException {
        ES3Parser.arrayItem_return retval = new ES3Parser.arrayItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:852:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:852:4: (expr= assignmentExpression | {...}?)
            {
            // com/google/jstestdriver/coverage/es3/ES3.g:852:4: (expr= assignmentExpression | {...}?)
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=NULL && LA8_0<=FALSE)||LA8_0==DELETE||LA8_0==FUNCTION||LA8_0==NEW||LA8_0==THIS||LA8_0==TYPEOF||LA8_0==VOID||LA8_0==LBRACE||LA8_0==LPAREN||LA8_0==LBRACK||(LA8_0>=ADD && LA8_0<=SUB)||(LA8_0>=INC && LA8_0<=DEC)||(LA8_0>=NOT && LA8_0<=INV)||(LA8_0>=Identifier && LA8_0<=StringLiteral)||LA8_0==RegularExpressionLiteral||(LA8_0>=DecimalLiteral && LA8_0<=HexIntegerLiteral)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RBRACK||LA8_0==COMMA) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:852:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3218);
                    expr=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:852:34: {...}?
                    {
                    if ( !(( input.LA(1) == COMMA )) ) {
                        throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
                    }

                    }
                    break;

            }



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (Object)adaptor.nil();
            // 853:2: -> ^( ITEM ( $expr)? )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:853:5: ^( ITEM ( $expr)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ITEM, "ITEM"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:853:13: ( $expr)?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayItem"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // com/google/jstestdriver/coverage/es3/ES3.g:856:1: objectLiteral : lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* ) ;
    public final ES3Parser.objectLiteral_return objectLiteral() throws RecognitionException {
        ES3Parser.objectLiteral_return retval = new ES3Parser.objectLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token COMMA32=null;
        Token COMMA34=null;
        Token RBRACE35=null;
        ES3Parser.nameValuePair_return nameValuePair31 = null;

        ES3Parser.nameValuePair_return nameValuePair33 = null;


        Object lb_tree=null;
        Object COMMA32_tree=null;
        Object COMMA34_tree=null;
        Object RBRACE35_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_nameValuePair=new RewriteRuleSubtreeStream(adaptor,"rule nameValuePair");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:857:2: (lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* ( COMMA )? )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:857:4: lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* ( COMMA )? )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3250);  
            stream_LBRACE.add(lb);

            // com/google/jstestdriver/coverage/es3/ES3.g:857:14: ( nameValuePair ( COMMA nameValuePair )* ( COMMA )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=Identifier && LA11_0<=StringLiteral)||(LA11_0>=DecimalLiteral && LA11_0<=HexIntegerLiteral)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:857:16: nameValuePair ( COMMA nameValuePair )* ( COMMA )?
                    {
                    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3254);
                    nameValuePair31=nameValuePair();

                    state._fsp--;

                    stream_nameValuePair.add(nameValuePair31.getTree());
                    // com/google/jstestdriver/coverage/es3/ES3.g:857:30: ( COMMA nameValuePair )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            int LA9_1 = input.LA(2);

                            if ( ((LA9_1>=Identifier && LA9_1<=StringLiteral)||(LA9_1>=DecimalLiteral && LA9_1<=HexIntegerLiteral)) ) {
                                alt9=1;
                            }


                        }


                        switch (alt9) {
                    	case 1 :
                    	    // com/google/jstestdriver/coverage/es3/ES3.g:857:32: COMMA nameValuePair
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3258);  
                    	    stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3260);
                    	    nameValuePair33=nameValuePair();

                    	    state._fsp--;

                    	    stream_nameValuePair.add(nameValuePair33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // com/google/jstestdriver/coverage/es3/ES3.g:857:55: ( COMMA )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==COMMA) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // com/google/jstestdriver/coverage/es3/ES3.g:857:56: COMMA
                            {
                            COMMA34=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3266);  
                            stream_COMMA.add(COMMA34);


                            }
                            break;

                    }


                    }
                    break;

            }

            RBRACE35=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3273);  
            stream_RBRACE.add(RBRACE35);



            // AST REWRITE
            // elements: nameValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 858:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:858:5: ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT, lb, "OBJECT"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:858:30: ( nameValuePair )*
                while ( stream_nameValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_nameValuePair.nextTree());

                }
                stream_nameValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "objectLiteral"

    public static class nameValuePair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameValuePair"
    // com/google/jstestdriver/coverage/es3/ES3.g:861:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final ES3Parser.nameValuePair_return nameValuePair() throws RecognitionException {
        ES3Parser.nameValuePair_return retval = new ES3Parser.nameValuePair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON37=null;
        ES3Parser.propertyName_return propertyName36 = null;

        ES3Parser.assignmentExpression_return assignmentExpression38 = null;


        Object COLON37_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:862:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:862:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3298);
            propertyName36=propertyName();

            state._fsp--;

            stream_propertyName.add(propertyName36.getTree());
            COLON37=(Token)match(input,COLON,FOLLOW_COLON_in_nameValuePair3300);  
            stream_COLON.add(COLON37);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3302);
            assignmentExpression38=assignmentExpression();

            state._fsp--;

            stream_assignmentExpression.add(assignmentExpression38.getTree());


            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 863:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:863:5: ^( NAMEDVALUE propertyName assignmentExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAMEDVALUE, "NAMEDVALUE"), root_1);

                adaptor.addChild(root_1, stream_propertyName.nextTree());
                adaptor.addChild(root_1, stream_assignmentExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nameValuePair"

    public static class propertyName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyName"
    // com/google/jstestdriver/coverage/es3/ES3.g:866:1: propertyName : ( Identifier | StringLiteral | numericLiteral );
    public final ES3Parser.propertyName_return propertyName() throws RecognitionException {
        ES3Parser.propertyName_return retval = new ES3Parser.propertyName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier39=null;
        Token StringLiteral40=null;
        ES3Parser.numericLiteral_return numericLiteral41 = null;


        Object Identifier39_tree=null;
        Object StringLiteral40_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:867:2: ( Identifier | StringLiteral | numericLiteral )
            int alt12=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt12=1;
                }
                break;
            case StringLiteral:
                {
                alt12=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:867:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    Identifier39=(Token)match(input,Identifier,FOLLOW_Identifier_in_propertyName3326); 
                    Identifier39_tree = (Object)adaptor.create(Identifier39);
                    adaptor.addChild(root_0, Identifier39_tree);


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:868:4: StringLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    StringLiteral40=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3331); 
                    StringLiteral40_tree = (Object)adaptor.create(StringLiteral40);
                    adaptor.addChild(root_0, StringLiteral40_tree);


                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:869:4: numericLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3336);
                    numericLiteral41=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral41.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyName"

    public static class memberExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:881:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final ES3Parser.memberExpression_return memberExpression() throws RecognitionException {
        ES3Parser.memberExpression_return retval = new ES3Parser.memberExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.primaryExpression_return primaryExpression42 = null;

        ES3Parser.functionExpression_return functionExpression43 = null;

        ES3Parser.newExpression_return newExpression44 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:882:2: ( primaryExpression | functionExpression | newExpression )
            int alt13=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt13=1;
                }
                break;
            case FUNCTION:
                {
                alt13=2;
                }
                break;
            case NEW:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:882:4: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3354);
                    primaryExpression42=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, primaryExpression42.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:883:4: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3359);
                    functionExpression43=functionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, functionExpression43.getTree());

                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:884:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3364);
                    newExpression44=newExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, newExpression44.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "memberExpression"

    public static class newExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:887:1: newExpression : NEW primaryExpression ;
    public final ES3Parser.newExpression_return newExpression() throws RecognitionException {
        ES3Parser.newExpression_return retval = new ES3Parser.newExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEW45=null;
        ES3Parser.primaryExpression_return primaryExpression46 = null;


        Object NEW45_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:888:2: ( NEW primaryExpression )
            // com/google/jstestdriver/coverage/es3/ES3.g:888:4: NEW primaryExpression
            {
            root_0 = (Object)adaptor.nil();

            NEW45=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression3375); 
            NEW45_tree = (Object)adaptor.create(NEW45);
            root_0 = (Object)adaptor.becomeRoot(NEW45_tree, root_0);

            pushFollow(FOLLOW_primaryExpression_in_newExpression3378);
            primaryExpression46=primaryExpression();

            state._fsp--;

            adaptor.addChild(root_0, primaryExpression46.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class multiLineComment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiLineComment"
    // com/google/jstestdriver/coverage/es3/ES3.g:891:1: multiLineComment : MultiLineComment ;
    public final ES3Parser.multiLineComment_return multiLineComment() throws RecognitionException {
        ES3Parser.multiLineComment_return retval = new ES3Parser.multiLineComment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MultiLineComment47=null;

        Object MultiLineComment47_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:892:9: ( MultiLineComment )
            // com/google/jstestdriver/coverage/es3/ES3.g:892:11: MultiLineComment
            {
            root_0 = (Object)adaptor.nil();

            MultiLineComment47=(Token)match(input,MultiLineComment,FOLLOW_MultiLineComment_in_multiLineComment3396); 
            MultiLineComment47_tree = (Object)adaptor.create(MultiLineComment47);
            adaptor.addChild(root_0, MultiLineComment47_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiLineComment"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // com/google/jstestdriver/coverage/es3/ES3.g:895:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) ;
    public final ES3Parser.arguments_return arguments() throws RecognitionException {
        ES3Parser.arguments_return retval = new ES3Parser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN48=null;
        Token COMMA50=null;
        Token RPAREN52=null;
        ES3Parser.assignmentExpression_return assignmentExpression49 = null;

        ES3Parser.assignmentExpression_return assignmentExpression51 = null;


        Object LPAREN48_tree=null;
        Object COMMA50_tree=null;
        Object RPAREN52_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:896:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGS ( assignmentExpression )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:896:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3415);  
            stream_LPAREN.add(LPAREN48);

            // com/google/jstestdriver/coverage/es3/ES3.g:896:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=NULL && LA15_0<=FALSE)||LA15_0==DELETE||LA15_0==FUNCTION||LA15_0==NEW||LA15_0==THIS||LA15_0==TYPEOF||LA15_0==VOID||LA15_0==LBRACE||LA15_0==LPAREN||LA15_0==LBRACK||(LA15_0>=ADD && LA15_0<=SUB)||(LA15_0>=INC && LA15_0<=DEC)||(LA15_0>=NOT && LA15_0<=INV)||(LA15_0>=Identifier && LA15_0<=StringLiteral)||LA15_0==RegularExpressionLiteral||(LA15_0>=DecimalLiteral && LA15_0<=HexIntegerLiteral)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:896:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3419);
                    assignmentExpression49=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression49.getTree());
                    // com/google/jstestdriver/coverage/es3/ES3.g:896:34: ( COMMA assignmentExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // com/google/jstestdriver/coverage/es3/ES3.g:896:36: COMMA assignmentExpression
                    	    {
                    	    COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments3423);  
                    	    stream_COMMA.add(COMMA50);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3425);
                    	    assignmentExpression51=assignmentExpression();

                    	    state._fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression51.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3433);  
            stream_RPAREN.add(RPAREN52);



            // AST REWRITE
            // elements: assignmentExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 897:2: -> ^( ARGS ( assignmentExpression )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:897:5: ^( ARGS ( assignmentExpression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:897:13: ( assignmentExpression )*
                while ( stream_assignmentExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_assignmentExpression.nextTree());

                }
                stream_assignmentExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftHandSideExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:900:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )* ;
    public final ES3Parser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        ES3Parser.leftHandSideExpression_return retval = new ES3Parser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LBRACK55=null;
        Token RBRACK57=null;
        Token DOT58=null;
        Token Identifier59=null;
        ES3Parser.memberExpression_return memberExpression53 = null;

        ES3Parser.arguments_return arguments54 = null;

        ES3Parser.expression_return expression56 = null;


        Object LBRACK55_tree=null;
        Object RBRACK57_tree=null;
        Object DOT58_tree=null;
        Object Identifier59_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:901:2: ( ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:902:2: ( memberExpression -> memberExpression ) ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )*
            {
            // com/google/jstestdriver/coverage/es3/ES3.g:902:2: ( memberExpression -> memberExpression )
            // com/google/jstestdriver/coverage/es3/ES3.g:903:3: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3462);
            memberExpression53=memberExpression();

            state._fsp--;

            stream_memberExpression.add(memberExpression53.getTree());


            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 903:22: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.nextTree());

            }

            retval.tree = root_0;
            }

            // com/google/jstestdriver/coverage/es3/ES3.g:905:2: ( arguments -> ^( CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> ^( BYINDEX $leftHandSideExpression expression ) | DOT Identifier -> ^( BYFIELD $leftHandSideExpression Identifier ) )*
            loop16:
            do {
                int alt16=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt16=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt16=2;
                    }
                    break;
                case DOT:
                    {
                    alt16=3;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:906:3: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3478);
            	    arguments54=arguments();

            	    state._fsp--;

            	    stream_arguments.add(arguments54.getTree());


            	    // AST REWRITE
            	    // elements: leftHandSideExpression, arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 906:15: -> ^( CALL $leftHandSideExpression arguments )
            	    {
            	        // com/google/jstestdriver/coverage/es3/ES3.g:906:18: ^( CALL $leftHandSideExpression arguments )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_arguments.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:907:5: LBRACK expression RBRACK
            	    {
            	    LBRACK55=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3499);  
            	    stream_LBRACK.add(LBRACK55);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3501);
            	    expression56=expression();

            	    state._fsp--;

            	    stream_expression.add(expression56.getTree());
            	    RBRACK57=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3503);  
            	    stream_RBRACK.add(RBRACK57);



            	    // AST REWRITE
            	    // elements: expression, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 907:30: -> ^( BYINDEX $leftHandSideExpression expression )
            	    {
            	        // com/google/jstestdriver/coverage/es3/ES3.g:907:33: ^( BYINDEX $leftHandSideExpression expression )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BYINDEX, "BYINDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:908:5: DOT Identifier
            	    {
            	    DOT58=(Token)match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression3522);  
            	    stream_DOT.add(DOT58);

            	    Identifier59=(Token)match(input,Identifier,FOLLOW_Identifier_in_leftHandSideExpression3524);  
            	    stream_Identifier.add(Identifier59);



            	    // AST REWRITE
            	    // elements: Identifier, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 908:21: -> ^( BYFIELD $leftHandSideExpression Identifier )
            	    {
            	        // com/google/jstestdriver/coverage/es3/ES3.g:908:24: ^( BYFIELD $leftHandSideExpression Identifier )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BYFIELD, "BYFIELD"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_Identifier.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leftHandSideExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:922:1: postfixExpression : leftHandSideExpression ( postfixOperator )? ;
    public final ES3Parser.postfixExpression_return postfixExpression() throws RecognitionException {
        ES3Parser.postfixExpression_return retval = new ES3Parser.postfixExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.leftHandSideExpression_return leftHandSideExpression60 = null;

        ES3Parser.postfixOperator_return postfixOperator61 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:923:2: ( leftHandSideExpression ( postfixOperator )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:923:4: leftHandSideExpression ( postfixOperator )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression3559);
            leftHandSideExpression60=leftHandSideExpression();

            state._fsp--;

            adaptor.addChild(root_0, leftHandSideExpression60.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // com/google/jstestdriver/coverage/es3/ES3.g:923:95: ( postfixOperator )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=INC && LA17_0<=DEC)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:923:97: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression3565);
                    postfixOperator61=postfixOperator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(postfixOperator61.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class postfixOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixOperator"
    // com/google/jstestdriver/coverage/es3/ES3.g:926:1: postfixOperator : (op= INC | op= DEC );
    public final ES3Parser.postfixOperator_return postfixOperator() throws RecognitionException {
        ES3Parser.postfixOperator_return retval = new ES3Parser.postfixOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;

        Object op_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:927:2: (op= INC | op= DEC )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INC) ) {
                alt18=1;
            }
            else if ( (LA18_0==DEC) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:927:4: op= INC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator3583); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PINC); 

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:928:4: op= DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator3592); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(PDEC); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfixOperator"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:935:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression );
    public final ES3Parser.unaryExpression_return unaryExpression() throws RecognitionException {
        ES3Parser.unaryExpression_return retval = new ES3Parser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.postfixExpression_return postfixExpression62 = null;

        ES3Parser.unaryOperator_return unaryOperator63 = null;

        ES3Parser.unaryExpression_return unaryExpression64 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:936:2: ( postfixExpression | unaryOperator unaryExpression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=NULL && LA19_0<=FALSE)||LA19_0==FUNCTION||LA19_0==NEW||LA19_0==THIS||LA19_0==LBRACE||LA19_0==LPAREN||LA19_0==LBRACK||(LA19_0>=Identifier && LA19_0<=StringLiteral)||LA19_0==RegularExpressionLiteral||(LA19_0>=DecimalLiteral && LA19_0<=HexIntegerLiteral)) ) {
                alt19=1;
            }
            else if ( (LA19_0==DELETE||LA19_0==TYPEOF||LA19_0==VOID||(LA19_0>=ADD && LA19_0<=SUB)||(LA19_0>=INC && LA19_0<=DEC)||(LA19_0>=NOT && LA19_0<=INV)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:936:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3609);
                    postfixExpression62=postfixExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, postfixExpression62.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:937:4: unaryOperator unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression3614);
                    unaryOperator63=unaryOperator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(unaryOperator63.getTree(), root_0);
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3617);
                    unaryExpression64=unaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryExpression64.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryOperator"
    // com/google/jstestdriver/coverage/es3/ES3.g:940:1: unaryOperator : ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT );
    public final ES3Parser.unaryOperator_return unaryOperator() throws RecognitionException {
        ES3Parser.unaryOperator_return retval = new ES3Parser.unaryOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        Token DELETE65=null;
        Token VOID66=null;
        Token TYPEOF67=null;
        Token INC68=null;
        Token DEC69=null;
        Token INV70=null;
        Token NOT71=null;

        Object op_tree=null;
        Object DELETE65_tree=null;
        Object VOID66_tree=null;
        Object TYPEOF67_tree=null;
        Object INC68_tree=null;
        Object DEC69_tree=null;
        Object INV70_tree=null;
        Object NOT71_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:941:2: ( DELETE | VOID | TYPEOF | INC | DEC | op= ADD | op= SUB | INV | NOT )
            int alt20=9;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt20=1;
                }
                break;
            case VOID:
                {
                alt20=2;
                }
                break;
            case TYPEOF:
                {
                alt20=3;
                }
                break;
            case INC:
                {
                alt20=4;
                }
                break;
            case DEC:
                {
                alt20=5;
                }
                break;
            case ADD:
                {
                alt20=6;
                }
                break;
            case SUB:
                {
                alt20=7;
                }
                break;
            case INV:
                {
                alt20=8;
                }
                break;
            case NOT:
                {
                alt20=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:941:4: DELETE
                    {
                    root_0 = (Object)adaptor.nil();

                    DELETE65=(Token)match(input,DELETE,FOLLOW_DELETE_in_unaryOperator3629); 
                    DELETE65_tree = (Object)adaptor.create(DELETE65);
                    adaptor.addChild(root_0, DELETE65_tree);


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:942:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    VOID66=(Token)match(input,VOID,FOLLOW_VOID_in_unaryOperator3634); 
                    VOID66_tree = (Object)adaptor.create(VOID66);
                    adaptor.addChild(root_0, VOID66_tree);


                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:943:4: TYPEOF
                    {
                    root_0 = (Object)adaptor.nil();

                    TYPEOF67=(Token)match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator3639); 
                    TYPEOF67_tree = (Object)adaptor.create(TYPEOF67);
                    adaptor.addChild(root_0, TYPEOF67_tree);


                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:944:4: INC
                    {
                    root_0 = (Object)adaptor.nil();

                    INC68=(Token)match(input,INC,FOLLOW_INC_in_unaryOperator3644); 
                    INC68_tree = (Object)adaptor.create(INC68);
                    adaptor.addChild(root_0, INC68_tree);


                    }
                    break;
                case 5 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:945:4: DEC
                    {
                    root_0 = (Object)adaptor.nil();

                    DEC69=(Token)match(input,DEC,FOLLOW_DEC_in_unaryOperator3649); 
                    DEC69_tree = (Object)adaptor.create(DEC69);
                    adaptor.addChild(root_0, DEC69_tree);


                    }
                    break;
                case 6 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:946:4: op= ADD
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)match(input,ADD,FOLLOW_ADD_in_unaryOperator3656); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(POS); 

                    }
                    break;
                case 7 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:947:4: op= SUB
                    {
                    root_0 = (Object)adaptor.nil();

                    op=(Token)match(input,SUB,FOLLOW_SUB_in_unaryOperator3665); 
                    op_tree = (Object)adaptor.create(op);
                    adaptor.addChild(root_0, op_tree);

                     op.setType(NEG); 

                    }
                    break;
                case 8 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:948:4: INV
                    {
                    root_0 = (Object)adaptor.nil();

                    INV70=(Token)match(input,INV,FOLLOW_INV_in_unaryOperator3672); 
                    INV70_tree = (Object)adaptor.create(INV70);
                    adaptor.addChild(root_0, INV70_tree);


                    }
                    break;
                case 9 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:949:4: NOT
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_unaryOperator3677); 
                    NOT71_tree = (Object)adaptor.create(NOT71);
                    adaptor.addChild(root_0, NOT71_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryOperator"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:956:1: multiplicativeExpression : unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* ;
    public final ES3Parser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        ES3Parser.multiplicativeExpression_return retval = new ES3Parser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set73=null;
        ES3Parser.unaryExpression_return unaryExpression72 = null;

        ES3Parser.unaryExpression_return unaryExpression74 = null;


        Object set73_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:957:2: ( unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:957:4: unaryExpression ( ( MUL | DIV | MOD ) unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3692);
            unaryExpression72=unaryExpression();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpression72.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:957:20: ( ( MUL | DIV | MOD ) unaryExpression )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=MUL && LA21_0<=MOD)||LA21_0==DIV) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:957:22: ( MUL | DIV | MOD ) unaryExpression
            	    {
            	    set73=(Token)input.LT(1);
            	    set73=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD)||input.LA(1)==DIV ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set73), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3711);
            	    unaryExpression74=unaryExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpression74.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:964:1: additiveExpression : multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* ;
    public final ES3Parser.additiveExpression_return additiveExpression() throws RecognitionException {
        ES3Parser.additiveExpression_return retval = new ES3Parser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        ES3Parser.multiplicativeExpression_return multiplicativeExpression75 = null;

        ES3Parser.multiplicativeExpression_return multiplicativeExpression77 = null;


        Object set76_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:965:2: ( multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:965:4: multiplicativeExpression ( ( ADD | SUB ) multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3729);
            multiplicativeExpression75=multiplicativeExpression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicativeExpression75.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:965:29: ( ( ADD | SUB ) multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=ADD && LA22_0<=SUB)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:965:31: ( ADD | SUB ) multiplicativeExpression
            	    {
            	    set76=(Token)input.LT(1);
            	    set76=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set76), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3744);
            	    multiplicativeExpression77=multiplicativeExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression77.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:972:1: shiftExpression : additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* ;
    public final ES3Parser.shiftExpression_return shiftExpression() throws RecognitionException {
        ES3Parser.shiftExpression_return retval = new ES3Parser.shiftExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        ES3Parser.additiveExpression_return additiveExpression78 = null;

        ES3Parser.additiveExpression_return additiveExpression80 = null;


        Object set79_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:973:2: ( additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:973:4: additiveExpression ( ( SHL | SHR | SHU ) additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression3763);
            additiveExpression78=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, additiveExpression78.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:973:23: ( ( SHL | SHR | SHU ) additiveExpression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=SHL && LA23_0<=SHU)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:973:25: ( SHL | SHR | SHU ) additiveExpression
            	    {
            	    set79=(Token)input.LT(1);
            	    set79=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SHL && input.LA(1)<=SHU) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set79), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression3782);
            	    additiveExpression80=additiveExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additiveExpression80.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:980:1: relationalExpression : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* ;
    public final ES3Parser.relationalExpression_return relationalExpression() throws RecognitionException {
        ES3Parser.relationalExpression_return retval = new ES3Parser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set82=null;
        ES3Parser.shiftExpression_return shiftExpression81 = null;

        ES3Parser.shiftExpression_return shiftExpression83 = null;


        Object set82_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:981:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:981:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression3801);
            shiftExpression81=shiftExpression();

            state._fsp--;

            adaptor.addChild(root_0, shiftExpression81.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:981:20: ( ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=IN && LA24_0<=INSTANCEOF)||(LA24_0>=LT && LA24_0<=GTE)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:981:22: ( LT | GT | LTE | GTE | INSTANCEOF | IN ) shiftExpression
            	    {
            	    set82=(Token)input.LT(1);
            	    set82=(Token)input.LT(1);
            	    if ( (input.LA(1)>=IN && input.LA(1)<=INSTANCEOF)||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set82), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression3832);
            	    shiftExpression83=shiftExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExpression83.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:984:1: relationalExpressionNoIn : shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* ;
    public final ES3Parser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        ES3Parser.relationalExpressionNoIn_return retval = new ES3Parser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;
        ES3Parser.shiftExpression_return shiftExpression84 = null;

        ES3Parser.shiftExpression_return shiftExpression86 = null;


        Object set85_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:985:2: ( shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:985:4: shiftExpression ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3846);
            shiftExpression84=shiftExpression();

            state._fsp--;

            adaptor.addChild(root_0, shiftExpression84.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:985:20: ( ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==INSTANCEOF||(LA25_0>=LT && LA25_0<=GTE)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:985:22: ( LT | GT | LTE | GTE | INSTANCEOF ) shiftExpression
            	    {
            	    set85=(Token)input.LT(1);
            	    set85=(Token)input.LT(1);
            	    if ( input.LA(1)==INSTANCEOF||(input.LA(1)>=LT && input.LA(1)<=GTE) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set85), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn3873);
            	    shiftExpression86=shiftExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExpression86.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpressionNoIn"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:992:1: equalityExpression : relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* ;
    public final ES3Parser.equalityExpression_return equalityExpression() throws RecognitionException {
        ES3Parser.equalityExpression_return retval = new ES3Parser.equalityExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set88=null;
        ES3Parser.relationalExpression_return relationalExpression87 = null;

        ES3Parser.relationalExpression_return relationalExpression89 = null;


        Object set88_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:993:2: ( relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:993:4: relationalExpression ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3892);
            relationalExpression87=relationalExpression();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpression87.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:993:25: ( ( EQ | NEQ | SAME | NSAME ) relationalExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=EQ && LA26_0<=NSAME)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:993:27: ( EQ | NEQ | SAME | NSAME ) relationalExpression
            	    {
            	    set88=(Token)input.LT(1);
            	    set88=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set88), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3915);
            	    relationalExpression89=relationalExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relationalExpression89.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:996:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* ;
    public final ES3Parser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        ES3Parser.equalityExpressionNoIn_return retval = new ES3Parser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set91=null;
        ES3Parser.relationalExpressionNoIn_return relationalExpressionNoIn90 = null;

        ES3Parser.relationalExpressionNoIn_return relationalExpressionNoIn92 = null;


        Object set91_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:997:2: ( relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:997:4: relationalExpressionNoIn ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3929);
            relationalExpressionNoIn90=relationalExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn90.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:997:29: ( ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=EQ && LA27_0<=NSAME)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:997:31: ( EQ | NEQ | SAME | NSAME ) relationalExpressionNoIn
            	    {
            	    set91=(Token)input.LT(1);
            	    set91=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQ && input.LA(1)<=NSAME) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set91), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3952);
            	    relationalExpressionNoIn92=relationalExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn92.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equalityExpressionNoIn"

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1004:1: bitwiseANDExpression : equalityExpression ( AND equalityExpression )* ;
    public final ES3Parser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        ES3Parser.bitwiseANDExpression_return retval = new ES3Parser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND94=null;
        ES3Parser.equalityExpression_return equalityExpression93 = null;

        ES3Parser.equalityExpression_return equalityExpression95 = null;


        Object AND94_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1005:2: ( equalityExpression ( AND equalityExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1005:4: equalityExpression ( AND equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3972);
            equalityExpression93=equalityExpression();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpression93.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1005:23: ( AND equalityExpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==AND) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1005:25: AND equalityExpression
            	    {
            	    AND94=(Token)match(input,AND,FOLLOW_AND_in_bitwiseANDExpression3976); 
            	    AND94_tree = (Object)adaptor.create(AND94);
            	    root_0 = (Object)adaptor.becomeRoot(AND94_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression3979);
            	    equalityExpression95=equalityExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExpression95.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpression"

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1008:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( AND equalityExpressionNoIn )* ;
    public final ES3Parser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        ES3Parser.bitwiseANDExpressionNoIn_return retval = new ES3Parser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND97=null;
        ES3Parser.equalityExpressionNoIn_return equalityExpressionNoIn96 = null;

        ES3Parser.equalityExpressionNoIn_return equalityExpressionNoIn98 = null;


        Object AND97_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1009:2: ( equalityExpressionNoIn ( AND equalityExpressionNoIn )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1009:4: equalityExpressionNoIn ( AND equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3993);
            equalityExpressionNoIn96=equalityExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn96.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1009:27: ( AND equalityExpressionNoIn )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==AND) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1009:29: AND equalityExpressionNoIn
            	    {
            	    AND97=(Token)match(input,AND,FOLLOW_AND_in_bitwiseANDExpressionNoIn3997); 
            	    AND97_tree = (Object)adaptor.create(AND97);
            	    root_0 = (Object)adaptor.becomeRoot(AND97_tree, root_0);

            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4000);
            	    equalityExpressionNoIn98=equalityExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn98.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpressionNoIn"

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1012:1: bitwiseXORExpression : bitwiseANDExpression ( XOR bitwiseANDExpression )* ;
    public final ES3Parser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        ES3Parser.bitwiseXORExpression_return retval = new ES3Parser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR100=null;
        ES3Parser.bitwiseANDExpression_return bitwiseANDExpression99 = null;

        ES3Parser.bitwiseANDExpression_return bitwiseANDExpression101 = null;


        Object XOR100_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1013:2: ( bitwiseANDExpression ( XOR bitwiseANDExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1013:4: bitwiseANDExpression ( XOR bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4016);
            bitwiseANDExpression99=bitwiseANDExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression99.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1013:25: ( XOR bitwiseANDExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==XOR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1013:27: XOR bitwiseANDExpression
            	    {
            	    XOR100=(Token)match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpression4020); 
            	    XOR100_tree = (Object)adaptor.create(XOR100);
            	    root_0 = (Object)adaptor.becomeRoot(XOR100_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4023);
            	    bitwiseANDExpression101=bitwiseANDExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression101.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpression"

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1016:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* ;
    public final ES3Parser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        ES3Parser.bitwiseXORExpressionNoIn_return retval = new ES3Parser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token XOR103=null;
        ES3Parser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn102 = null;

        ES3Parser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn104 = null;


        Object XOR103_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1017:2: ( bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1017:4: bitwiseANDExpressionNoIn ( XOR bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4039);
            bitwiseANDExpressionNoIn102=bitwiseANDExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn102.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1017:29: ( XOR bitwiseANDExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==XOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1017:31: XOR bitwiseANDExpressionNoIn
            	    {
            	    XOR103=(Token)match(input,XOR,FOLLOW_XOR_in_bitwiseXORExpressionNoIn4043); 
            	    XOR103_tree = (Object)adaptor.create(XOR103);
            	    root_0 = (Object)adaptor.becomeRoot(XOR103_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4046);
            	    bitwiseANDExpressionNoIn104=bitwiseANDExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn104.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpressionNoIn"

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1020:1: bitwiseORExpression : bitwiseXORExpression ( OR bitwiseXORExpression )* ;
    public final ES3Parser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        ES3Parser.bitwiseORExpression_return retval = new ES3Parser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR106=null;
        ES3Parser.bitwiseXORExpression_return bitwiseXORExpression105 = null;

        ES3Parser.bitwiseXORExpression_return bitwiseXORExpression107 = null;


        Object OR106_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1021:2: ( bitwiseXORExpression ( OR bitwiseXORExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1021:4: bitwiseXORExpression ( OR bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4061);
            bitwiseXORExpression105=bitwiseXORExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression105.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1021:25: ( OR bitwiseXORExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==OR) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1021:27: OR bitwiseXORExpression
            	    {
            	    OR106=(Token)match(input,OR,FOLLOW_OR_in_bitwiseORExpression4065); 
            	    OR106_tree = (Object)adaptor.create(OR106);
            	    root_0 = (Object)adaptor.becomeRoot(OR106_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4068);
            	    bitwiseXORExpression107=bitwiseXORExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression107.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpression"

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1024:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* ;
    public final ES3Parser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        ES3Parser.bitwiseORExpressionNoIn_return retval = new ES3Parser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR109=null;
        ES3Parser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn108 = null;

        ES3Parser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn110 = null;


        Object OR109_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1025:2: ( bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1025:4: bitwiseXORExpressionNoIn ( OR bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4083);
            bitwiseXORExpressionNoIn108=bitwiseXORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn108.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1025:29: ( OR bitwiseXORExpressionNoIn )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==OR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1025:31: OR bitwiseXORExpressionNoIn
            	    {
            	    OR109=(Token)match(input,OR,FOLLOW_OR_in_bitwiseORExpressionNoIn4087); 
            	    OR109_tree = (Object)adaptor.create(OR109);
            	    root_0 = (Object)adaptor.becomeRoot(OR109_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4090);
            	    bitwiseXORExpressionNoIn110=bitwiseXORExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn110.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpressionNoIn"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1032:1: logicalANDExpression : bitwiseORExpression ( LAND bitwiseORExpression )* ;
    public final ES3Parser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        ES3Parser.logicalANDExpression_return retval = new ES3Parser.logicalANDExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND112=null;
        ES3Parser.bitwiseORExpression_return bitwiseORExpression111 = null;

        ES3Parser.bitwiseORExpression_return bitwiseORExpression113 = null;


        Object LAND112_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1033:2: ( bitwiseORExpression ( LAND bitwiseORExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1033:4: bitwiseORExpression ( LAND bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4109);
            bitwiseORExpression111=bitwiseORExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseORExpression111.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1033:24: ( LAND bitwiseORExpression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LAND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1033:26: LAND bitwiseORExpression
            	    {
            	    LAND112=(Token)match(input,LAND,FOLLOW_LAND_in_logicalANDExpression4113); 
            	    LAND112_tree = (Object)adaptor.create(LAND112);
            	    root_0 = (Object)adaptor.becomeRoot(LAND112_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression4116);
            	    bitwiseORExpression113=bitwiseORExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression113.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1036:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* ;
    public final ES3Parser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        ES3Parser.logicalANDExpressionNoIn_return retval = new ES3Parser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LAND115=null;
        ES3Parser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn114 = null;

        ES3Parser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn116 = null;


        Object LAND115_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1037:2: ( bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1037:4: bitwiseORExpressionNoIn ( LAND bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4130);
            bitwiseORExpressionNoIn114=bitwiseORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn114.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1037:28: ( LAND bitwiseORExpressionNoIn )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LAND) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1037:30: LAND bitwiseORExpressionNoIn
            	    {
            	    LAND115=(Token)match(input,LAND,FOLLOW_LAND_in_logicalANDExpressionNoIn4134); 
            	    LAND115_tree = (Object)adaptor.create(LAND115);
            	    root_0 = (Object)adaptor.becomeRoot(LAND115_tree, root_0);

            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4137);
            	    bitwiseORExpressionNoIn116=bitwiseORExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn116.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpressionNoIn"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1040:1: logicalORExpression : logicalANDExpression ( LOR logicalANDExpression )* ;
    public final ES3Parser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        ES3Parser.logicalORExpression_return retval = new ES3Parser.logicalORExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR118=null;
        ES3Parser.logicalANDExpression_return logicalANDExpression117 = null;

        ES3Parser.logicalANDExpression_return logicalANDExpression119 = null;


        Object LOR118_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1041:2: ( logicalANDExpression ( LOR logicalANDExpression )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1041:4: logicalANDExpression ( LOR logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4152);
            logicalANDExpression117=logicalANDExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalANDExpression117.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1041:25: ( LOR logicalANDExpression )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==LOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1041:27: LOR logicalANDExpression
            	    {
            	    LOR118=(Token)match(input,LOR,FOLLOW_LOR_in_logicalORExpression4156); 
            	    LOR118_tree = (Object)adaptor.create(LOR118);
            	    root_0 = (Object)adaptor.becomeRoot(LOR118_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression4159);
            	    logicalANDExpression119=logicalANDExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression119.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1044:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* ;
    public final ES3Parser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        ES3Parser.logicalORExpressionNoIn_return retval = new ES3Parser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LOR121=null;
        ES3Parser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn120 = null;

        ES3Parser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn122 = null;


        Object LOR121_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1045:2: ( logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1045:4: logicalANDExpressionNoIn ( LOR logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4174);
            logicalANDExpressionNoIn120=logicalANDExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn120.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1045:29: ( LOR logicalANDExpressionNoIn )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LOR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1045:31: LOR logicalANDExpressionNoIn
            	    {
            	    LOR121=(Token)match(input,LOR,FOLLOW_LOR_in_logicalORExpressionNoIn4178); 
            	    LOR121_tree = (Object)adaptor.create(LOR121);
            	    root_0 = (Object)adaptor.becomeRoot(LOR121_tree, root_0);

            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4181);
            	    logicalANDExpressionNoIn122=logicalANDExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn122.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalORExpressionNoIn"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1052:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final ES3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        ES3Parser.conditionalExpression_return retval = new ES3Parser.conditionalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE124=null;
        Token COLON126=null;
        ES3Parser.logicalORExpression_return logicalORExpression123 = null;

        ES3Parser.assignmentExpression_return assignmentExpression125 = null;

        ES3Parser.assignmentExpression_return assignmentExpression127 = null;


        Object QUE124_tree=null;
        Object COLON126_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1053:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:1053:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression4200);
            logicalORExpression123=logicalORExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalORExpression123.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1053:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==QUE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1053:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE124=(Token)match(input,QUE,FOLLOW_QUE_in_conditionalExpression4204); 
                    QUE124_tree = (Object)adaptor.create(QUE124);
                    root_0 = (Object)adaptor.becomeRoot(QUE124_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4207);
                    assignmentExpression125=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression125.getTree());
                    COLON126=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression4209); 
                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression4212);
                    assignmentExpression127=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression127.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1056:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final ES3Parser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        ES3Parser.conditionalExpressionNoIn_return retval = new ES3Parser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUE129=null;
        Token COLON131=null;
        ES3Parser.logicalORExpressionNoIn_return logicalORExpressionNoIn128 = null;

        ES3Parser.assignmentExpressionNoIn_return assignmentExpressionNoIn130 = null;

        ES3Parser.assignmentExpressionNoIn_return assignmentExpressionNoIn132 = null;


        Object QUE129_tree=null;
        Object COLON131_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1057:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:1057:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4226);
            logicalORExpressionNoIn128=logicalORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn128.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1057:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QUE) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1057:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE129=(Token)match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn4230); 
                    QUE129_tree = (Object)adaptor.create(QUE129);
                    root_0 = (Object)adaptor.becomeRoot(QUE129_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4233);
                    assignmentExpressionNoIn130=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn130.getTree());
                    COLON131=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn4235); 
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4238);
                    assignmentExpressionNoIn132=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn132.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditionalExpressionNoIn"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1086:1: assignmentExpression : lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? ;
    public final ES3Parser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        ES3Parser.assignmentExpression_return retval = new ES3Parser.assignmentExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.conditionalExpression_return lhs = null;

        ES3Parser.assignmentOperator_return assignmentOperator133 = null;

        ES3Parser.assignmentExpression_return assignmentExpression134 = null;




        	Object[] isLhs = new Object[1];

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1091:2: (lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:1091:4: lhs= conditionalExpression ({...}? assignmentOperator assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression4266);
            lhs=conditionalExpression();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1092:2: ({...}? assignmentOperator assignmentExpression )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=ASSIGN && LA40_0<=XORASS)||LA40_0==DIVASS) ) {
                int LA40_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1092:4: {...}? assignmentOperator assignmentExpression
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpression", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression4273);
                    assignmentOperator133=assignmentOperator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator133.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression4276);
                    assignmentExpression134=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression134.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // com/google/jstestdriver/coverage/es3/ES3.g:1095:1: assignmentOperator : ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS );
    public final ES3Parser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        ES3Parser.assignmentOperator_return retval = new ES3Parser.assignmentOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set135=null;

        Object set135_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1096:2: ( ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS )
            // com/google/jstestdriver/coverage/es3/ES3.g:
            {
            root_0 = (Object)adaptor.nil();

            set135=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set135));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"

    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1099:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final ES3Parser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        ES3Parser.assignmentExpressionNoIn_return retval = new ES3Parser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.conditionalExpressionNoIn_return lhs = null;

        ES3Parser.assignmentOperator_return assignmentOperator136 = null;

        ES3Parser.assignmentExpressionNoIn_return assignmentExpressionNoIn137 = null;




        	Object[] isLhs = new Object[1];

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1104:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:1104:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4353);
            lhs=conditionalExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1105:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=ASSIGN && LA41_0<=XORASS)||LA41_0==DIVASS) ) {
                int LA41_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1105:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4360);
                    assignmentOperator136=assignmentOperator();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOperator136.getTree(), root_0);
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4363);
                    assignmentExpressionNoIn137=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn137.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignmentExpressionNoIn"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1112:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final ES3Parser.expression_return expression() throws RecognitionException {
        ES3Parser.expression_return retval = new ES3Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA138=null;
        List list_exprs=null;
        ES3Parser.assignmentExpression_return exprs = null;
         exprs = null;
        Object COMMA138_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1113:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // com/google/jstestdriver/coverage/es3/ES3.g:1113:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression4385);
            exprs=assignmentExpression();

            state._fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());

            // com/google/jstestdriver/coverage/es3/ES3.g:1113:32: ( COMMA exprs+= assignmentExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1113:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression4389);  
            	    stream_COMMA.add(COMMA138);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression4393);
            	    exprs=assignmentExpression();

            	    state._fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);



            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (Object)adaptor.nil();
            // 1114:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // com/google/jstestdriver/coverage/es3/ES3.g:1114:28: ^( CEXPR ( $exprs)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprs.nextTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1115:2: -> $exprs
            {
                adaptor.addChild(root_0, stream_exprs.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1118:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final ES3Parser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        ES3Parser.expressionNoIn_return retval = new ES3Parser.expressionNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA139=null;
        List list_exprs=null;
        ES3Parser.assignmentExpressionNoIn_return exprs = null;
         exprs = null;
        Object COMMA139_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1119:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // com/google/jstestdriver/coverage/es3/ES3.g:1119:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4430);
            exprs=assignmentExpressionNoIn();

            state._fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());

            // com/google/jstestdriver/coverage/es3/ES3.g:1119:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1119:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA139=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn4434);  
            	    stream_COMMA.add(COMMA139);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4438);
            	    exprs=assignmentExpressionNoIn();

            	    state._fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);



            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (Object)adaptor.nil();
            // 1120:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // com/google/jstestdriver/coverage/es3/ES3.g:1120:28: ^( CEXPR ( $exprs)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprs.nextTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1121:2: -> $exprs
            {
                adaptor.addChild(root_0, stream_exprs.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionNoIn"

    public static class semic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semic"
    // com/google/jstestdriver/coverage/es3/ES3.g:1146:1: semic : ( SEMIC | EOF | RBRACE | EOL );
    public final ES3Parser.semic_return semic() throws RecognitionException {
        ES3Parser.semic_return retval = new ES3Parser.semic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC140=null;
        Token EOF141=null;
        Token RBRACE142=null;
        Token EOL143=null;

        Object SEMIC140_tree=null;
        Object EOF141_tree=null;
        Object RBRACE142_tree=null;
        Object EOL143_tree=null;


        	// Mark current position so we can unconsume a RBRACE.
        	int marker = input.mark();
        	// Promote EOL if appropriate	
        	promoteEOL(retval);

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1154:2: ( SEMIC | EOF | RBRACE | EOL )
            int alt44=4;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt44=1;
                }
                break;
            case EOF:
                {
                alt44=2;
                }
                break;
            case RBRACE:
                {
                alt44=3;
                }
                break;
            case EOL:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1154:4: SEMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    SEMIC140=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_semic4489); 
                    SEMIC140_tree = (Object)adaptor.create(SEMIC140);
                    adaptor.addChild(root_0, SEMIC140_tree);


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1155:4: EOF
                    {
                    root_0 = (Object)adaptor.nil();

                    EOF141=(Token)match(input,EOF,FOLLOW_EOF_in_semic4494); 
                    EOF141_tree = (Object)adaptor.create(EOF141);
                    adaptor.addChild(root_0, EOF141_tree);


                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1156:4: RBRACE
                    {
                    root_0 = (Object)adaptor.nil();

                    RBRACE142=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_semic4499); 
                    RBRACE142_tree = (Object)adaptor.create(RBRACE142);
                    adaptor.addChild(root_0, RBRACE142_tree);

                     input.rewind(marker); 

                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1157:4: EOL
                    {
                    root_0 = (Object)adaptor.nil();

                    EOL143=(Token)match(input,EOL,FOLLOW_EOL_in_semic4506); 
                    EOL143_tree = (Object)adaptor.create(EOL143);
                    adaptor.addChild(root_0, EOL143_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "semic"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1165:1: statement options {k=1; } : ({...}? block | statementTail );
    public final ES3Parser.statement_return statement() throws RecognitionException {
        ES3Parser.statement_return retval = new ES3Parser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.block_return block144 = null;

        ES3Parser.statementTail_return statementTail145 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1170:2: ({...}? block | statementTail )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1170:4: {...}? block
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !(( input.LA(1) == LBRACE )) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement4534);
                    block144=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block144.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1171:4: statementTail
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement4539);
                    statementTail145=statementTail();

                    state._fsp--;

                    adaptor.addChild(root_0, statementTail145.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementTail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementTail"
    // com/google/jstestdriver/coverage/es3/ES3.g:1174:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final ES3Parser.statementTail_return statementTail() throws RecognitionException {
        ES3Parser.statementTail_return retval = new ES3Parser.statementTail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.variableStatement_return variableStatement146 = null;

        ES3Parser.emptyStatement_return emptyStatement147 = null;

        ES3Parser.expressionStatement_return expressionStatement148 = null;

        ES3Parser.ifStatement_return ifStatement149 = null;

        ES3Parser.iterationStatement_return iterationStatement150 = null;

        ES3Parser.continueStatement_return continueStatement151 = null;

        ES3Parser.breakStatement_return breakStatement152 = null;

        ES3Parser.returnStatement_return returnStatement153 = null;

        ES3Parser.withStatement_return withStatement154 = null;

        ES3Parser.labelledStatement_return labelledStatement155 = null;

        ES3Parser.switchStatement_return switchStatement156 = null;

        ES3Parser.throwStatement_return throwStatement157 = null;

        ES3Parser.tryStatement_return tryStatement158 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1175:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt46=13;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1175:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail4551);
                    variableStatement146=variableStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, variableStatement146.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1176:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail4556);
                    emptyStatement147=emptyStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, emptyStatement147.getTree());

                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1177:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail4561);
                    expressionStatement148=expressionStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStatement148.getTree());

                    }
                    break;
                case 4 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1178:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail4566);
                    ifStatement149=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement149.getTree());

                    }
                    break;
                case 5 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1179:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail4571);
                    iterationStatement150=iterationStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, iterationStatement150.getTree());

                    }
                    break;
                case 6 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1180:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail4576);
                    continueStatement151=continueStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, continueStatement151.getTree());

                    }
                    break;
                case 7 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1181:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail4581);
                    breakStatement152=breakStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, breakStatement152.getTree());

                    }
                    break;
                case 8 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1182:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail4586);
                    returnStatement153=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStatement153.getTree());

                    }
                    break;
                case 9 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1183:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail4591);
                    withStatement154=withStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, withStatement154.getTree());

                    }
                    break;
                case 10 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1184:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail4596);
                    labelledStatement155=labelledStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, labelledStatement155.getTree());

                    }
                    break;
                case 11 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1185:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail4601);
                    switchStatement156=switchStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, switchStatement156.getTree());

                    }
                    break;
                case 12 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1186:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail4606);
                    throwStatement157=throwStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, throwStatement157.getTree());

                    }
                    break;
                case 13 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1187:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail4611);
                    tryStatement158=tryStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, tryStatement158.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementTail"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // com/google/jstestdriver/coverage/es3/ES3.g:1192:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) ;
    public final ES3Parser.block_return block() throws RecognitionException {
        ES3Parser.block_return retval = new ES3Parser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE160=null;
        ES3Parser.statement_return statement159 = null;


        Object lb_tree=null;
        Object RBRACE160_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1193:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1193:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block4626);  
            stream_LBRACE.add(lb);

            // com/google/jstestdriver/coverage/es3/ES3.g:1193:14: ( statement )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=NULL && LA47_0<=BREAK)||LA47_0==CONTINUE||(LA47_0>=DELETE && LA47_0<=DO)||(LA47_0>=FOR && LA47_0<=IF)||(LA47_0>=NEW && LA47_0<=WITH)||LA47_0==LBRACE||LA47_0==LPAREN||LA47_0==LBRACK||LA47_0==SEMIC||(LA47_0>=ADD && LA47_0<=SUB)||(LA47_0>=INC && LA47_0<=DEC)||(LA47_0>=NOT && LA47_0<=INV)||(LA47_0>=Identifier && LA47_0<=StringLiteral)||LA47_0==RegularExpressionLiteral||(LA47_0>=DecimalLiteral && LA47_0<=HexIntegerLiteral)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1193:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block4628);
            	    statement159=statement();

            	    state._fsp--;

            	    stream_statement.add(statement159.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            RBRACE160=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block4631);  
            stream_RBRACE.add(RBRACE160);



            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1194:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1194:5: ^( BLOCK[$lb, \"BLOCK\"] ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, lb, "BLOCK"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:1194:28: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class variableStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1201:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) ;
    public final ES3Parser.variableStatement_return variableStatement() throws RecognitionException {
        ES3Parser.variableStatement_return retval = new ES3Parser.variableStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR161=null;
        Token COMMA163=null;
        ES3Parser.variableDeclaration_return variableDeclaration162 = null;

        ES3Parser.variableDeclaration_return variableDeclaration164 = null;

        ES3Parser.semic_return semic165 = null;


        Object VAR161_tree=null;
        Object COMMA163_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1202:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ^( VAR ( variableDeclaration )+ ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1202:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR161=(Token)match(input,VAR,FOLLOW_VAR_in_variableStatement4660);  
            stream_VAR.add(VAR161);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement4662);
            variableDeclaration162=variableDeclaration();

            state._fsp--;

            stream_variableDeclaration.add(variableDeclaration162.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1202:28: ( COMMA variableDeclaration )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1202:30: COMMA variableDeclaration
            	    {
            	    COMMA163=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableStatement4666);  
            	    stream_COMMA.add(COMMA163);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement4668);
            	    variableDeclaration164=variableDeclaration();

            	    state._fsp--;

            	    stream_variableDeclaration.add(variableDeclaration164.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement4673);
            semic165=semic();

            state._fsp--;

            stream_semic.add(semic165.getTree());


            // AST REWRITE
            // elements: variableDeclaration, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1203:2: -> ^( VAR ( variableDeclaration )+ )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1203:5: ^( VAR ( variableDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclaration.nextTree());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableStatement"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // com/google/jstestdriver/coverage/es3/ES3.g:1206:1: variableDeclaration : Identifier ( ASSIGN assignmentExpression )? ;
    public final ES3Parser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        ES3Parser.variableDeclaration_return retval = new ES3Parser.variableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier166=null;
        Token ASSIGN167=null;
        ES3Parser.assignmentExpression_return assignmentExpression168 = null;


        Object Identifier166_tree=null;
        Object ASSIGN167_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1207:2: ( Identifier ( ASSIGN assignmentExpression )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:1207:4: Identifier ( ASSIGN assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();

            Identifier166=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration4696); 
            Identifier166_tree = (Object)adaptor.create(Identifier166);
            adaptor.addChild(root_0, Identifier166_tree);

            // com/google/jstestdriver/coverage/es3/ES3.g:1207:15: ( ASSIGN assignmentExpression )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASSIGN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1207:17: ASSIGN assignmentExpression
                    {
                    ASSIGN167=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration4700); 
                    ASSIGN167_tree = (Object)adaptor.create(ASSIGN167);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN167_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration4703);
                    assignmentExpression168=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression168.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarationNoIn"
    // com/google/jstestdriver/coverage/es3/ES3.g:1210:1: variableDeclarationNoIn : Identifier ( ASSIGN assignmentExpressionNoIn )? ;
    public final ES3Parser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        ES3Parser.variableDeclarationNoIn_return retval = new ES3Parser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier169=null;
        Token ASSIGN170=null;
        ES3Parser.assignmentExpressionNoIn_return assignmentExpressionNoIn171 = null;


        Object Identifier169_tree=null;
        Object ASSIGN170_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1211:2: ( Identifier ( ASSIGN assignmentExpressionNoIn )? )
            // com/google/jstestdriver/coverage/es3/ES3.g:1211:4: Identifier ( ASSIGN assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();

            Identifier169=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn4718); 
            Identifier169_tree = (Object)adaptor.create(Identifier169);
            adaptor.addChild(root_0, Identifier169_tree);

            // com/google/jstestdriver/coverage/es3/ES3.g:1211:15: ( ASSIGN assignmentExpressionNoIn )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ASSIGN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1211:17: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN170=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn4722); 
                    ASSIGN170_tree = (Object)adaptor.create(ASSIGN170);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN170_tree, root_0);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4725);
                    assignmentExpressionNoIn171=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn171.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableDeclarationNoIn"

    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1218:1: emptyStatement : SEMIC ;
    public final ES3Parser.emptyStatement_return emptyStatement() throws RecognitionException {
        ES3Parser.emptyStatement_return retval = new ES3Parser.emptyStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC172=null;

        Object SEMIC172_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1219:2: ( SEMIC )
            // com/google/jstestdriver/coverage/es3/ES3.g:1219:4: SEMIC
            {
            root_0 = (Object)adaptor.nil();

            SEMIC172=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement4744); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "emptyStatement"

    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1232:1: expressionStatement : expression semic ;
    public final ES3Parser.expressionStatement_return expressionStatement() throws RecognitionException {
        ES3Parser.expressionStatement_return retval = new ES3Parser.expressionStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.expression_return expression173 = null;

        ES3Parser.semic_return semic174 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1233:2: ( expression semic )
            // com/google/jstestdriver/coverage/es3/ES3.g:1233:4: expression semic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement4763);
            expression173=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression173.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement4765);
            semic174=semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1240:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression statement ( ELSE statement )? ) ;
    public final ES3Parser.ifStatement_return ifStatement() throws RecognitionException {
        ES3Parser.ifStatement_return retval = new ES3Parser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF175=null;
        Token LPAREN176=null;
        Token RPAREN178=null;
        Token ELSE180=null;
        ES3Parser.expression_return expression177 = null;

        ES3Parser.statement_return statement179 = null;

        ES3Parser.statement_return statement181 = null;


        Object IF175_tree=null;
        Object LPAREN176_tree=null;
        Object RPAREN178_tree=null;
        Object ELSE180_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1242:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( IF expression statement ( ELSE statement )? ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1242:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF175=(Token)match(input,IF,FOLLOW_IF_in_ifStatement4783);  
            stream_IF.add(IF175);

            LPAREN176=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement4785);  
            stream_LPAREN.add(LPAREN176);

            pushFollow(FOLLOW_expression_in_ifStatement4787);
            expression177=expression();

            state._fsp--;

            stream_expression.add(expression177.getTree());
            RPAREN178=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement4789);  
            stream_RPAREN.add(RPAREN178);

            pushFollow(FOLLOW_statement_in_ifStatement4791);
            statement179=statement();

            state._fsp--;

            stream_statement.add(statement179.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1242:42: ({...}? ELSE statement )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ELSE) ) {
                int LA51_1 = input.LA(2);

                if ( (( input.LA(1) == ELSE )) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1242:44: {...}? ELSE statement
                    {
                    if ( !(( input.LA(1) == ELSE )) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE180=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement4797);  
                    stream_ELSE.add(ELSE180);

                    pushFollow(FOLLOW_statement_in_ifStatement4799);
                    statement181=statement();

                    state._fsp--;

                    stream_statement.add(statement181.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: statement, IF, expression, statement, ELSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1243:2: -> ^( IF expression statement ( ELSE statement )? )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1243:5: ^( IF expression statement ( ELSE statement )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());
                // com/google/jstestdriver/coverage/es3/ES3.g:1243:32: ( ELSE statement )?
                if ( stream_statement.hasNext()||stream_ELSE.hasNext() ) {
                    adaptor.addChild(root_1, stream_ELSE.nextNode());
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                stream_ELSE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class iterationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterationStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1251:1: iterationStatement : ( doStatement | whileStatement | forStatement );
    public final ES3Parser.iterationStatement_return iterationStatement() throws RecognitionException {
        ES3Parser.iterationStatement_return retval = new ES3Parser.iterationStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.doStatement_return doStatement182 = null;

        ES3Parser.whileStatement_return whileStatement183 = null;

        ES3Parser.forStatement_return forStatement184 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1252:2: ( doStatement | whileStatement | forStatement )
            int alt52=3;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt52=1;
                }
                break;
            case WHILE:
                {
                alt52=2;
                }
                break;
            case FOR:
                {
                alt52=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1252:4: doStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement4838);
                    doStatement182=doStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, doStatement182.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1253:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement4843);
                    whileStatement183=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement183.getTree());

                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1254:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement4848);
                    forStatement184=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement184.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iterationStatement"

    public static class doStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1257:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) ;
    public final ES3Parser.doStatement_return doStatement() throws RecognitionException {
        ES3Parser.doStatement_return retval = new ES3Parser.doStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO185=null;
        Token WHILE187=null;
        Token LPAREN188=null;
        Token RPAREN190=null;
        ES3Parser.statement_return statement186 = null;

        ES3Parser.expression_return expression189 = null;

        ES3Parser.semic_return semic191 = null;


        Object DO185_tree=null;
        Object WHILE187_tree=null;
        Object LPAREN188_tree=null;
        Object RPAREN190_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1258:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( DO statement expression ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1258:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO185=(Token)match(input,DO,FOLLOW_DO_in_doStatement4860);  
            stream_DO.add(DO185);

            pushFollow(FOLLOW_statement_in_doStatement4862);
            statement186=statement();

            state._fsp--;

            stream_statement.add(statement186.getTree());
            WHILE187=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStatement4864);  
            stream_WHILE.add(WHILE187);

            LPAREN188=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doStatement4866);  
            stream_LPAREN.add(LPAREN188);

            pushFollow(FOLLOW_expression_in_doStatement4868);
            expression189=expression();

            state._fsp--;

            stream_expression.add(expression189.getTree());
            RPAREN190=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStatement4870);  
            stream_RPAREN.add(RPAREN190);

            pushFollow(FOLLOW_semic_in_doStatement4872);
            semic191=semic();

            state._fsp--;

            stream_semic.add(semic191.getTree());


            // AST REWRITE
            // elements: expression, statement, DO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1259:2: -> ^( DO statement expression )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1259:5: ^( DO statement expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1262:1: whileStatement : WHILE LPAREN expression RPAREN statement ;
    public final ES3Parser.whileStatement_return whileStatement() throws RecognitionException {
        ES3Parser.whileStatement_return retval = new ES3Parser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE192=null;
        Token LPAREN193=null;
        Token RPAREN195=null;
        ES3Parser.expression_return expression194 = null;

        ES3Parser.statement_return statement196 = null;


        Object WHILE192_tree=null;
        Object LPAREN193_tree=null;
        Object RPAREN195_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1263:2: ( WHILE LPAREN expression RPAREN statement )
            // com/google/jstestdriver/coverage/es3/ES3.g:1263:4: WHILE LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WHILE192=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement4897); 
            WHILE192_tree = (Object)adaptor.create(WHILE192);
            root_0 = (Object)adaptor.becomeRoot(WHILE192_tree, root_0);

            LPAREN193=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement4900); 
            pushFollow(FOLLOW_expression_in_whileStatement4903);
            expression194=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression194.getTree());
            RPAREN195=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement4905); 
            pushFollow(FOLLOW_statement_in_whileStatement4908);
            statement196=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement196.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1307:1: forStatement : FOR LPAREN forControl RPAREN statement ;
    public final ES3Parser.forStatement_return forStatement() throws RecognitionException {
        ES3Parser.forStatement_return retval = new ES3Parser.forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR197=null;
        Token LPAREN198=null;
        Token RPAREN200=null;
        ES3Parser.forControl_return forControl199 = null;

        ES3Parser.statement_return statement201 = null;


        Object FOR197_tree=null;
        Object LPAREN198_tree=null;
        Object RPAREN200_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1308:2: ( FOR LPAREN forControl RPAREN statement )
            // com/google/jstestdriver/coverage/es3/ES3.g:1308:4: FOR LPAREN forControl RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            FOR197=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement4921); 
            FOR197_tree = (Object)adaptor.create(FOR197);
            root_0 = (Object)adaptor.becomeRoot(FOR197_tree, root_0);

            LPAREN198=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStatement4924); 
            pushFollow(FOLLOW_forControl_in_forStatement4927);
            forControl199=forControl();

            state._fsp--;

            adaptor.addChild(root_0, forControl199.getTree());
            RPAREN200=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement4929); 
            pushFollow(FOLLOW_statement_in_forStatement4932);
            statement201=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement201.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class forControl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControl"
    // com/google/jstestdriver/coverage/es3/ES3.g:1311:1: forControl : ( forControlVar | forControlExpression | forControlSemic );
    public final ES3Parser.forControl_return forControl() throws RecognitionException {
        ES3Parser.forControl_return retval = new ES3Parser.forControl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.forControlVar_return forControlVar202 = null;

        ES3Parser.forControlExpression_return forControlExpression203 = null;

        ES3Parser.forControlSemic_return forControlSemic204 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1312:2: ( forControlVar | forControlExpression | forControlSemic )
            int alt53=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt53=1;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt53=2;
                }
                break;
            case SEMIC:
                {
                alt53=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1312:4: forControlVar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl4943);
                    forControlVar202=forControlVar();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlVar202.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1313:4: forControlExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlExpression_in_forControl4948);
                    forControlExpression203=forControlExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlExpression203.getTree());

                    }
                    break;
                case 3 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1314:4: forControlSemic
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forControlSemic_in_forControl4953);
                    forControlSemic204=forControlSemic();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlSemic204.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControl"

    public static class forControlVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlVar"
    // com/google/jstestdriver/coverage/es3/ES3.g:1317:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) ;
    public final ES3Parser.forControlVar_return forControlVar() throws RecognitionException {
        ES3Parser.forControlVar_return retval = new ES3Parser.forControlVar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR205=null;
        Token IN207=null;
        Token COMMA209=null;
        Token SEMIC211=null;
        Token SEMIC212=null;
        ES3Parser.expression_return ex1 = null;

        ES3Parser.expression_return ex2 = null;

        ES3Parser.variableDeclarationNoIn_return variableDeclarationNoIn206 = null;

        ES3Parser.expression_return expression208 = null;

        ES3Parser.variableDeclarationNoIn_return variableDeclarationNoIn210 = null;


        Object VAR205_tree=null;
        Object IN207_tree=null;
        Object COMMA209_tree=null;
        Object SEMIC211_tree=null;
        Object SEMIC212_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1318:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1318:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            {
            VAR205=(Token)match(input,VAR,FOLLOW_VAR_in_forControlVar4964);  
            stream_VAR.add(VAR205);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar4966);
            variableDeclarationNoIn206=variableDeclarationNoIn();

            state._fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn206.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1319:2: ( ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==IN) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=SEMIC && LA57_0<=COMMA)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1320:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    {
                    // com/google/jstestdriver/coverage/es3/ES3.g:1320:3: ( IN expression -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) ) )
                    // com/google/jstestdriver/coverage/es3/ES3.g:1321:4: IN expression
                    {
                    IN207=(Token)match(input,IN,FOLLOW_IN_in_forControlVar4978);  
                    stream_IN.add(IN207);

                    pushFollow(FOLLOW_expression_in_forControlVar4980);
                    expression208=expression();

                    state._fsp--;

                    stream_expression.add(expression208.getTree());


                    // AST REWRITE
                    // elements: expression, variableDeclarationNoIn, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1322:4: -> ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                    {
                        // com/google/jstestdriver/coverage/es3/ES3.g:1322:7: ^( FORITER ^( VAR variableDeclarationNoIn ) ^( EXPR expression ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORITER, "FORITER"), root_1);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1322:18: ^( VAR variableDeclarationNoIn )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_variableDeclarationNoIn.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/google/jstestdriver/coverage/es3/ES3.g:1322:51: ^( EXPR expression )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1325:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    {
                    // com/google/jstestdriver/coverage/es3/ES3.g:1325:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
                    // com/google/jstestdriver/coverage/es3/ES3.g:1326:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // com/google/jstestdriver/coverage/es3/ES3.g:1326:4: ( COMMA variableDeclarationNoIn )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==COMMA) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // com/google/jstestdriver/coverage/es3/ES3.g:1326:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA209=(Token)match(input,COMMA,FOLLOW_COMMA_in_forControlVar5026);  
                    	    stream_COMMA.add(COMMA209);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar5028);
                    	    variableDeclarationNoIn210=variableDeclarationNoIn();

                    	    state._fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn210.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    SEMIC211=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5033);  
                    stream_SEMIC.add(SEMIC211);

                    // com/google/jstestdriver/coverage/es3/ES3.g:1326:48: (ex1= expression )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=NULL && LA55_0<=FALSE)||LA55_0==DELETE||LA55_0==FUNCTION||LA55_0==NEW||LA55_0==THIS||LA55_0==TYPEOF||LA55_0==VOID||LA55_0==LBRACE||LA55_0==LPAREN||LA55_0==LBRACK||(LA55_0>=ADD && LA55_0<=SUB)||(LA55_0>=INC && LA55_0<=DEC)||(LA55_0>=NOT && LA55_0<=INV)||(LA55_0>=Identifier && LA55_0<=StringLiteral)||LA55_0==RegularExpressionLiteral||(LA55_0>=DecimalLiteral && LA55_0<=HexIntegerLiteral)) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // com/google/jstestdriver/coverage/es3/ES3.g:1326:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5037);
                            ex1=expression();

                            state._fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC212=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar5040);  
                    stream_SEMIC.add(SEMIC212);

                    // com/google/jstestdriver/coverage/es3/ES3.g:1326:70: (ex2= expression )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=NULL && LA56_0<=FALSE)||LA56_0==DELETE||LA56_0==FUNCTION||LA56_0==NEW||LA56_0==THIS||LA56_0==TYPEOF||LA56_0==VOID||LA56_0==LBRACE||LA56_0==LPAREN||LA56_0==LBRACK||(LA56_0>=ADD && LA56_0<=SUB)||(LA56_0>=INC && LA56_0<=DEC)||(LA56_0>=NOT && LA56_0<=INV)||(LA56_0>=Identifier && LA56_0<=StringLiteral)||LA56_0==RegularExpressionLiteral||(LA56_0>=DecimalLiteral && LA56_0<=HexIntegerLiteral)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // com/google/jstestdriver/coverage/es3/ES3.g:1326:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar5044);
                            ex2=expression();

                            state._fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ex1, VAR, ex2, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1327:4: -> ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                    {
                        // com/google/jstestdriver/coverage/es3/ES3.g:1327:7: ^( FORSTEP ^( VAR ( variableDeclarationNoIn )+ ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1327:18: ^( VAR ( variableDeclarationNoIn )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_VAR.nextNode(), root_2);

                        if ( !(stream_variableDeclarationNoIn.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclarationNoIn.hasNext() ) {
                            adaptor.addChild(root_2, stream_variableDeclarationNoIn.nextTree());

                        }
                        stream_variableDeclarationNoIn.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/google/jstestdriver/coverage/es3/ES3.g:1327:52: ^( EXPR ( $ex1)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1327:60: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex1.nextTree());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/google/jstestdriver/coverage/es3/ES3.g:1327:68: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1327:76: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.nextTree());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlVar"

    public static class forControlExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1332:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final ES3Parser.forControlExpression_return forControlExpression() throws RecognitionException {
        ES3Parser.forControlExpression_return retval = new ES3Parser.forControlExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN213=null;
        Token SEMIC214=null;
        Token SEMIC215=null;
        ES3Parser.expressionNoIn_return ex1 = null;

        ES3Parser.expression_return ex2 = null;

        ES3Parser.expression_return ex3 = null;


        Object IN213_tree=null;
        Object SEMIC214_tree=null;
        Object SEMIC215_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1337:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1337:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression5110);
            ex1=expressionNoIn();

            state._fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1338:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==IN) ) {
                alt60=1;
            }
            else if ( (LA60_0==SEMIC) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1339:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !(( isLeftHandSideIn(ex1, isLhs) )) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // com/google/jstestdriver/coverage/es3/ES3.g:1339:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // com/google/jstestdriver/coverage/es3/ES3.g:1340:4: IN ex2= expression
                    {
                    IN213=(Token)match(input,IN,FOLLOW_IN_in_forControlExpression5125);  
                    stream_IN.add(IN213);

                    pushFollow(FOLLOW_expression_in_forControlExpression5129);
                    ex2=expression();

                    state._fsp--;

                    stream_expression.add(ex2.getTree());


                    // AST REWRITE
                    // elements: ex1, ex2
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1341:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // com/google/jstestdriver/coverage/es3/ES3.g:1341:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORITER, "FORITER"), root_1);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1341:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/google/jstestdriver/coverage/es3/ES3.g:1341:33: ^( EXPR $ex2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1344:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // com/google/jstestdriver/coverage/es3/ES3.g:1344:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // com/google/jstestdriver/coverage/es3/ES3.g:1345:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC214=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5175);  
                    stream_SEMIC.add(SEMIC214);

                    // com/google/jstestdriver/coverage/es3/ES3.g:1345:13: (ex2= expression )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NULL && LA58_0<=FALSE)||LA58_0==DELETE||LA58_0==FUNCTION||LA58_0==NEW||LA58_0==THIS||LA58_0==TYPEOF||LA58_0==VOID||LA58_0==LBRACE||LA58_0==LPAREN||LA58_0==LBRACK||(LA58_0>=ADD && LA58_0<=SUB)||(LA58_0>=INC && LA58_0<=DEC)||(LA58_0>=NOT && LA58_0<=INV)||(LA58_0>=Identifier && LA58_0<=StringLiteral)||LA58_0==RegularExpressionLiteral||(LA58_0>=DecimalLiteral && LA58_0<=HexIntegerLiteral)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // com/google/jstestdriver/coverage/es3/ES3.g:1345:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5179);
                            ex2=expression();

                            state._fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC215=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression5182);  
                    stream_SEMIC.add(SEMIC215);

                    // com/google/jstestdriver/coverage/es3/ES3.g:1345:35: (ex3= expression )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=NULL && LA59_0<=FALSE)||LA59_0==DELETE||LA59_0==FUNCTION||LA59_0==NEW||LA59_0==THIS||LA59_0==TYPEOF||LA59_0==VOID||LA59_0==LBRACE||LA59_0==LPAREN||LA59_0==LBRACK||(LA59_0>=ADD && LA59_0<=SUB)||(LA59_0>=INC && LA59_0<=DEC)||(LA59_0>=NOT && LA59_0<=INV)||(LA59_0>=Identifier && LA59_0<=StringLiteral)||LA59_0==RegularExpressionLiteral||(LA59_0>=DecimalLiteral && LA59_0<=HexIntegerLiteral)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // com/google/jstestdriver/coverage/es3/ES3.g:1345:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression5186);
                            ex3=expression();

                            state._fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ex3, ex2, ex1
                    // token labels: 
                    // rule labels: retval, ex3, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"rule ex3",ex3!=null?ex3.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 1346:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // com/google/jstestdriver/coverage/es3/ES3.g:1346:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1346:18: ^( EXPR $ex1)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/google/jstestdriver/coverage/es3/ES3.g:1346:33: ^( EXPR ( $ex2)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1346:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.nextTree());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // com/google/jstestdriver/coverage/es3/ES3.g:1346:49: ^( EXPR ( $ex3)? )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                        // com/google/jstestdriver/coverage/es3/ES3.g:1346:57: ( $ex3)?
                        if ( stream_ex3.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex3.nextTree());

                        }
                        stream_ex3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlExpression"

    public static class forControlSemic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlSemic"
    // com/google/jstestdriver/coverage/es3/ES3.g:1351:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final ES3Parser.forControlSemic_return forControlSemic() throws RecognitionException {
        ES3Parser.forControlSemic_return retval = new ES3Parser.forControlSemic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMIC216=null;
        Token SEMIC217=null;
        ES3Parser.expression_return ex1 = null;

        ES3Parser.expression_return ex2 = null;


        Object SEMIC216_tree=null;
        Object SEMIC217_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1352:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1352:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC216=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5245);  
            stream_SEMIC.add(SEMIC216);

            // com/google/jstestdriver/coverage/es3/ES3.g:1352:13: (ex1= expression )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||(LA61_0>=Identifier && LA61_0<=StringLiteral)||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1352:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5249);
                    ex1=expression();

                    state._fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC217=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic5252);  
            stream_SEMIC.add(SEMIC217);

            // com/google/jstestdriver/coverage/es3/ES3.g:1352:35: (ex2= expression )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=NULL && LA62_0<=FALSE)||LA62_0==DELETE||LA62_0==FUNCTION||LA62_0==NEW||LA62_0==THIS||LA62_0==TYPEOF||LA62_0==VOID||LA62_0==LBRACE||LA62_0==LPAREN||LA62_0==LBRACK||(LA62_0>=ADD && LA62_0<=SUB)||(LA62_0>=INC && LA62_0<=DEC)||(LA62_0>=NOT && LA62_0<=INV)||(LA62_0>=Identifier && LA62_0<=StringLiteral)||LA62_0==RegularExpressionLiteral||(LA62_0>=DecimalLiteral && LA62_0<=HexIntegerLiteral)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1352:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic5256);
                    ex2=expression();

                    state._fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ex1, ex2
            // token labels: 
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1353:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1353:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:1353:16: ^( EXPR )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // com/google/jstestdriver/coverage/es3/ES3.g:1353:26: ^( EXPR ( $ex1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                // com/google/jstestdriver/coverage/es3/ES3.g:1353:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.nextTree());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // com/google/jstestdriver/coverage/es3/ES3.g:1353:42: ^( EXPR ( $ex2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_2);

                // com/google/jstestdriver/coverage/es3/ES3.g:1353:50: ( $ex2)?
                if ( stream_ex2.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex2.nextTree());

                }
                stream_ex2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forControlSemic"

    public static class continueStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1365:1: continueStatement : CONTINUE ( Identifier )? semic ;
    public final ES3Parser.continueStatement_return continueStatement() throws RecognitionException {
        ES3Parser.continueStatement_return retval = new ES3Parser.continueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE218=null;
        Token Identifier219=null;
        ES3Parser.semic_return semic220 = null;


        Object CONTINUE218_tree=null;
        Object Identifier219_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1366:2: ( CONTINUE ( Identifier )? semic )
            // com/google/jstestdriver/coverage/es3/ES3.g:1366:4: CONTINUE ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE218=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement5310); 
            CONTINUE218_tree = (Object)adaptor.create(CONTINUE218);
            root_0 = (Object)adaptor.becomeRoot(CONTINUE218_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // com/google/jstestdriver/coverage/es3/ES3.g:1366:67: ( Identifier )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Identifier) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1366:67: Identifier
                    {
                    Identifier219=(Token)match(input,Identifier,FOLLOW_Identifier_in_continueStatement5315); 
                    Identifier219_tree = (Object)adaptor.create(Identifier219);
                    adaptor.addChild(root_0, Identifier219_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement5318);
            semic220=semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "continueStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1378:1: breakStatement : BREAK ( Identifier )? semic ;
    public final ES3Parser.breakStatement_return breakStatement() throws RecognitionException {
        ES3Parser.breakStatement_return retval = new ES3Parser.breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK221=null;
        Token Identifier222=null;
        ES3Parser.semic_return semic223 = null;


        Object BREAK221_tree=null;
        Object Identifier222_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1379:2: ( BREAK ( Identifier )? semic )
            // com/google/jstestdriver/coverage/es3/ES3.g:1379:4: BREAK ( Identifier )? semic
            {
            root_0 = (Object)adaptor.nil();

            BREAK221=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStatement5337); 
            BREAK221_tree = (Object)adaptor.create(BREAK221);
            root_0 = (Object)adaptor.becomeRoot(BREAK221_tree, root_0);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // com/google/jstestdriver/coverage/es3/ES3.g:1379:64: ( Identifier )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Identifier) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1379:64: Identifier
                    {
                    Identifier222=(Token)match(input,Identifier,FOLLOW_Identifier_in_breakStatement5342); 
                    Identifier222_tree = (Object)adaptor.create(Identifier222);
                    adaptor.addChild(root_0, Identifier222_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement5345);
            semic223=semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "breakStatement"

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1399:1: returnStatement : RETURN ( expression )? semic ;
    public final ES3Parser.returnStatement_return returnStatement() throws RecognitionException {
        ES3Parser.returnStatement_return retval = new ES3Parser.returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN224=null;
        ES3Parser.expression_return expression225 = null;

        ES3Parser.semic_return semic226 = null;


        Object RETURN224_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1400:2: ( RETURN ( expression )? semic )
            // com/google/jstestdriver/coverage/es3/ES3.g:1400:4: RETURN ( expression )? semic
            {
            root_0 = (Object)adaptor.nil();

            RETURN224=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStatement5364); 
            RETURN224_tree = (Object)adaptor.create(RETURN224);
            root_0 = (Object)adaptor.becomeRoot(RETURN224_tree, root_0);

             promoteEOL(null); 
            // com/google/jstestdriver/coverage/es3/ES3.g:1400:34: ( expression )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=NULL && LA65_0<=FALSE)||LA65_0==DELETE||LA65_0==FUNCTION||LA65_0==NEW||LA65_0==THIS||LA65_0==TYPEOF||LA65_0==VOID||LA65_0==LBRACE||LA65_0==LPAREN||LA65_0==LBRACK||(LA65_0>=ADD && LA65_0<=SUB)||(LA65_0>=INC && LA65_0<=DEC)||(LA65_0>=NOT && LA65_0<=INV)||(LA65_0>=Identifier && LA65_0<=StringLiteral)||LA65_0==RegularExpressionLiteral||(LA65_0>=DecimalLiteral && LA65_0<=HexIntegerLiteral)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1400:34: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement5369);
                    expression225=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression225.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement5372);
            semic226=semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1407:1: withStatement : WITH LPAREN expression RPAREN statement ;
    public final ES3Parser.withStatement_return withStatement() throws RecognitionException {
        ES3Parser.withStatement_return retval = new ES3Parser.withStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WITH227=null;
        Token LPAREN228=null;
        Token RPAREN230=null;
        ES3Parser.expression_return expression229 = null;

        ES3Parser.statement_return statement231 = null;


        Object WITH227_tree=null;
        Object LPAREN228_tree=null;
        Object RPAREN230_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1408:2: ( WITH LPAREN expression RPAREN statement )
            // com/google/jstestdriver/coverage/es3/ES3.g:1408:4: WITH LPAREN expression RPAREN statement
            {
            root_0 = (Object)adaptor.nil();

            WITH227=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement5389); 
            WITH227_tree = (Object)adaptor.create(WITH227);
            root_0 = (Object)adaptor.becomeRoot(WITH227_tree, root_0);

            LPAREN228=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_withStatement5392); 
            pushFollow(FOLLOW_expression_in_withStatement5395);
            expression229=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression229.getTree());
            RPAREN230=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_withStatement5397); 
            pushFollow(FOLLOW_statement_in_withStatement5400);
            statement231=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement231.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "withStatement"

    public static class switchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1415:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final ES3Parser.switchStatement_return switchStatement() throws RecognitionException {
        ES3Parser.switchStatement_return retval = new ES3Parser.switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH232=null;
        Token LPAREN233=null;
        Token RPAREN235=null;
        Token LBRACE236=null;
        Token RBRACE239=null;
        ES3Parser.expression_return expression234 = null;

        ES3Parser.defaultClause_return defaultClause237 = null;

        ES3Parser.caseClause_return caseClause238 = null;


        Object SWITCH232_tree=null;
        Object LPAREN233_tree=null;
        Object RPAREN235_tree=null;
        Object LBRACE236_tree=null;
        Object RBRACE239_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");

        	int defaultClauseCount = 0;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1420:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1420:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH232=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement5421);  
            stream_SWITCH.add(SWITCH232);

            LPAREN233=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement5423);  
            stream_LPAREN.add(LPAREN233);

            pushFollow(FOLLOW_expression_in_switchStatement5425);
            expression234=expression();

            state._fsp--;

            stream_expression.add(expression234.getTree());
            RPAREN235=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement5427);  
            stream_RPAREN.add(RPAREN235);

            LBRACE236=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement5429);  
            stream_LBRACE.add(LBRACE236);

            // com/google/jstestdriver/coverage/es3/ES3.g:1420:43: ({...}? => defaultClause | caseClause )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==DEFAULT) && (( defaultClauseCount == 0 ))) {
                    alt66=1;
                }
                else if ( (LA66_0==CASE) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1420:45: {...}? => defaultClause
            	    {
            	    if ( !(( defaultClauseCount == 0 )) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement5436);
            	    defaultClause237=defaultClause();

            	    state._fsp--;

            	    stream_defaultClause.add(defaultClause237.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1420:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement5442);
            	    caseClause238=caseClause();

            	    state._fsp--;

            	    stream_caseClause.add(caseClause238.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            RBRACE239=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement5447);  
            stream_RBRACE.add(RBRACE239);



            // AST REWRITE
            // elements: caseClause, expression, defaultClause, SWITCH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1421:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1421:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_SWITCH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // com/google/jstestdriver/coverage/es3/ES3.g:1421:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.nextTree());

                }
                stream_defaultClause.reset();
                // com/google/jstestdriver/coverage/es3/ES3.g:1421:41: ( caseClause )*
                while ( stream_caseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseClause.nextTree());

                }
                stream_caseClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "switchStatement"

    public static class caseClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseClause"
    // com/google/jstestdriver/coverage/es3/ES3.g:1424:1: caseClause : CASE expression COLON ( statement )* ;
    public final ES3Parser.caseClause_return caseClause() throws RecognitionException {
        ES3Parser.caseClause_return retval = new ES3Parser.caseClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE240=null;
        Token COLON242=null;
        ES3Parser.expression_return expression241 = null;

        ES3Parser.statement_return statement243 = null;


        Object CASE240_tree=null;
        Object COLON242_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1425:2: ( CASE expression COLON ( statement )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1425:4: CASE expression COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            CASE240=(Token)match(input,CASE,FOLLOW_CASE_in_caseClause5475); 
            CASE240_tree = (Object)adaptor.create(CASE240);
            root_0 = (Object)adaptor.becomeRoot(CASE240_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause5478);
            expression241=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression241.getTree());
            COLON242=(Token)match(input,COLON,FOLLOW_COLON_in_caseClause5480); 
            // com/google/jstestdriver/coverage/es3/ES3.g:1425:28: ( statement )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=NULL && LA67_0<=BREAK)||LA67_0==CONTINUE||(LA67_0>=DELETE && LA67_0<=DO)||(LA67_0>=FOR && LA67_0<=IF)||(LA67_0>=NEW && LA67_0<=WITH)||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||LA67_0==SEMIC||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||(LA67_0>=Identifier && LA67_0<=StringLiteral)||LA67_0==RegularExpressionLiteral||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1425:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause5483);
            	    statement243=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement243.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "caseClause"

    public static class defaultClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultClause"
    // com/google/jstestdriver/coverage/es3/ES3.g:1428:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final ES3Parser.defaultClause_return defaultClause() throws RecognitionException {
        ES3Parser.defaultClause_return retval = new ES3Parser.defaultClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT244=null;
        Token COLON245=null;
        ES3Parser.statement_return statement246 = null;


        Object DEFAULT244_tree=null;
        Object COLON245_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1429:2: ( DEFAULT COLON ( statement )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1429:4: DEFAULT COLON ( statement )*
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT244=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause5496); 
            DEFAULT244_tree = (Object)adaptor.create(DEFAULT244);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT244_tree, root_0);

            COLON245=(Token)match(input,COLON,FOLLOW_COLON_in_defaultClause5499); 
            // com/google/jstestdriver/coverage/es3/ES3.g:1429:20: ( statement )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=NULL && LA68_0<=BREAK)||LA68_0==CONTINUE||(LA68_0>=DELETE && LA68_0<=DO)||(LA68_0>=FOR && LA68_0<=IF)||(LA68_0>=NEW && LA68_0<=WITH)||LA68_0==LBRACE||LA68_0==LPAREN||LA68_0==LBRACK||LA68_0==SEMIC||(LA68_0>=ADD && LA68_0<=SUB)||(LA68_0>=INC && LA68_0<=DEC)||(LA68_0>=NOT && LA68_0<=INV)||(LA68_0>=Identifier && LA68_0<=StringLiteral)||LA68_0==RegularExpressionLiteral||(LA68_0>=DecimalLiteral && LA68_0<=HexIntegerLiteral)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1429:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause5502);
            	    statement246=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement246.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defaultClause"

    public static class labelledStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelledStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1436:1: labelledStatement : Identifier COLON statement -> ^( LABELLED Identifier statement ) ;
    public final ES3Parser.labelledStatement_return labelledStatement() throws RecognitionException {
        ES3Parser.labelledStatement_return retval = new ES3Parser.labelledStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Identifier247=null;
        Token COLON248=null;
        ES3Parser.statement_return statement249 = null;


        Object Identifier247_tree=null;
        Object COLON248_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1437:2: ( Identifier COLON statement -> ^( LABELLED Identifier statement ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1437:4: Identifier COLON statement
            {
            Identifier247=(Token)match(input,Identifier,FOLLOW_Identifier_in_labelledStatement5519);  
            stream_Identifier.add(Identifier247);

            COLON248=(Token)match(input,COLON,FOLLOW_COLON_in_labelledStatement5521);  
            stream_COLON.add(COLON248);

            pushFollow(FOLLOW_statement_in_labelledStatement5523);
            statement249=statement();

            state._fsp--;

            stream_statement.add(statement249.getTree());


            // AST REWRITE
            // elements: Identifier, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1438:2: -> ^( LABELLED Identifier statement )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1438:5: ^( LABELLED Identifier statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LABELLED, "LABELLED"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "labelledStatement"

    public static class throwStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1460:1: throwStatement : THROW expression semic ;
    public final ES3Parser.throwStatement_return throwStatement() throws RecognitionException {
        ES3Parser.throwStatement_return retval = new ES3Parser.throwStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token THROW250=null;
        ES3Parser.expression_return expression251 = null;

        ES3Parser.semic_return semic252 = null;


        Object THROW250_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1461:2: ( THROW expression semic )
            // com/google/jstestdriver/coverage/es3/ES3.g:1461:4: THROW expression semic
            {
            root_0 = (Object)adaptor.nil();

            THROW250=(Token)match(input,THROW,FOLLOW_THROW_in_throwStatement5554); 
            THROW250_tree = (Object)adaptor.create(THROW250);
            root_0 = (Object)adaptor.becomeRoot(THROW250_tree, root_0);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement5559);
            expression251=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression251.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement5561);
            semic252=semic();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throwStatement"

    public static class tryStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryStatement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1468:1: tryStatement : TRY block ( catchClause ( finallyClause )? | finallyClause ) ;
    public final ES3Parser.tryStatement_return tryStatement() throws RecognitionException {
        ES3Parser.tryStatement_return retval = new ES3Parser.tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY253=null;
        ES3Parser.block_return block254 = null;

        ES3Parser.catchClause_return catchClause255 = null;

        ES3Parser.finallyClause_return finallyClause256 = null;

        ES3Parser.finallyClause_return finallyClause257 = null;


        Object TRY253_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1469:2: ( TRY block ( catchClause ( finallyClause )? | finallyClause ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1469:4: TRY block ( catchClause ( finallyClause )? | finallyClause )
            {
            root_0 = (Object)adaptor.nil();

            TRY253=(Token)match(input,TRY,FOLLOW_TRY_in_tryStatement5578); 
            TRY253_tree = (Object)adaptor.create(TRY253);
            root_0 = (Object)adaptor.becomeRoot(TRY253_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement5581);
            block254=block();

            state._fsp--;

            adaptor.addChild(root_0, block254.getTree());
            // com/google/jstestdriver/coverage/es3/ES3.g:1469:15: ( catchClause ( finallyClause )? | finallyClause )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==CATCH) ) {
                alt70=1;
            }
            else if ( (LA70_0==FINALLY) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1469:17: catchClause ( finallyClause )?
                    {
                    pushFollow(FOLLOW_catchClause_in_tryStatement5585);
                    catchClause255=catchClause();

                    state._fsp--;

                    adaptor.addChild(root_0, catchClause255.getTree());
                    // com/google/jstestdriver/coverage/es3/ES3.g:1469:29: ( finallyClause )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==FINALLY) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // com/google/jstestdriver/coverage/es3/ES3.g:1469:29: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_tryStatement5587);
                            finallyClause256=finallyClause();

                            state._fsp--;

                            adaptor.addChild(root_0, finallyClause256.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1469:46: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement5592);
                    finallyClause257=finallyClause();

                    state._fsp--;

                    adaptor.addChild(root_0, finallyClause257.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tryStatement"

    public static class catchClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchClause"
    // com/google/jstestdriver/coverage/es3/ES3.g:1472:1: catchClause : CATCH LPAREN Identifier RPAREN block ;
    public final ES3Parser.catchClause_return catchClause() throws RecognitionException {
        ES3Parser.catchClause_return retval = new ES3Parser.catchClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH258=null;
        Token LPAREN259=null;
        Token Identifier260=null;
        Token RPAREN261=null;
        ES3Parser.block_return block262 = null;


        Object CATCH258_tree=null;
        Object LPAREN259_tree=null;
        Object Identifier260_tree=null;
        Object RPAREN261_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1473:2: ( CATCH LPAREN Identifier RPAREN block )
            // com/google/jstestdriver/coverage/es3/ES3.g:1473:4: CATCH LPAREN Identifier RPAREN block
            {
            root_0 = (Object)adaptor.nil();

            CATCH258=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchClause5606); 
            CATCH258_tree = (Object)adaptor.create(CATCH258);
            root_0 = (Object)adaptor.becomeRoot(CATCH258_tree, root_0);

            LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClause5609); 
            Identifier260=(Token)match(input,Identifier,FOLLOW_Identifier_in_catchClause5612); 
            Identifier260_tree = (Object)adaptor.create(Identifier260);
            adaptor.addChild(root_0, Identifier260_tree);

            RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClause5614); 
            pushFollow(FOLLOW_block_in_catchClause5617);
            block262=block();

            state._fsp--;

            adaptor.addChild(root_0, block262.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class finallyClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finallyClause"
    // com/google/jstestdriver/coverage/es3/ES3.g:1476:1: finallyClause : FINALLY block ;
    public final ES3Parser.finallyClause_return finallyClause() throws RecognitionException {
        ES3Parser.finallyClause_return retval = new ES3Parser.finallyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FINALLY263=null;
        ES3Parser.block_return block264 = null;


        Object FINALLY263_tree=null;

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1477:2: ( FINALLY block )
            // com/google/jstestdriver/coverage/es3/ES3.g:1477:4: FINALLY block
            {
            root_0 = (Object)adaptor.nil();

            FINALLY263=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause5629); 
            FINALLY263_tree = (Object)adaptor.create(FINALLY263);
            root_0 = (Object)adaptor.becomeRoot(FINALLY263_tree, root_0);

            pushFollow(FOLLOW_block_in_finallyClause5632);
            block264=block();

            state._fsp--;

            adaptor.addChild(root_0, block264.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "finallyClause"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // com/google/jstestdriver/coverage/es3/ES3.g:1490:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) ;
    public final ES3Parser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        ES3Parser.functionDeclaration_return retval = new ES3Parser.functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token FUNCTION265=null;
        ES3Parser.formalParameterList_return formalParameterList266 = null;

        ES3Parser.functionBody_return functionBody267 = null;


        Object name_tree=null;
        Object FUNCTION265_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1491:2: ( FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION $name formalParameterList functionBody ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1491:4: FUNCTION name= Identifier formalParameterList functionBody
            {
            FUNCTION265=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration5653);  
            stream_FUNCTION.add(FUNCTION265);

            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration5657);  
            stream_Identifier.add(name);

            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration5659);
            formalParameterList266=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList266.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration5661);
            functionBody267=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody267.getTree());


            // AST REWRITE
            // elements: FUNCTION, formalParameterList, functionBody, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1492:2: -> ^( FUNCTION $name formalParameterList functionBody )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1492:5: ^( FUNCTION $name formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                adaptor.addChild(root_1, stream_name.nextNode());
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"

    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpression"
    // com/google/jstestdriver/coverage/es3/ES3.g:1495:1: functionExpression : FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final ES3Parser.functionExpression_return functionExpression() throws RecognitionException {
        ES3Parser.functionExpression_return retval = new ES3Parser.functionExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token FUNCTION268=null;
        ES3Parser.formalParameterList_return formalParameterList269 = null;

        ES3Parser.functionBody_return functionBody270 = null;


        Object name_tree=null;
        Object FUNCTION268_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1496:2: ( FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1496:4: FUNCTION (name= Identifier )? formalParameterList functionBody
            {
            FUNCTION268=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression5688);  
            stream_FUNCTION.add(FUNCTION268);

            // com/google/jstestdriver/coverage/es3/ES3.g:1496:17: (name= Identifier )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Identifier) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1496:17: name= Identifier
                    {
                    name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionExpression5692);  
                    stream_Identifier.add(name);


                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression5695);
            formalParameterList269=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList269.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression5697);
            functionBody270=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody270.getTree());


            // AST REWRITE
            // elements: name, formalParameterList, FUNCTION, functionBody
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1497:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1497:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:1497:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionExpression"

    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterList"
    // com/google/jstestdriver/coverage/es3/ES3.g:1500:1: formalParameterList : LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN -> ^( ARGS ( Identifier )* ) ;
    public final ES3Parser.formalParameterList_return formalParameterList() throws RecognitionException {
        ES3Parser.formalParameterList_return retval = new ES3Parser.formalParameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LPAREN271=null;
        Token Identifier272=null;
        Token COMMA273=null;
        Token Identifier274=null;
        Token RPAREN275=null;

        Object LPAREN271_tree=null;
        Object Identifier272_tree=null;
        Object COMMA273_tree=null;
        Object Identifier274_tree=null;
        Object RPAREN275_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1501:2: ( LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN -> ^( ARGS ( Identifier )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1501:4: LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN
            {
            LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList5725);  
            stream_LPAREN.add(LPAREN271);

            // com/google/jstestdriver/coverage/es3/ES3.g:1501:11: ( Identifier ( COMMA Identifier )* )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Identifier) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1501:13: Identifier ( COMMA Identifier )*
                    {
                    Identifier272=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5729);  
                    stream_Identifier.add(Identifier272);

                    // com/google/jstestdriver/coverage/es3/ES3.g:1501:24: ( COMMA Identifier )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==COMMA) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // com/google/jstestdriver/coverage/es3/ES3.g:1501:26: COMMA Identifier
                    	    {
                    	    COMMA273=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameterList5733);  
                    	    stream_COMMA.add(COMMA273);

                    	    Identifier274=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList5735);  
                    	    stream_Identifier.add(Identifier274);


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList5743);  
            stream_RPAREN.add(RPAREN275);



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1502:2: -> ^( ARGS ( Identifier )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1502:5: ^( ARGS ( Identifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:1502:13: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBody"
    // com/google/jstestdriver/coverage/es3/ES3.g:1505:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) ;
    public final ES3Parser.functionBody_return functionBody() throws RecognitionException {
        ES3Parser.functionBody_return retval = new ES3Parser.functionBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token lb=null;
        Token RBRACE277=null;
        ES3Parser.sourceElement_return sourceElement276 = null;


        Object lb_tree=null;
        Object RBRACE277_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1506:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* ) )
            // com/google/jstestdriver/coverage/es3/ES3.g:1506:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionBody5768);  
            stream_LBRACE.add(lb);

            // com/google/jstestdriver/coverage/es3/ES3.g:1506:14: ( sourceElement )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=NULL && LA74_0<=BREAK)||LA74_0==CONTINUE||(LA74_0>=DELETE && LA74_0<=DO)||(LA74_0>=FOR && LA74_0<=IF)||(LA74_0>=NEW && LA74_0<=WITH)||LA74_0==LBRACE||LA74_0==LPAREN||LA74_0==LBRACK||LA74_0==SEMIC||(LA74_0>=ADD && LA74_0<=SUB)||(LA74_0>=INC && LA74_0<=DEC)||(LA74_0>=NOT && LA74_0<=INV)||(LA74_0>=Identifier && LA74_0<=StringLiteral)||LA74_0==RegularExpressionLiteral||(LA74_0>=DecimalLiteral && LA74_0<=HexIntegerLiteral)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1506:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody5770);
            	    sourceElement276=sourceElement();

            	    state._fsp--;

            	    stream_sourceElement.add(sourceElement276.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            RBRACE277=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_functionBody5773);  
            stream_RBRACE.add(RBRACE277);



            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 1507:2: -> ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
            {
                // com/google/jstestdriver/coverage/es3/ES3.g:1507:5: ^( BLOCK[$lb, \"BLOCK\"] ( sourceElement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, lb, "BLOCK"), root_1);

                // com/google/jstestdriver/coverage/es3/ES3.g:1507:28: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.nextTree());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionBody"

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // com/google/jstestdriver/coverage/es3/ES3.g:1514:1: program : ( sourceElement )* ;
    public final ES3Parser.program_return program() throws RecognitionException {
        ES3Parser.program_return retval = new ES3Parser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.sourceElement_return sourceElement278 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1515:2: ( ( sourceElement )* )
            // com/google/jstestdriver/coverage/es3/ES3.g:1515:4: ( sourceElement )*
            {
            root_0 = (Object)adaptor.nil();

            // com/google/jstestdriver/coverage/es3/ES3.g:1515:4: ( sourceElement )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=NULL && LA75_0<=BREAK)||LA75_0==CONTINUE||(LA75_0>=DELETE && LA75_0<=DO)||(LA75_0>=FOR && LA75_0<=IF)||(LA75_0>=NEW && LA75_0<=WITH)||LA75_0==LBRACE||LA75_0==LPAREN||LA75_0==LBRACK||LA75_0==SEMIC||(LA75_0>=ADD && LA75_0<=SUB)||(LA75_0>=INC && LA75_0<=DEC)||(LA75_0>=NOT && LA75_0<=INV)||(LA75_0>=Identifier && LA75_0<=StringLiteral)||LA75_0==RegularExpressionLiteral||(LA75_0>=DecimalLiteral && LA75_0<=HexIntegerLiteral)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // com/google/jstestdriver/coverage/es3/ES3.g:1515:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program5802);
            	    sourceElement278=sourceElement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sourceElement278.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class sourceElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sourceElement"
    // com/google/jstestdriver/coverage/es3/ES3.g:1523:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final ES3Parser.sourceElement_return sourceElement() throws RecognitionException {
        ES3Parser.sourceElement_return retval = new ES3Parser.sourceElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ES3Parser.functionDeclaration_return functionDeclaration279 = null;

        ES3Parser.statement_return statement280 = null;



        try {
            // com/google/jstestdriver/coverage/es3/ES3.g:1528:2: ({...}? functionDeclaration | statement )
            int alt76=2;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1528:4: {...}? functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    if ( !(( input.LA(1) == FUNCTION )) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement5831);
                    functionDeclaration279=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration279.getTree());

                    }
                    break;
                case 2 :
                    // com/google/jstestdriver/coverage/es3/ES3.g:1529:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement5836);
                    statement280=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement280.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sourceElement"

    // Delegated rules


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA76 dfa76 = new DFA76(this);
    static final String DFA45_eotS =
        "\44\uffff";
    static final String DFA45_eofS =
        "\44\uffff";
    static final String DFA45_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA45_maxS =
        "\1\u00a1\1\0\42\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA45_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA45_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\3\2\2\uffff\13\2\37\uffff"+
            "\1\1\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff\2\2\2\uffff"+
            "\2\2\6\uffff\2\2\66\uffff\2\2\5\uffff\1\2\3\uffff\3\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1165:1: statement options {k=1; } : ({...}? block | statementTail );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == LBRACE )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\17\uffff";
    static final String DFA46_eofS =
        "\4\uffff\1\3\12\uffff";
    static final String DFA46_minS =
        "\1\4\3\uffff\1\23\12\uffff";
    static final String DFA46_maxS =
        "\1\u00a1\3\uffff\1\u0091\12\uffff";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\15\1\12";
    static final String DFA46_specialS =
        "\17\uffff}>";
    static final String[] DFA46_transitionS = {
            "\3\3\1\10\2\uffff\1\7\1\uffff\1\3\1\6\2\uffff\1\6\1\3\1\5\2"+
            "\uffff\1\3\1\11\1\13\1\3\1\14\1\15\1\3\1\1\1\3\1\6\1\12\37\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\2\11\uffff\2\3\2\uffff"+
            "\2\3\6\uffff\2\3\66\uffff\1\4\1\3\5\uffff\1\3\3\uffff\3\3",
            "",
            "",
            "",
            "\2\3\53\uffff\2\3\1\uffff\1\3\1\uffff\27\3\2\uffff\3\3\1\16"+
            "\15\3\42\uffff\1\3",
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1174:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );";
        }
    }
    static final String DFA76_eotS =
        "\44\uffff";
    static final String DFA76_eofS =
        "\44\uffff";
    static final String DFA76_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA76_maxS =
        "\1\u00a1\1\0\42\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA76_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\1\1\2\2\uffff\13"+
            "\2\37\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff"+
            "\2\2\2\uffff\2\2\6\uffff\2\2\66\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\3\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "1523:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == FUNCTION )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index76_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_reservedWord_in_token1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_token1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3141 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3169 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0x0000000388300000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3177 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0x0000000388300000L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0000000380300000L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000380300000L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3300 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_propertyName3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3375 = new BitSet(new long[]{0x8000000001000070L,0x000000000000000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_primaryExpression_in_newExpression3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_multiLineComment3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3415 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000EL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_arguments3423 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3462 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3478 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3499 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3503 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression3522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression3524 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression3559 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression3614 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_unaryOperator3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_unaryOperator3649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_unaryOperator3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unaryOperator3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3692 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3696 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3711 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3729 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_additiveExpression3733 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3763 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_shiftExpression3767 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression3782 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3801 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalExpression3805 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression3832 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3846 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn3850 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn3873 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3892 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpression3896 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3915 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3929 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn3933 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn3952 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3972 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpression3976 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression3979 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn3993 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseANDExpressionNoIn3997 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4000 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4016 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpression4020 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4023 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4039 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXORExpressionNoIn4043 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4046 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4061 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpression4065 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4068 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4083 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseORExpressionNoIn4087 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4090 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4109 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpression4113 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression4116 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4130 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_logicalANDExpressionNoIn4134 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn4137 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4152 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpression4156 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression4159 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4174 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_logicalORExpressionNoIn4178 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn4181 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression4200 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression4204 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4207 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression4209 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn4226 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn4230 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4233 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn4235 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression4266 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression4273 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn4353 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn4360 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4385 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expression4389 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression4393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn4434 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn4438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEMIC_in_semic4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block4626 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_block4628 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_RBRACE_in_block4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4662 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement4666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement4668 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_variableStatement4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration4696 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration4700 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn4718 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn4722 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement4763 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement4783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement4785 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_ifStatement4787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement4789 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_ifStatement4791 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement4797 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_ifStatement4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement4860 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_doStatement4862 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement4864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement4866 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_doStatement4868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement4870 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_doStatement4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement4897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement4900 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_whileStatement4903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement4905 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_whileStatement4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement4921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement4924 = new BitSet(new long[]{0x8000000039221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_forControl_in_forStatement4927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement4929 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_forStatement4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar4964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar4966 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_IN_in_forControlVar4978 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar5026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar5028 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5033 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar5040 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlVar5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression5110 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_forControlExpression5125 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5175 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression5182 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlExpression5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5245 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic5252 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_forControlSemic5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement5310 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000120000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement5315 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_continueStatement5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement5337 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000120000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement5342 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_breakStatement5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement5364 = new BitSet(new long[]{0x8000000029221070L,0x00000000303300CBL,0x0000000388320000L});
    public static final BitSet FOLLOW_expression_in_returnStatement5369 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_returnStatement5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement5392 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_withStatement5395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement5397 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_withStatement5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement5421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement5423 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_switchStatement5425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement5427 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement5429 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement5436 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement5442 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause5475 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_caseClause5478 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause5480 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_caseClause5483 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause5496 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause5499 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_defaultClause5502 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement5521 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_statement_in_labelledStatement5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement5554 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0000000388300000L});
    public static final BitSet FOLLOW_expression_in_throwStatement5559 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x0000000000020000L});
    public static final BitSet FOLLOW_semic_in_throwStatement5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement5578 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_tryStatement5581 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement5585 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause5606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause5609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause5612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause5614 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause5629 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_finallyClause5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration5653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration5657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration5659 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression5688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression5692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression5695 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList5725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList5729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList5733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList5735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody5768 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody5770 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0000000388300000L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program5802 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0000000388300000L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement5836 = new BitSet(new long[]{0x0000000000000002L});

}