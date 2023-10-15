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


        String formaAcquario1="rotondo";
        String formaAcquario2="rettangolare";
        Pesci[] pesci = {pesce1,pesce2};

        Acquario acquario1 = new Acquario(pesci,formaAcquario1);
        Acquario acquario2 = new Acquario(2,formaAcquario2);
        System.out.println(acquario1.getForma());
        System.out.println(acquario1.getPesci(0));
        System.out.println(acquario1.getPesci(1));
        acquario1.setPesci(0,"Luca",3);
        System.out.println(acquario1.getPesci(0));
        System.out.println(acquario2.getForma());
        acquario2.aggiungiPesce(0,"Matteo",4);
        acquario2.aggiungiPesce(1,"Silverio",1);
        System.out.println(acquario2.getPesci(0));
        System.out.println(acquario2.getPesci(1));
        acquario2.rimuoviPesce(0);
        acquario2.aggiungiPesce(0,"Rino",2);
        System.out.println(acquario2.getPesci(0));
        System.out.println(acquario2.clone());


    }
}