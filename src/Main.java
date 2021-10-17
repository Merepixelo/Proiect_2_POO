import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        //Vectorul cu sansele prestabuilite
        double[] Arr_chance = { 1.0,2.0,3.0,4.0};
        //Vectorul care stocheaza datele aleatorii
        int[] Arr2_chance;
        Arr2_chance=new int [10];
        int range=4-1+1;//max-min-1
        int k=0;

            for(int i=0;i<10;i++){

                int rand=(int)(Math.random()*range)+1;
                Arr2_chance[i] = rand;
                System.out.println(Arr2_chance[i]);

        }

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