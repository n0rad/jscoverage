lexer grammar ES3Instrument;
options {
  language=Java;

}

@members {
private Token last;

private final boolean areRegularExpressionsEnabled()
{
	if (last == null)
	{
		return true;
	}
	switch (last.getType())
	{
	// identifier
		case Identifier:
	// literals
		case NULL:
		case TRUE:
		case FALSE:
		case THIS:
		case OctalIntegerLiteral:
		case DecimalLiteral:
		case HexIntegerLiteral:
		case StringLiteral:
	// member access ending 
		case RBRACK:
	// function call or nested expression ending
		case RPAREN:
			return false;
	// otherwise OK
		default:
			return true;
	}
}
	
private final void consumeIdentifierUnicodeStart() throws RecognitionException, NoViableAltException
{
	int ch = input.LA(1);
	if (isIdentifierStartUnicode(ch))
	{
		matchAny();
		do
		{
			ch = input.LA(1);
			if (ch == '$' || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || ch == '\\' || ch == '_' || (ch >= 'a' && ch <= 'z') || isIdentifierPartUnicode(ch))
			{
				mIdentifierPart();
			}
			else
			{
				return;
			}
		}
		while (true);
	}
	else
	{
		throw new NoViableAltException();
	}
}
	
private final boolean isIdentifierPartUnicode(int ch)
{
	return Character.isJavaIdentifierPart(ch);
}
	
private final boolean isIdentifierStartUnicode(int ch)
{
	return Character.isJavaIdentifierStart(ch);
}

public Token nextToken()
{
	Token result = super.nextToken();
	if (result.getChannel() == Token.DEFAULT_CHANNEL)
	{
		last = result;
	}
	return result;		
}
}
@header {
  package com.google.jstestdriver.coverage.es3;
}

NULL : 'null' ;
TRUE : 'true' ;
FALSE : 'false' ;
BREAK : 'break' ;
CASE : 'case' ;
CATCH : 'catch' ;
CONTINUE : 'continue' ;
DEFAULT : 'default' ;
DELETE : 'delete' ;
DO : 'do' ;
ELSE : 'else' ;
FINALLY : 'finally' ;
FOR : 'for' ;
FUNCTION : 'function' ;
IF : 'if' ;
IN : 'in' ;
INSTANCEOF : 'instanceof' ;
NEW : 'new' ;
RETURN : 'return' ;
SWITCH : 'switch' ;
THIS : 'this' ;
THROW : 'throw' ;
TRY : 'try' ;
TYPEOF : 'typeof' ;
VAR : 'var' ;
VOID : 'void' ;
WHILE : 'while' ;
WITH : 'with' ;
ABSTRACT : 'abstract' ;
BOOLEAN : 'boolean' ;
BYTE : 'byte' ;
CHAR : 'char' ;
CLASS : 'class' ;
CONST : 'const' ;
DEBUGGER : 'debugger' ;
DOUBLE : 'double' ;
ENUM : 'enum' ;
EXPORT : 'export' ;
EXTENDS : 'extends' ;
FINAL : 'final' ;
FLOAT : 'float' ;
GOTO : 'goto' ;
IMPLEMENTS : 'implements' ;
IMPORT : 'import' ;
INT : 'int' ;
INTERFACE : 'interface' ;
LONG : 'long' ;
NATIVE : 'native' ;
PACKAGE : 'package' ;
PRIVATE : 'private' ;
PROTECTED : 'protected' ;
PUBLIC : 'public' ;
SHORT : 'short' ;
STATIC : 'static' ;
SUPER : 'super' ;
SYNCHRONIZED : 'synchronized' ;
THROWS : 'throws' ;
TRANSIENT : 'transient' ;
VOLATILE : 'volatile' ;
LBRACE : '{' ;
RBRACE : '}' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACK : '[' ;
RBRACK : ']' ;
DOT : '.' ;
SEMIC : ';' ;
COMMA : ',' ;
LT : '<' ;
GT : '>' ;
LTE : '<=' ;
GTE : '>=' ;
EQ : '==' ;
NEQ : '!=' ;
SAME : '===' ;
NSAME : '!==' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
MOD : '%' ;
INC : '++' ;
DEC : '--' ;
SHL : '<<' ;
SHR : '>>' ;
SHU : '>>>' ;
AND : '&' ;
OR : '|' ;
XOR : '^' ;
NOT : '!' ;
INV : '~' ;
LAND : '&&' ;
LOR : '||' ;
QUE : '?' ;
COLON : ':' ;
ASSIGN : '=' ;
ADDASS : '+=' ;
SUBASS : '-=' ;
MULASS : '*=' ;
MODASS : '%=' ;
SHLASS : '<<=' ;
SHRASS : '>>=' ;
SHUASS : '>>>=' ;
ANDASS : '&=' ;
ORASS : '|=' ;
XORASS : '^=' ;
DIV : '/' ;
DIVASS : '/=' ;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 428
fragment BSLASH
	: '\\'
	;
	
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 432
fragment DQUOTE
	: '"'
	;
	
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 436
fragment SQUOTE
	: '\''
	;

