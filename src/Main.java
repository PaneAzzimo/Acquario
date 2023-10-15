public class Main {
    public static void main(String[] args) {
        String nomePesce1="Carlo";
        String nomePesce2="Nino";
        int etaPesce1=1;
        int etaPesce2=2;
        Pesci pesce1 = new Pesci(nomePesce1,etaPesce1);
        Pesci pesce2 = new Pesci(nomePesce2,etaPesce2);
        System.out.println(pesce1.getNome());
        System.out.println(pesce1.getEta());
        System.out.println(pesce1.toString());
        System.out.println(pesce2.getNome());
        System.out.println(pesce2.getEta());
        System.out.println(pesce2.toString());
    }
}