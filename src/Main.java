import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            RubyLexer lexer;
            if (args.length > 0)
                lexer = new RubyLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new RubyLexer(CharStreams.fromStream(System.in));

            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            RubyParser parser = new RubyParser(tokens);
            ParseTree tree = parser.prog(); // Iniciar el analisis sintáctico en la regla inicial: programa
            // ParseTreeWalker walker = new ParseTreeWalker();
            // walker.walk(new ListenerRuby(),tree);
            // System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido usuario\n");
            System.out.println("Seleccione los malos olores que desea analizar en su codigo:\n" +
                                "0 - Analisis completo (todos los filtros seleccionados)\n" + 
                                "1 - Deteccion de multiples sentencias return\n" + 
                                "2 - Deteccion de cadenas de llamados de metodos muy largas\n" + 
                                "3 - Deteccion de codigo muerto\n" + 
                                "4 - Deteccion de funciones no llamadas\n" + 
                                "5 - Deteccion de sentencias return dentro de estructuras de bucle\n" +
                                "6 - Deteccion de condicionales muy largos\n" + 
                                "7 - Deteccion de metodos demasiado largos y complejos\n" + 
                                "8 - Deteccion de identificadores muy largos\n" +
                                "9 - Deteccion de codigo profundamente anidado\n");
            System.out.println("Para seleccionar una opcion del menu escriba el numero correspondiente de la opcion\n" + 
                                "que desea.\n\nPara comenzar el analisis escriba \'-1\'\n");
            System.out.println("----------------------------------------------------------------------------------------------\n");

            String opcion = "";
            int opcionNum = -2;
            ArrayList<Integer> selectedFilters = new ArrayList<Integer>(); 
            while (opcionNum != -1) {
                System.out.print("\nEscriba la opcion que desea ejecutar: ");
                opcion = scanner.nextLine();
                try {  
                    opcionNum = Integer.parseInt(opcion);  
                    if(opcionNum > -2 && opcionNum < 10){
                        if(opcionNum == 0){
                            for(int i = 1; i < 10; i++){
                                if(selectedFilters.contains(i)){
                                    System.out.println("El filtro " + i + " ya existe en la lista seleccionada por lo que no se agrego");
                                }else{
                                    selectedFilters.add(i);
                                }
                            }
                            System.out.println();
                        }else if(opcionNum != -1){
                            if (selectedFilters.contains(opcionNum)){
                                System.out.println("El filtro ya fue seleccionado");
                            }else{
                                selectedFilters.add(opcionNum);
                            }
                        }
                    }else{
                        System.out.println("Opcion seleccionada no valida");
                    }
                } catch(NumberFormatException e){  
                    System.out.println("Opcion seleccionada no valida");
                }  
            }
            
            Collections.sort(selectedFilters);
            System.out.println("Genrando reporte ...");

            if (args.length > 1) {
                String[] y = args[1].split(",");
                ArrayList<Integer> smellsEnabled = new ArrayList<Integer>();
                for(String t : y) {
                    smellsEnabled.add(Integer.parseInt(t));
                }
                VisitorRuby<Object> loader = new VisitorRuby<>(smellsEnabled);
                loader.visit(tree);
                loader.manager.Menu(selectedFilters);
            } else {
                VisitorRuby<Object> loader = new VisitorRuby<>();
                loader.visit(tree);
                loader.manager.Menu(selectedFilters);
            }

            // System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}