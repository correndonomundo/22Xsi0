package util.sda;

public class TablaDeJoc {

    private String[][] matriceXsi0;
    private int spatiiGoale = 9;


    public TablaDeJoc(String [][]matriceXsi0){
        this.matriceXsi0 = matriceXsi0;
    }

    public int spatiiGoaleRamase() {
        int counter = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (matriceXsi0[i][j] == "-") {
                    counter++;
                }
            }
        }
        return counter;
    }

    public boolean verificaCelula(int rand, int coloana){
            if(matriceXsi0[rand][coloana] == "-"){
               return true;
            }
            return false;
    }

        public boolean verificaDacaAmTrei(String c1, String c2, String c3){
        return ((c1 != "-") && (c1==c2) && (c2 ==c3));
        }

        public boolean verificaRandul() {
            for (int i = 0; i < 3; ++i) {
                if (verificaDacaAmTrei(matriceXsi0[i][0], matriceXsi0[i][1], matriceXsi0[i][2]) == true) {
                    return true;
                }
            }
        return false;
    }

    public boolean verificaColoana() {
        for (int i = 0; i < 3; ++i) {
            if (verificaDacaAmTrei(matriceXsi0[0][i], matriceXsi0[1][i], matriceXsi0[2][i]) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean verificaDiagonala() {
        for (int i = 0; i < 3; ++i) {
            if (verificaDacaAmTrei(matriceXsi0[0][0], matriceXsi0[1][1], matriceXsi0[2][2]) == true ||
                    verificaDacaAmTrei(matriceXsi0[2][0], matriceXsi0[1][1], matriceXsi0[0][2]) == true ) {
                return true;
            }
        }
        return false;
    }

    public void afiseazaTabla() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
            System.out.print(matriceXsi0 [i][j]);
            }
            System.out.println();
        }

    }

}
