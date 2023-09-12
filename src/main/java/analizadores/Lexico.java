/* The following code was generated by JFlex 1.7.0 */

package analizadores;

import errores.ErrorLexico;import java_cup.runtime.Symbol;
import java.util.LinkedList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>src/main/java/analizadores/lexicoStatPy.flex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\3\1\5\1\5\1\4\22\0\1\13\1\61\1\7"+
    "\1\0\1\27\1\0\1\62\1\24\1\67\1\70\1\6\1\65\1\0"+
    "\1\66\1\11\1\2\1\35\1\36\1\37\2\10\1\32\1\31\2\33"+
    "\1\34\1\64\1\63\1\57\1\60\1\56\2\0\1\21\1\50\1\51"+
    "\1\46\1\17\1\20\1\53\1\52\1\45\1\42\1\73\1\22\1\55"+
    "\1\26\1\47\2\42\1\15\1\43\1\14\1\16\1\54\1\71\3\42"+
    "\1\0\1\25\2\0\1\41\1\0\1\21\1\50\1\51\1\46\1\17"+
    "\1\20\1\53\1\52\1\45\1\42\1\73\1\22\1\55\1\26\1\47"+
    "\2\42\1\15\1\43\1\14\1\16\1\54\1\71\3\42\1\30\1\12"+
    "\1\40\7\0\1\5\252\0\2\44\115\0\1\23\u1ea8\0\1\5\1\5"+
    "\u0100\0\1\72\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udee5\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\6\1\1\10\1\11\7\1\1\12\1\13\1\1"+
    "\1\14\1\1\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\1\3\0\1\23\1\0\1\24\7\0\1\25\3\0"+
    "\1\26\2\0\1\27\7\0\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\2\0\2\2\1\0\1\6\4\0\1\36"+
    "\2\0\1\25\1\0\1\37\1\40\15\0\1\41\1\42"+
    "\1\43\11\0\1\44\1\0\1\45\1\46\3\0\1\2"+
    "\10\0\1\47\1\50\1\51\3\0\1\52\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\74\0\74\0\360\0\u012c"+
    "\0\74\0\u0168\0\u01a4\0\u01e0\0\u021c\0\u0258\0\u0294\0\74"+
    "\0\74\0\u02d0\0\u030c\0\u0348\0\u0384\0\u03c0\0\u03fc\0\u0438"+
    "\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564\0\74\0\74\0\u05a0"+
    "\0\74\0\74\0\74\0\u05dc\0\u0618\0\u0654\0\360\0\74"+
    "\0\u0690\0\74\0\u06cc\0\u0708\0\u0744\0\u0780\0\u07bc\0\u07f8"+
    "\0\u0834\0\74\0\u0870\0\u08ac\0\u08e8\0\74\0\u0924\0\u0960"+
    "\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04\0\u0b40"+
    "\0\74\0\74\0\74\0\74\0\74\0\74\0\u0b7c\0\u0bb8"+
    "\0\74\0\u0bf4\0\u0c30\0\u0690\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20"+
    "\0\74\0\u0d5c\0\u0d98\0\u0834\0\u0dd4\0\u08e8\0\74\0\u0e10"+
    "\0\u0e4c\0\u0e88\0\u0ec4\0\u0f00\0\u0f3c\0\u0f78\0\u0fb4\0\u0ff0"+
    "\0\u102c\0\u1068\0\u10a4\0\u10e0\0\74\0\74\0\74\0\u111c"+
    "\0\u1158\0\u1194\0\u11d0\0\u120c\0\u1248\0\u1284\0\u12c0\0\u12fc"+
    "\0\74\0\u1338\0\74\0\74\0\u1374\0\u13b0\0\u13ec\0\u13ec"+
    "\0\u1428\0\u1464\0\u14a0\0\u14dc\0\u1518\0\u1554\0\u1590\0\u15cc"+
    "\0\74\0\74\0\74\0\u1608\0\u1644\0\u1680\0\74\0\74"+
    "\0\74";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\0\1\6\1\7"+
    "\1\10\1\11\1\12\1\3\1\13\2\2\1\14\1\15"+
    "\2\2\1\16\1\17\3\2\1\20\7\10\1\21\1\22"+
    "\1\2\1\16\2\23\1\24\1\2\1\25\1\26\2\2"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\2\2\75\0"+
    "\1\3\2\0\1\3\6\0\1\3\62\0\1\45\3\0"+
    "\1\46\65\0\7\47\1\50\64\47\10\0\1\10\1\51"+
    "\17\0\7\10\46\0\1\52\76\0\1\53\100\0\1\54"+
    "\72\0\1\55\25\0\1\56\40\0\1\57\54\0\1\60"+
    "\2\0\1\61\1\0\1\61\1\0\3\61\1\0\14\61"+
    "\1\62\1\63\1\61\1\64\44\61\10\0\1\65\3\0"+
    "\7\65\3\0\1\65\2\0\7\65\1\0\3\65\1\0"+
    "\11\65\13\0\1\65\1\0\1\65\20\0\1\66\5\0"+
    "\1\67\64\0\1\70\27\0\1\71\41\0\1\72\31\0"+
    "\1\73\45\0\1\74\25\0\1\75\2\0\1\76\70\0"+
    "\1\77\45\0\1\100\132\0\1\101\73\0\1\102\73\0"+
    "\1\103\73\0\1\104\75\0\1\105\76\0\1\106\23\0"+
    "\1\107\34\0\1\110\21\0\3\45\1\111\1\112\1\0"+
    "\66\45\6\46\1\113\65\46\10\0\1\114\1\0\2\114"+
    "\15\0\7\114\52\0\1\115\100\0\1\116\17\0\1\116"+
    "\2\117\50\0\1\120\66\0\1\121\73\0\1\122\122\0"+
    "\2\123\52\0\1\62\56\0\1\61\4\0\1\61\7\0"+
    "\1\124\1\0\1\61\71\0\1\62\3\0\1\125\53\0"+
    "\1\65\3\0\7\65\3\0\1\65\2\0\7\65\1\0"+
    "\1\126\2\65\1\0\11\65\13\0\1\65\1\0\1\65"+
    "\14\0\1\127\77\0\1\130\71\0\1\131\74\0\1\132"+
    "\123\0\1\133\47\0\1\134\17\0\1\134\56\0\1\135"+
    "\66\0\1\136\116\0\2\137\72\0\2\140\72\0\2\141"+
    "\72\0\2\142\31\0\1\111\70\0\2\143\1\111\3\143"+
    "\1\144\65\143\17\0\1\145\73\0\1\146\74\0\1\147"+
    "\76\0\1\115\17\0\1\115\74\0\2\150\42\0\1\151"+
    "\110\0\1\152\1\0\1\153\1\154\1\0\1\155\56\0"+
    "\1\156\122\0\1\157\44\0\1\160\74\0\1\127\70\0"+
    "\1\161\77\0\1\162\17\0\1\162\45\0\1\127\124\0"+
    "\1\163\53\0\1\164\61\0\1\165\101\0\1\166\51\0"+
    "\2\46\1\167\3\46\1\113\67\46\1\170\3\46\1\113"+
    "\65\46\26\0\1\171\116\0\1\172\53\0\4\173\47\0"+
    "\1\173\20\0\7\173\67\0\3\173\73\0\2\153\1\174"+
    "\52\0\1\175\77\0\1\176\143\0\2\177\47\0\1\200"+
    "\43\0\1\201\73\0\1\202\56\0\1\143\144\0\1\127"+
    "\72\0\1\203\61\0\1\61\70\0\3\173\56\0\1\204"+
    "\70\0\1\127\67\0\1\205\102\0\1\206\65\0\1\207"+
    "\72\0\1\210\77\0\1\211\54\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5820];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\2\11\2\1\1\11\6\1\2\11"+
    "\14\1\2\11\1\1\3\11\1\1\3\0\1\11\1\0"+
    "\1\11\7\0\1\11\3\0\1\11\2\0\1\1\7\0"+
    "\6\11\2\0\1\11\1\1\1\0\1\1\4\0\1\11"+
    "\2\0\1\1\1\0\1\1\1\11\15\0\3\11\11\0"+
    "\1\11\1\0\2\11\3\0\1\1\10\0\3\11\3\0"+
    "\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[137];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public LinkedList<ErrorLexico> lexicalErrors;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
  lexicalErrors = new LinkedList<>();
    yyline = 1;
    yychar = 1;
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 238) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexicalErrors.add(new ErrorLexico(yytext(), yyline, (int) yychar));
            } 
            // fall through
          case 45: break;
          case 2: 
            { 
            } 
            // fall through
          case 46: break;
          case 3: 
            { return new Symbol(sym.DIVISION, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 47: break;
          case 4: 
            { yychar=1;
            } 
            // fall through
          case 48: break;
          case 5: 
            { return new Symbol(sym.MULTIPLICACION, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 49: break;
          case 6: 
            { return new Symbol(sym.NUM, yyline, (int) yychar, yytext());
            } 
            // fall through
          case 50: break;
          case 7: 
            { return new Symbol(sym.PUNTO, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 51: break;
          case 8: 
            { return new Symbol(sym.LLAVE_IZQ, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 52: break;
          case 9: 
            { return new Symbol(sym.LLAVE_DER, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 53: break;
          case 10: 
            { return new Symbol(sym.MAYOR, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 54: break;
          case 11: 
            { return new Symbol(sym.MENOR, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 55: break;
          case 12: 
            { return new Symbol(sym.NOT, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 56: break;
          case 13: 
            { return new Symbol(sym.PUNTO_COMA, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 57: break;
          case 14: 
            { return new Symbol(sym.DOS_PUNTOS, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 58: break;
          case 15: 
            { return new Symbol(sym.SUMA, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 59: break;
          case 16: 
            { return new Symbol(sym.RESTA, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 60: break;
          case 17: 
            { return new Symbol(sym.PARENTESIS_IZQ, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 61: break;
          case 18: 
            { return new Symbol(sym.PARENTESIS_DER, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 62: break;
          case 19: 
            { return new Symbol(sym.STR, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));
            } 
            // fall through
          case 63: break;
          case 20: 
            { return new Symbol(sym.OR, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 64: break;
          case 21: 
            { return new Symbol(sym.CHAR, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));
            } 
            // fall through
          case 65: break;
          case 22: 
            { return new Symbol(sym.IF, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 66: break;
          case 23: 
            { return new Symbol(sym.DO, yyline, (int) yychar, yytext());
            } 
            // fall through
          case 67: break;
          case 24: 
            { return new Symbol(sym.MAYOR_IGUAL, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 68: break;
          case 25: 
            { return new Symbol(sym.MENOR_IGUAL, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 69: break;
          case 26: 
            { return new Symbol(sym.IGUAL, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 70: break;
          case 27: 
            { return new Symbol(sym.NO_IGUAL, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 71: break;
          case 28: 
            { return new Symbol(sym.AND, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 72: break;
          case 29: 
            { return new Symbol(sym.INCREMENTO, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 73: break;
          case 30: 
            { return new Symbol(sym.FOR, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 74: break;
          case 31: 
            { return new Symbol(sym.ID, yyline, (int) yychar, (yytext()).substring(1,yytext().length()-1));
            } 
            // fall through
          case 75: break;
          case 32: 
            { return new Symbol(sym.TYPEDEF, yyline, (int) yychar, yytext());
            } 
            // fall through
          case 76: break;
          case 33: 
            { return new Symbol(sym.BOOLEAN, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 77: break;
          case 34: 
            { return new Symbol(sym.ELSE, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 78: break;
          case 35: 
            { return new Symbol(sym.ELIF, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 79: break;
          case 36: 
            { return new Symbol(sym.CASE, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 80: break;
          case 37: 
            { return new Symbol(sym.VOID, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 81: break;
          case 38: 
            { return new Symbol(sym.MAIN, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 82: break;
          case 39: 
            { return new Symbol(sym.WRITE, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 83: break;
          case 40: 
            { return new Symbol(sym.WHILE, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 84: break;
          case 41: 
            { return new Symbol(sym.SWITCH, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 85: break;
          case 42: 
            { return new Symbol(sym.DEFAULT, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 86: break;
          case 43: 
            { return new Symbol(sym.SWITCH_BREAK, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 87: break;
          case 44: 
            { return new Symbol(sym.CONSOLE, yyline,(int) yychar, yytext());
            } 
            // fall through
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
