package exercice_1;

import exercice_1.JournalisationSingleton.Journalisation;

public class CompteBancaire {
    private int numero;
    private double solde;

    public CompteBancaire(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;

        System.out.println("\nBienvenue dans notre banque, votre numéro de compte est le suivant :"+ this.numero);
        System.out.println("Votre Solde est de : " + this.solde);
    }

    public void deposerArgent(double depot) {
        if (depot > 0) {
            solde += depot;
            Journalisation.getInstance().ajouterLog("Dépôt de " + depot + " FCFA sur le compte " + numero);
        } else {
            Journalisation.getInstance().ajouterLog("Échec du dépôt : montant invalide (" + depot + ") sur le compte " + numero);
        }
    }

    public void retirerArgent(double retrait) {
        if (retrait > 0 && retrait <= solde) {
            solde -= retrait;
            Journalisation.getInstance().ajouterLog("Retrait de " + retrait + " FCFA du compte " + numero);
        } else {
            Journalisation.getInstance().ajouterLog("Échec du retrait : montant invalide ou insuffisant (" + retrait + ") sur le compte " + numero);
        }
    }
}
