import DatabaseSingleton.DatabaseSingleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("...Test de l'unicité de l'instance DatabaseSingleton...");

        DatabaseSingleton databaseSingleton = DatabaseSingleton.getInstance("ApasizeDatabase");

        databaseSingleton.editRecord(6);

        System.out.println("\nNom de la base de données : " + databaseSingleton.getName());


        DatabaseSingleton newDatabaseSingleton = DatabaseSingleton.getInstance("AMZDatabase");

        System.out.println("\nNom de la nouvelle base de données : "+ newDatabaseSingleton.getName());

        System.out.println("\nLes deux base de données sont elles indentiques ? "+ (databaseSingleton == newDatabaseSingleton));
    }
}