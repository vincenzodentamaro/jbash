/* Generated By:JavaCC: Do not edit this line. jBashConstants.java */

/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface jBashConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int IF = 8;
  /** RegularExpression Id. */
  int ENDIF = 9;
  /** RegularExpression Id. */
  int THEN = 10;
  /** RegularExpression Id. */
  int ELSE = 11;
  /** RegularExpression Id. */
  int ECHO = 12;
  /** RegularExpression Id. */
  int FOR = 13;
  /** RegularExpression Id. */
  int WHILE = 14;
  /** RegularExpression Id. */
  int DO = 15;
  /** RegularExpression Id. */
  int IN = 16;
  /** RegularExpression Id. */
  int EXIT = 17;
  /** RegularExpression Id. */
  int DONE = 18;
  /** RegularExpression Id. */
  int ESCLAMATIVO = 19;
  /** RegularExpression Id. */
  int DOPPIAQUADRAPERTA = 20;
  /** RegularExpression Id. */
  int DOPPIAQUADRACHIUSA = 21;
  /** RegularExpression Id. */
  int CASE = 22;
  /** RegularExpression Id. */
  int ELIF = 23;
  /** RegularExpression Id. */
  int ESAC = 24;
  /** RegularExpression Id. */
  int FUNCTION = 25;
  /** RegularExpression Id. */
  int SELECT = 26;
  /** RegularExpression Id. */
  int TIME = 27;
  /** RegularExpression Id. */
  int UNTIL = 28;
  /** RegularExpression Id. */
  int LEFTBRACE = 29;
  /** RegularExpression Id. */
  int RIGHTBRACE = 30;
  /** RegularExpression Id. */
  int EXEC = 31;
  /** RegularExpression Id. */
  int ALIAS = 32;
  /** RegularExpression Id. */
  int BREAK = 33;
  /** RegularExpression Id. */
  int CHANGEDIR = 34;
  /** RegularExpression Id. */
  int CONTINUE = 35;
  /** RegularExpression Id. */
  int KILL = 36;
  /** RegularExpression Id. */
  int PRINTF = 37;
  /** RegularExpression Id. */
  int RETURN = 38;
  /** RegularExpression Id. */
  int TEST = 39;
  /** RegularExpression Id. */
  int UNALIAS = 40;
  /** RegularExpression Id. */
  int UNSET = 41;
  /** RegularExpression Id. */
  int SET = 42;
  /** RegularExpression Id. */
  int LPAREN = 43;
  /** RegularExpression Id. */
  int RPAREN = 44;
  /** RegularExpression Id. */
  int PIPE = 45;
  /** RegularExpression Id. */
  int DOUBLEPIPE = 46;
  /** RegularExpression Id. */
  int LBRACKET = 47;
  /** RegularExpression Id. */
  int RBRACKET = 48;
  /** RegularExpression Id. */
  int VIRGOLA = 49;
  /** RegularExpression Id. */
  int PUNTO = 50;
  /** RegularExpression Id. */
  int AT = 51;
  /** RegularExpression Id. */
  int DOLLARO = 52;
  /** RegularExpression Id. */
  int ID = 53;
  /** RegularExpression Id. */
  int LETTERA = 54;
  /** RegularExpression Id. */
  int NUMERO = 55;
  /** RegularExpression Id. */
  int SEGNO = 56;
  /** RegularExpression Id. */
  int NUMERI_C_VIRGOLA = 57;
  /** RegularExpression Id. */
  int NUMERI_DECIMALI = 58;
  /** RegularExpression Id. */
  int STRINGA = 59;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IL_COMMENTO = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"#\"",
    "\"/n\"",
    "<token of kind 7>",
    "\"if\"",
    "\"fi\"",
    "\"then\"",
    "\"else\"",
    "\"echo\"",
    "\"for\"",
    "\"while\"",
    "\"do\"",
    "\"in\"",
    "\"exit\"",
    "\"done\"",
    "\"!\"",
    "\"[[\"",
    "\"]]\"",
    "\"case\"",
    "\"elif\"",
    "\"esac\"",
    "\"function\"",
    "\"select\"",
    "\"time\"",
    "\"until\"",
    "\"{\"",
    "\"}\"",
    "\"exec\"",
    "\"alias\"",
    "\"break\"",
    "\"cd\"",
    "\"continue\"",
    "\"kill\"",
    "\"printf\"",
    "\"return\"",
    "\"test\"",
    "\"unalias\"",
    "\"unset\"",
    "\"set\"",
    "\"(\"",
    "\")\"",
    "\"|\"",
    "\"||\"",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "\".\"",
    "\"@\"",
    "\"$\"",
    "<ID>",
    "<LETTERA>",
    "<NUMERO>",
    "<SEGNO>",
    "<NUMERI_C_VIRGOLA>",
    "<NUMERI_DECIMALI>",
    "<STRINGA>",
  };

}