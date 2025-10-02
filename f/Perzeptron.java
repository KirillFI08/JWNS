package g;
public class Perzeptron {
double w1, w2, w3, bias;
double eta = 0.5;

public Perzeptron(double w1, double w2, double w3, double bias) {

this.w1 = w1; this.w2 = w2; this.w3 = w3; this.bias = bias; 
}

public int predict(int x1, int x2, int x3) {
double sum = w1 * x1 + w2 * x2 + w3 * x3 + bias;
return sum >= 0 ? 1 : 0;
}



public static void main(String[] args) {
    Perzeptron p = new Perzeptron(1, 1, 1, -2);
    p.eta = 0.1; // Lernrate setzen
    int[][] daten = { {0,0,0}, {1,0,0}, {0,1,0}, {0,0,1}, {1,1,0}, {1,0,1}, {0,1,1}, {1,1,1}};
    int[] ziele =   {0, 0, 1, 1, 1, 1, 1, 1}; // ODER-Funktion
    p.train(daten, ziele, 100); // 100 Trainingsdurchläufe

    System.out.println("Wahrheitstabelle für ODER nach Training:");
    for (int i = 0; i < daten.length; i++) {
        int out = p.predict(daten[i][0], daten[i][1], daten[i][2]);
        System.out.printf("%d,%d,%d -> %d%n", daten[i][0], daten[i][1], daten[i][2], out);
    }
}

public void train(int[][] daten, int[] ziele, int epochen) {
    for (int e = 0; e < epochen; e++) {
        for (int i = 0; i < daten.length; i++) {
            int x1 = daten[i][0], x2 = daten[i][1], x3 = daten[i][2];
            int y = predict(x1, x2, x3);
            int fehler = ziele[i] - y;
            // Gewichte und Bias anpassen
            w1 += eta * fehler * x1;
            w2 += eta * fehler * x2;
            w3 += eta * fehler * x3;
            bias += eta * fehler;
        }
    }
}
}