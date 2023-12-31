
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores.json;

import java_cup.runtime.Symbol;
import errores.ErrorSintactico;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserJSON extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserJSON() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserJSON(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserJSON(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\006\000\002\002\004\000\002\002\005\000\002\003" +
    "\005\000\002\003\003\000\002\004\005\000\002\004\005" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\004\006\005\001\002\000\004\002\017\001" +
    "\002\000\004\011\010\001\002\000\006\004\014\007\015" +
    "\001\002\000\006\004\ufffe\007\ufffe\001\002\000\004\005" +
    "\011\001\002\000\006\010\012\011\013\001\002\000\006" +
    "\004\ufffd\007\ufffd\001\002\000\006\004\ufffc\007\ufffc\001" +
    "\002\000\004\011\010\001\002\000\004\002\000\001\002" +
    "\000\006\004\uffff\007\uffff\001\002\000\004\002\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\015\000\004\002\003\001\001\000\002\001\001\000" +
    "\006\003\005\004\006\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserJSON$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserJSON$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserJSON$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Map<String, String> simbolos = new HashMap<>();
    public LinkedList<ErrorSintactico> errores = new LinkedList<>();
    public void error_sintactico(Symbol s) {
        if (s.value != null)
            errores.add(new ErrorSintactico(s.value.toString(), s.left, s.right));
    }
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
                throw new Exception("Error irrecuperable en (linea, columna): " + s.left + ", " + s.right);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserJSON$actions {
  private final ParserJSON parser;

  /** Constructor */
  CUP$ParserJSON$actions(ParserJSON parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserJSON$do_action_part00000000(
    int                        CUP$ParserJSON$act_num,
    java_cup.runtime.lr_parser CUP$ParserJSON$parser,
    java.util.Stack            CUP$ParserJSON$stack,
    int                        CUP$ParserJSON$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserJSON$result;

      /* select the action based on the action number */
      switch (CUP$ParserJSON$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)).value;
		RESULT = start_val;
              CUP$ParserJSON$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)), ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserJSON$parser.done_parsing();
          return CUP$ParserJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= LLAVE_START pares LLAVE_END 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-1)).value;

              CUP$ParserJSON$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)), ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), RESULT);
            }
          return CUP$ParserJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // pares ::= pares COMA par 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.peek()).value;

              CUP$ParserJSON$result = parser.getSymbolFactory().newSymbol("pares",1, ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)), ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), RESULT);
            }
          return CUP$ParserJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // pares ::= par 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.peek()).value;

              CUP$ParserJSON$result = parser.getSymbolFactory().newSymbol("pares",1, ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), RESULT);
            }
          return CUP$ParserJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // par ::= STR DOS_PUNTOS NUM 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.peek()).value;
		simbolos.put(utilidades.Utils.strs(s), n);
              CUP$ParserJSON$result = parser.getSymbolFactory().newSymbol("par",2, ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)), ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), RESULT);
            }
          return CUP$ParserJSON$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // par ::= STR DOS_PUNTOS STR 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$ParserJSON$stack.peek()).value;
		simbolos.put(utilidades.Utils.strs(s), utilidades.Utils.strs(n));
              CUP$ParserJSON$result = parser.getSymbolFactory().newSymbol("par",2, ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.elementAt(CUP$ParserJSON$top-2)), ((java_cup.runtime.Symbol)CUP$ParserJSON$stack.peek()), RESULT);
            }
          return CUP$ParserJSON$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserJSON$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserJSON$do_action(
    int                        CUP$ParserJSON$act_num,
    java_cup.runtime.lr_parser CUP$ParserJSON$parser,
    java.util.Stack            CUP$ParserJSON$stack,
    int                        CUP$ParserJSON$top)
    throws java.lang.Exception
    {
              return CUP$ParserJSON$do_action_part00000000(
                               CUP$ParserJSON$act_num,
                               CUP$ParserJSON$parser,
                               CUP$ParserJSON$stack,
                               CUP$ParserJSON$top);
    }
}

}
