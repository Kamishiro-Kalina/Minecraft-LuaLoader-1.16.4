/* Generated By:JavaCC: Do not edit this line. LuaParserConstants.java */
package org.luaj.lualoader.vm2.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface LuaParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COMMENT = 17;
  /** RegularExpression Id. */
  int LONGCOMMENT0 = 18;
  /** RegularExpression Id. */
  int LONGCOMMENT1 = 19;
  /** RegularExpression Id. */
  int LONGCOMMENT2 = 20;
  /** RegularExpression Id. */
  int LONGCOMMENT3 = 21;
  /** RegularExpression Id. */
  int LONGCOMMENTN = 22;
  /** RegularExpression Id. */
  int LONGSTRING0 = 23;
  /** RegularExpression Id. */
  int LONGSTRING1 = 24;
  /** RegularExpression Id. */
  int LONGSTRING2 = 25;
  /** RegularExpression Id. */
  int LONGSTRING3 = 26;
  /** RegularExpression Id. */
  int LONGSTRINGN = 27;
  /** RegularExpression Id. */
  int AND = 29;
  /** RegularExpression Id. */
  int BREAK = 30;
  /** RegularExpression Id. */
  int DO = 31;
  /** RegularExpression Id. */
  int ELSE = 32;
  /** RegularExpression Id. */
  int ELSEIF = 33;
  /** RegularExpression Id. */
  int END = 34;
  /** RegularExpression Id. */
  int FALSE = 35;
  /** RegularExpression Id. */
  int FOR = 36;
  /** RegularExpression Id. */
  int FUNCTION = 37;
  /** RegularExpression Id. */
  int GOTO = 38;
  /** RegularExpression Id. */
  int IF = 39;
  /** RegularExpression Id. */
  int IN = 40;
  /** RegularExpression Id. */
  int LOCAL = 41;
  /** RegularExpression Id. */
  int NIL = 42;
  /** RegularExpression Id. */
  int NOT = 43;
  /** RegularExpression Id. */
  int OR = 44;
  /** RegularExpression Id. */
  int RETURN = 45;
  /** RegularExpression Id. */
  int REPEAT = 46;
  /** RegularExpression Id. */
  int THEN = 47;
  /** RegularExpression Id. */
  int TRUE = 48;
  /** RegularExpression Id. */
  int UNTIL = 49;
  /** RegularExpression Id. */
  int WHILE = 50;
  /** RegularExpression Id. */
  int NAME = 51;
  /** RegularExpression Id. */
  int NUMBER = 52;
  /** RegularExpression Id. */
  int FLOAT = 53;
  /** RegularExpression Id. */
  int FNUM = 54;
  /** RegularExpression Id. */
  int DIGIT = 55;
  /** RegularExpression Id. */
  int EXP = 56;
  /** RegularExpression Id. */
  int HEX = 57;
  /** RegularExpression Id. */
  int HEXNUM = 58;
  /** RegularExpression Id. */
  int HEXDIGIT = 59;
  /** RegularExpression Id. */
  int HEXEXP = 60;
  /** RegularExpression Id. */
  int STRING = 61;
  /** RegularExpression Id. */
  int CHARSTRING = 62;
  /** RegularExpression Id. */
  int QUOTED = 63;
  /** RegularExpression Id. */
  int DECIMAL = 64;
  /** RegularExpression Id. */
  int DBCOLON = 65;
  /** RegularExpression Id. */
  int UNICODE = 66;
  /** RegularExpression Id. */
  int CHAR = 67;
  /** RegularExpression Id. */
  int LF = 68;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_COMMENT = 1;
  /** Lexical state. */
  int IN_LC0 = 2;
  /** Lexical state. */
  int IN_LC1 = 3;
  /** Lexical state. */
  int IN_LC2 = 4;
  /** Lexical state. */
  int IN_LC3 = 5;
  /** Lexical state. */
  int IN_LCN = 6;
  /** Lexical state. */
  int IN_LS0 = 7;
  /** Lexical state. */
  int IN_LS1 = 8;
  /** Lexical state. */
  int IN_LS2 = 9;
  /** Lexical state. */
  int IN_LS3 = 10;
  /** Lexical state. */
  int IN_LSN = 11;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"--[[\"",
    "\"--[=[\"",
    "\"--[==[\"",
    "\"--[===[\"",
    "<token of kind 10>",
    "\"[[\"",
    "\"[=[\"",
    "\"[==[\"",
    "\"[===[\"",
    "<token of kind 15>",
    "\"--\"",
    "<COMMENT>",
    "\"]]\"",
    "\"]=]\"",
    "\"]==]\"",
    "\"]===]\"",
    "<LONGCOMMENTN>",
    "\"]]\"",
    "\"]=]\"",
    "\"]==]\"",
    "\"]===]\"",
    "<LONGSTRINGN>",
    "<token of kind 28>",
    "\"and\"",
    "\"break\"",
    "\"do\"",
    "\"else\"",
    "\"elseif\"",
    "\"end\"",
    "\"false\"",
    "\"for\"",
    "\"function\"",
    "\"goto\"",
    "\"if\"",
    "\"in\"",
    "\"local\"",
    "\"nil\"",
    "\"not\"",
    "\"or\"",
    "\"return\"",
    "\"repeat\"",
    "\"then\"",
    "\"true\"",
    "\"until\"",
    "\"while\"",
    "<NAME>",
    "<NUMBER>",
    "<FLOAT>",
    "<FNUM>",
    "<DIGIT>",
    "<EXP>",
    "<HEX>",
    "<HEXNUM>",
    "<HEXDIGIT>",
    "<HEXEXP>",
    "<STRING>",
    "<CHARSTRING>",
    "<QUOTED>",
    "<DECIMAL>",
    "\"::\"",
    "<UNICODE>",
    "<CHAR>",
    "<LF>",
    "\"#\"",
    "\";\"",
    "\"=\"",
    "\",\"",
    "\".\"",
    "\":\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"...\"",
    "\"{\"",
    "\"}\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^\"",
    "\"%\"",
    "\"..\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"==\"",
    "\"~=\"",
  };

}
