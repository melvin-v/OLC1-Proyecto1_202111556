package analizadores.json;

import errores.ErrorLexico;
import java_cup.runtime.Symbol;
import java.util.LinkedList;

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
%}

%init{
erroresLexicos = new LinkedList<>();
    yyline = 1;
    yychar = 1;
%init}

BLANK = [ \r\t]+

STR = [\"][^\"]*[\"]
NUM = [0-9]+("."[  |0-9]+)?

%%

","                     {return new Symbol(sym.COMA, yyline,(int) yychar, yytext());}
":"                     {return new Symbol(sym.DOS_PUNTOS, yyline,(int) yychar, yytext());}

"{"                     {return new Symbol(sym.LLAVE_START, yyline,(int) yychar, yytext());}
"}"                     {return new Symbol(sym.LLAVE_END, yyline,(int) yychar, yytext());}

\n                      {yychar=1;}
{BLANK}                 {}
{NUM}                   {return new Symbol(sym.NUM, yyline, (int) yychar, yytext());}
{STR}                   {return new Symbol(sym.STR, yyline, (int) yychar, (yytext()));}


. {
    erroresLexicos.add(new ErrorLexico(yytext(), yyline, (int) yychar));
}