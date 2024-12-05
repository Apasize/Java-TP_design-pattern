package exercice_2.DatabaseSingleton;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;

    private int record;
    private String name;


    private DatabaseSingleton(String name) {
        this.record = 0;
        this.name = name;
    }

    public static DatabaseSingleton getInstance(String name) {
        if (instance == null) {
            instance = new DatabaseSingleton(name);
        }
        return instance;
    }

    public void editRecord(int recordNumber) {
        this.record = recordNumber;
        System.out.println("\nEnregistrement numéro " + recordNumber + " modifié dans la base de données " + name);
    }

    public String getName(){
        return this.name;
    }
}
