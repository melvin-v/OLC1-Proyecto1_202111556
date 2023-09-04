package analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import olc1.project1.errors.LexicalError;

%%
%class Lexico
%public
%line
%char
%cup
%unicode
%ignorecase

%{
    public LinkedList<LexicalError> lexicalErrors;
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
CHAR = ([\']([^\t\'\"\n]|(\\\")|(\\n)|(\\\')|(\\t))?[\'])|(['][\$][{](6[5-9]|[7-8][0-9]|90|9[7-9]|10[0-9]|11[0-9]|12[0-2])[}]['])

ID = "_"[0-9A-Za-z_]+"_"
TYPEDEF = int|double|char|bool|string

%%

"void"                  {return new Symbol(sym.VOID, yyline,(int) yychar, yytext());}
"main"                  {return new Symbol(sym.MAIN, yyline,(int) yychar, yytext());}


">"                 {return new Symbol(sym.MAJOR, yyline,(int) yychar, yytext());}
"<"                 {return new Symbol(sym.MINOR, yyline,(int) yychar, yytext());}
">="                {return new Symbol(sym.MAJOREQUALS, yyline,(int) yychar, yytext());}
">="         {return new Symbol(sym.MINOREQUALS, yyline,(int) yychar, yytext());}
"=="              {return new Symbol(sym.EQUALS, yyline,(int) yychar, yytext());}
"!="          {return new Symbol(sym.NOTEQUALS, yyline,(int) yychar, yytext());}
"!"                   {return new Symbol(sym.NOT, yyline,(int) yychar, yytext());}
"||"                    {return new Symbol(sym.OR, yyline,(int) yychar, yytext());}
"&&"                   {return new Symbol(sym.AND, yyline,(int) yychar, yytext());}

","                     {return new Symbol(sym.COMA, yyline,(int) yychar, yytext());}
";"                     {return new Symbol(sym.DOTCOMMA, yyline,(int) yychar, yytext());}

"+"                     {return new Symbol(sym.ADD, yyline,(int) yychar, yytext());}
"-"                     {return new Symbol(sym.SUBSTRACT, yyline,(int) yychar, yytext());}
"*"                     {return new Symbol(sym.MULTIPLY, yyline,(int) yychar, yytext());}
"/"                     {return new Symbol(sym.DIVISION, yyline,(int) yychar, yytext());}

"("                     {return new Symbol(sym.PARSTART, yyline,(int) yychar, yytext());}
")"                     {return new Symbol(sym.PAREND, yyline,(int) yychar, yytext());}

"{"                     {return new Symbol(sym.LLAVE_START, yyline,(int) yychar, yytext());}
"}"                     {return new Symbol(sym.LLAVE_END, yyline,(int) yychar, yytext());}

"if"                    {return new Symbol(sym.IF, yyline,(int) yychar, yytext());}
"else"                  {return new Symbol(sym.ELSE, yyline,(int) yychar, yytext());}
"elif"                  {return new Symbol(sym.ELIF, yyline,(int) yychar, yytext());}

"switch"             {return new Symbol(sym.SWITCH, yyline,(int) yychar, yytext());}
"case"               {return new Symbol(sym.CASE, yyline,(int) yychar, yytext());}
"default"            {return new Symbol(sym.DEFAULT, yyline,(int) yychar, yytext());}
"break  "            {return new Symbol(sym.SWITCH_BREAK, yyline,(int) yychar, yytext());}

"for"              {return new Symbol(sym.FOR, yyline,(int) yychar, yytext());}

"while"             {return new Symbol(sym.WHILE, yyline,(int) yychar, yytext());}

"do"                {return new Symbol(sym.DO, yyline, (int) yychar, yytext());}

"Console.Write"          {return new Symbol(sym.PRINT, yyline,(int) yychar, yytext());}

\n                      {yychar=1;}
{BLANK}                 {}
{COMMENTONELINE}        {}
{COMMENTMULTILINE}      {}

{NUM}                   {return new Symbol(sym.NUM, yyline, (int) yychar, yytext());}
{STR}                   {return new Symbol(sym.STR, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));}
{CHAR}                  {return new Symbol(sym.CHAR, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));}

{TYPEDEF}               {return new Symbol(sym.TYPEDEF, yyline, (int) yychar, yytext());}
{ID}                    {return new Symbol(sym.ID, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));}

. {
    lexicalErrors.add(new LexicalError(yytext(), yyline, (int) yychar));
}