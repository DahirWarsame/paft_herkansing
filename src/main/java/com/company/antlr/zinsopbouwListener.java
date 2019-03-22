// Generated from D:/Users/dahir/Documents/Hu/Jaar3/Blok C/PAFR/pafr_herkansing_translater/src/main/java/com/company/antlr\zinsopbouw.g4 by ANTLR 4.7.2
package com.company.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link zinsopbouwParser}.
 */
public interface zinsopbouwListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link zinsopbouwParser#eenvoudigezin}.
	 * @param ctx the parse tree
	 */
	void enterEenvoudigezin(zinsopbouwParser.EenvoudigezinContext ctx);
	/**
	 * Exit a parse tree produced by {@link zinsopbouwParser#eenvoudigezin}.
	 * @param ctx the parse tree
	 */
	void exitEenvoudigezin(zinsopbouwParser.EenvoudigezinContext ctx);
	/**
	 * Enter a parse tree produced by {@link zinsopbouwParser#naamwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void enterNaamwoordelijk_deel(zinsopbouwParser.Naamwoordelijk_deelContext ctx);
	/**
	 * Exit a parse tree produced by {@link zinsopbouwParser#naamwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void exitNaamwoordelijk_deel(zinsopbouwParser.Naamwoordelijk_deelContext ctx);
	/**
	 * Enter a parse tree produced by {@link zinsopbouwParser#zelfstandig_naamwoord}.
	 * @param ctx the parse tree
	 */
	void enterZelfstandig_naamwoord(zinsopbouwParser.Zelfstandig_naamwoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link zinsopbouwParser#zelfstandig_naamwoord}.
	 * @param ctx the parse tree
	 */
	void exitZelfstandig_naamwoord(zinsopbouwParser.Zelfstandig_naamwoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link zinsopbouwParser#lidwoord}.
	 * @param ctx the parse tree
	 */
	void enterLidwoord(zinsopbouwParser.LidwoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link zinsopbouwParser#lidwoord}.
	 * @param ctx the parse tree
	 */
	void exitLidwoord(zinsopbouwParser.LidwoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link zinsopbouwParser#werkwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void enterWerkwoordelijk_deel(zinsopbouwParser.Werkwoordelijk_deelContext ctx);
	/**
	 * Exit a parse tree produced by {@link zinsopbouwParser#werkwoordelijk_deel}.
	 * @param ctx the parse tree
	 */
	void exitWerkwoordelijk_deel(zinsopbouwParser.Werkwoordelijk_deelContext ctx);
}