public class f {
    public static void main(String[] args) {
        String a = "anna";
        System.out.println(polyndrom(a));
    }

    public static boolean polyndrom(String a) {

        StringBuilder b = new StringBuilder();

        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }

        if(a.equals(b.toString())) {
            return true;
        } else {
            return false;
        }
        

    }

}
