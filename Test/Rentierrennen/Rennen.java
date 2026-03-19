package Test.Rentierrennen;

public class Rennen {

    int rndm1 = (int) (Math.random() * 10) + 1;
    int rndm2 = (int) (Math.random() * 10) + 1;

    int rndm3 = (int) (Math.random() * 10) + 1;
    int rndm4 = (int) (Math.random() * 10) + 1;

    rndm1 = rndm1/5;

    public static void main(String[] args) {
        Rehntier rehn1 = new Rehntier("Rudolf", 10, 5);
        Rehntier rehn2 = new Rehntier("Blitzen", 8, 8);
        Rehntier rehn3 = new Rehntier("Comet", 9, 6);
        Rehntier rehn4 = new Rehntier("Dasher", 7, 9);

        Rehntier[] rennen = {rehn1, rehn2, rehn3, rehn4};

        for (Rehntier rehn : rennen) {
            int wert = rehn.geschwindigkeit * rehn.ausdauer;
            System.out.println(rehn.name + " hat einen Wert von " + wert + "/100");
        }
    }






}
