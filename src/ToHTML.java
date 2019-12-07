import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class ToHTML {
    public  SMELL[] smellsList = {SMELL.MultipleReturn,SMELL.ExtremeChains,SMELL.DeadCodeReturn,SMELL.FunctionsNotCalled,SMELL.ReturnInLoop,SMELL.LongConditionals,SMELL.MethodTooLong,SMELL.IdTooLong,SMELL.DeeplyNestedCode};
    public String[] names ={"1. MULTIPLES SENTENCIAS RETURN","2. CADENAS DE LLAMADOS DE METODOS MUY LARGAS","3. CODIGO MUERTO","4. FUNCIONES NO LLAMADAS","5. SENTENCIAS RETURN DENTRO DE ESTRUCTURAS DE BUCLE","6. CONDICIONALES MUY LARGOS","7. METODOS DEMASIADO LARGOS Y COMPLEJOS","8. IDENTIFICADORES MUY LARGOS","9. CODIGO PROFUNDAMENTE ANIDADO"};
    public String headerHtml = "<!doctype html>\n" +
            "<html>\n" +
            "    <head>\n" +
            "        <meta charset=\"UTF-8\">\n" +
            "        <title>Reporte</title>\n" +
            "        <link href=\"Estilos.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
            "        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n" +
            "    </head>\n" +
            "    <body class=\"bg_urbano\">\n" +
            "        <div>\n" +
            "            <div  class = \"header\">\n" +
            "                <h1 class=\"title\">Reporte de malos olores en Ruby</h1>\n" +
            "                 <img src=\"imagenes/logo.png\" style=\"width: 25vh;height: 25vh\"/>\n" +
            "                 <p class=\"light_text_title\"> Lenguajes de Programación <br>Universidad Nacional de Colombia</p>\n" +
            "            </div>\n" +
            "          \n" +
            "                \n" +
            "            <nav id=\"nav\">\n" +
            "\t\t\t\t<ul>\t\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t<li class=\"active\"><a class=\"active_link\" href=\"report.html\" target=\"_self\">Reporte</a></li>\n" +
            "                            <li class=\"li_icons\"><a class=\"li_icons_a\" href=\"https://github.com/FernandoMorantes/ProyectoLenguajes\" target=\"_blank\"><i class=\"fa fa-github\" style=\"font-size:40px; padding: 12px 30px 1px 0px;; cursor: pointer;\" ></i></a></li>\n" +
            "\t\t\t\t</ul>\n" +
            "            </nav>\n" +
            "            <div class=\"cont\">\n" +
            "                <div class=\"cont_text\">\n" +
            "                    <h1>Malos olores encontrados</h1>"+ "\n";
    public String footerHtml ="                </div>\n" +
            "            </div>\n" +
            "            <div class=\"footer\">\n" +
            "\t\t\t\t\t\t<ul><li>&copy; Lenguajes de Programación</li> <li>Universidad Nacional De Colombia</li></ul>\n" +
            "\t\t\t</div>\n" +
            "        </div>\n" +
            "    </body>\n" +
            "</html>";

    public ArrayList<Integer> user_select;
    ArrayList<CodeSmell> codeSmells ;

    public ToHTML(ArrayList<Integer> select, ArrayList<CodeSmell> codeSmells ){
        this.user_select = select;
        this.codeSmells = codeSmells;
    }

    public void createHTML(){
        String text = "";
        boolean flag = false;
        for(int element : user_select){
            flag = false;
            text += " <h2 class = \"sub_title\">"+names[(element - 1)]+"</h2>"+ "\n";
            text += "<div class = \"center\"> \n";
            String recom = "";
            for(CodeSmell smell : codeSmells){
                if(smell.type == smellsList[element-1] ){

                    StringTokenizer tokens=new StringTokenizer(smell.message,"\n");
                    int nDatos=tokens.countTokens();
                    String[] datos=new String[nDatos];
                    int i=0;
                    while(tokens.hasMoreTokens()){
                        String str=tokens.nextToken();
                        datos[i]=str;
                        i++;
                    }

                    if(smell.type == SMELL.MultipleReturn){
                        text += "<h3>"+datos[0]+"<h3>"+"\n";
                        text += "<h3>"+datos[1]+"<h3>"+"\n";

                        recom = datos[2];
                        flag = true;

                    }
                    else{
                        recom = datos[1];
                        text += "<h3>"+datos[0]+"<h3>"+"\n";
                        flag = true;
                    }

                }
            }
            text += " </div> \n";
            if(flag){
                text += " <h2 class =\"recomendacion\">Recomendaciones</h2>"+ "\n";
                text += "<div class =\"center\">"+"\n";
                text += "<h3>"+recom+"</h3>"+"\n";
                text += "</div>"+"\n";
            }
            if (!flag){
                text += "<div class =\"center\">"+"\n";
                text += "<h3>No se han encontrado malos olores de este tipo </h3> \n";
                text += "</div>"+"\n";
            }

        }

        String toRender = headerHtml+text+footerHtml;
        try (FileWriter writer = new FileWriter("report.html");
             BufferedWriter bw = new BufferedWriter(writer)) {

            bw.write(toRender);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }



    }


}
