public class Pesci {
    private String nome;
    
    public Pesci(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }
    public Pesci clone(){
        return new Pesci(this.nome);
    }
    public String toString(){
        String rit="{\t";
        rit+="nome:\t"+this.nome;
        rit+="\t}";
        return rit;
    }

}
