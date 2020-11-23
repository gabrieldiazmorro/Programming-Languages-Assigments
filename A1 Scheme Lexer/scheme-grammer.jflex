

%%

%class SchemeLexer
%unicode
%line
%column
%standalone

// Program

Program={Form}*
Form={Definition}|{Expression}

// Expressions

Expression={Constant}|{Variable}|\(quote {Datum}\)
|'{Datum}|\(lambda {Formals}{Body}\)
|\(if {Expression}{Expression}{Expression}\)
| \(if {Expression} {Expression}\)
|\(set! {Variable} {Expression}\)
|{Application}
|\(let \({SyntaxBinding}* \) {Expression}+\)
|\(letrec \({SyntaxBinding}* \) {Expression}+\)
|{DerivedExpression}

Constant={Boolean}
Formals={Variable}|\({Variable}* \)|\({Variable}+ . {Variable}\)
Application=\({Expression} {Expression}* \)
DerivedExpression=and|begin|case|cond|delay|do|let|let\*|letrec|or|quasiquote|else

// Definitions

Definition={VariableDefinition}
	|{SyntaxDefinition}
	|\(begin {Definition}*\)
	|\(let \({SyntaxBinding}*\) {Definition}*\)
	|\(letrec \({SyntaxBinding}*\) {Definition}*\)

VariableDefinition=\(define {Variable} {Expression}\)
	|\(define \({Variable} {Variable}*\) {Body}\)
	|\(define \({Variable} {Variable}* . {Variable}\) {Body}\)

Variable={Identifier}
Body={Definition}* {Expression}+
SyntaxDefinition=\(define {Keyword}\)
Keyword={Identifier}
SyntaxBinding=\({Keyword}\)

// Numbers

Digit=[0-9]
Digit2=0|1
Digit8=[0-7]
Digit10={Digit}

Num10={Prefix10}{Complex10}
Num2={Prefix2}{Complex2}
Num8={Prefix8}{Complex8}

Complex2={Real2}|{Real2}@{Real2}|{Real2}\+{Imag2}|{Real2}"-"{Imag2}|\+{Imag2}|{Imag2}
Complex8={Real8}|{Real8}@{Real8}|{Real8}\+{Imag8}|{Real8}"-"{Imag8}|\+{Imag8}|{Imag8}
Complex10={Real10}|{Real10}@{Real10}|{Real10}\+{Imag10}|{Real10}-{Imag10}|{Imag10}

Imag2=i | {Ureal2}i
Imag8=i | {Ureal8}i
Imag10=i | {Ureal10}i

Real2={Sign}{Ureal2}
Real8={Sign}{Ureal8}
Real10={Sign}?{Ureal10}

Ureal2 ={Uint2}| {Uint2} \/ {Uint2} | {Decimal2}
Ureal8 ={Uint8}| {Uint8} \/ {Uint8} |{Decimal8}
Ureal10 ={Uint10}|{Uint10}\/{Uint10}|{Decimal10}

Uint2={Digit2}+#*
Uint8={Digit8}+#*
Uint10={Digit10}+#*

Prefix2={Radix2}{Exact}|{Exact}{Radix2}
Prefix8={Radix8}{Exact}|{Exact}{Radix8}
Prefix10={Radix10}{Exact}|{Exact}{Radix10}

Decimal10={Uint10}{Exponent}|\.{Digit10}+#*{Suffix}|{Digit10}+\.{Digit10}*#*{Suffix}|{Digit10}+#+\.#*{Suffix}
Decimal8={Uint8}{Exponent}|\.{Digit8}+#*{Suffix}|{Digit8}+\.{Digit8}*#*{Suffix}|{Digit8}+#+\.#*{Suffix}
Decimal2={Uint2}{Exponent}|\.{Digit2}+#*{Suffix}|{Digit2}+\.{Digit2}*#*{Suffix}|{Digit2}+#+\.#*{Suffix}

Suffix=[^$]|{Exponent}

Exponent={ExponentMarker}{Sign}{Digit10}+
ExponentMarker=e|s|f|d|l
Sign=[^$]|\+|-
Exact=[^$]|#i|#e

Radix2=#b
Radix8=#o
Radix10=[^$]|#d

// Data
Datum={Boolean}|{Number}|{Character}|{String}|{Symbol}|{List}|{Vector}
Boolean=#t|#f
Number={Num10}
Character=#\|#\|#\newline|#\space
StringCharacter=\\|[^\*]|.
String=\"({Initial}|{StringCharacter})*\"
Symbol={Identifier}
List=\({Datum}*\)|\({Datum}+.{Datum}\)|{Abbreviation}
Abbreviation='{Datum}|`{Datum}|,{Datum}|,@{Datum}
Vector=#\({Datum}*\)

// Identifiers
Identifier={Letter}|{Initial}{Subsequent}*|\+|-
Initial=\!|\$|\%|&|\*|\/|":"|"<"|"="|">"|"?"|"~"|"_"|"^"|"-"|"\+"|{Letter}
Subsequent={Initial}|{Digit}*
Letter=[a-zA-Z]
WhiteSpace=[ \n\r\t]+|[ ]
%%
/*auxiliary funcionts*/
{WhiteSpace}+		{}
eq\?					{System.out.println("EQ" +  yytext());}
\(					{System.out.println("LP,"+yytext());}
\)					{System.out.println("RP,"+yytext());}
\[					{System.out.println("LB,[");}
\]					{System.out.println("RB,]");}
\, 					{System.out.println("COMMA");}
if					{System.out.println("IF");}
{DerivedExpression} 			{System.out.println("DerivedEx,"+yytext());}

{Identifier} 				{System.out.println("ID," + yytext());}
	
{Sign}?{Digit}+				{System.out.println("Number," + yytext());}
{String}				{System.out.println("String," + yytext());}
{StringCharacter}				{System.out.println("Character," + yytext());}
{Boolean}                       	{System.out.println("String," + yytext());}

