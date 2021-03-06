// Generated from src/main/resources/org/rebecalang/compiler/modelcompiler/grammar/TimedRebecaComplete.g4 by ANTLR 4.2

	package org.rebecalang.compiler.modelcompiler.timedrebeca.compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimedRebecaCompleteLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFTER=1, DEADLINE=2, INTLITERAL=3, FLOATLITERAL=4, DOUBLELITERAL=5, CHARLITERAL=6, 
		STRINGLITERAL=7, WS=8, COMMENT=9, LINE_COMMENT=10, BREAK=11, CASE=12, 
		CLASS=13, CONTINUE=14, DEFAULT=15, ELSE=16, FOR=17, GOTO=18, IF=19, IMPORT=20, 
		NEW=21, PACKAGE=22, PRIVATE=23, PROTECTED=24, PUBLIC=25, RECORD=26, RETURN=27, 
		SWITCH=28, WHILE=29, ENV=30, REACTIVECLASS=31, MSGSRV=32, MAIN=33, STATEVARS=34, 
		KNOWNREBECS=35, THIS=36, TRUE=37, FALSE=38, NULL=39, LPAREN=40, RPAREN=41, 
		LBRACE=42, RBRACE=43, LBRACKET=44, RBRACKET=45, SEMI=46, COMMA=47, DOT=48, 
		EQ=49, BANG=50, TILDA=51, QUES=52, COLON=53, EQEQ=54, AMPAMP=55, BARBAR=56, 
		PLUSPLUS=57, SUBSUB=58, SUPER=59, PLUS=60, SUB=61, STAR=62, SLASH=63, 
		AMP=64, BAR=65, CARET=66, PERCENT=67, PLUSEQ=68, SUBEQ=69, STAREQ=70, 
		SLASHEQ=71, AMPEQ=72, BAREQ=73, CARETEQ=74, TILDAEQ=75, PERCENTEQ=76, 
		MONKEYS_AT=77, BANGEQ=78, GT=79, LT=80, LTLT=81, LTLTEQ=82, GTGT=83, GTGTEQ=84, 
		IDENTIFIER=85;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'after'", "'deadline'", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERAL", 
		"CHARLITERAL", "STRINGLITERAL", "WS", "COMMENT", "LINE_COMMENT", "'break'", 
		"'case'", "'class'", "'continue'", "'default'", "'else'", "'for'", "'goto'", 
		"'if'", "'import'", "'new'", "'package'", "'private'", "'protected'", 
		"'public'", "'record'", "'return'", "'switch'", "'while'", "'env'", "'reactiveclass'", 
		"'msgsrv'", "'main'", "'statevars'", "'knownrebecs'", "'this'", "'true'", 
		"'false'", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'!'", "'~'", "'?'", "':'", "'=='", "'&&'", "'||'", 
		"'++'", "'--'", "'super'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'~='", 
		"'%='", "'@'", "'!='", "'>'", "'<'", "'<<'", "'<<='", "'>>'", "'>>='", 
		"IDENTIFIER"
	};
	public static final String[] ruleNames = {
		"AFTER", "DEADLINE", "INTLITERAL", "IntegerNumber", "HexPrefix", "HexDigit", 
		"LongSuffix", "NonIntegerNumber", "Exponent", "FloatSuffix", "DoubleSuffix", 
		"FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "STRINGLITERAL", "EscapeSequence", 
		"WS", "COMMENT", "LINE_COMMENT", "BREAK", "CASE", "CLASS", "CONTINUE", 
		"DEFAULT", "ELSE", "FOR", "GOTO", "IF", "IMPORT", "NEW", "PACKAGE", "PRIVATE", 
		"PROTECTED", "PUBLIC", "RECORD", "RETURN", "SWITCH", "WHILE", "ENV", "REACTIVECLASS", 
		"MSGSRV", "MAIN", "STATEVARS", "KNOWNREBECS", "THIS", "TRUE", "FALSE", 
		"NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", 
		"SEMI", "COMMA", "DOT", "EQ", "BANG", "TILDA", "QUES", "COLON", "EQEQ", 
		"AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "SUPER", "PLUS", "SUB", "STAR", 
		"SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", 
		"SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "TILDAEQ", "PERCENTEQ", "MONKEYS_AT", 
		"BANGEQ", "GT", "LT", "LTLT", "LTLTEQ", "GTGT", "GTGTEQ", "IDENTIFIER", 
		"Letter", "JavaIDDigit"
	};


	public TimedRebecaCompleteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TimedRebecaComplete.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2W\u02cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\7\5\u00d8\n\5\f\5\16\5\u00db\13\5\3\5\3\5\6\5\u00df"+
		"\n\5\r\5\16\5\u00e0\3\5\3\5\6\5\u00e5\n\5\r\5\16\5\u00e6\5\5\u00e9\n\5"+
		"\3\6\3\6\3\6\3\6\5\6\u00ef\n\6\3\7\3\7\3\b\3\b\3\t\6\t\u00f6\n\t\r\t\16"+
		"\t\u00f7\3\t\3\t\7\t\u00fc\n\t\f\t\16\t\u00ff\13\t\3\t\5\t\u0102\n\t\3"+
		"\t\3\t\6\t\u0106\n\t\r\t\16\t\u0107\3\t\5\t\u010b\n\t\3\t\6\t\u010e\n"+
		"\t\r\t\16\t\u010f\3\t\3\t\6\t\u0114\n\t\r\t\16\t\u0115\3\t\3\t\7\t\u011a"+
		"\n\t\f\t\16\t\u011d\13\t\3\t\3\t\3\t\7\t\u0122\n\t\f\t\16\t\u0125\13\t"+
		"\5\t\u0127\n\t\3\t\3\t\5\t\u012b\n\t\3\t\6\t\u012e\n\t\r\t\16\t\u012f"+
		"\5\t\u0132\n\t\3\n\3\n\5\n\u0136\n\n\3\n\6\n\u0139\n\n\r\n\16\n\u013a"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u0146\n\16\3\17\3\17\3\17"+
		"\5\17\u014b\n\17\3\17\3\17\3\20\3\20\3\20\7\20\u0152\n\20\f\20\16\20\u0155"+
		"\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0161\n"+
		"\21\3\22\6\22\u0164\n\22\r\22\16\22\u0165\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u016e\n\23\f\23\16\23\u0171\13\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\7\24\u017c\n\24\f\24\16\24\u017f\13\24\3\24\5\24\u0182"+
		"\n\24\3\24\3\24\5\24\u0186\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3"+
		"A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3G\3G\3H\3"+
		"H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3"+
		"R\3R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Z\3"+
		"Z\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3^\3^\3^\3^\3_\3_\3_\7_\u02c3\n_\f"+
		"_\16_\u02c6\13_\3`\3`\3a\3a\3\u016f\2b\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\6\33\7\35\b\37\t!\2#\n%\13\'\f)\r+\16-\17/\20\61"+
		"\21\63\22\65\23\67\249\25;\26=\27?\30A\31C\32E\33G\34I\35K\36M\37O Q!"+
		"S\"U#W$Y%[&]\'_(a)c*e+g,i-k.m/o\60q\61s\62u\63w\64y\65{\66}\67\1778\u0081"+
		"9\u0083:\u0085;\u0087<\u0089=\u008b>\u008d?\u008f@\u0091A\u0093B\u0095"+
		"C\u0097D\u0099E\u009bF\u009dG\u009fH\u00a1I\u00a3J\u00a5K\u00a7L\u00a9"+
		"M\u00abN\u00adO\u00afP\u00b1Q\u00b3R\u00b5S\u00b7T\u00b9U\u00bbV\u00bd"+
		"W\u00bf\2\u00c1\2\3\2\20\5\2\62;CHch\4\2NNnn\4\2RRrr\4\2--//\4\2GGgg\4"+
		"\2HHhh\4\2FFff\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttv"+
		"v\5\2\13\f\16\17\"\"\4\2\f\f\17\17\16\2&&C\\aac|\u00c2\u00d8\u00da\u00f8"+
		"\u00fa\u2001\u3042\u3191\u3302\u3381\u3402\u3d2f\u4e02\ua001\uf902\ufb01"+
		"\21\2\62;\u0662\u066b\u06f2\u06fb\u0968\u0971\u09e8\u09f1\u0a68\u0a71"+
		"\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68\u0c71\u0ce8\u0cf1\u0d68\u0d71"+
		"\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\u02e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\3\u00c3\3\2\2\2\5\u00c9\3\2\2\2\7\u00d2\3\2\2"+
		"\2\t\u00e8\3\2\2\2\13\u00ee\3\2\2\2\r\u00f0\3\2\2\2\17\u00f2\3\2\2\2\21"+
		"\u0131\3\2\2\2\23\u0133\3\2\2\2\25\u013c\3\2\2\2\27\u013e\3\2\2\2\31\u0140"+
		"\3\2\2\2\33\u0143\3\2\2\2\35\u0147\3\2\2\2\37\u014e\3\2\2\2!\u0158\3\2"+
		"\2\2#\u0163\3\2\2\2%\u0169\3\2\2\2\'\u0177\3\2\2\2)\u0189\3\2\2\2+\u018f"+
		"\3\2\2\2-\u0194\3\2\2\2/\u019a\3\2\2\2\61\u01a3\3\2\2\2\63\u01ab\3\2\2"+
		"\2\65\u01b0\3\2\2\2\67\u01b4\3\2\2\29\u01b9\3\2\2\2;\u01bc\3\2\2\2=\u01c3"+
		"\3\2\2\2?\u01c7\3\2\2\2A\u01cf\3\2\2\2C\u01d7\3\2\2\2E\u01e1\3\2\2\2G"+
		"\u01e8\3\2\2\2I\u01ef\3\2\2\2K\u01f6\3\2\2\2M\u01fd\3\2\2\2O\u0203\3\2"+
		"\2\2Q\u0207\3\2\2\2S\u0215\3\2\2\2U\u021c\3\2\2\2W\u0221\3\2\2\2Y\u022b"+
		"\3\2\2\2[\u0237\3\2\2\2]\u023c\3\2\2\2_\u0241\3\2\2\2a\u0247\3\2\2\2c"+
		"\u024c\3\2\2\2e\u024e\3\2\2\2g\u0250\3\2\2\2i\u0252\3\2\2\2k\u0254\3\2"+
		"\2\2m\u0256\3\2\2\2o\u0258\3\2\2\2q\u025a\3\2\2\2s\u025c\3\2\2\2u\u025e"+
		"\3\2\2\2w\u0260\3\2\2\2y\u0262\3\2\2\2{\u0264\3\2\2\2}\u0266\3\2\2\2\177"+
		"\u0268\3\2\2\2\u0081\u026b\3\2\2\2\u0083\u026e\3\2\2\2\u0085\u0271\3\2"+
		"\2\2\u0087\u0274\3\2\2\2\u0089\u0277\3\2\2\2\u008b\u027d\3\2\2\2\u008d"+
		"\u027f\3\2\2\2\u008f\u0281\3\2\2\2\u0091\u0283\3\2\2\2\u0093\u0285\3\2"+
		"\2\2\u0095\u0287\3\2\2\2\u0097\u0289\3\2\2\2\u0099\u028b\3\2\2\2\u009b"+
		"\u028d\3\2\2\2\u009d\u0290\3\2\2\2\u009f\u0293\3\2\2\2\u00a1\u0296\3\2"+
		"\2\2\u00a3\u0299\3\2\2\2\u00a5\u029c\3\2\2\2\u00a7\u029f\3\2\2\2\u00a9"+
		"\u02a2\3\2\2\2\u00ab\u02a5\3\2\2\2\u00ad\u02a8\3\2\2\2\u00af\u02aa\3\2"+
		"\2\2\u00b1\u02ad\3\2\2\2\u00b3\u02af\3\2\2\2\u00b5\u02b1\3\2\2\2\u00b7"+
		"\u02b4\3\2\2\2\u00b9\u02b8\3\2\2\2\u00bb\u02bb\3\2\2\2\u00bd\u02bf\3\2"+
		"\2\2\u00bf\u02c7\3\2\2\2\u00c1\u02c9\3\2\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7t\2\2"+
		"\u00c8\4\3\2\2\2\u00c9\u00ca\7f\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7c"+
		"\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7g\2\2\u00d1\6\3\2\2\2\u00d2\u00d3\5\t\5\2\u00d3\b"+
		"\3\2\2\2\u00d4\u00e9\7\62\2\2\u00d5\u00d9\4\63;\2\u00d6\u00d8\4\62;\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00e9\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7\62\2\2"+
		"\u00dd\u00df\4\629\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e9\3\2\2\2\u00e2\u00e4\5\13\6\2"+
		"\u00e3\u00e5\5\r\7\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8"+
		"\u00d5\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e9\n\3\2\2\2"+
		"\u00ea\u00eb\7\62\2\2\u00eb\u00ef\7z\2\2\u00ec\u00ed\7\62\2\2\u00ed\u00ef"+
		"\7Z\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\f\3\2\2\2\u00f0"+
		"\u00f1\t\2\2\2\u00f1\16\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3\20\3\2\2\2\u00f4"+
		"\u00f6\4\62;\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fd\5s:\2\u00fa\u00fc"+
		"\4\62;\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0102\5\23"+
		"\n\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0132\3\2\2\2\u0103"+
		"\u0105\5s:\2\u0104\u0106\4\62;\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2"+
		"\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b"+
		"\5\23\n\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0132\3\2\2\2"+
		"\u010c\u010e\4\62;\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0132\5\23\n\2"+
		"\u0112\u0114\4\62;\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0132\3\2\2\2\u0117\u011b\5\13\6\2"+
		"\u0118\u011a\5\r\7\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0126\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0127\3\2\2\2\u011f\u0123\5s:\2\u0120\u0122\5\r\7\2\u0121\u0120\3\2\2"+
		"\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u011f\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\t\4\2\2\u0129\u012b\t\5\2\2\u012a\u0129\3\2"+
		"\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012e\4\62;\2\u012d"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u00f5\3\2\2\2\u0131\u0103\3\2\2\2\u0131"+
		"\u010d\3\2\2\2\u0131\u0113\3\2\2\2\u0131\u0117\3\2\2\2\u0132\22\3\2\2"+
		"\2\u0133\u0135\t\6\2\2\u0134\u0136\t\5\2\2\u0135\u0134\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\4\62;\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\24\3\2\2"+
		"\2\u013c\u013d\t\7\2\2\u013d\26\3\2\2\2\u013e\u013f\t\b\2\2\u013f\30\3"+
		"\2\2\2\u0140\u0141\5\21\t\2\u0141\u0142\5\25\13\2\u0142\32\3\2\2\2\u0143"+
		"\u0145\5\21\t\2\u0144\u0146\5\27\f\2\u0145\u0144\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\34\3\2\2\2\u0147\u014a\7)\2\2\u0148\u014b\5!\21\2\u0149\u014b"+
		"\n\t\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\7)\2\2\u014d\36\3\2\2\2\u014e\u0153\7$\2\2\u014f\u0152\5!\21\2"+
		"\u0150\u0152\n\n\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0157\7$\2\2\u0157 \3\2\2\2\u0158\u0160\7^\2\2\u0159"+
		"\u0161\t\13\2\2\u015a\u015b\4\62\65\2\u015b\u015c\4\629\2\u015c\u0161"+
		"\4\629\2\u015d\u015e\4\629\2\u015e\u0161\4\629\2\u015f\u0161\4\629\2\u0160"+
		"\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\"\3\2\2\2\u0162\u0164\t\f\2\2\u0163\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b\22\2\2\u0168$\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7,\2\2"+
		"\u016b\u016f\3\2\2\2\u016c\u016e\13\2\2\2\u016d\u016c\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0173\7,\2\2\u0173\u0174\7\61\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0176\b\23\2\2\u0176&\3\2\2\2\u0177\u0178\7\61\2\2\u0178\u0179"+
		"\7\61\2\2\u0179\u017d\3\2\2\2\u017a\u017c\n\r\2\2\u017b\u017a\3\2\2\2"+
		"\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0185"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\7\17\2\2\u0181\u0180\3\2\2\2"+
		"\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\7\f\2\2\u0184\u0186"+
		"\7\2\2\3\u0185\u0181\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\b\24\2\2\u0188(\3\2\2\2\u0189\u018a\7d\2\2\u018a\u018b\7t\2\2\u018b"+
		"\u018c\7g\2\2\u018c\u018d\7c\2\2\u018d\u018e\7m\2\2\u018e*\3\2\2\2\u018f"+
		"\u0190\7e\2\2\u0190\u0191\7c\2\2\u0191\u0192\7u\2\2\u0192\u0193\7g\2\2"+
		"\u0193,\3\2\2\2\u0194\u0195\7e\2\2\u0195\u0196\7n\2\2\u0196\u0197\7c\2"+
		"\2\u0197\u0198\7u\2\2\u0198\u0199\7u\2\2\u0199.\3\2\2\2\u019a\u019b\7"+
		"e\2\2\u019b\u019c\7q\2\2\u019c\u019d\7p\2\2\u019d\u019e\7v\2\2\u019e\u019f"+
		"\7k\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7w\2\2\u01a1\u01a2\7g\2\2\u01a2"+
		"\60\3\2\2\2\u01a3\u01a4\7f\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7h\2\2\u01a6"+
		"\u01a7\7c\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7n\2\2\u01a9\u01aa\7v\2\2"+
		"\u01aa\62\3\2\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7n\2\2\u01ad\u01ae\7"+
		"u\2\2\u01ae\u01af\7g\2\2\u01af\64\3\2\2\2\u01b0\u01b1\7h\2\2\u01b1\u01b2"+
		"\7q\2\2\u01b2\u01b3\7t\2\2\u01b3\66\3\2\2\2\u01b4\u01b5\7i\2\2\u01b5\u01b6"+
		"\7q\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7q\2\2\u01b88\3\2\2\2\u01b9\u01ba"+
		"\7k\2\2\u01ba\u01bb\7h\2\2\u01bb:\3\2\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be"+
		"\7o\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7t\2\2\u01c1"+
		"\u01c2\7v\2\2\u01c2<\3\2\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7g\2\2\u01c5"+
		"\u01c6\7y\2\2\u01c6>\3\2\2\2\u01c7\u01c8\7r\2\2\u01c8\u01c9\7c\2\2\u01c9"+
		"\u01ca\7e\2\2\u01ca\u01cb\7m\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7i\2\2"+
		"\u01cd\u01ce\7g\2\2\u01ce@\3\2\2\2\u01cf\u01d0\7r\2\2\u01d0\u01d1\7t\2"+
		"\2\u01d1\u01d2\7k\2\2\u01d2\u01d3\7x\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5"+
		"\7v\2\2\u01d5\u01d6\7g\2\2\u01d6B\3\2\2\2\u01d7\u01d8\7r\2\2\u01d8\u01d9"+
		"\7t\2\2\u01d9\u01da\7q\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7g\2\2\u01dc"+
		"\u01dd\7e\2\2\u01dd\u01de\7v\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7f\2\2"+
		"\u01e0D\3\2\2\2\u01e1\u01e2\7r\2\2\u01e2\u01e3\7w\2\2\u01e3\u01e4\7d\2"+
		"\2\u01e4\u01e5\7n\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7e\2\2\u01e7F\3\2"+
		"\2\2\u01e8\u01e9\7t\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec"+
		"\7q\2\2\u01ec\u01ed\7t\2\2\u01ed\u01ee\7f\2\2\u01eeH\3\2\2\2\u01ef\u01f0"+
		"\7t\2\2\u01f0\u01f1\7g\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7w\2\2\u01f3"+
		"\u01f4\7t\2\2\u01f4\u01f5\7p\2\2\u01f5J\3\2\2\2\u01f6\u01f7\7u\2\2\u01f7"+
		"\u01f8\7y\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7v\2\2\u01fa\u01fb\7e\2\2"+
		"\u01fb\u01fc\7j\2\2\u01fcL\3\2\2\2\u01fd\u01fe\7y\2\2\u01fe\u01ff\7j\2"+
		"\2\u01ff\u0200\7k\2\2\u0200\u0201\7n\2\2\u0201\u0202\7g\2\2\u0202N\3\2"+
		"\2\2\u0203\u0204\7g\2\2\u0204\u0205\7p\2\2\u0205\u0206\7x\2\2\u0206P\3"+
		"\2\2\2\u0207\u0208\7t\2\2\u0208\u0209\7g\2\2\u0209\u020a\7c\2\2\u020a"+
		"\u020b\7e\2\2\u020b\u020c\7v\2\2\u020c\u020d\7k\2\2\u020d\u020e\7x\2\2"+
		"\u020e\u020f\7g\2\2\u020f\u0210\7e\2\2\u0210\u0211\7n\2\2\u0211\u0212"+
		"\7c\2\2\u0212\u0213\7u\2\2\u0213\u0214\7u\2\2\u0214R\3\2\2\2\u0215\u0216"+
		"\7o\2\2\u0216\u0217\7u\2\2\u0217\u0218\7i\2\2\u0218\u0219\7u\2\2\u0219"+
		"\u021a\7t\2\2\u021a\u021b\7x\2\2\u021bT\3\2\2\2\u021c\u021d\7o\2\2\u021d"+
		"\u021e\7c\2\2\u021e\u021f\7k\2\2\u021f\u0220\7p\2\2\u0220V\3\2\2\2\u0221"+
		"\u0222\7u\2\2\u0222\u0223\7v\2\2\u0223\u0224\7c\2\2\u0224\u0225\7v\2\2"+
		"\u0225\u0226\7g\2\2\u0226\u0227\7x\2\2\u0227\u0228\7c\2\2\u0228\u0229"+
		"\7t\2\2\u0229\u022a\7u\2\2\u022aX\3\2\2\2\u022b\u022c\7m\2\2\u022c\u022d"+
		"\7p\2\2\u022d\u022e\7q\2\2\u022e\u022f\7y\2\2\u022f\u0230\7p\2\2\u0230"+
		"\u0231\7t\2\2\u0231\u0232\7g\2\2\u0232\u0233\7d\2\2\u0233\u0234\7g\2\2"+
		"\u0234\u0235\7e\2\2\u0235\u0236\7u\2\2\u0236Z\3\2\2\2\u0237\u0238\7v\2"+
		"\2\u0238\u0239\7j\2\2\u0239\u023a\7k\2\2\u023a\u023b\7u\2\2\u023b\\\3"+
		"\2\2\2\u023c\u023d\7v\2\2\u023d\u023e\7t\2\2\u023e\u023f\7w\2\2\u023f"+
		"\u0240\7g\2\2\u0240^\3\2\2\2\u0241\u0242\7h\2\2\u0242\u0243\7c\2\2\u0243"+
		"\u0244\7n\2\2\u0244\u0245\7u\2\2\u0245\u0246\7g\2\2\u0246`\3\2\2\2\u0247"+
		"\u0248\7p\2\2\u0248\u0249\7w\2\2\u0249\u024a\7n\2\2\u024a\u024b\7n\2\2"+
		"\u024bb\3\2\2\2\u024c\u024d\7*\2\2\u024dd\3\2\2\2\u024e\u024f\7+\2\2\u024f"+
		"f\3\2\2\2\u0250\u0251\7}\2\2\u0251h\3\2\2\2\u0252\u0253\7\177\2\2\u0253"+
		"j\3\2\2\2\u0254\u0255\7]\2\2\u0255l\3\2\2\2\u0256\u0257\7_\2\2\u0257n"+
		"\3\2\2\2\u0258\u0259\7=\2\2\u0259p\3\2\2\2\u025a\u025b\7.\2\2\u025br\3"+
		"\2\2\2\u025c\u025d\7\60\2\2\u025dt\3\2\2\2\u025e\u025f\7?\2\2\u025fv\3"+
		"\2\2\2\u0260\u0261\7#\2\2\u0261x\3\2\2\2\u0262\u0263\7\u0080\2\2\u0263"+
		"z\3\2\2\2\u0264\u0265\7A\2\2\u0265|\3\2\2\2\u0266\u0267\7<\2\2\u0267~"+
		"\3\2\2\2\u0268\u0269\7?\2\2\u0269\u026a\7?\2\2\u026a\u0080\3\2\2\2\u026b"+
		"\u026c\7(\2\2\u026c\u026d\7(\2\2\u026d\u0082\3\2\2\2\u026e\u026f\7~\2"+
		"\2\u026f\u0270\7~\2\2\u0270\u0084\3\2\2\2\u0271\u0272\7-\2\2\u0272\u0273"+
		"\7-\2\2\u0273\u0086\3\2\2\2\u0274\u0275\7/\2\2\u0275\u0276\7/\2\2\u0276"+
		"\u0088\3\2\2\2\u0277\u0278\7u\2\2\u0278\u0279\7w\2\2\u0279\u027a\7r\2"+
		"\2\u027a\u027b\7g\2\2\u027b\u027c\7t\2\2\u027c\u008a\3\2\2\2\u027d\u027e"+
		"\7-\2\2\u027e\u008c\3\2\2\2\u027f\u0280\7/\2\2\u0280\u008e\3\2\2\2\u0281"+
		"\u0282\7,\2\2\u0282\u0090\3\2\2\2\u0283\u0284\7\61\2\2\u0284\u0092\3\2"+
		"\2\2\u0285\u0286\7(\2\2\u0286\u0094\3\2\2\2\u0287\u0288\7~\2\2\u0288\u0096"+
		"\3\2\2\2\u0289\u028a\7`\2\2\u028a\u0098\3\2\2\2\u028b\u028c\7\'\2\2\u028c"+
		"\u009a\3\2\2\2\u028d\u028e\7-\2\2\u028e\u028f\7?\2\2\u028f\u009c\3\2\2"+
		"\2\u0290\u0291\7/\2\2\u0291\u0292\7?\2\2\u0292\u009e\3\2\2\2\u0293\u0294"+
		"\7,\2\2\u0294\u0295\7?\2\2\u0295\u00a0\3\2\2\2\u0296\u0297\7\61\2\2\u0297"+
		"\u0298\7?\2\2\u0298\u00a2\3\2\2\2\u0299\u029a\7(\2\2\u029a\u029b\7?\2"+
		"\2\u029b\u00a4\3\2\2\2\u029c\u029d\7~\2\2\u029d\u029e\7?\2\2\u029e\u00a6"+
		"\3\2\2\2\u029f\u02a0\7`\2\2\u02a0\u02a1\7?\2\2\u02a1\u00a8\3\2\2\2\u02a2"+
		"\u02a3\7\u0080\2\2\u02a3\u02a4\7?\2\2\u02a4\u00aa\3\2\2\2\u02a5\u02a6"+
		"\7\'\2\2\u02a6\u02a7\7?\2\2\u02a7\u00ac\3\2\2\2\u02a8\u02a9\7B\2\2\u02a9"+
		"\u00ae\3\2\2\2\u02aa\u02ab\7#\2\2\u02ab\u02ac\7?\2\2\u02ac\u00b0\3\2\2"+
		"\2\u02ad\u02ae\7@\2\2\u02ae\u00b2\3\2\2\2\u02af\u02b0\7>\2\2\u02b0\u00b4"+
		"\3\2\2\2\u02b1\u02b2\7>\2\2\u02b2\u02b3\7>\2\2\u02b3\u00b6\3\2\2\2\u02b4"+
		"\u02b5\7>\2\2\u02b5\u02b6\7>\2\2\u02b6\u02b7\7?\2\2\u02b7\u00b8\3\2\2"+
		"\2\u02b8\u02b9\7@\2\2\u02b9\u02ba\7@\2\2\u02ba\u00ba\3\2\2\2\u02bb\u02bc"+
		"\7@\2\2\u02bc\u02bd\7@\2\2\u02bd\u02be\7?\2\2\u02be\u00bc\3\2\2\2\u02bf"+
		"\u02c4\5\u00bf`\2\u02c0\u02c3\5\u00bf`\2\u02c1\u02c3\5\u00c1a\2\u02c2"+
		"\u02c0\3\2\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c4\u02c5\3\2\2\2\u02c5\u00be\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02c8\t\16\2\2\u02c8\u00c0\3\2\2\2\u02c9\u02ca\t\17\2\2\u02ca\u00c2\3"+
		"\2\2\2#\2\u00d9\u00e0\u00e6\u00e8\u00ee\u00f7\u00fd\u0101\u0107\u010a"+
		"\u010f\u0115\u011b\u0123\u0126\u012a\u012f\u0131\u0135\u013a\u0145\u014a"+
		"\u0151\u0153\u0160\u0165\u016f\u017d\u0181\u0185\u02c2\u02c4\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}