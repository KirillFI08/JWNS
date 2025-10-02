package g;

public class wumpus {
    void raumInfoAusgabe(int aktuellerRaum, int wumpusRaum, int[][] graph){
        ausgeben("Du bist in Raum " + aktuellerRaum);
        ausgeben("Es gibt Tunnel nach ");
        for(int i = 0; i < graph[aktuellerRaum].length; i++){
            ausgeben(graph[aktuellerRaum][i] + " ");
        }

        for(int i = 0; i < graph[aktuellerRaum].length; i++){
            if(wumpusRaum == graph[aktuellerRaum][i]){
                ausgeben("Du riechst den Wumpus!");
            }
        }
    }

    void ausgeben(String text) {
        System.out.print(text);
    }
}
