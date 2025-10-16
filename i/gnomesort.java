package i;

import java.util.Arrays;

public class gnomesort {

    public static void main(String[] args){
        int[] zahlen = {9,4,3,5,2,6,1};
        gnomeSort(zahlen);
        System.out.println(Bogosort.richtigSortiert(zahlen));

    }

    public static void gnomeSort(int[] zahlen){
        int k;

        for(int i=0; i<zahlen.length-1; i++){

            if(zahlen[i]>zahlen[i+1]){
                k=zahlen[i];
                zahlen[i] = zahlen[i+1];
                zahlen[i+1]=k;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(zahlen));
    }


}
