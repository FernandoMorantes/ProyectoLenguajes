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

            // Ejecutar la interfaz grafica
            InitGUI gui = new InitGUI();
            VisitorRuby<Object> loader = new VisitorRuby<>();
            loader.visit(tree);
            gui.run(loader);
            
        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}