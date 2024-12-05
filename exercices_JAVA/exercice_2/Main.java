package exercice_2;

import exercice_2.DatabaseSingleton.DatabaseSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("...Test de l'unicité de l'instance exercice_2.DatabaseSingleton...");

        DatabaseSingleton databaseSingleton = DatabaseSingleton.getInstance("ApasizeDatabase");

        databaseSingleton.editRecord(6);

        System.out.println("\nNom de la base de données : " + databaseSingleton.getName());


        DatabaseSingleton newDatabaseSingleton = DatabaseSingleton.getInstance("AMZDatabase");

        System.out.println("\nNom de la nouvelle base de données : "+ newDatabaseSingleton.getName());

        System.out.println("\nLes deux base de données sont elles indentiques ? "+ (databaseSingleton == newDatabaseSingleton));
    }
}