public class Caeser {
    public static void main(String[] args) {
        String a = "z";
        caesar(a);
    }

    public static void caesar(String a) {

        StringBuilder b = new StringBuilder();

        System.out.println("Original: ");

        for (int i = 0; i < a.length(); i++) {

            int verschiebung = 1;

            char original = a.charAt(i);
            char incremented = original;

            if (original + verschiebung > 'z') {
                incremented = (char) (original + verschiebung - 26);
            } 
            
            else {
                incremented = (char) (incremented + verschiebung);
            }

            b.append(incremented);

            System.out.print(original + "");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Verschlüsselt: ");
        System.out.print(b.toString());
    }

}
