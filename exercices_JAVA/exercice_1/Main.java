package exercice_1;

import exercice_1.JournalisationSingleton.Journalisation;

public class Main {
    public static void main(String[] args) {
        // Création de deux comptes bancaires
        CompteBancaire compte1 = new CompteBancaire(123456789, 5000.0);
        CompteBancaire compte2 = new CompteBancaire(987654321, 10000.0);

        // Opérations sur le compte 1
        compte1.deposerArgent(2000.0);
        compte1.retirerArgent(3000.0);
        compte1.retirerArgent(5000.0); // Tentative échouée

        // Opérations sur le compte 2
        compte2.deposerArgent(500.0);
        compte2.retirerArgent(12000.0); // Tentative échouée

        // Affichage des logs
        System.out.println("\nJournal des opérations :");
        Journalisation.getInstance().afficherLog();
    }
}
