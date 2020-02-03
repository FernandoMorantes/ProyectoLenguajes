import mdlaf.MaterialLookAndFeel;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.themes.JMarsDarkTheme;
import mdlaf.utils.MaterialColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;



public class FinishGUI {

    public void run(VisitorRuby<Object> loader) {
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
            panelLabel.setBorder(new EmptyBorder(25,10,30,10));

            JPanel panelInfo = new JPanel();
            panelInfo.setBorder(new EmptyBorder(10,10,50,10));

            JPanel panelButton = new JPanel();
            panelButton.setBorder(new EmptyBorder(10,10,40,10));

            JPanel panelRestart = new JPanel();
            panelRestart.setBorder(new EmptyBorder(10,10,10,10));


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
            JLabel course = new JLabel("El analisis ha concluido, el informe se ha generado correctamente");
            course.setFont(new Font("Product Sans Light", Font.PLAIN, 20));
            course.setForeground(Color.white);
            course.setAlignmentX(panelInfo.CENTER_ALIGNMENT);
            panelInfo.add(course);


            class ChangePage extends AbstractAction {

                public ChangePage() {
                    putValue(Action.NAME, "Abrir informe HTML");
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    Desktop ficheroAEjecutar=Desktop.getDesktop();
                    try {
                        ficheroAEjecutar.open(new File("report.html"));
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,
                                                        ex.getMessage(),
                                                        "Error",
                                                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.LINE_AXIS));
            JButton all = new JButton("Abrir informe HTML");
            all.setAction(new ChangePage());
            all.setBackground(MaterialColors.LIGHT_BLUE_900);
            all.setForeground(MaterialColors.WHITE);
            all.addMouseListener(MaterialUIMovement.getMovement(all, MaterialColors.LIGHT_BLUE_800));

            JLabel space = new JLabel("    ");
            space.setSize(60,60);

            JButton start = new JButton("Abrir informe txt");
            class Start extends AbstractAction {

                public Start() {
                    putValue(Action.NAME, "Abrir informe txt");
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    Desktop ficheroAEjecutar=Desktop.getDesktop();
                    try {
                        ficheroAEjecutar.open(new File("report.txt  "));
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null,
                                                        ex.getMessage(),
                                                        "Error",
                                                        JOptionPane.ERROR_MESSAGE);
                    }

                }
            }
            start.setAction(new Start());
            start.setBackground(MaterialColors.LIGHT_BLUE_900);
            start.setForeground(MaterialColors.WHITE);
            start.addMouseListener(MaterialUIMovement.getMovement(start, MaterialColors.LIGHT_BLUE_800));
            panelButton.add(all);
            panelButton.add(space);
            panelButton.add(start);


            JButton restart = new JButton("Realizar otro analisis");
            class Restart extends AbstractAction {

                public Restart() {
                    putValue(Action.NAME, "Realizar otro analisis");
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    SelectorGUI selector = new SelectorGUI();
                    selector.run(loader);

                }
            }
            restart.setAction(new Restart());
            restart.setBackground(MaterialColors.LIGHT_GREEN_900);
            restart.setForeground(MaterialColors.WHITE);
            restart.addMouseListener(MaterialUIMovement.getMovement(restart, MaterialColors.LIGHT_GREEN_800));
            panelRestart.add(restart);

            Container contenedor = frame.getContentPane();

            contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.PAGE_AXIS));
            panelLabel.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelInfo.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelButton.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelRestart.setAlignmentX(contenedor.CENTER_ALIGNMENT);

            contenedor.add(panelLabel);
            contenedor.add(panelInfo);
            contenedor.add(panelButton);
            contenedor.add(panelRestart);

            frame.setVisible(true);

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }




}
