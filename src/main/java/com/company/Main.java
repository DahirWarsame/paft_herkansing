package com.company;

import com.company.antlr.SentenceParser;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    /**
     * main method - build the interpreter
     * and then interpret a specific sequence
     *
     * @param args
     */
    public static void main(String[] args) {
        while (true) {

            //Systeem vraagt om Input. een zin
            System.out.println("Enter your sentence: ");
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine().toLowerCase().trim();

            SentenceParser parser = new SentenceParser();
            parser.setSentence(sentence);

            // Dit checkt of de zin klopt
            if (parser.parseSentence()) {

                System.out.println("...Translating...");

                String[] parts = sentence.split(" ");
                StringJoiner result = new StringJoiner(" ");

                for (String part : parts) {
                    switch (part) {
                        case "de":
                            result.add(getLidwoordTranslation().interpret("de"));
                            break;
                        case "het":
                            result.add(getLidwoordTranslation().interpret("het"));
                            break;
                        case "een":
                            result.add(getLidwoordTranslation().interpret("een"));
                            break;
                        case "brood":
                            result.add(getZelfstandigNaamwoordTranslation().interpret("brood"));
                            break;
                        case "man":
                            result.add(getZelfstandigNaamwoordTranslation().interpret("man"));
                            break;
                        case "boer":
                            result.add(getZelfstandigNaamwoordTranslation().interpret("boer"));
                            break;
                        case "laat":
                            result.add(getWerkwoordelijkDeelTranslation().interpret("laat"));
                            break;
                        case "eet":
                            result.add(getWerkwoordelijkDeelTranslation().interpret("eet"));
                            break;
                        case "koopt":
                            result.add(getWerkwoordelijkDeelTranslation().interpret("koopt"));
                            break;
                        case "snijdt":
                            result.add(getWerkwoordelijkDeelTranslation().interpret("snijdt"));
                            break;
                        default:
                    }

                }

                System.out.println("End result: " + result);
            }
        }
    }

    /**
     * vertaalt de volgende worden
     * de, het of een
     *
     * @return string
     */
    private static Expression getLidwoordTranslation() {
        Expression terExp1 = new TerminalExpression("de", "The");
        Expression terExp2 = new TerminalExpression("het", "The");
        Expression terExp3 = new TerminalExpression("een", "a");

        Expression alt = new OrRegelWoorden(terExp1, terExp2);

        return new OrRegelWoorden(terExp3, alt); //een of (het of de)
    }

    /**
     * vertaalt de volgende worden
     * brood, man, boer
     *
     * @return string
     */
    private static Expression getZelfstandigNaamwoordTranslation() {
        // Zelfstandige naamwoorden
        Expression terExp1 = new TerminalExpression("brood", "bread");
        Expression terExp2 = new TerminalExpression("man", "man");
        Expression terExp3 = new TerminalExpression("boer", "farmer");

        Expression alt = new OrRegelWoorden(terExp2, terExp3);  // man of boer

        return new OrRegelWoorden(terExp1, alt); //brood of (man of boer)
    }

    /**
     * vertaalt de volgende worden
     * laat, eet, koopt, snijdt
     *
     * @return string
     */
    private static Expression getWerkwoordelijkDeelTranslation() {
        //Werkwoordelijk deel
        Expression terExp1 = new TerminalExpression("laat", "lets");
        Expression terExp2 = new TerminalExpression("eet", "eats");
        Expression terExp3 = new TerminalExpression("koopt", "buys");
        Expression terExp4 = new TerminalExpression("snijdt", "cuts");//eet of koopt

        Expression ww_alt1 = new OrRegelWoorden(terExp2, terExp3);
        Expression ww_alt2 = new OrRegelWoorden(terExp1, ww_alt1);


        return new OrRegelWoorden(terExp4, ww_alt2);//snijdt of (laat of (eet of koopt))
    }

}