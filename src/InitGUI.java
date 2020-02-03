import mdlaf.MaterialLookAndFeel;
import mdlaf.animation.MaterialUIMovement;
import mdlaf.themes.JMarsDarkTheme;
import mdlaf.utils.MaterialColors;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;


public class InitGUI {


    public void run(VisitorRuby<Object> loader ) {

        try {
            JDialog.setDefaultLookAndFeelDecorated(true);
            JFrame.setDefaultLookAndFeelDecorated(false);
            MaterialLookAndFeel material = new MaterialLookAndFeel(new JMarsDarkTheme());
            UIManager.setLookAndFeel(material);
            JFrame frame = new JFrame("Analizador de malos olores en Ruby");
            frame.setMinimumSize(new Dimension(800, 500));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            JPanel panelLabel = new JPanel();
            panelLabel.setBorder(new EmptyBorder(25,10,10,10));

            JPanel panelImage = new JPanel();
            panelImage.setBorder(new EmptyBorder(20,10,0,10));

            JPanel panelInfo = new JPanel();
            panelInfo.setBorder(new EmptyBorder(10,10,30,10));

            JPanel panelButton = new JPanel();
            panelButton.setBorder(new EmptyBorder(10,10,10,10));


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


            JLabel image = new JLabel("");
            image.setSize(110, 110);
            image.setLocation(25,25);
            ImageIcon fot = new ImageIcon("imagenes/logo.png");
            Icon icono = new ImageIcon(fot.getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
            image.setIcon(icono);
            panelImage.add(image);

            panelInfo.setLayout(new BoxLayout(panelInfo, BoxLayout.PAGE_AXIS));
            JLabel course = new JLabel("Lenguajes de Programación");
            course.setFont(new Font("Product Sans Light", Font.PLAIN, 20));
            course.setForeground(Color.white);
            course.setAlignmentX(panelInfo.CENTER_ALIGNMENT);
            panelInfo.add(course);

            JLabel university = new JLabel("Universidad Nacional de Colombia");
            university.setFont(new Font("Product Sans Light", Font.PLAIN, 20));
            university.setForeground(Color.white);
            university.setAlignmentX(panelInfo.CENTER_ALIGNMENT);
            panelInfo.add(university);


            JButton start = new JButton("Empezar");
            class ChangePage extends AbstractAction {

                public ChangePage() {
                    putValue(Action.NAME, "Empezar");
                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    SelectorGUI selector = new SelectorGUI();
                    selector.run(loader);
                }
            }
            start.setAction(new ChangePage());
            start.setBackground(MaterialColors.LIGHT_BLUE_900);
            start.setForeground(MaterialColors.WHITE);
            start.addMouseListener(MaterialUIMovement.getMovement(start, MaterialColors.LIGHT_BLUE_800));
            panelButton.add(start);

            Container contenedor = frame.getContentPane();
            contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.PAGE_AXIS));
            panelLabel.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelImage.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelInfo.setAlignmentX(contenedor.CENTER_ALIGNMENT);
            panelButton.setAlignmentX(contenedor.CENTER_ALIGNMENT);

            contenedor.add(panelLabel);
            contenedor.add(panelImage);
            contenedor.add(panelInfo);
            contenedor.add(panelButton);

            frame.setVisible(true);

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
