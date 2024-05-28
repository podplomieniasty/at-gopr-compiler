package at.example;// Generated from Signal.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SignalParser}.
 */
public interface SignalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SignalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SignalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SignalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SignalParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SignalParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#route}.
	 * @param ctx the parse tree
	 */
	void enterRoute(SignalParser.RouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#route}.
	 * @param ctx the parse tree
	 */
	void exitRoute(SignalParser.RouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#parenthesis_expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis_expr(SignalParser.Parenthesis_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#parenthesis_expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis_expr(SignalParser.Parenthesis_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SignalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SignalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#weather_condition}.
	 * @param ctx the parse tree
	 */
	void enterWeather_condition(SignalParser.Weather_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#weather_condition}.
	 * @param ctx the parse tree
	 */
	void exitWeather_condition(SignalParser.Weather_conditionContext ctx);
}