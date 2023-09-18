package analizadores.json;

import errores.ErrorLexico;
import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java.util.LinkedList;
import utilidades.Token;
%%
%class Lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%{
    public LinkedList<ErrorLexico> erroresLexicos;
    public LinkedList<Token> tokens;
%}

%init{
erroresLexicos = new LinkedList<>();
tokens = new LinkedList<>();
    yyline = 1;
    yychar = 1;
%init}

BLANK = [ \r\t]+

STR = [\"][^\"]*[\"]
NUM = [0-9]+("."[  |0-9]+)?

%%

","                     {tokens.add(new Token("COMA", yytext(), yyline, yychar ));return new Symbol(sym.COMA, yyline,(int) yychar, yytext());}
":"                     {tokens.add(new Token("DOS_PUNTOS", yytext(), yyline, yychar ));return new Symbol(sym.DOS_PUNTOS, yyline,(int) yychar, yytext());}

"{"                     {tokens.add(new Token("LLAVE_START", yytext(), yyline, yychar ));return new Symbol(sym.LLAVE_START, yyline,(int) yychar, yytext());}
"}"                     {tokens.add(new Token("LLAVE_END", yytext(), yyline, yychar ));return new Symbol(sym.LLAVE_END, yyline,(int) yychar, yytext());}

\n                      {yychar=1;}
{BLANK}                 {}
{NUM}                   {tokens.add(new Token("NUM", yytext(), yyline, yychar ));return new Symbol(sym.NUM, yyline, (int) yychar, yytext());}
{STR}                   {tokens.add(new Token("STR", yytext(), yyline, yychar ));return new Symbol(sym.STR, yyline, (int) yychar, (yytext()));}


. {
    erroresLexicos.add(new ErrorLexico("Lexico", "Caracter no valido detectado: " + yytext(), yyline+"" , yychar+"" ));
}