// Generated from AP1.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AP1Parser}.
 */
public interface AP1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AP1Parser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(AP1Parser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(AP1Parser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link AP1Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(AP1Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(AP1Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link AP1Parser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(AP1Parser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(AP1Parser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link AP1Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(AP1Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(AP1Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link AP1Parser#hop}.
	 * @param ctx the parse tree
	 */
	void enterHop(AP1Parser.HopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#hop}.
	 * @param ctx the parse tree
	 */
	void exitHop(AP1Parser.HopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AP1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AP1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AP1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AP1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AP1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AP1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AP1Parser.TermContext ctx);
}