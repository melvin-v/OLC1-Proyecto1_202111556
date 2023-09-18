package analizadores;

import errores.ErrorLexico;import java_cup.runtime.Symbol;import utilidades.Token;
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
    public LinkedList<ErrorLexico> lexicalErrors;
    public LinkedList<Token> tokens;
%}

%init{
lexicalErrors = new LinkedList<>();
tokens = new LinkedList<>();
    yyline = 1;
    yychar = 1;
%init}

BLANK = [ \r\t]+
COMMENTONELINE = ("//".*\r\n)|("//".*\n)|("//".*\r)
COMMENTMULTILINE = "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"

STR = [\"][^\"]*[\"]
NUM = [0-9]+("."[  |0-9]+)?
BOOLEAN = true|false
CHAR = '[a-zA-Z]'


ID = [A-Za-z]+["_"0-9A-Za-z]*
TYPEDEF = int|double|char|bool|string

%%

"void"                  {tokens.add(new Token("VOID", yytext(), yyline, yychar )); return new Symbol(sym.VOID, yyline,(int) yychar, yytext()); }
"main"                  {tokens.add(new Token("MAIN", yytext(), yyline, yychar )); return new Symbol(sym.MAIN, yyline,(int) yychar, yytext());}

"="                    {tokens.add(new Token("IGUAL", yytext(), yyline, yychar )); return new Symbol(sym.IGUAL, yyline,(int) yychar, yytext());}
">"                 {tokens.add(new Token("MAYOR", yytext(), yyline, yychar )); return new Symbol(sym.MAYOR, yyline,(int) yychar, yytext());}
"<"                 {tokens.add(new Token("MENOR", yytext(), yyline, yychar )); return new Symbol(sym.MENOR, yyline,(int) yychar, yytext());}
">="                {tokens.add(new Token("MAYOR_IGUAL", yytext(), yyline, yychar )); return new Symbol(sym.MAYOR_IGUAL, yyline,(int) yychar, yytext());}
"<="         {tokens.add(new Token("MENOR_IGUAL", yytext(), yyline, yychar )); return new Symbol(sym.MENOR_IGUAL, yyline,(int) yychar, yytext());}
"=="              {tokens.add(new Token("IGUAL", yytext(), yyline, yychar )); return new Symbol(sym.IGUAL, yyline,(int) yychar, yytext());}
"!="          {tokens.add(new Token("NO_IGUAL", yytext(), yyline, yychar ));return new Symbol(sym.NO_IGUAL, yyline,(int) yychar, yytext());}
"!"                   {tokens.add(new Token("NOT", yytext(), yyline, yychar ));return new Symbol(sym.NOT, yyline,(int) yychar, yytext());}
"||"                    {tokens.add(new Token("OR", yytext(), yyline, yychar ));return new Symbol(sym.OR, yyline,(int) yychar, yytext());}
"&&"                   {tokens.add(new Token("AND", yytext(), yyline, yychar ));return new Symbol(sym.AND, yyline,(int) yychar, yytext());}
"$"                     {tokens.add(new Token("DOLAR", yytext(), yyline, yychar ));return new Symbol(sym.DOLAR, yyline,(int) yychar, yytext());}

";"                     {tokens.add(new Token("PUNTO_COMA", yytext(), yyline, yychar ));return new Symbol(sym.PUNTO_COMA, yyline,(int) yychar, yytext());}
":"                    {tokens.add(new Token("DOS_PUNTOS", yytext(), yyline, yychar ));return new Symbol(sym.DOS_PUNTOS, yyline,(int) yychar, yytext());}

"++"                    {tokens.add(new Token("INCREMENTO", yytext(), yyline, yychar ));return new Symbol(sym.INCREMENTO, yyline,(int) yychar, yytext());}

"+"                     {tokens.add(new Token("SUMA", yytext(), yyline, yychar ));return new Symbol(sym.SUMA, yyline,(int) yychar, yytext());}
"-"                     {tokens.add(new Token("RESTA", yytext(), yyline, yychar ));return new Symbol(sym.RESTA, yyline,(int) yychar, yytext());}
"*"                     {tokens.add(new Token("MULTIPLICACION", yytext(), yyline, yychar ));return new Symbol(sym.MULTIPLICACION, yyline,(int) yychar, yytext());}
"/"                     {tokens.add(new Token("DIVISION", yytext(), yyline, yychar ));return new Symbol(sym.DIVISION, yyline,(int) yychar, yytext());}
"."                     {tokens.add(new Token("PUNTO", yytext(), yyline, yychar ));return new Symbol(sym.PUNTO, yyline,(int) yychar, yytext());}
","                     {tokens.add(new Token("COMA", yytext(), yyline, yychar ));return new Symbol(sym.COMA, yyline,(int) yychar, yytext());}

"("                     {tokens.add(new Token("PARENTESIS_IZQ", yytext(), yyline, yychar ));return new Symbol(sym.PARENTESIS_IZQ, yyline,(int) yychar, yytext());}
")"                     {tokens.add(new Token("PARENTESIS_DER", yytext(), yyline, yychar ));return new Symbol(sym.PARENTESIS_DER, yyline,(int) yychar, yytext());}

"{"                     {tokens.add(new Token("LLAVE_IZQ", yytext(), yyline, yychar ));return new Symbol(sym.LLAVE_IZQ, yyline,(int) yychar, yytext());}
"}"                     {tokens.add(new Token("LLAVE_DER", yytext(), yyline, yychar ));return new Symbol(sym.LLAVE_DER, yyline,(int) yychar, yytext());}

"["                     {tokens.add(new Token("CORCHETE_IZQ", yytext(), yyline, yychar ));return new Symbol(sym.CORCHETE_IZQ, yyline,(int) yychar, yytext());}
"]"                     {tokens.add(new Token("CORCHETE_DER", yytext(), yyline, yychar ));return new Symbol(sym.CORCHETE_DER, yyline,(int) yychar, yytext());}

"if"                    {tokens.add(new Token("IF", yytext(), yyline, yychar ));return new Symbol(sym.IF, yyline,(int) yychar, yytext());}
"else"                  {tokens.add(new Token("ELSE", yytext(), yyline, yychar ));return new Symbol(sym.ELSE, yyline,(int) yychar, yytext());}

"switch"             {tokens.add(new Token("SWITCH", yytext(), yyline, yychar ));return new Symbol(sym.SWITCH, yyline,(int) yychar, yytext());}
"case"               {tokens.add(new Token("CASE", yytext(), yyline, yychar ));return new Symbol(sym.CASE, yyline,(int) yychar, yytext());}
"default"            {tokens.add(new Token("DEFAULT", yytext(), yyline, yychar ));return new Symbol(sym.DEFAULT, yyline,(int) yychar, yytext());}
"break"            {tokens.add(new Token("SWITCH_BREAK", yytext(), yyline, yychar ));return new Symbol(sym.SWITCH_BREAK, yyline,(int) yychar, yytext());}

"for"              {tokens.add(new Token("FOR", yytext(), yyline, yychar ));return new Symbol(sym.FOR, yyline,(int) yychar, yytext());}

"while"             {tokens.add(new Token("WHILE", yytext(), yyline, yychar ));return new Symbol(sym.WHILE, yyline,(int) yychar, yytext());}

"do"                {tokens.add(new Token("DO", yytext(), yyline, yychar ));return new Symbol(sym.DO, yyline, (int) yychar, yytext());}

"Console"          {tokens.add(new Token("CONSOLE", yytext(), yyline, yychar ));return new Symbol(sym.CONSOLE, yyline,(int) yychar, yytext());}
"Write"          {tokens.add(new Token("WRITE", yytext(), yyline, yychar ));return new Symbol(sym.WRITE, yyline,(int) yychar, yytext());}

"NewValor"          {tokens.add(new Token("NEWVALOR", yytext(), yyline, yychar ));return new Symbol(sym.NEWVALOR, yyline,(int) yychar, yytext());}
"DefinirGlobales"         {tokens.add(new Token("DEFINIRGLOBALES", yytext(), yyline, yychar ));return new Symbol(sym.DEFINIRGLOBALES, yyline,(int) yychar, yytext());}
"GraficaBarras"         {tokens.add(new Token("GRAFICABARRAS", yytext(), yyline, yychar ));return new Symbol(sym.GRAFICABARRAS, yyline,(int) yychar, yytext());}
"GraficaPie"        {tokens.add(new Token("GRAFICAPIE", yytext(), yyline, yychar ));return new Symbol(sym.GRAFICAPIE, yyline,(int) yychar, yytext());}
"Titulox"        {tokens.add(new Token("TITULOX", yytext(), yyline, yychar ));return new Symbol(sym.TITULOX, yyline,(int) yychar, yytext());}
"Tituloy"        {tokens.add(new Token("TITULOY", yytext(), yyline, yychar ));return new Symbol(sym.TITULOY, yyline,(int) yychar, yytext());}
"Titulo"       {tokens.add(new Token("TITULO", yytext(), yyline, yychar ));return new Symbol(sym.TITULO, yyline,(int) yychar, yytext());}
"Ejex"       {tokens.add(new Token("EJEX", yytext(), yyline, yychar ));return new Symbol(sym.EJEX, yyline,(int) yychar, yytext());}
"Valores"       {tokens.add(new Token("VALORES", yytext(), yyline, yychar ));return new Symbol(sym.VALORES, yyline,(int) yychar, yytext());}

\n                      {yychar=1;}
{BLANK}                 {}
{COMMENTONELINE}        {}
{COMMENTMULTILINE}      {}

{NUM}                   {tokens.add(new Token("NUM", yytext(), yyline, yychar ));return new Symbol(sym.NUM, yyline, (int) yychar, yytext());}
{STR}                   {tokens.add(new Token("STR", yytext(), yyline, yychar ));return new Symbol(sym.STR, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));}
{BOOLEAN}               {tokens.add(new Token("BOOLEAN", yytext(), yyline, yychar ));return new Symbol(sym.BOOLEAN, yyline,(int) yychar, yytext());}
{CHAR}                  {tokens.add(new Token("CHAR", yytext(), yyline, yychar ));return new Symbol(sym.CHAR, yyline, (int) yychar, (yytext()));}

{TYPEDEF}               {tokens.add(new Token("TYPEDEF", yytext(), yyline, yychar ));return new Symbol(sym.TYPEDEF, yyline, (int) yychar, yytext());}
{ID}                    {tokens.add(new Token("ID", yytext(), yyline, yychar ));return new Symbol(sym.ID, yyline, (int) yychar, (yytext()));}

. {
    lexicalErrors.add(new ErrorLexico("Lexico", "Caracter no valido detectado: " + yytext(), yyline+"" , yychar+"" ));
}