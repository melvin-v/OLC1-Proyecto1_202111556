package analizadores;

import errores.ErrorLexico;import java_cup.runtime.Symbol;
import java.util.LinkedList;

%%
%debug
%class Lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%{
    public LinkedList<ErrorLexico> lexicalErrors;
%}

%init{
lexicalErrors = new LinkedList<>();
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

"void"                  {return new Symbol(sym.VOID, yyline,(int) yychar, yytext()); }
"main"                  {return new Symbol(sym.MAIN, yyline,(int) yychar, yytext());}

"="                    {return new Symbol(sym.IGUAL, yyline,(int) yychar, yytext());}
">"                 {return new Symbol(sym.MAYOR, yyline,(int) yychar, yytext());}
"<"                 {return new Symbol(sym.MENOR, yyline,(int) yychar, yytext());}
">="                {return new Symbol(sym.MAYOR_IGUAL, yyline,(int) yychar, yytext());}
"<="         {return new Symbol(sym.MENOR_IGUAL, yyline,(int) yychar, yytext());}
"=="              {return new Symbol(sym.IGUAL, yyline,(int) yychar, yytext());}
"!="          {return new Symbol(sym.NO_IGUAL, yyline,(int) yychar, yytext());}
"!"                   {return new Symbol(sym.NOT, yyline,(int) yychar, yytext());}
"||"                    {return new Symbol(sym.OR, yyline,(int) yychar, yytext());}
"&&"                   {return new Symbol(sym.AND, yyline,(int) yychar, yytext());}
"$"                     {return new Symbol(sym.DOLAR, yyline,(int) yychar, yytext());}

";"                     {return new Symbol(sym.PUNTO_COMA, yyline,(int) yychar, yytext());}
":"                    {return new Symbol(sym.DOS_PUNTOS, yyline,(int) yychar, yytext());}

"++"                    {return new Symbol(sym.INCREMENTO, yyline,(int) yychar, yytext());}

"+"                     {return new Symbol(sym.SUMA, yyline,(int) yychar, yytext());}
"-"                     {return new Symbol(sym.RESTA, yyline,(int) yychar, yytext());}
"*"                     {return new Symbol(sym.MULTIPLICACION, yyline,(int) yychar, yytext());}
"/"                     {return new Symbol(sym.DIVISION, yyline,(int) yychar, yytext());}
"."                     {return new Symbol(sym.PUNTO, yyline,(int) yychar, yytext());}
","                     {return new Symbol(sym.COMA, yyline,(int) yychar, yytext());}

"("                     {return new Symbol(sym.PARENTESIS_IZQ, yyline,(int) yychar, yytext());}
")"                     {return new Symbol(sym.PARENTESIS_DER, yyline,(int) yychar, yytext());}

"{"                     {return new Symbol(sym.LLAVE_IZQ, yyline,(int) yychar, yytext());}
"}"                     {return new Symbol(sym.LLAVE_DER, yyline,(int) yychar, yytext());}

"["                     {return new Symbol(sym.CORCHETE_IZQ, yyline,(int) yychar, yytext());}
"]"                     {return new Symbol(sym.CORCHETE_DER, yyline,(int) yychar, yytext());}

"if"                    {return new Symbol(sym.IF, yyline,(int) yychar, yytext());}
"else"                  {return new Symbol(sym.ELSE, yyline,(int) yychar, yytext());}

"switch"             {return new Symbol(sym.SWITCH, yyline,(int) yychar, yytext());}
"case"               {return new Symbol(sym.CASE, yyline,(int) yychar, yytext());}
"default"            {return new Symbol(sym.DEFAULT, yyline,(int) yychar, yytext());}
"break"            {return new Symbol(sym.SWITCH_BREAK, yyline,(int) yychar, yytext());}

"for"              {return new Symbol(sym.FOR, yyline,(int) yychar, yytext());}

"while"             {return new Symbol(sym.WHILE, yyline,(int) yychar, yytext());}

"do"                {return new Symbol(sym.DO, yyline, (int) yychar, yytext());}

"Console"          {return new Symbol(sym.CONSOLE, yyline,(int) yychar, yytext());}
"Write"          {return new Symbol(sym.WRITE, yyline,(int) yychar, yytext());}

"NewValor"          {return new Symbol(sym.NEWVALOR, yyline,(int) yychar, yytext());}
"DefinirGlobales"         {return new Symbol(sym.DEFINIRGLOBALES, yyline,(int) yychar, yytext());}
"GraficaBarras"         {return new Symbol(sym.GRAFICABARRAS, yyline,(int) yychar, yytext());}
"GraficaPie"        {return new Symbol(sym.GRAFICAPIE, yyline,(int) yychar, yytext());}
"Titulox"        {return new Symbol(sym.TITULOX, yyline,(int) yychar, yytext());}
"Tituloy"        {return new Symbol(sym.TITULOY, yyline,(int) yychar, yytext());}
"Titulo"       {return new Symbol(sym.TITULO, yyline,(int) yychar, yytext());}
"Ejex"       {return new Symbol(sym.EJEX, yyline,(int) yychar, yytext());}
"Valores"       {return new Symbol(sym.VALORES, yyline,(int) yychar, yytext());}

\n                      {yychar=1;}
{BLANK}                 {}
{COMMENTONELINE}        {}
{COMMENTMULTILINE}      {}

{NUM}                   {return new Symbol(sym.NUM, yyline, (int) yychar, yytext());}
{STR}                   {return new Symbol(sym.STR, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));}
{BOOLEAN}               {return new Symbol(sym.BOOLEAN, yyline,(int) yychar, yytext());}
{CHAR}                  {return new Symbol(sym.CHAR, yyline, (int) yychar, (yytext()));}

{TYPEDEF}               {return new Symbol(sym.TYPEDEF, yyline, (int) yychar, yytext());}
{ID}                    {return new Symbol(sym.ID, yyline, (int) yychar, (yytext()));}

. {
    lexicalErrors.add(new ErrorLexico(yytext(), yyline, (int) yychar));
}