// $<	Whitespace (7.2)

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 442
fragment TAB
	: '\u0009'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 446
fragment VT // Vertical TAB
	: '\u000b'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 450
fragment FF // Form Feed
	: '\u000c'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 454
fragment SP // Space
	: '\u0020'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 458
fragment NBSP // Non-Breaking Space
	: '\u00a0'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 462
fragment USP // Unicode Space Separator (rest of Unicode category Zs)
	: '\u1680'  // OGHAM SPACE MARK
	| '\u180E'  // MONGOLIAN VOWEL SEPARATOR
	| '\u2000'  // EN QUAD
	| '\u2001'  // EM QUAD
	| '\u2002'  // EN SPACE
	| '\u2003'  // EM SPACE
	| '\u2004'  // THREE-PER-EM SPACE
	| '\u2005'  // FOUR-PER-EM SPACE
	| '\u2006'  // SIX-PER-EM SPACE
	| '\u2007'  // FIGURE SPACE
	| '\u2008'  // PUNCTUATION SPACE
	| '\u2009'  // THIN SPACE
	| '\u200A'  // HAIR SPACE
	| '\u202F'  // NARROW NO-BREAK SPACE
	| '\u205F'  // MEDIUM MATHEMATICAL SPACE
	| '\u3000'  // IDEOGRAPHIC SPACE
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 481
WhiteSpace
	: ( TAB | VT | FF | SP | NBSP | USP )+ { $channel = HIDDEN; }
	;

// $>

// $<	Line terminators (7.3)

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 489
fragment LF // Line Feed
	: '\n'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 493
fragment CR // Carriage Return
	: '\r'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 497
fragment LS // Line Separator
	: '\u2028'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 501
fragment PS // Paragraph Separator
	: '\u2029'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 505
fragment LineTerminator
	: CR | LF | LS | PS
	;
		
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 509
EOL
	: ( ( CR LF? ) | LF | LS | PS ) { $channel = HIDDEN; }
	;
// $>

// $<	Comments (7.4)

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 516
MultiLineComment
	: '/*' ( options { greedy = false; } : . )* '*/' { $channel = HIDDEN; }
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 520
SingleLineComment
	: '//' ( ~( LineTerminator ) )* { $channel = HIDDEN; }
	;

// $>

// $<	Tokens (7.5)

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 621
fragment IdentifierStartASCII
	: 'a'..'z' | 'A'..'Z'
	| '$'
	| '_'
	| BSLASH 'u' HexDigit HexDigit HexDigit HexDigit // UnicodeEscapeSequence
	;

