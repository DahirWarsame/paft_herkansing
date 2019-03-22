// Generated from D:/Users/dahir/Documents/Hu/Jaar3/Blok C/PAFR/pafr_herkansing_translater/src/main/java/com/company/antlr\zinsopbouw.g4 by ANTLR 4.7.2
package com.company.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link zinsopbouwParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface zinsopbouwVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link zinsopbouwParser#eenvoudigezin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEenvoudigezin(zinsopbouwParser.EenvoudigezinContext ctx);
	/**
	 * Visit a parse tree produced by {@link zinsopbouwParser#naamwoordelijk_deel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaamwoordelijk_deel(zinsopbouwParser.Naamwoordelijk_deelContext ctx);
	/**
	 * Visit a parse tree produced by {@link zinsopbouwParser#zelfstandig_naamwoord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZelfstandig_naamwoord(zinsopbouwParser.Zelfstandig_naamwoordContext ctx);
	/**
	 * Visit a parse tree produced by {@link zinsopbouwParser#lidwoord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLidwoord(zinsopbouwParser.LidwoordContext ctx);
	/**
	 * Visit a parse tree produced by {@link zinsopbouwParser#werkwoordelijk_deel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWerkwoordelijk_deel(zinsopbouwParser.Werkwoordelijk_deelContext ctx);
}