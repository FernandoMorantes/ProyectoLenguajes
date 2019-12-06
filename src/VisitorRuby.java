import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

class FunctionCreated {
    public String name;
    public int line;
    public int column;

    public FunctionCreated(String name, int line, int column){
        this.name = name;
        this.line = line;
        this.column = column;
    }
}
public class VisitorRuby<T> extends RubyBaseVisitor<T> {
    public static int returnsCounter;
    public static int chainsCounter;
    public static int conditionalsVariableCounter;
    public static int conditionalsCounter;
    public static int ifstatementCounter;
    public static int returnsFunctionLine;
    public static int returnsFunctionColumn;
    public static String returnsFunctionName;
    public static String conditionalVariable;
    public static ArrayList<FunctionCreated> functionsCreated = new ArrayList<FunctionCreated>();
    public static ArrayList<String> varDeclarated = new ArrayList<String>();
    public CodeSmellsManager manager;
    public static int methodStartLine;
    public static int methodStartColumn;
    public static int methodFinalLine;
    public static int maxMethodLongitude = 100;
    VisitorRuby(ArrayList<Integer> _enableSmells) {
        manager = new CodeSmellsManager(_enableSmells);
    }
    VisitorRuby() {
        manager = new CodeSmellsManager();
    }

    @Override public T visitFunction_definition_header(RubyParser.Function_definition_headerContext ctx) {
        returnsCounter = 0;
        returnsFunctionLine = ctx.start.getLine();
        returnsFunctionColumn = ctx.start.getCharPositionInLine();
        methodStartLine = ctx.start.getLine();
        methodStartColumn = ctx.start.getCharPositionInLine();
        returnsFunctionName = ctx.getChild(1).getChild(0).getChild(0).toString();
        FunctionCreated func = new FunctionCreated(returnsFunctionName, returnsFunctionLine, returnsFunctionColumn);
        functionsCreated.add(func);

        ifstatementCounter = 0;
        
        return visitChildren(ctx);
    }


    @Override
    public T visitReturn_statement(RubyParser.Return_statementContext ctx) {
        if(returnsCounter == 0 ){
            returnsCounter += 1;
        }else{
            returnsCounter += 1;
            RuleContext StmtCtx = ctx.parent.parent.parent.parent;
            if(StmtCtx.equals("class RubyParser$Function_if_statementContext") ||
                StmtCtx.getClass().toString().equals("class RubyParser$Function_definitionContext") ||
                StmtCtx.getClass().toString().equals("class RubyParser$Function_if_elsif_statementContext") ||
                StmtCtx.getClass().toString().equals("class RubyParser$Function_definitionContext") ||
                StmtCtx.getClass().toString().equals("class RubyParser$Function_unless_statementContext") ||
                StmtCtx.parent.getClass().toString().equals("class RubyParser$Function_unless_statementContext") ||
                StmtCtx.parent.getClass().toString().equals("class RubyParser$Function_if_elsif_statementContext")){
                int line = ctx.start.getLine();
                int column = ctx.start.getCharPositionInLine();
                String message = "\nMal olor en la funcion: \'" + returnsFunctionName + "\' en Linea: "+ returnsFunctionLine + ", Columna: " + returnsFunctionColumn + 
                                    "\nSe encontraron multiples returns, primer return multiple Linea: "+ line +" Columna: " + column + "\n"
                                    + "Se recomienda crear una variable unica a retornar y asignarle a esto los valores que se pensaban retornar, posteriormente retornar esta variable al final de la funcion\n";

                manager.AddCodeSmell(SMELL.MultipleReturn, line, column, message);

            }
        }
        String StmtCtx = ctx.parent.parent.parent.parent.getClass().toString();
        if(StmtCtx.equals("class RubyParser$Function_while_statementContext")){
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message ="\nMal olor encontrado, return dentro de una estructura de bucle en Linea : " + line + " Columna " + column + "\n"
                        + "Se recomienda no tener returns en estructuras de bucle, declare una variable donde guarde el resultado que desea y retornelo fuera de la estructura.\n";
            manager.AddCodeSmell(SMELL.ReturnInLoop, line, column, message);
        }

        if(StmtCtx.equals("class RubyParser$Function_for_statementContext")){
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message ="\nMal olor encontrado, return dentro de una estructura de bucle en Linea : " + line + " Columna " + column + "\n"
                        + "Se recomienda no tener returns en estructuras de bucle, declare una variable donde guarde el resultado que desea y retornelo fuera de la estructura.\n";
            manager.AddCodeSmell(SMELL.ReturnInLoop, line, column, message);
        }
        // else if(StmtCtx.equals("class RubyParser$If_elsif_statementContext")){
        //     System.out.println("elsif");
        // }        
        String inFunction = ctx.parent.parent.parent.getClass().toString();
        //System.out.println(inFunction);
        if(!(inFunction.equals("class RubyParser$Function_statement_bodyContext") ||
                inFunction.equals("class RubyParser$Function_definition_bodyContext"))){
            int line = ctx.start.getLine()+1;
            int column = ctx.start.getCharPositionInLine();
            String message ="\nMal olor encontrado, codigo inalcanzable en Linea: " + line + " Columna " + column + "\n"
                        + "Se recomienda mover o eliminar el codigo que se encuentra despues del return.\n";
            manager.AddCodeSmell(SMELL.DeadCodeReturn, line, column, message);
        }

        return super.visitChildren(ctx);
    }

