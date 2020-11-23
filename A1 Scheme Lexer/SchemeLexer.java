// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexer.jflex

//Made by Gabriel Diaz Morro
//802185131

/**
     * This class is a simple lexer for scheme.
     */


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class SchemeLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\25\u0100\1\u0200\11\u0100\1\u0300\17\u0100\1\u0400\247\u0100"+
    "\10\u0500\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\6"+
    "\1\7\1\10\3\6\1\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\2\21\6\22\2\23\1\6"+
    "\1\24\3\6\1\25\1\26\32\6\1\27\1\0\1\30"+
    "\2\6\1\0\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\6\1\40\2\6\1\41\1\6\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\6\1\52"+
    "\1\53\1\54\1\6\3\0\1\6\6\0\1\3\32\0"+
    "\1\55\u01df\0\1\55\177\0\13\55\35\0\2\3\5\0"+
    "\1\55\57\0\1\55\240\0\1\55\377\0\u0100\56";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\1\4\1\5\1\6"+
    "\1\1\1\7\1\1\1\10\1\11\11\3\7\0\1\12"+
    "\3\0\1\13\1\0\1\14\4\3\1\15\1\3\1\16"+
    "\2\3\1\17\2\0\2\20\6\0\5\3\1\21\1\15"+
    "\1\3\7\0\6\3\4\0\1\20\3\0\1\20\2\0"+
    "\1\20\2\0\1\20\1\0\1\22\4\3\1\0\2\20"+
    "\4\0\1\20\1\0\1\20\5\0\2\20\3\0\2\20"+
    "\4\0\1\3\1\15\1\3\1\20\2\0\1\20\1\0"+
    "\1\20\1\0\1\20\7\0\1\20\2\0\1\20\1\0"+
    "\1\20\2\0\1\20\1\0\2\20\2\0\1\20\1\0"+
    "\1\20\1\0\2\3\1\20\2\0\2\20\3\0\1\20"+
    "\6\0\1\20\1\0\1\20\3\0\2\20\2\0\2\20"+
    "\1\0\1\20\2\0\2\20\2\0\2\3\1\20\1\0"+
    "\3\20\6\0\1\20\1\0\1\20\1\0\2\20\1\0"+
    "\1\20\1\0\1\3\1\0\1\20\1\0\1\20\7\0"+
    "\1\22\2\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[235];
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
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\57"+
    "\0\u0149\0\u0178\0\u01a7\0\u01d6\0\57\0\57\0\u0205\0\u0234"+
    "\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac"+
    "\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\57\0\u04f5"+
    "\0\u0524\0\u0553\0\57\0\u0582\0\u01d6\0\u05b1\0\u05e0\0\u060f"+
    "\0\u063e\0\215\0\u066d\0\215\0\u069c\0\u06cb\0\u03ac\0\u06fa"+
    "\0\u0729\0\57\0\u06fa\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814"+
    "\0\u0843\0\57\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\215\0\u092e"+
    "\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6"+
    "\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96"+
    "\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\215\0\u0edf"+
    "\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\u1057"+
    "\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\u11cf"+
    "\0\u11fe\0\u122d\0\u125c\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347"+
    "\0\u1376\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490\0\u14bf"+
    "\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa\0\u15d9\0\u1608\0\u1637"+
    "\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u1751\0\u1780\0\u17af"+
    "\0\u17de\0\u180d\0\u183c\0\u186b\0\u189a\0\u18c9\0\u18f8\0\u1927"+
    "\0\u1956\0\u1985\0\u19b4\0\u19e3\0\u1a12\0\u1a41\0\u1a70\0\u1a9f"+
    "\0\u1ace\0\u1afd\0\u1b2c\0\u1b5b\0\u1b8a\0\u1bb9\0\u1be8\0\u1c17"+
    "\0\u1c46\0\u1c75\0\u1ca4\0\u1cd3\0\u1d02\0\u1d31\0\u1d60\0\u1d8f"+
    "\0\u1dbe\0\u1ded\0\u1e1c\0\u1e4b\0\u1e7a\0\u1ea9\0\u1ed8\0\u1f07"+
    "\0\u1f36\0\u1f65\0\u1f94\0\u1fc3\0\u1ff2\0\u2021\0\u2050\0\u207f"+
    "\0\u20ae\0\u20dd\0\u210c\0\u213b\0\u216a\0\u2199\0\u21c8\0\u21f7"+
    "\0\u2226\0\u2255\0\u2284\0\u22b3\0\u22e2\0\u2311\0\u2340\0\u236f"+
    "\0\u239e\0\u23cd\0\u23fc\0\u242b\0\u245a\0\u2489\0\u24b8\0\u24e7"+
    "\0\u2516\0\u2545\0\u2574\0\u25a3\0\u25d2\0\u2601\0\u2630\0\u265f"+
    "\0\u245a\0\u268e\0\u26bd\0\u26ec\0\u271b\0\u274a\0\u2779\0\u27a8"+
    "\0\57\0\u27d7\0\u2806";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[235];
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
    "\1\2\2\3\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\4\1\11\1\4\1\12\1\4\3\13\1\14"+
    "\1\4\1\2\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\2\4\1\24\1\25\1\4\1\26\1\4\1\27"+
    "\7\4\2\2\60\0\2\3\1\0\2\3\57\0\1\4"+
    "\4\0\2\4\1\0\6\4\1\0\1\4\3\0\24\4"+
    "\2\0\57\30\1\0\1\31\1\32\2\31\1\33\24\0"+
    "\1\34\1\0\1\35\1\36\1\37\1\0\1\36\2\0"+
    "\1\40\4\0\1\37\2\0\1\41\1\0\1\31\35\0"+
    "\1\42\50\0\1\43\47\0\1\44\60\0\3\13\33\0"+
    "\2\45\3\0\51\45\7\0\1\4\4\0\2\4\1\0"+
    "\6\4\1\0\1\4\3\0\11\4\1\46\12\4\10\0"+
    "\1\4\4\0\2\4\1\0\6\4\1\0\1\4\3\0"+
    "\4\4\1\47\17\4\10\0\1\4\4\0\2\4\1\0"+
    "\6\4\1\0\1\4\3\0\1\50\11\4\1\17\11\4"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\4\4\1\51\5\4\1\52\11\4\10\0\1\4"+
    "\4\0\2\4\1\0\6\4\1\0\1\4\3\0\10\4"+
    "\1\50\3\4\1\53\7\4\10\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\5\4\1\54\16\4"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\4\4\1\55\17\4\10\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\15\4\1\52\6\4"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\20\4\1\56\3\4\2\0\2\30\3\0\2\30"+
    "\1\57\46\30\45\0\1\60\47\0\1\61\6\0\1\60"+
    "\12\0\2\62\3\0\37\62\1\63\11\62\11\0\1\64"+
    "\56\0\1\65\56\0\1\66\56\0\1\67\56\0\1\70"+
    "\103\0\1\71\40\0\1\72\45\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\3\4\1\52\20\4"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\6\4\1\73\15\4\10\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\16\4\1\74\5\4"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\5\4\1\75\2\4\1\76\13\4\10\0\1\4"+
    "\4\0\2\4\1\0\6\4\1\0\1\77\3\0\24\4"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\17\4\1\100\4\4\10\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\1\101\23\4\33\0"+
    "\1\102\77\0\1\103\41\0\1\104\2\0\1\104\53\0"+
    "\1\105\2\0\1\105\50\0\1\104\1\0\1\105\6\0"+
    "\1\106\7\0\1\107\40\0\1\106\2\0\1\106\53\0"+
    "\1\107\2\0\1\107\54\0\1\110\26\0\1\4\4\0"+
    "\2\4\1\0\6\4\1\0\1\4\3\0\7\4\1\111"+
    "\14\4\10\0\1\4\4\0\2\4\1\0\6\4\1\0"+
    "\1\4\3\0\4\4\1\52\17\4\10\0\1\4\4\0"+
    "\2\4\1\0\6\4\1\0\1\4\3\0\7\4\1\112"+
    "\14\4\10\0\1\4\4\0\2\4\1\0\6\4\1\0"+
    "\1\4\3\0\1\113\23\4\10\0\1\4\4\0\1\52"+
    "\1\4\1\0\1\114\5\4\1\0\1\4\3\0\15\4"+
    "\1\115\6\4\10\0\1\4\4\0\2\4\1\0\6\4"+
    "\1\0\1\4\3\0\16\4\1\116\5\4\35\0\1\117"+
    "\64\0\1\120\31\0\1\121\1\0\1\122\2\0\1\123"+
    "\16\0\1\62\32\0\1\124\1\0\1\125\1\126\1\0"+
    "\3\127\14\0\1\62\32\0\1\130\1\0\1\131\2\0"+
    "\2\132\15\0\1\62\32\0\1\133\1\0\1\134\2\0"+
    "\3\135\5\0\6\135\1\0\1\62\56\0\1\136\24\0"+
    "\1\4\4\0\2\4\1\0\6\4\1\0\1\4\3\0"+
    "\11\4\1\137\12\4\10\0\1\4\4\0\2\4\1\0"+
    "\6\4\1\0\1\4\3\0\11\4\1\140\12\4\10\0"+
    "\1\4\4\0\2\4\1\0\6\4\1\0\1\4\3\0"+
    "\23\4\1\52\10\0\1\4\4\0\2\4\1\0\6\4"+
    "\1\0\1\4\3\0\16\4\1\141\5\4\10\0\1\4"+
    "\4\0\2\4\1\0\6\4\1\0\1\4\3\0\4\4"+
    "\1\142\17\4\10\0\1\4\4\0\2\4\1\0\6\4"+
    "\1\0\1\4\3\0\7\4\1\143\14\4\37\0\1\62"+
    "\61\0\1\144\37\0\1\123\16\0\1\62\37\0\1\145"+
    "\45\0\1\146\3\0\1\147\1\0\1\147\1\0\1\150"+
    "\1\123\4\0\1\151\11\0\1\62\35\0\1\126\1\0"+
    "\3\127\14\0\1\62\35\0\1\152\1\0\3\153\54\0"+
    "\3\154\43\0\1\155\3\0\1\156\1\0\1\156\1\157"+
    "\1\160\3\127\2\0\1\161\5\0\3\162\1\0\1\62"+
    "\1\162\5\0\1\162\30\0\2\132\15\0\1\62\37\0"+
    "\2\163\44\0\1\164\3\0\1\165\1\0\1\165\1\0"+
    "\1\166\2\132\3\0\1\167\11\0\1\62\37\0\3\135"+
    "\5\0\6\135\1\0\1\62\37\0\3\170\5\0\6\170"+
    "\30\0\1\171\3\0\1\172\1\0\1\172\1\0\1\173"+
    "\3\135\2\0\1\174\2\0\6\135\1\0\1\62\60\0"+
    "\1\175\22\0\1\4\4\0\2\4\1\0\6\4\1\0"+
    "\1\4\3\0\4\4\1\137\17\4\10\0\1\4\4\0"+
    "\2\4\1\0\6\4\1\0\1\4\3\0\23\4\1\176"+
    "\10\0\1\4\4\0\2\4\1\0\6\4\1\0\1\4"+
    "\3\0\2\4\1\177\21\4\10\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\14\4\1\200\7\4"+
    "\44\0\1\117\24\0\1\201\3\0\1\147\1\0\1\147"+
    "\1\0\1\202\1\145\4\0\1\151\40\0\1\146\3\0"+
    "\1\147\1\0\1\147\1\0\1\150\5\0\1\151\11\0"+
    "\1\62\37\0\1\203\16\0\1\62\37\0\1\204\51\0"+
    "\1\205\1\0\1\205\2\0\1\206\56\0\3\207\43\0"+
    "\1\210\3\0\1\156\1\0\1\156\1\211\1\212\3\153"+
    "\2\0\1\161\5\0\3\213\2\0\1\213\5\0\1\213"+
    "\17\0\1\214\10\0\3\154\43\0\1\155\3\0\1\156"+
    "\1\0\1\156\1\215\1\160\5\0\1\161\5\0\3\162"+
    "\1\0\1\62\1\162\5\0\1\162\26\0\1\216\1\0"+
    "\3\217\14\0\1\62\37\0\3\215\54\0\3\220\47\0"+
    "\1\221\1\0\1\221\1\222\1\0\3\223\47\0\1\224"+
    "\1\0\1\224\50\0\1\225\3\0\1\165\1\0\1\165"+
    "\1\0\1\226\2\163\3\0\1\167\40\0\1\164\3\0"+
    "\1\165\1\0\1\165\1\0\1\166\5\0\1\167\11\0"+
    "\1\62\37\0\2\227\15\0\1\62\37\0\2\230\50\0"+
    "\1\231\1\0\1\231\2\0\2\232\44\0\1\233\3\0"+
    "\1\172\1\0\1\172\1\0\1\234\3\170\2\0\1\174"+
    "\2\0\6\170\30\0\1\171\3\0\1\172\1\0\1\172"+
    "\1\0\1\173\5\0\1\174\11\0\1\62\37\0\3\235"+
    "\5\0\6\235\1\0\1\62\37\0\3\236\5\0\6\236"+
    "\34\0\1\237\1\0\1\237\2\0\3\240\5\0\6\240"+
    "\55\0\1\241\27\0\1\4\4\0\2\4\1\0\6\4"+
    "\1\0\1\4\3\0\11\4\1\242\12\4\10\0\1\4"+
    "\4\0\2\4\1\0\1\114\5\4\1\0\1\4\3\0"+
    "\24\4\10\0\1\4\4\0\2\4\1\0\6\4\1\0"+
    "\1\4\3\0\20\4\1\243\3\4\12\0\1\201\3\0"+
    "\1\147\1\0\1\147\1\0\1\202\5\0\1\151\51\0"+
    "\1\244\45\0\1\245\7\0\1\246\1\203\16\0\1\62"+
    "\26\0\1\247\3\0\1\147\1\0\1\147\2\0\1\204"+
    "\4\0\1\151\11\0\1\62\37\0\1\206\45\0\1\250"+
    "\7\0\1\251\1\206\45\0\1\252\10\0\3\207\43\0"+
    "\1\210\3\0\1\156\1\0\1\156\1\253\1\212\5\0"+
    "\1\161\5\0\3\213\2\0\1\213\5\0\1\213\30\0"+
    "\3\253\54\0\3\254\47\0\1\255\1\0\1\255\74\0"+
    "\3\162\2\0\1\162\5\0\1\162\17\0\1\214\67\0"+
    "\3\256\43\0\1\257\6\0\1\260\1\261\3\217\10\0"+
    "\3\262\1\0\1\62\1\262\5\0\1\262\17\0\1\263"+
    "\3\0\1\156\1\0\1\156\2\0\3\220\2\0\1\161"+
    "\11\0\1\62\35\0\1\222\1\0\3\223\54\0\3\264"+
    "\43\0\1\265\6\0\1\266\1\267\3\223\10\0\3\270"+
    "\2\0\1\270\5\0\1\270\30\0\3\271\43\0\1\225"+
    "\3\0\1\165\1\0\1\165\1\0\1\226\5\0\1\167"+
    "\51\0\2\272\44\0\1\273\7\0\1\274\2\227\15\0"+
    "\1\62\26\0\1\275\3\0\1\165\1\0\1\165\2\0"+
    "\2\230\3\0\1\167\11\0\1\62\37\0\2\232\44\0"+
    "\1\276\7\0\1\277\2\232\44\0\1\233\3\0\1\172"+
    "\1\0\1\172\1\0\1\234\5\0\1\174\51\0\3\300"+
    "\5\0\6\300\30\0\1\301\7\0\1\302\3\235\5\0"+
    "\6\235\1\0\1\62\26\0\1\303\3\0\1\172\1\0"+
    "\1\172\2\0\3\236\2\0\1\174\2\0\6\236\1\0"+
    "\1\62\37\0\3\240\5\0\6\240\30\0\1\304\7\0"+
    "\1\305\3\240\5\0\6\240\36\0\1\306\46\0\1\4"+
    "\4\0\2\4\1\0\6\4\1\0\1\4\3\0\17\4"+
    "\1\307\4\4\10\0\1\4\4\0\2\4\1\0\6\4"+
    "\1\0\1\4\3\0\12\4\1\310\11\4\12\0\1\311"+
    "\3\0\1\147\1\0\1\147\2\0\1\244\4\0\1\151"+
    "\40\0\1\245\7\0\1\246\17\0\1\62\37\0\1\312"+
    "\45\0\1\247\3\0\1\147\1\0\1\147\7\0\1\151"+
    "\11\0\1\62\26\0\1\250\7\0\1\251\57\0\1\313"+
    "\71\0\3\213\2\0\1\213\5\0\1\213\17\0\1\252"+
    "\56\0\1\314\3\0\1\156\1\0\1\156\2\0\3\254"+
    "\2\0\1\161\51\0\3\315\43\0\1\316\10\0\3\256"+
    "\43\0\1\257\6\0\1\317\1\261\13\0\3\262\1\0"+
    "\1\62\1\262\5\0\1\262\30\0\3\317\54\0\3\320"+
    "\47\0\1\321\1\0\1\321\50\0\1\263\3\0\1\156"+
    "\1\0\1\156\7\0\1\161\11\0\1\62\26\0\1\322"+
    "\10\0\3\264\43\0\1\265\6\0\1\323\1\267\13\0"+
    "\3\270\2\0\1\270\5\0\1\270\30\0\3\323\54\0"+
    "\3\324\47\0\1\325\1\0\1\325\54\0\1\156\1\0"+
    "\1\156\2\0\3\271\2\0\1\161\11\0\1\62\26\0"+
    "\1\326\3\0\1\165\1\0\1\165\2\0\2\272\3\0"+
    "\1\167\40\0\1\273\7\0\1\274\17\0\1\62\37\0"+
    "\2\327\44\0\1\275\3\0\1\165\1\0\1\165\7\0"+
    "\1\167\11\0\1\62\26\0\1\276\7\0\1\277\57\0"+
    "\2\330\44\0\1\331\3\0\1\172\1\0\1\172\2\0"+
    "\3\300\2\0\1\174\2\0\6\300\30\0\1\301\7\0"+
    "\1\302\17\0\1\62\37\0\3\332\5\0\6\332\30\0"+
    "\1\303\3\0\1\172\1\0\1\172\7\0\1\174\11\0"+
    "\1\62\26\0\1\304\7\0\1\305\57\0\3\333\5\0"+
    "\6\333\67\0\1\334\15\0\1\4\4\0\2\4\1\0"+
    "\6\4\1\0\1\4\3\0\1\335\23\4\10\0\1\4"+
    "\4\0\2\4\1\0\6\4\1\0\1\4\3\0\17\4"+
    "\1\74\4\4\12\0\1\311\3\0\1\147\1\0\1\147"+
    "\7\0\1\151\40\0\1\336\10\0\1\312\16\0\1\62"+
    "\26\0\1\337\10\0\1\313\45\0\1\314\3\0\1\156"+
    "\1\0\1\156\7\0\1\161\44\0\1\156\1\0\1\156"+
    "\2\0\3\315\2\0\1\161\64\0\3\262\2\0\1\262"+
    "\5\0\1\262\17\0\1\316\56\0\1\336\10\0\3\320"+
    "\14\0\1\62\37\0\3\340\67\0\3\270\2\0\1\270"+
    "\5\0\1\270\17\0\1\322\56\0\1\337\10\0\3\324"+
    "\54\0\3\341\43\0\1\326\3\0\1\165\1\0\1\165"+
    "\7\0\1\167\40\0\1\336\10\0\2\327\15\0\1\62"+
    "\26\0\1\337\10\0\2\330\44\0\1\331\3\0\1\172"+
    "\1\0\1\172\7\0\1\174\40\0\1\336\10\0\3\332"+
    "\5\0\6\332\1\0\1\62\26\0\1\337\10\0\3\333"+
    "\5\0\6\333\74\0\1\342\10\0\1\4\4\0\2\4"+
    "\1\0\6\4\1\0\1\4\3\0\22\4\1\137\1\4"+
    "\12\0\1\336\27\0\1\62\26\0\1\337\67\0\3\340"+
    "\14\0\1\62\60\0\1\343\64\0\1\344\37\0\1\345"+
    "\100\0\1\346\11\0\1\347\4\0\2\347\1\0\1\347"+
    "\1\350\1\347\4\0\1\347\3\0\24\347\10\0\1\347"+
    "\3\0\1\351\2\347\1\0\6\347\1\0\1\347\3\0"+
    "\24\347\21\0\1\352\56\0\1\353\51\0\1\351\44\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10293];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\4\1\2\11\11\1\7\0"+
    "\1\11\3\0\1\11\1\0\13\1\2\0\1\11\1\1"+
    "\6\0\1\11\7\1\7\0\6\1\4\0\1\1\3\0"+
    "\1\1\2\0\1\1\2\0\1\1\1\0\5\1\1\0"+
    "\2\1\4\0\1\1\1\0\1\1\5\0\2\1\3\0"+
    "\2\1\4\0\4\1\2\0\1\1\1\0\1\1\1\0"+
    "\1\1\7\0\1\1\2\0\1\1\1\0\1\1\2\0"+
    "\1\1\1\0\2\1\2\0\1\1\1\0\1\1\1\0"+
    "\3\1\2\0\2\1\3\0\1\1\6\0\1\1\1\0"+
    "\1\1\3\0\2\1\2\0\2\1\1\0\1\1\2\0"+
    "\2\1\2\0\3\1\1\0\3\1\6\0\1\1\1\0"+
    "\1\1\1\0\2\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\1\0\1\1\7\0\1\11\2\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[235];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  SchemeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Character: " + yytext());
            }
            // fall through
          case 19: break;
          case 2:
            { 
            }
            // fall through
          case 20: break;
          case 3:
            { System.out.println("ID: " + yytext());
            }
            // fall through
          case 21: break;
          case 4:
            { System.out.println("OP: "+yytext());
            }
            // fall through
          case 22: break;
          case 5:
            { System.out.println("CP: "+yytext());
            }
            // fall through
          case 23: break;
          case 6:
            { System.out.println("Comma: " +yytext());
            }
            // fall through
          case 24: break;
          case 7:
            { System.out.println("Number: " + yytext());
            }
            // fall through
          case 25: break;
          case 8:
            { System.out.println("OBracket: " + yytext());
            }
            // fall through
          case 26: break;
          case 9:
            { System.out.println("CBracket: " + yytext());
            }
            // fall through
          case 27: break;
          case 10:
            { System.out.println("Boolean: " + yytext());
            }
            // fall through
          case 28: break;
          case 11:
            { System.out.println("Datum: " + yytext());
            }
            // fall through
          case 29: break;
          case 12:
            { System.out.println("This is a comment: [" + yytext() + "]");
            }
            // fall through
          case 30: break;
          case 13:
            { System.out.println("DerivedExpr: "+yytext());
            }
            // fall through
          case 31: break;
          case 14:
            { System.out.println("If keyword: " + yytext());
            }
            // fall through
          case 32: break;
          case 15:
            { System.out.println("String: " + yytext());
            }
            // fall through
          case 33: break;
          case 16:
            { System.out.println("Expression: " + yytext());
            }
            // fall through
          case 34: break;
          case 17:
            { System.out.println("EQ" +  yytext());
            }
            // fall through
          case 35: break;
          case 18:
            { System.out.println("Definition: " + yytext());
            }
            // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java SchemeLexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        SchemeLexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new SchemeLexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
