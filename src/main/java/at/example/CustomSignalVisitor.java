package at.example;

import at.example.enums.DifficultyCategory;

public class CustomSignalVisitor extends SignalBaseVisitor<String> {

    public CustomSignalJSON outputJson = new CustomSignalJSON();

    @Override
    public String visitProg(SignalParser.ProgContext ctx) {
        //if(!(ctx.parent instanceof SignalParser.ProgContext)) return null;
        return visitChildren(ctx);
    }

    @Override
    public String visitLine(SignalParser.LineContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitRoute(SignalParser.RouteContext ctx) {

        System.out.println(ctx.DIFFICULTY().getText());
        int diffValue = Integer.parseInt(ctx.DIFFICULTY().getText().substring(1));
        outputJson.difficulty = DifficultyCategory.values()[diffValue-1];
        return visitChildren(ctx);

    }

    @Override
    public String visitParenthesis_expr(SignalParser.Parenthesis_exprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitExpr(SignalParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitWeather_condition(SignalParser.Weather_conditionContext ctx) {
        if(ctx.parent instanceof SignalParser.ExprContext) {
            String elem = ctx.getText().substring(0, 1).toUpperCase();
            int value = Integer.parseInt(ctx.getText().substring(1));
            if(outputJson.weatherConditions.get(elem) < value)
                outputJson.weatherConditions.put(elem, value);
            return visitChildren(ctx);
        }
        return null;
    }
}
