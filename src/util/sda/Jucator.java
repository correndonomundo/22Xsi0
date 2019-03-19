package util.sda;

public class Jucator {

    String nume;
    char simbol;


    public Jucator(String nume, char simbol){
        this.nume = nume;
        this.simbol = simbol;
    }

    public String toString(){
        return "Jucatorul cu numele" + nume + "si simbolul" + simbol;
    }
}
