import java.util.*;

public class CodeSmellsManager {
    ArrayList<CodeSmell> codeSmells = new ArrayList<>();
    ArrayList<Integer> enableSmells;
    CodeSmellsManager(ArrayList<Integer> _enableSmells) {
        enableSmells = _enableSmells;
    }
    CodeSmellsManager() {
        enableSmells = new ArrayList<>();
    }
    private boolean isInside(ArrayList<CodeSmell> array, CodeSmell element) {
        for(int i = 0; i < array.size(); i ++) {
            CodeSmell ele = array.get(i);
            if (ele.column == element.column &&
                ele.line == element.line &&
                ele.type == element.type ) {

                return true;
            }
        }
        return false;
    }

    public void AddCodeSmell(SMELL type, int line, int column, String message) {
        CodeSmell codeSmell = new CodeSmell();
        codeSmell.type = type;
        codeSmell.line = line;
        codeSmell.column = column;
        codeSmell.message = message;


        if (!isInside(codeSmells, codeSmell)  && (enableSmells.size() < 1 ||  isEnabled(codeSmell))) {
            codeSmells.add(codeSmell);
        }
    }
    public void Print() {
        String result = "";
        for(int i = 0; i < codeSmells.size(); i ++) {
            CodeSmell smell = codeSmells.get(i);
            result += smell.message; 
        }
        result += "\n"; 
   

        System.out.println(result);
    }


    private boolean isEnabled(CodeSmell smell) {

        if (smell.type == SMELL.MultipleReturn && enableSmells.contains(1)) {
            return true;
        }
        if (smell.type == SMELL.ExtremeChains && enableSmells.contains(2)) {
            return true;
        }
        if (smell.type == SMELL.DeadCodeReturn && enableSmells.contains(3)) {
            return true;
        }
        if (smell.type == SMELL.FunctionsNotCalled && enableSmells.contains(4)) {
            return true;
        }
        if (smell.type == SMELL.ReturnInLoop && enableSmells.contains(5)) {
            return true;
        }
  
        return false;
    }
}
