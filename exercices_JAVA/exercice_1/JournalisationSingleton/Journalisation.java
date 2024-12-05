package exercice_1.JournalisationSingleton;

public class Journalisation {
    private static Journalisation uniqueInstance;

    private String log;

    private Journalisation() {
        log = "";
    }

    public static Journalisation getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Journalisation();
        }
        return uniqueInstance;
    }

    public void ajouterLog(String message) {
        String horodatage = "[" + java.time.LocalDateTime.now().format(
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h'mm")) + "] ";
        log += horodatage + message + "\n";
    }

    public void afficherLog() {
        System.out.println(log);
    }
}
