package presentation;

import metier.Compte;

public class GestionCompteApp {
    public static void main(String[] args) {
        Compte c1=new Compte(11111,"Binani",20000);
        Compte c2=new Compte(22222,"HAJAR",30000);
        System.out.println("************Avant Modification***********");
        c1.afficherCompteInfo();
        c2.afficherCompteInfo();
        c1.retier(19000);
        c2.retier(40000);
        c1.deposer(15000);
        System.out.println("************Aprés Modification***********");
        c1.afficherCompteInfo();
        c2.afficherCompteInfo();

    }

}
