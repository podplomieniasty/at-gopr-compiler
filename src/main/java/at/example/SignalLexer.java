package at.example;// Generated from Signal.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SignalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WEATHER=3, DIFFICULTY=4, AVALANCHE=5, DIFFICULTY_LEVEL=6, 
		WEATHER_LEVEL=7, AVALANCHE_LEVEL=8, AND=9, OTHER=10, WS=11, NEWLINE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "W", "F", "T", "R", "A", "D", "WEATHER", "DIFFICULTY", 
			"AVALANCHE", "DIFFICULTY_LEVEL", "WEATHER_LEVEL", "AVALANCHE_LEVEL", 
			"AND", "OTHER", "WS", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, null, null, "'^'", "'v'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WEATHER", "DIFFICULTY", "AVALANCHE", "DIFFICULTY_LEVEL", 
			"WEATHER_LEVEL", "AVALANCHE_LEVEL", "AND", "OTHER", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SignalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "at/example/Signal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\5\n<\n\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6\22Q\n\22\r\22\16\22"+
		"R\3\22\3\22\3\23\5\23X\n\23\3\23\3\23\6\23\\\n\23\r\23\16\23]\2\2\24\3"+
		"\3\5\4\7\2\t\2\13\2\r\2\17\2\21\2\23\5\25\6\27\7\31\b\33\t\35\n\37\13"+
		"!\f#\r%\16\3\2\f\4\2YYyy\4\2HHhh\4\2VVvv\4\2TTtt\4\2CCcc\4\2FFff\3\2\63"+
		"\66\3\2\63\65\3\2\63\67\5\2\13\f\17\17\"\"\2_\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)"+
		"\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2"+
		"\21\65\3\2\2\2\23;\3\2\2\2\25?\3\2\2\2\27B\3\2\2\2\31E\3\2\2\2\33G\3\2"+
		"\2\2\35I\3\2\2\2\37K\3\2\2\2!M\3\2\2\2#P\3\2\2\2%[\3\2\2\2\'(\7*\2\2("+
		"\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\t\2\2\2,\b\3\2\2\2-.\t\3\2\2.\n\3\2\2"+
		"\2/\60\t\4\2\2\60\f\3\2\2\2\61\62\t\5\2\2\62\16\3\2\2\2\63\64\t\6\2\2"+
		"\64\20\3\2\2\2\65\66\t\7\2\2\66\22\3\2\2\2\67<\5\7\4\28<\5\t\5\29<\5\13"+
		"\6\2:<\5\r\7\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=>\5"+
		"\33\16\2>\24\3\2\2\2?@\5\21\t\2@A\5\31\r\2A\26\3\2\2\2BC\5\17\b\2CD\5"+
		"\35\17\2D\30\3\2\2\2EF\t\b\2\2F\32\3\2\2\2GH\t\t\2\2H\34\3\2\2\2IJ\t\n"+
		"\2\2J\36\3\2\2\2KL\7`\2\2L \3\2\2\2MN\7x\2\2N\"\3\2\2\2OQ\t\13\2\2PO\3"+
		"\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\22\2\2U$\3\2\2\2VX"+
		"\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y\\\7\f\2\2Z\\\7\17\2\2[W\3\2\2"+
		"\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^&\3\2\2\2\b\2;RW[]\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}