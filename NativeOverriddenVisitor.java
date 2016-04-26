import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NativeOverriddenVisitor extends SwiftBaseVisitor<String> {

    @Override protected String aggregateResult(String aggregate, String nextResult) {
        return aggregate + nextResult;
    }

    @Override protected String defaultResult() {
        return "";
    }

    @Override public String visitChildren(RuleNode node) {
        return visitChildren(node, 0, 0);
    }

    public String visitChildren(RuleNode node, int skipStart, int skipEnd) {
        String result = this.defaultResult();
        int n = node.getChildCount() - skipEnd;

        for(int i = skipStart; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            String childResult = c instanceof TerminalNode ? printTerminalNode((TerminalNode) c) : c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    protected String printTerminalNode(TerminalNode c) {
        String text = c.getText();
        if(text.equals("<EOF>")) {
            return "";
        }
        else if(text.equals("let")) {
            return "const ";
        }
        else if(text.equals("print")) {
            return "console.log ";
        }
        else if(text.equals("func")) {
            return "function ";
        }
        else if(text.equals(".")) {
            return ".";
        }
        return text + " ";
    }
};