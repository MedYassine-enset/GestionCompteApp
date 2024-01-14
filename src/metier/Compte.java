package metier;

public class Compte {
    private long num;
    private String nomClient;
    private double solde;

    public Compte() {
    }

    public Compte(long num, String nomClient, double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }
    public void afficherCompteInfo(){
        System.out.println("Numéro de compte :"+num+" "+"Nom Client :"+nomClient+" "+"Solde :"+solde);
    }
    public void retier(double montant){
        if (montant>solde){
            System.out.println("le solde est insuffisant");
        }else {
            solde=solde-montant;
        }
    }
    public void deposer(double montant){
        solde=solde+montant;
    }
}
