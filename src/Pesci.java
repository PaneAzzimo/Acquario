public class Pesci {
    private String nome;
    private int eta;
    
    public Pesci(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }
    public String getNome(){
        return this.nome;
    }
    public int getEta(){
        return this.eta;
    }
    public Pesci clone(){
        return new Pesci(this.nome, this.eta);
    }
    public String toString(){
        String rit="{\t";
        rit+="nome:\t"+this.nome;
        rit+="\teta`:\t"+this.eta;
        rit+="\t}";
        return rit;
    }

}
