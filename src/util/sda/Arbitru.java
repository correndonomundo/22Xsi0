package util.sda;

import java.util.Scanner;

public class Arbitru {

    boolean alCuiRand;
    Jucator jucatorX;
    Jucator jucator0;
    TablaDeJoc tablaDeJoc;
    Scanner scan = new Scanner(System.in);

    public Arbitru (Jucator jucatorX, Jucator jucator0, TablaDeJoc tablaDeJoc){
        this.jucatorX = jucatorX;
        this.jucator0 = jucator0;
        this.tablaDeJoc = tablaDeJoc;
    }

    public String adaugaCoordLaTabla(int rand, int coloana){
            rand = scan.nextInt();
            coloana = scan.nextInt();
            if(tablaDeJoc.verificaCelula(rand, coloana) == true){
                return "Succes";
                    }
            return "Casuta nu este libera";
    }

    public boolean verificaAlCuiRand(){
        if(tablaDeJoc.spatiiGoaleRamase() % 2 == 1){
        return alCuiRand = true;
        }
      return  alCuiRand = false;
    }

    public boolean verificaStatusJoc (){
        return(tablaDeJoc.verificaColoana() || tablaDeJoc.verificaRandul() || tablaDeJoc.verificaDiagonala());
    }



}
