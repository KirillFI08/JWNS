public class Fakultaet {
    public static void main(String[] args){
        int a = 3;
        System.out.println("Zahl: "+a);
        System.out.println("Lösung: "+fakultät(a));
    }

    public static int fakultät(int x){
        if(x==1){
            return 1;
            
        }
        else{
        return x * fakultät(x-1);
        }

    }

}
