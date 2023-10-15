public class Acquario {
    private String forma;

    private Pesci[] pesci;

    public Acquario(int numeroPesci, String forma) {
        this.forma = forma;
        this.pesci = new Pesci[numeroPesci];
    }

    public Acquario(Pesci[] pesci, String forma) {
        this.forma = forma;
        this.pesci = pesci;
    }

    public String getForma() {
        return forma;
    }

    public Pesci getPesci(int pos) {
        Pesci rit = null;
        if (pesci[pos] != null && pos >= 0 && pos < pesci.length) {
            rit = pesci[pos];
        }
        return rit;
    }

    public void setPesci(int pos, String nome, int eta) {
        if (pesci[pos] != null && pos >= 0 && pos < pesci.length) {
            pesci[pos] = new Pesci(nome, eta);
        }
    }

    public void aggiungiPesce(int pos, String nome, int eta) {
        if (pesci[pos] == null && pos >= 0 && pos < pesci.length) {
            pesci[pos] = new Pesci(nome, eta);
        }
    }

    public void rimuoviPesce(int pos){
        if(pesci[pos]!=null&&pos>=0&&pos<pesci.length){
            pesci[pos] = null;
        }
    }

    public String toString(){
        String rit="{\t";
        rit+="forma:\t"+this.forma;
        rit+="\tpesci:\t";
        for (int i = 0; i < this.pesci.length; i++) {
            rit+="[\t"+this.pesci[i];
        }
        rit+="\t]";
        rit+="\t}";
        return rit;

    }
    public Acquario clone() {
        Acquario acquario = new Acquario(new Pesci[this.pesci.length], this.forma);
        for (int i = 0; i < this.pesci.length; i++) {
            if (this.pesci[i] != null) {
                acquario.pesci[i] = this.pesci[i].clone();
            } else {
                acquario.pesci[i] = null;
            }
        }
        return acquario;
    }
}


