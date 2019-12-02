import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

public class VisitorRuby<T> extends RubyParserBaseVisitor<T> {
    public CodeSmellsManager manager;
    VisitorRuby(ArrayList<Integer> _enableSmells) {
        manager = new CodeSmellsManager(_enableSmells);
    }
    VisitorRuby() {
        manager = new CodeSmellsManager();
    }


}