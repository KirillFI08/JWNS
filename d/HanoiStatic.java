package d;

public class HanoiStatic {
    public void bewegeScheibe(int von, int nach){
        System.out.println("Bewege Scheibe von " + von + " nach " + nach);
    }

    public void bewegeScheibe(int von, int nach, int zwischenspeicher){
        bewegeScheibe(von, zwischenspeicher, nach);
        bewegeScheibe(von, nach);
        bewegeScheibe(zwischenspeicher, nach, von);

    }

    public void bewegeZweiScheiben(int von, int nach, int zwischenspeicher){
        bewegeZweiScheiben(von, zwischenspeicher, nach);
        bewegeScheibe(von, nach);
        bewegeZweiScheiben(zwischenspeicher, nach, von);

    }

    public void bewegeMehrereScheiben(int n, int von, int nach, int zwischenspeicher){

    }


    public static void main(String[] args){
        HanoiStatic hanoi = new HanoiStatic();
        hanoi.bewegeMehrereScheiben(8,1,3,2);
        
    }
}
