package at.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) {

        String testString = "d4 ^ (w2 v f3 v t3 v r3 v a2)";
        String jsonDataPath = "data/signals.json";
        CharStream inputStream = CharStreams.fromString(testString);

        SignalLexer lexer = new SignalLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SignalParser parser = new SignalParser(tokenStream);

        SignalParser.ProgContext ctx = parser.prog();
        CustomSignalVisitor visitor = new CustomSignalVisitor();
        visitor.visit(ctx);

        System.out.println(visitor.outputJson);
    }
}