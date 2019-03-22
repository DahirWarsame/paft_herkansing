package com.company.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;

public class SentenceParser {

    private String sentence;

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public boolean parseSentence() {
        ANTLRInputStream input = new ANTLRInputStream(sentence.toLowerCase());

        zinsopbouwLexer lexer = new zinsopbouwLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        zinsopbouwParser parser = new zinsopbouwParser(tokens);

        parser.eenvoudigezin();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            System.out.println("Deze zin is correct");
            return true;
        } else {
            System.out.println("Deze zin is foutive");
            return false;
        }

    }

    public String getLidwoord() {
        ANTLRInputStream input = new ANTLRInputStream(sentence.toLowerCase());

        zinsopbouwLexer lexer = new zinsopbouwLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        zinsopbouwParser parser = new zinsopbouwParser(tokens);

        return parser.lidwoord().getText();
    }

    public String getZelfstandigNaamwoord() {
        ANTLRInputStream input = new ANTLRInputStream(sentence.toLowerCase());

        zinsopbouwLexer lexer = new zinsopbouwLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        zinsopbouwParser parser = new zinsopbouwParser(tokens);

        return parser.zelfstandig_naamwoord().toString();
    }

    public String getWerkwoordelijkDeel() {
        CharStream input = CharStreams.fromString(sentence.toLowerCase());

        zinsopbouwLexer lexer = new zinsopbouwLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        zinsopbouwParser parser = new zinsopbouwParser(tokens);

        int a = parser.eenvoudigezin().start.getStartIndex();
        int b = parser.eenvoudigezin().stop.getStopIndex();
        Interval interval = new Interval(a, b);
        ParseTree tree = parser.eenvoudigezin();

        //show AST in console
        System.out.println(tree.toStringTree(parser));
        return input.getText(interval);
    }
//    public String sourceTextForContext(ParseTree context) {
//        Token startToken = (context.start instanceof TerminalNode) ? (TerminalNode)(start).getSymbol() : (ParserRuleContext)(start).start;
//        Token stopToken = (context.stop instanceof TerminalNode) ? (TerminalNode)(stop).getSymbol() : (ParserRuleContext)(stop).start;
//
//        CharStream cs = start.getTokenSource().getInputStream();
//        int stopIndex = stop != null ? stop.getStopIndex() : -1;
//        return cs.getText(new Interval(start.getStartIndex(), stopIndex));
//    }
}