/*
The first two alternatives define how ANTLR can match ASCII characters which can be considered as part of an identifier.
The last alternative matches other characters in the unicode range that can be sonsidered as part of an identifier.
*/
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 632
fragment IdentifierPart
	: DecimalDigit
	| IdentifierStartASCII
	| { isIdentifierPartUnicode(input.LA(1)) }? { matchAny(); }
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 638
fragment IdentifierNameASCIIStart
	: IdentifierStartASCII IdentifierPart*
	;

/*
The second alternative acts as an action driven fallback to evaluate other characters in the unicode range than the ones in the ASCII subset.
Due to the first alternative this grammar defines enough so that ANTLR can generate a lexer that correctly predicts identifiers with characters in the ASCII range.
In that way keywords, other reserved words and ASCII identifiers are recognized with standard ANTLR driven logic. When the first character for an identifier fails to 
match this ASCII definition, the lexer calls consumeIdentifierUnicodeStart because of the action in the alternative. This method checks whether the character matches 
as first character in ranges other than ASCII and consumes further characters belonging to the identifier with help of mIdentifierPart generated out of the 
IdentifierPart rule above.
*/
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 650
Identifier
	: IdentifierNameASCIIStart
	| { consumeIdentifierUnicodeStart(); }
	;

// $>

// $<	Punctuators (7.7)

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 734
fragment DecimalDigit
	: '0'..'9'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 738
fragment HexDigit
	: DecimalDigit | 'a'..'f' | 'A'..'F'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 742
fragment OctalDigit
	: '0'..'7'
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 746
fragment ExponentPart
	: ( 'e' | 'E' ) ( '+' | '-' )? DecimalDigit+
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 750
fragment DecimalIntegerLiteral
	: '0'
	| '1'..'9' DecimalDigit*
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 755
DecimalLiteral
	: DecimalIntegerLiteral '.' DecimalDigit* ExponentPart?
	| '.' DecimalDigit+ ExponentPart?
	| DecimalIntegerLiteral ExponentPart?
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 761
OctalIntegerLiteral
	: '0' OctalDigit+
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 765
HexIntegerLiteral
	: ( '0x' | '0X' ) HexDigit+
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 784
fragment CharacterEscapeSequence
	: ~( DecimalDigit | 'x' | 'u' | LineTerminator ) // Concatenation of SingleEscapeCharacter and NonEscapeCharacter
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 788
fragment ZeroToThree
	: '0'..'3'
	;
	
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 792
fragment OctalEscapeSequence
	: OctalDigit
	| ZeroToThree OctalDigit
	| '4'..'7' OctalDigit
	| ZeroToThree OctalDigit OctalDigit
	;
	
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 799
fragment HexEscapeSequence
	: 'x' HexDigit HexDigit
	;
	
// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 803
fragment UnicodeEscapeSequence
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 807
fragment EscapeSequence
	:
	BSLASH 
	(
		CharacterEscapeSequence 
		| OctalEscapeSequence
		| HexEscapeSequence
		| UnicodeEscapeSequence
	)
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 818
StringLiteral
	: SQUOTE ( ~( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE
	| DQUOTE ( ~( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE
	;

// $>

// $<	Regular expression literals (7.8.5)

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 827
fragment BackslashSequence
	: BSLASH ~( LineTerminator )
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 831
fragment RegularExpressionFirstChar
	: ~ ( LineTerminator | MUL | BSLASH | DIV )
	| BackslashSequence
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 836
fragment RegularExpressionChar
	: ~ ( LineTerminator | BSLASH | DIV )
	| BackslashSequence
	;

// $ANTLR src "net/awired/jscoverage/instrumentation/es3/ES3Instrument.g" 841
RegularExpressionLiteral
	: { areRegularExpressionsEnabled() }?=> DIV RegularExpressionFirstChar RegularExpressionChar* DIV IdentifierPart*
	;

// $>

// $>

// $>

//
// $<	A.3 Expressions (11)
//

// $<Primary expressions (11.1)