    @Override public T visitUnless_statement(RubyParser.Unless_statementContext ctx) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedStatement(ctx, line, column);
        return super.visitChildren(ctx); 
    }

    @Override public T visitWhile_statement(RubyParser.While_statementContext ctx) { 
       
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedStatement(ctx, line, column);
        return  super.visitChildren(ctx); 
    }

    @Override public T visitFor_statement(RubyParser.For_statementContext ctx) { 

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedStatement(ctx, line, column);
        return super.visitChildren(ctx); 
    }

    @Override public T  visitFunction_unless_statement(RubyParser.Function_unless_statementContext ctx) {

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedFunctionStatement(ctx, line, column);
        return super.visitChildren(ctx); 
    }

    @Override public T visitFunction_while_statement(RubyParser.Function_while_statementContext ctx) { 
       
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedFunctionStatement(ctx, line, column);
        return  super.visitChildren(ctx); 
    }

    @Override public T visitFunction_for_statement(RubyParser.Function_for_statementContext ctx) { 

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedFunctionStatement(ctx, line, column);
        return super.visitChildren(ctx); 
    }


    @Override
    public T visitExpression(RubyParser.ExpressionContext ctx) {
        if((ctx.getChild(0).getClass().toString()).equals("class RubyParser$Function_chainContext")){
            chainsCounter = 0;
          }
        return super.visitChildren(ctx);
    }
    @Override public T visitLvalue(RubyParser.LvalueContext ctx) {
        String id = ctx.getChild(0).getChild(0).toString();
        if(!varDeclarated.contains(id)){
            varDeclarated.add(id);

            if(id.length() > 10){
                 int line = ctx.start.getLine();
                 int column = ctx.start.getCharPositionInLine();
                  String message = "\nMal olor encontrado, el nombre de la variable " + id+ " es muy largo linea: " + line + " Columna: " + column + "\n"
                                + "Se recomienda cambiar este identificador por uno mas sencillo, esto hara el codigo mas legible\n";
                  manager.AddCodeSmell(SMELL.IdTooLong, line, column, message);

            }
        }

        return super.visitChildren(ctx);
    }

    @Override public T visitFunction_name(RubyParser.Function_nameContext ctx) {
        if((ctx.getParent().getClass().toString()).equals("class RubyParser$Function_definition_headerContext")){
            String id = ctx.getChild(0).getChild(0).toString();
            if(id.length() > 10){
                int line = ctx.start.getLine();
                int column = ctx.start.getCharPositionInLine();
                String message = "\nMal olor encontrado, el nombre de la funcion " + id+ " es muy largo linea: " + line + " Columna: " + column + "\n"
                        + "Se recomienda cambiar este identificador por uno mas sencillo, esto hara el codigo mas legible\n";
                manager.AddCodeSmell(SMELL.IdTooLong, line, column, message);

            }
        }
        return super.visitChildren(ctx);
    }

    @Override
    public T visitExpression_list(RubyParser.Expression_listContext ctx) {
        ifstatementCounter = 0;
        return visitChildren(ctx);
    }

    @Override
    public T visitFunction_chain(RubyParser.Function_chainContext ctx) {
        if(chainsCounter < 5){
            chainsCounter += 1;
        }else if(chainsCounter == 5){
            chainsCounter += 1;
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message = "\nMal olor encontrado, muchas funciones encadenadas en Linea: " + line + " Columna: " + column + "\n"
                                + "Se recomienda dividir los encadenamientos en diferentes variables, donde como mucho se encadenen cuatro funciones, para que el codigo sea mas comprensible y facil de mantener\n";
            manager.AddCodeSmell(SMELL.ExtremeChains, line, column, message);
        }
        return super.visitChildren(ctx);
    }
    
    @Override 
    public T visitFunction_inline_call(RubyParser.Function_inline_callContext ctx) { 
       
        String functionName = ctx.getChild(0).getChild(0).getChild(0).getChild(0).toString();

        Iterator<FunctionCreated> itr = functionsCreated.iterator();
        while (itr.hasNext()) {
            FunctionCreated function = itr.next();
            if (function.name.equals(functionName)) {
                itr.remove();
            }
        }

        return visitChildren(ctx); 
    }

    @Override 
    public T visitTerminator(RubyParser.TerminatorContext ctx) { 
       if(ctx.getChild(ctx.getChildCount() - 1).toString().equals("<EOF>")){
             for (FunctionCreated x : functionsCreated){
                int line = x.line;
                int column = x.column;
                String message = "\nMal olor encontrado, la funcion \'" + x.name + "\' en linea " + line + " Columna: " + column + " nunca es llamada\n"
                                + "Se recomienda crear un llamado a la funcion o en caso de que no sea necesaria eliminarla.\n";
                 manager.AddCodeSmell(SMELL.FunctionsNotCalled, line, column, message);              
            } 
        }else{
            RuleContext StmtCtx = ctx.parent.parent;
            if(StmtCtx.getClass().toString().equals("class RubyParser$Function_definition_bodyContext")){
                methodFinalLine = ctx.start.getLine();
                if((methodFinalLine - methodStartLine) > maxMethodLongitude){
                    String message = "\nMal olor encontrado, la funcion \'" + returnsFunctionName + "\' en linea " + methodStartLine + " Columna: " + methodStartColumn + " Es demasiado larga\n"
                                + "Se recomienda revisar la funcionalidad de este metodo e intentar dividirlo en varios metodos\nque trabajen en conjunto.\n";
                                    manager.AddCodeSmell(SMELL.MethodTooLong, methodStartLine, methodStartColumn, message);
                }
            }
        } 
        return super.visitChildren(ctx); 
    }
    
    public void nestedStatement(RuleContext ctx, int line, int column){
        RuleContext parentStructure = ctx;
        String parentString;
        int nestedCounter = 1;
        int i;
        while(true){
            i = 0;
            while(parentStructure != null && i < 4){
                parentStructure = parentStructure.parent;
                i++;
            }
            if(parentStructure != null){
                parentString = parentStructure.getClass().toString();
                if(parentString.equals("class RubyParser$If_elsif_statementContext")){
                    parentStructure = parentStructure.parent.parent;
                    parentString = parentStructure.getClass().toString();
                }
                if(parentString.equals("class RubyParser$If_statementContext")
                || parentString.equals("class RubyParser$Unless_statementContext")
                || parentString.equals("class RubyParser$While_statementContext")
                || parentString.equals("class RubyParser$For_statementContext")){
                    nestedCounter++;
                }
                if(nestedCounter > 4){
                    String message = "\nMal olor encontrado, estructura profundamente anidada, Linea: " + line + ", Columna: " + column + "\n"
                    + "Se recomienda reestructurar la logica del codigo para evitar la complejidad de lectura.\n";
                    manager.AddCodeSmell(SMELL.DeeplyNestedCode, line, column, message);
                    break;  
                }
            }
            else{
                break;
            }
        }
    }

    public void nestedFunctionStatement(RuleContext ctx, int line, int column) {
        RuleContext parentStructure = ctx;
        String parentString;
        int nestedCounter = 1;
        int i;
        while (true) {
            i = 0;
            while (parentStructure != null && i < 4) {
                parentStructure = parentStructure.parent;
                i++;
            }
            if (parentStructure != null) {
                parentString = parentStructure.getClass().toString();
                if (parentString.equals("class RubyParser$Function_if_elsif_statementContext")) {
                    parentStructure = parentStructure.parent.parent;
                    parentString = parentStructure.getClass().toString();
                }
                if (parentString.equals("class RubyParser$Function_if_statementContext")
                        || parentString.equals("class RubyParser$Function_unless_statementContext")
                        || parentString.equals("class RubyParser$Function_while_statementContext")
                        || parentString.equals("class RubyParser$Function_for_statementContext")) {
                    nestedCounter++;
                }
                if (nestedCounter > 4) {
                    String message = "\nMal olor encontrado, estructura profundamente anidada, Linea: " + line
                            + ", Columna: " + column + "\n"
                            + "Se recomienda reestructurar la logica del codigo para evitar la complejidad de lectura.\n";
                    manager.AddCodeSmell(SMELL.DeeplyNestedCode, line, column, message);
                    break;
                }
            } else {
                break;
            }
        }
    }

    @Override
    public T visitIf_statement(RubyParser.If_statementContext ctx) {
        conditionalsVariableCounter = 0;
        conditionalsCounter = 0;
        ParseTree comparison = ctx.getChild(1).getChild(0).getChild(1).getChild(0).getChild(0);
        conditionalVariable = comparison.getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).toString();
        if(ifstatementCounter < 4){
            ifstatementCounter += 1;
        }else if(ifstatementCounter == 4){
            ifstatementCounter += 1;
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message = "\nMal olor encontrado, muchos condicionales en Linea: " + line + " Columna: " + column + " para la variable " + "\n"
                    + "Se recomienda separar las condiciones en bucles o metodos diferentes segun lo permita la logica del programa.\n";
            manager.AddCodeSmell(SMELL.LongConditionals, line, column, message);
        }
        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedStatement(ctx, line, column);
        return visitChildren(ctx);
    }

    @Override
    public T visitIf_elsif_statement(RubyParser.If_elsif_statementContext ctx) {
        ParseTree comparison = ctx.getChild(1).getChild(0).getChild(1).getChild(0).getChild(0);
        String auxComparison = comparison.getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).toString();
        if(auxComparison.equals(conditionalVariable)){
            if(conditionalsVariableCounter < 4){
                conditionalsVariableCounter += 1;
            }else if(conditionalsVariableCounter == 4){
                conditionalsVariableCounter += 1;
                int line = ctx.start.getLine();
                int column = ctx.start.getCharPositionInLine();
                String message = "\nMal olor encontrado, condicionales muy largos en Linea: " + line + " Columna: " + column + " para la variable \'" + auxComparison + "\'.\n"
                        + "Se recomienda la creacion de un objeto, donde pueda mapear las diferentes opciones de la variable, para asi ingresar a estas con mayor eficacia.\n";
                manager.AddCodeSmell(SMELL.LongConditionals, line, column, message);
            }
        }else if(conditionalsCounter < 4 ){
            conditionalsCounter += 1;
        }else if(conditionalsCounter == 4){
            conditionalsCounter += 1;
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message = "\nMal olor encontrado, condicionales muy largos en Linea: " + line + " Columna: " + column + "\n"
                    + "Se recomienda separar las condiciones en bucles o metodos diferentes segun lo permita la logica del programa.\n";
            manager.AddCodeSmell(SMELL.LongConditionals, line, column, message);
        }
        return visitChildren(ctx);
    }

    @Override
    public T visitFunction_if_statement(RubyParser.Function_if_statementContext ctx) {
        conditionalsVariableCounter = 0;
        conditionalsCounter = 0;
        ParseTree comparison = ctx.getChild(1).getChild(0).getChild(1).getChild(0).getChild(0);
        conditionalVariable = comparison.getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).toString();
        if(ifstatementCounter < 4){
            ifstatementCounter += 1;
        }else if(ifstatementCounter == 4){
            ifstatementCounter += 1;
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message = "\nMal olor encontrado, muchos condicionales en Linea: " + line + " Columna: " + column + " para la variable " + "\n"
                    + "Se recomienda separar las condiciones en bucles o metodos diferentes segun lo permita la logica del programa.\n";
            manager.AddCodeSmell(SMELL.LongConditionals, line, column, message);
        }

        int line = ctx.start.getLine();
        int column = ctx.start.getCharPositionInLine();
        nestedFunctionStatement(ctx, line, column);
        return visitChildren(ctx);
    }

    @Override
    public T visitFunction_if_elsif_statement(RubyParser.Function_if_elsif_statementContext ctx) {
        ParseTree comparison = ctx.getChild(1).getChild(0).getChild(1).getChild(0).getChild(0);
        String auxComparison = comparison.getChild(0).getChild(0).getChild(0).getChild(0).getChild(0).toString();
        if(auxComparison.equals(conditionalVariable)){
            if(conditionalsVariableCounter < 4){
                conditionalsVariableCounter += 1;
            }else if(conditionalsVariableCounter == 4){
                conditionalsVariableCounter += 1;
                int line = ctx.start.getLine();
                int column = ctx.start.getCharPositionInLine();
                String message = "\nMal olor encontrado, condicionales muy largos en Linea: " + line + " Columna: " + column + " para la variable \'" + auxComparison + "\'.\n"
                        + "Se recomienda la creacion de un objeto, donde pueda mapear las diferentes opciones de la variable, para asi ingresar a estas con mayor eficacia.\n";
                manager.AddCodeSmell(SMELL.LongConditionals, line, column, message);
            }
        }else if(conditionalsCounter < 4 ){
            conditionalsCounter += 1;
        }else if(conditionalsCounter == 4){
            conditionalsCounter += 1;
            int line = ctx.start.getLine();
            int column = ctx.start.getCharPositionInLine();
            String message = "\nMal olor encontrado, condicionales muy largos en Linea: " + line + " Columna: " + column + "\n"
                    + "Se recomienda separar las condiciones en bucles o metodos diferentes segun lo permita la logica del programa.\n";
            manager.AddCodeSmell(SMELL.LongConditionals, line, column, message);
        }
        return visitChildren(ctx);
    }
}

