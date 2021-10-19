package GUI;

import Units.Rylanor;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;


//main form
public class Placeholder {

    public JPanel myPanel;
    private JLabel titlu;
    private JButton button1;
    private JButton button2;
    private JButton callX1Button;
    private JButton callX10Button;
    private JButton backButton1;
    private JRadioButton bannerInfoRadioButton;
    private JButton backButton2;




    public Placeholder() {

        //Summonig menu
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlu.setVisible(false);
                button1.setVisible(false);
                button2.setVisible(false);
                backButton1.setVisible(true);
                callX1Button.setVisible(true);
                callX10Button.setVisible(true);
            }
        });
        //Back to Main manu
        backButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlu.setVisible(true);
                button1.setVisible(true);
                button2.setVisible(true);
                backButton1.setVisible(false);
                callX1Button.setVisible(false);
                callX10Button.setVisible(false);
            }
        });

        //Upgrading manu
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlu.setVisible(false);
                button1.setVisible(false);
                button2.setVisible(false);
                backButton2.setVisible(true);
              /*  .setVisible(true);
                .setVisible(true);
                .setVisible(true);
                *
               */
            }
        });

//Back to Main Menu2
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titlu.setVisible(true);
                button1.setVisible(true);
                button2.setVisible(true);
                backButton2.setVisible(false);

            }
        });
}



}
