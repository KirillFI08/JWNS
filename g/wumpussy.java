package g;

public class wumpussy {
    raumInfoAusgabe(int aktuellerRaum, int wumpus Raum, int[] graph){
        ausgeben("Du bist in Raum "+ aktuellerRaum);
        ausgeben("Es gibt Tunnel nach ");
        for(int i=0; i<aktuellerRaum.length-1; i++){
            ausgeben(graph[aktuellerRaum][i]+" ");
        }

    }

    for(int i=0;i<3;i++){
        if(wumpusRaum == graph[aktuellerRaum][i]){
            ausgeben("Du riechst den Wumpus!");
        }
    }


        raumInfoAusgabe(int aktuellerRaum, int wumpus Raum, int[] graph){
        ausgeben("Du bist in Raum "+ aktuellerRaum);
        ausgeben("Es gibt Tunnel nach ");
       

        for(int i=0;i<20;i++){
            if(graph[aktuellerRaum][i]==1){
            ausgeben(i+" ");
            }
        }

        if(graph[aktuellerRaum][wumpusRaum]==1){
            ausgeben("Du riechst den Wumpus!");
        }
    }


}
