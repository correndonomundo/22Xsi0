package util.sda;

import java.util.Scanner;

public class Xsi0 {

    public static void main(String[] args) {

        String nume = "";
        Jucator jucatorX = new Jucator(nume, 'x');
        Jucator jucator0 = new Jucator(nume, '0');
        String[][] matriceXsi0 = {
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
        TablaDeJoc tablaDeJoc = new TablaDeJoc(matriceXsi0);
        Arbitru arbitru = new Arbitru(jucatorX, jucator0, tablaDeJoc);
       //Scanner scan = new Scanner(System.in);
        int rand = 0;
        int coloana = 0;

        while(arbitru.verificaStatusJoc() == false){

            System.out.println("Introdu coordonatele");

            if(arbitru.adaugaCoordLaTabla(rand, coloana) == "Succes" && arbitru.verificaAlCuiRand()){
                matriceXsi0 [rand] [coloana] = "x ";
            } else if(arbitru.adaugaCoordLaTabla(rand, coloana) == "Succes" && !arbitru.verificaAlCuiRand()){
                matriceXsi0[rand][coloana] = "0 ";
            }else {
                arbitru.adaugaCoordLaTabla(rand, coloana);
            }

          tablaDeJoc.afiseazaTabla();

        }


    }
}
