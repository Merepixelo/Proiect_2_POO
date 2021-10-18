 /* double[] Arr_chance = { 1.0,2.0,3.0,4.0};*/
import GUI.Placeholder;

import java.awt.*;
import java.lang.Math;
import javax.swing.*;

import java.io.IOException;

/*
http://coddingbuddy.com/article/55457394/how-to-set-background-image-in-java
 */

 public class Main extends javax.swing.JFrame{
     public static void main(String[] args) throws Exception{



         int[] Arr_chance;
         Arr_chance=new int [10];
         int range=4-1+1;//max-min-1


         //Vectorul care stocheaza datele aleatorii pt roll de 10
         for(int i=0;i<10;i++){
             int rand=(int)(Math.random()*range)+1;
             Arr_chance[i] = rand;
             System.out.println(Arr_chance[i]);
         }

         System.out.println("\n");

         //Vectorul care stocheaza datele aleatorii pt roll de 1
         for(int i=0;i<1;i++){
             int rand=(int)(Math.random()*range)+1;
             Arr_chance[i] = rand;
             System.out.println(Arr_chance[i]);
         }


        // r.LoadImageApp();

         JFrame frame=new JFrame("gatcha");
         frame.setContentPane(new Placeholder().myPanel);
         frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
         frame.pack();



         frame.setVisible(true);
     }



 }




/* Tales form the Wastelands ___ gatcha game

Timp:
Start: 11.10.2021
End: 20.10.2021

Verificare:
Upload: Github
Diagrame UML
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------










Cerinte implementate in proiect:

->get/set(): currency for rolling the gacha
->metodelor:-private: Nume,base_atk,base_def,base_hp,
            -public: upgrade_atk,upgrade_def,upgrade_hp
            -protected: max_atk,max_def,max_hp
->vector: din pool-ul unitati alege dupa sanse

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Cerințe:

->Prog. de baza:
Folosirea claselor, constructorilor, membrilor, metodelor(publice, private, protected), modificatori de access
Instantare obiecte, Incapsulare
Metode de clasa/instanta, get/set(), equals(), toString()
Pachete, interfete, vectori/tablouri de obiecte/structuri de date

Moștenire + polimorfism

Supraîncarcarea/supradefinirea metodelor

->Viusal:
Aplicație cu interfață grafică folosind Java Swing
Folosirea obiectelor din Java Swing, ActionListeners, OptionPane



 */