package at.example;// Generated from Signal.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SignalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SignalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SignalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SignalParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SignalParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute(SignalParser.RouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#parenthesis_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis_expr(SignalParser.Parenthesis_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SignalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#weather_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeather_condition(SignalParser.Weather_conditionContext ctx);
}