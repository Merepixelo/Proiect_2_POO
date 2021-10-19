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
    private JLabel Summ1;
    private JLabel Summ2;
    private JLabel Summ3;
    private JLabel Summ4;
    private JLabel Summ5;
    private JLabel Summ6;
    private JLabel Summ7;
    private JLabel Summ8;
    private JLabel Summ10;
    private JLabel Summ9;
    private JLabel Summ01;


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
                Summ1.setVisible(true);
                Summ2.setVisible(true);
                Summ3.setVisible(true);
                Summ4.setVisible(true);
                Summ5.setVisible(true);
                Summ6.setVisible(true);
                Summ7.setVisible(true);
                Summ8.setVisible(true);
                Summ9.setVisible(true);
                Summ10.setVisible(true);
                Summ01.setVisible(true);
                callX10Button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int[] Arr_chance;
                        Arr_chance=new int [10];
                        int range=4-1+1;//max-min-1
                        //Vectorul care stocheaza datele aleatorii pt roll de 10

                        for(int i=0;i<10;i++){
                            int rand=(int)(Math.random()*range)+1;
                            Arr_chance[i] = rand;
                            System.out.println(" "+Arr_chance[i]);

                            if(Arr_chance[0]==1){
                                Summ1.setText("Rylanor");
                            }else if(Arr_chance[0]==2){
                                Summ1.setText("Dony Salvadore");
                            }else if(Arr_chance[0]==3){
                                Summ1.setText("Thorn");
                            }else
                                Summ1.setText("Kryptmann");

                            if(Arr_chance[1]==1){
                                Summ2.setText("Rylanor");
                            }else if(Arr_chance[1]==2){
                                Summ2.setText("Dony Salvadore");
                            }else if(Arr_chance[1]==3){
                                Summ2.setText("Thorn");
                            }else
                                Summ2.setText("Kryptmann");

                            if(Arr_chance[2]==1){
                                Summ3.setText("Rylanor");
                            }else if(Arr_chance[2]==2){
                                Summ3.setText("Dony Salvadore");
                            }else if(Arr_chance[2]==3){
                                Summ3.setText("Thorn");
                            }else
                                Summ3.setText("Kryptmann");

                            if(Arr_chance[3]==1){
                                Summ4.setText("Rylanor");
                            }else if(Arr_chance[3]==2){
                                Summ4.setText("Dony Salvadore");
                            }else if(Arr_chance[3]==3){
                                Summ4.setText("Thorn");
                            }else
                                Summ4.setText("Kryptmann");

                            if(Arr_chance[4]==1){
                                Summ5.setText("Rylanor");
                            }else if(Arr_chance[4]==2){
                                Summ5.setText("Dony Salvadore");
                            }else if(Arr_chance[4]==3){
                                Summ5.setText("Thorn");
                            }else
                                Summ5.setText("Kryptmann");

                            if(Arr_chance[5]==1){
                                Summ6.setText("Rylanor");
                            }else if(Arr_chance[5]==2){
                                Summ6.setText("Dony Salvadore");
                            }else if(Arr_chance[5]==3){
                                Summ6.setText("Thorn");
                            }else
                                Summ6.setText("Kryptmann");

                            if(Arr_chance[6]==1){
                                Summ7.setText("Rylanor");
                            }else if(Arr_chance[6]==2){
                                Summ7.setText("Dony Salvadore");
                            }else if(Arr_chance[6]==3){
                                Summ7.setText("Thorn");
                            }else
                                Summ7.setText("Kryptmann");

                            if(Arr_chance[7]==1){
                                Summ8.setText("Rylanor");
                            }else if(Arr_chance[7]==2){
                                Summ8.setText("Dony Salvadore");
                            }else if(Arr_chance[7]==3){
                                Summ8.setText("Thorn");
                            }else
                                Summ8.setText("Kryptmann");

                            if(Arr_chance[8]==1){
                                Summ9.setText("Rylanor");
                            }else if(Arr_chance[8]==2){
                                Summ9.setText("Dony Salvadore");
                            }else if(Arr_chance[8]==3){
                                Summ9.setText("Thorn");
                            }else
                                Summ9.setText("Kryptmann");

                            if(Arr_chance[9]==1){
                                Summ10.setText("Rylanor");
                            }else if(Arr_chance[9]==2){
                                Summ10.setText("Dony Salvadore");
                            }else if(Arr_chance[9]==3){
                                Summ10.setText("Thorn");
                            }else
                                Summ10.setText("Kryptmann");

                        }
