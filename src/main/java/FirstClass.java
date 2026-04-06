import java.util.HashMap;

public class FirstClass {
    public static void main(String[] args) {
        printings();


    }

    private static void printings() {
        System.out.print("hello world");
        double um = 20.0d, dois = 80.00d ;
        double result = ((um+dois)*100 ) % 40.00;
        boolean f = result == 0.00 ? true : false;
        System.out.print(f);
        System.out.print(!f ? "got some remainder" : "dont get it") ;

         HashMap<String, String> greeting = new HashMap<>();
        greeting.put("english", "Welcome");
        greeting.put("czech", "Vitejte");
        greeting.put("danish", "Velkomst");
        greeting.put("dutch", "Welkom");
        greeting.put("estonian", "Tere tulemast");
        greeting.put("finnish", "Tervetuloa");
        greeting.put("flemish", "Welgekomen");
        greeting.put("french", "Bienvenue");
        greeting.put("german", "Willkommen");
        greeting.put("irish", "Failte");
        greeting.put("italian", "Benvenuto");
        greeting.put("latvian", "Gaidits");
        greeting.put("lithuanian", "Laukiamas");
        greeting.put("polish", "Witamy");
        greeting.put("spanish", "Bienvenido");
        greeting.put("swedish", "Valkommen");
        greeting.put("welsh", "Croeso");


        for (int i = 0; i < greeting.size(); i++) {

            System.out.print(greeting.values());
        }
    }
}

