package g;
import java.util.HashMap;
public class hashMap {

    
    public static void main(String[] args){
        HashMap<String, String> schüler = new HashMap<String, String>();
        schüler.put("Tom", "2,2");  // "hauptstadt von England = London"
        schüler.put("Bernd", "3,5");
        schüler.put("Norbert", "1,9");
        schüler.put("Ronald", "3,9");
        String sTom = schüler.get("Tom");
        

        int Anzahlschüler = schüler.size();
        System.out.println(Anzahlschüler);

        System.out.println(sTom);
        System.out.println(schüler);


    }
}
