// Generated from D:/Users/dahir/Documents/Hu/Jaar3/Blok C/PAFR/pafr_herkansing_translater/src/main/java/com/company/antlr\zinsopbouw.g4 by ANTLR 4.7.2
package com.company.antlr;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link zinsopbouwVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class zinsopbouwBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements zinsopbouwVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEenvoudigezin(zinsopbouwParser.EenvoudigezinContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNaamwoordelijk_deel(zinsopbouwParser.Naamwoordelijk_deelContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitZelfstandig_naamwoord(zinsopbouwParser.Zelfstandig_naamwoordContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLidwoord(zinsopbouwParser.LidwoordContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWerkwoordelijk_deel(zinsopbouwParser.Werkwoordelijk_deelContext ctx) { return visitChildren(ctx); }
}