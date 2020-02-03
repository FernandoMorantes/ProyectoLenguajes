import mdlaf.MaterialLookAndFeel;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.themes.JMarsDarkTheme;
import mdlaf.utils.MaterialColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;

public class SelectorGUI {
    public void run(VisitorRuby<Object> loader ) {
        try {

            JDialog.setDefaultLookAndFeelDecorated(true);
            JFrame.setDefaultLookAndFeelDecorated(false);
            MaterialLookAndFeel material = new MaterialLookAndFeel(new JMarsDarkTheme());
            UIManager.setLookAndFeel(material);
            JFrame frame = new JFrame("Analizador de malos olores en Ruby");
            frame.setMinimumSize(new Dimension(800, 500));
            frame.setMaximumSize(new Dimension(800, 500));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panelLabel = new JPanel();
            panelLabel.setBorder(new EmptyBorder(25,10,10,10));

            JPanel panelInfo = new JPanel();
            panelInfo.setBorder(new EmptyBorder(10,10,20,10));

            JPanel panelButton = new JPanel();
            panelButton.setBorder(new EmptyBorder(10,10,10,10));

            JPanel panelCheck = new JPanel();
            panelCheck.setBorder(new EmptyBorder(10,100,10,10));


            panelLabel.setLayout(new BoxLayout(panelLabel, BoxLayout.PAGE_AXIS));
            JLabel title1 = new JLabel("Analizador de malos olores");
            title1.setFont(new Font("Product Sans Bold", Font.PLAIN, 32));
            title1.setForeground(Color.white);
            title1.setAlignmentX(panelLabel.CENTER_ALIGNMENT);
            panelLabel.add(title1);

            JLabel title2 = new JLabel("en Ruby");
            title2.setFont(new Font("Product Sans Bold", Font.PLAIN, 32));
            title2.setForeground(Color.white);
            title2.setAlignmentX(panelLabel.CENTER_ALIGNMENT);
            panelLabel.add(title2);

            panelInfo.setLayout(new BoxLayout(panelInfo, BoxLayout.PAGE_AXIS));
            JLabel course = new JLabel("Seleccione los malos olores que desea analizar en su codigo");
            course.setFont(new Font("Product Sans Light", Font.PLAIN, 15));
            course.setForeground(Color.white);
            course.setAlignmentX(panelInfo.CENTER_ALIGNMENT);
            panelInfo.add(course);

            panelCheck.setLayout(new BoxLayout(panelCheck, BoxLayout.LINE_AXIS));
            JPanel columna_izq = new JPanel();
            columna_izq.setLayout(new BoxLayout(columna_izq, BoxLayout.PAGE_AXIS));
            JPanel columna_der = new JPanel();
            columna_der.setLayout(new BoxLayout(columna_der, BoxLayout.PAGE_AXIS));


            JCheckBoxMenuItem check1 = new JCheckBoxMenuItem();
            check1.setText("Multiples sentencias return");
            columna_izq.add(check1);

            JCheckBoxMenuItem check2 = new JCheckBoxMenuItem();
            check2.setText("Encadenado de muchos metodos");
            columna_izq.add(check2);

            JCheckBoxMenuItem check3 = new JCheckBoxMenuItem();
            check3.setText("Codigo muerto");
            columna_izq.add(check3);

            JCheckBoxMenuItem check4 = new JCheckBoxMenuItem();
            check4.setText("Funciones no llamadas");
            columna_izq.add(check4);

            JCheckBoxMenuItem check5 = new JCheckBoxMenuItem();
            check5.setText("Sentencias Return en bucles");
            columna_izq.add(check5);

            JCheckBoxMenuItem check6 = new JCheckBoxMenuItem();
            check6.setText("Condicionales muy largos");
            columna_der.add(check6);

            JCheckBoxMenuItem check7 = new JCheckBoxMenuItem();
            check7.setText("Metodos muy largos");
            columna_der.add(check7);

            JCheckBoxMenuItem check8 = new JCheckBoxMenuItem();
            check8.setText("Identificadores muy largos");
            columna_der.add(check8);

            JCheckBoxMenuItem check9 = new JCheckBoxMenuItem();
            check9.setText("Codigo profundamente anidado");
            columna_der.add(check9);

            columna_der.setAlignmentX(panelCheck.TOP_ALIGNMENT);
            columna_izq.setAlignmentX(panelCheck.TOP_ALIGNMENT);

            panelCheck.add(columna_izq);
            panelCheck.add(columna_der);


            class ChangePage extends AbstractAction {

                public ChangePage() {
                    putValue(Action.NAME, "Seleccionar Todos");
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    check1.setState(true);
                    check2.setState(true);
                    check3.setState(true);
                    check4.setState(true);
                    check5.setState(true);
                    check6.setState(true);
                    check7.setState(true);
                    check8.setState(true);
                    check9.setState(true);
                }
            }
            panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.LINE_AXIS));
            JButton all = new JButton("Seleccionar Todos");
            all.setAction(new ChangePage());
            all.setBackground(MaterialColors.LIGHT_BLUE_900);
            all.setForeground(MaterialColors.WHITE);
            all.addMouseListener(MaterialUIMovement.getMovement(all, MaterialColors.LIGHT_BLUE_800));

            JLabel space = new JLabel("    ");
            space.setSize(60,60);

            JButton start = new JButton("Iniciar Analisis");
            class Start extends AbstractAction {

                public Start() {
                    putValue(Action.NAME, "Iniciar Analisis");
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    ArrayList<Integer> selectedFilters = new ArrayList<Integer>();

                    if(check1.getState()){
                        selectedFilters.add(1);
                    }
                    if(check2.getState()){
                        selectedFilters.add(2);
                    }
                    if(check3.getState()){
                        selectedFilters.add(3);
                    }
                    if(check4.getState()){
                        selectedFilters.add(4);
                    }
                    if(check5.getState()){
                        selectedFilters.add(5);
                    }
                    if(check6.getState()){
                        selectedFilters.add(6);
                    }
                    if(check7.getState()){
                        selectedFilters.add(7);
                    }
                    if(check8.getState()){
                        selectedFilters.add(8);
                    }
                    if(check9.getState()){
                        selectedFilters.add(9);
                    }

                    if(selectedFilters.size() == 0){

                        JFrame popup = new JFrame("Error");
                        UIManager UI=new UIManager();

                        JOptionPane.showMessageDialog(popup,
                                "Debe seleccionar al menos un mal olor para analizar ",
                                "Error",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        Collections.sort(selectedFilters);
                        loader.manager.Menu(selectedFilters);
                        selectedFilters.clear();
                        frame.dispose();
                        FinishGUI finish = new FinishGUI();
                        finish.run(loader);

                    }

                }
            }
            start.setAction(new Start());
            start.setBackground(MaterialColors.LIGHT_GREEN_900);
            start.setForeground(MaterialColors.WHITE);
            start.addMouseListener(MaterialUIMovement.getMovement(start, MaterialColors.LIGHT_GREEN_800));
            panelButton.add(all);
            panelButton.add(space);
            panelButton.add(start);

            Container contenedor = frame.getContentPane();
            contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.PAGE_AXIS));
            panelLabel.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelInfo.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelButton.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelCheck.setAlignmentX(contenedor.CENTER_ALIGNMENT);

            contenedor.add(panelLabel);
            contenedor.add(panelInfo);
            contenedor.add(panelCheck);
            contenedor.add(panelButton);

            frame.setVisible(true);

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}


