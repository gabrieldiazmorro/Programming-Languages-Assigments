//Made by Gabriel Diaz Morro
//802185131

/**
     * This class is a simple lexer for scheme.
     */

%%
// %class tells JFlex to give the generated class the name Lexer and to write the code to a file SchemeLexer.java
%class SchemeLexer
%unicode
%line //switches line counting on (the current line number can be accessed via the variable yyline)
%column // switches column counting on (the current column is accessed via yycolumn)
%standalone

//**Note**
//The specification continues with macro declarations. Macros are abbreviations for regular expressions, 
//used to make lexical specifications easier to read and understand. A macro declaration consists of a macro identifier
//followed by =, then followed by the regular expression it represents. This regular expression may itself contain macro usages.
//Although this allows a grammar-like specification style, macros are still just abbreviations and not non-terminals – they 
//cannot be recursive. Cycles in macro definitions are detected and reported at generation time by JFlex.
//macro identifier = regular expression

//empty string & comment
//empty = [^$]
comment = ;.* 

//program 
program= {form}*
form= {definition} | {expression}


//definitions 
definition= {variable_definition}
    |{syntax_definition}
    |begin
    |let-syntax
    |letrec-syntax
	

variable_definition= define

variable= {identifier}
body= {definition}*{expression}+
syntax_definition= \(define-syntax {keyword}\)
keyword= {identifier}
syntax_binding= \({keyword}\)

//Expressions

//macro identifier = regular expression
expression={constant}
			|{variable}
			|quote
			|\'
			|lambda
			|if
			|set\!
			|let-syntax
			|letrec-syntax
			|{derived_expression}
			
constant={boolean} | {number} | {character} | {string}
formals={variable}|\({variable}* \)|\({variable}+ . {variable}\)
derived_expression= and|begin|case|cond|delay|do|let|let\*|letrec|or|quasiquote|else


//Identifiers
identifier={initial}{subsequent}*|\+|\-|\.\.\.
initial=\!|\$|\%|\&|\*|\/|\:|\<|\=|\>|\?|\~|\_|\^|\-|\+|{letter}

subsequent={initial}|{digit}|\.|\+|\-

letter=[A-Za-z]+
whitespace=[ \n\r\t]+|[ ]

//Data
datum= {boolean} | {number} | {character} | {string} | {symbol} | {list}
boolean= #t|#f
number= {num2} | {num8} | {num10} | {num16}
character= #\ . | #\newline | #\space //removed a #\
string_character= \" |\\ | [^\\] | [^\"] // an escape sequence or any unicode character that is not one of these meta characters: \  "
string=\"{string_character}.*\"    //[^abc] matches any character except abc
symbol={identifier}           
list={abbreviation}
abbreviation='|`|,|,@


//Numbers 

digit=[0-9]
digit2=0|1
digit8=[0-7]
digit10={digit}
digit16 = {digit} | [a-f]

num10={prefix10}{complex10}
num2={prefix2}{complex2}
num8={prefix8}{complex8}
num16={prefix16}{complex16}

complex2={real2}|{real2}@{real2}|{real2}\+{imag2}|{real2}"-"{imag2}|\+{imag2}|{imag2}
complex8={real8}|{real8}@{real8}|{real8}\+{imag8}|{real8}"-"{imag8}|\+{imag8}|{imag8}
complex10={real10}|{real10}@{real10}|{real10}\+{imag10}|{real10}"-"{imag10}|\+{imag10}|{imag10}
complex16={real16}|{real16}@{real16}|{real16}\+{imag16}|{real16}"-"{imag16}|\+{imag16}|{imag16}

imag2=i | {ureal2}i
imag8=i | {ureal8}i
imag10=i | {ureal10}i
imag16=i | {ureal16}i

real2={sign}?{ureal2}
real8={sign}?{ureal8}
real10={sign}?{ureal10} //a “?” after a pattern to match text that corresponds to an optional occurrence of the pattern		
real16={sign}?{ureal16}

ureal2 ={uint2}| {uint2} \/ {uint2}
ureal8 ={uint8}| {uint8} \/ {uint8} 
ureal10 ={uint10}|{uint10}\/{uint10}|{decimal10}
ureal16 ={uint16}|{uint16}\/{uint16}

uint2={digit2}+#*
uint8={digit8}+#*
uint10={digit10}+#*
uint16={digit16}+#*

prefix2={radix2}{exactness}|{exactness}{radix2}
prefix8={radix8}{exactness}|{exactness}{radix8}
prefix10={radix10}{exactness}|{exactness}{radix10}
prefix16={radix16}{exactness}|{exactness}{radix16}

decimal10={uint10}{exponent}|\.{digit10}+#{suffix}|{digit10}+\.{digit10}#{suffix}|{digit10}+#+\.#{suffix}


suffix={exponent}

exponent={exponent_marker}{sign}{digit10}+
exponent_marker=e|s|f|d|l
sign=\+|\-
exactness=#i|#e

radix2=#b
radix8=#o
radix10=#d
radix16=#x


%%

//auxilary functions

//pattern           action
{whitespace}+		 {}
eq\?				 {System.out.println("EQ" +  yytext());}
\(					 {System.out.println("OP: "+yytext());}
\)					 {System.out.println("CP: "+yytext());}
\[					 {System.out.println("OBracket: " + yytext());}
\]					 {System.out.println("CBracket: " + yytext());}
\, 					 {System.out.println("Comma: " +yytext());}
if					 {System.out.println("If keyword: " + yytext());}
{definition}       	 {System.out.println("Definition: " + yytext());}
{derived_expression} {System.out.println("DerivedExpr: "+yytext());}
{identifier} 		 {System.out.println("ID: " + yytext());}	
{sign}?{digit}+		 {System.out.println("Number: " + yytext());}

{string}			 {System.out.println("String: " + yytext());}
{string_character}	 {System.out.println("Character: " + yytext());}
{boolean}            {System.out.println("Boolean: " + yytext());}
{expression}       	 {System.out.println("Expression: " + yytext());}
{datum}            	 {System.out.println("Datum: " + yytext());}

{comment}            {System.out.println("This is a comment: [" + yytext() + "]");}