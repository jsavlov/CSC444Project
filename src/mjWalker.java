import org.antlr.v4.runtime.tree.ErrorNode;

public class mjWalker extends mjgrammarBaseListener {

    @Override
    public void enterGoal(mjgrammarParser.GoalContext ctx) {
        super.enterGoal(ctx);

        System.out.println("Entering goal...");
    }

    @Override
    public void exitGoal(mjgrammarParser.GoalContext ctx) {
        super.exitGoal(ctx);

        System.out.println("Exiting goal...");
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);

        System.out.println("Hit an error node...");
    }
}
