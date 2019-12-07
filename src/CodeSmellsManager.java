import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class CodeSmellsManager {
    ArrayList<CodeSmell> codeSmells = new ArrayList<>();
    ArrayList<Integer> enableSmells;
    SMELL[] smellsList = {SMELL.MultipleReturn,SMELL.ExtremeChains,SMELL.DeadCodeReturn,SMELL.FunctionsNotCalled,SMELL.ReturnInLoop,SMELL.LongConditionals,SMELL.MethodTooLong,SMELL.IdTooLong,SMELL.DeeplyNestedCode};
    String[] names ={"1. MULTIPLES SENTENCIAS RETURN","2. CADENAS DE LLAMADOS DE METODOS MUY LARGAS","3. CODIGO MUERTO","4. FUNCIONES NO LLAMADAS","5. SENTENCIAS RETURN DENTRO DE ESTRUCTURAS DE BUCLE","6. CONDICIONALES MUY LARGOS","7. METODOS DEMASIADO LARGOS Y COMPLEJOS","8. IDENTIFICADORES MUY LARGOS","9. CODIGO PROFUNDAMENTE ANIDADO"};
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

   

    public void Menu(ArrayList<Integer> userinput){

        ToHTML htmlcode = new ToHTML(userinput,codeSmells);
        htmlcode.createHTML();


        System.out.println("Se han encontrado "+ codeSmells.size()+" malos olores.");
        Date objDate = new Date();
        String text = "REPORTE DE MALOS OLORES \n";
        String strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        text += "Generado el " + objSDF.format(objDate).toString() + "\n\n\n";
        boolean flag = false;
        for(int element : userinput){
            flag = false;
            text += names[(element - 1)] + "\n";
            text += "-------------------------------------------------------------------------------------------- \n";
                for(CodeSmell smell : codeSmells){

                   if(smell.type == smellsList[element-1] ){
                       text += smell.message+"\n";
                       flag = true;
                   }
                }
                if (!flag){
                    text += "No se han encontrado malos olores de este tipo \n \n";
                }
                text += "\n\n\n\n\n";
        }
        try (FileWriter writer = new FileWriter("report.txt");
		 BufferedWriter bw = new BufferedWriter(writer)) {

		    bw.write(text);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        
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
        if (smell.type == SMELL.LongConditionals && enableSmells.contains(6)) {
            return true;
        }
        if (smell.type == SMELL.MethodTooLong && enableSmells.contains(7)) {
            return true;
        }
        if (smell.type == SMELL.IdTooLong && enableSmells.contains(8)) {
            return true;
        }
        if (smell.type == SMELL.DeeplyNestedCode && enableSmells.contains(9)) {
            return true;
        }

        return false;
    }
}