/*
   int[] Arr_chance;
                        Arr_chance=new int [10];
                        int range=10-1+1;//max-min-1
                        //Vectorul care stocheaza datele aleatorii pt roll de 10
                        for(int i=0;i<10;i++){
                            int rand=(int)(Math.random()*range)+1;
                            Arr_chance[i] = rand;

                            if(Arr_chance[i]==1){
                                Summ1.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ1.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ1.setText("Thorn");
                            }else
                                Summ1.setText("Kryptmann");

                            if(Arr_chance[i+1]==1){
                                Summ2.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ2.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ2.setText("Thorn");
                            }else
                                Summ2.setText("Kryptmann");

                            if(Arr_chance[i+2]==1){
                                Summ3.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ3.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ3.setText("Thorn");
                            }else
                                Summ3.setText("Kryptmann");

                            if(Arr_chance[i+3]==1){
                                Summ4.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ4.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ4.setText("Thorn");
                            }else
                                Summ4.setText("Kryptmann");

                            if(Arr_chance[i+4]==1){
                                Summ5.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ5.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ5.setText("Thorn");
                            }else
                                Summ5.setText("Kryptmann");

                            if(Arr_chance[i+5]==1){
                                Summ6.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ6.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ6.setText("Thorn");
                            }else
                                Summ6.setText("Kryptmann");

                            if(Arr_chance[i+6]==1){
                                Summ7.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ7.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ7.setText("Thorn");
                            }else
                                Summ7.setText("Kryptmann");

                            if(Arr_chance[i+7]==1){
                                Summ8.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ8.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ8.setText("Thorn");
                            }else
                                Summ8.setText("Kryptmann");

                            if(Arr_chance[i+8]==1){
                                Summ9.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ9.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ9.setText("Thorn");
                            }else
                                Summ9.setText("Kryptmann");

                            if(Arr_chance[i+9]==1){
                                Summ10.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ10.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ10.setText("Thorn");
                            }else
                                Summ10.setText("Kryptmann");

                        }


 */


/*
                            Summ1.setText(""+Arr_chance[0]);
                             Summ2.setText(""+Arr_chance[1]);
                            Summ3.setText(""+Arr_chance[2]);
                            Summ4.setText(""+Arr_chance[3]);
                            Summ5.setText(""+Arr_chance[4]);
                            Summ6.setText(""+Arr_chance[5]);
                            Summ7.setText(""+Arr_chance[6]);
                            Summ8.setText(""+Arr_chance[7]);
                            Summ9.setText(""+Arr_chance[8]);
                            Summ10.setText(""+Arr_chance[9]);
 */
                    }
                });

                callX1Button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Vectorul care stocheaza datele aleatorii pt roll de 1
                        int[] Arr_chance;
                        Arr_chance=new int [10];
                        int range=4-1+1;//max-min-1
                        //Vectorul care stocheaza datele aleatorii pt roll de 10

                        for(int i=0;i<1;i++){
                            int rand=(int)(Math.random()*range)+1;
                            Arr_chance[i] = rand;

                            if(Arr_chance[i]==1){
                                Summ01.setText("Rylanor");
                            }else if(Arr_chance[i]==2){
                                Summ01.setText("Dony Salvadore");
                            }else if(Arr_chance[i]==3){
                                Summ01.setText("Thorn");
                            }else
                                Summ01.setText("Kryptmann");
                        }
                    }
                });
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
                Summ1.setVisible(false);
                Summ2.setVisible(false);
                Summ3.setVisible(false);
                Summ4.setVisible(false);
                Summ5.setVisible(false);
                Summ6.setVisible(false);
                Summ7.setVisible(false);
                Summ8.setVisible(false);
                Summ9.setVisible(false);
                Summ10.setVisible(false);
                Summ01.setVisible(false);
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
