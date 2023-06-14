import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Diccionary {

    public static void main(String[] args) {
        Map<Integer, String> diccionaryHash = new HashMap<>();
        diccionaryHash.put(1,"Tomas");
        diccionaryHash.put(2,"Roberti");
        diccionaryHash.put(3,"Juana");
        diccionaryHash.put(4,"Maria");
        diccionaryHash.put(5,"Ana");
        diccionaryHash.put(5,"Juanes");
        diccionaryHash.put(5,"Ana");

        System.out.println("Hash: ------");
        for(Map.Entry<Integer, String> entry: diccionaryHash.entrySet()){
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        };

        Map<Integer, String> diccionaryTree = new TreeMap<>();
        diccionaryTree.put(5,"Ana");
        diccionaryTree.put(3,"Juana");
        diccionaryTree.put(1,"Tomas");
        diccionaryTree.put(4,"Maria");
        diccionaryTree.put(2,"Roberti");

        System.out.println();
        System.out.println("Tree: ------");
        for(Map.Entry<Integer, String> entry: diccionaryTree.entrySet()){
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        };

        Map<Integer, String> diccionaryLinked = new LinkedHashMap<>();
        diccionaryLinked.put(5,"Ana");
        diccionaryLinked.put(3,"Juana");
        diccionaryLinked.put(1,"Tomas");
        diccionaryLinked.put(4,"Maria");
        diccionaryLinked.put(2,"Roberti");

        System.out.println();
        System.out.println("Tree: ------");
        for(Map.Entry<Integer, String> entry: diccionaryLinked.entrySet()){
            System.out.println("Key:" + entry.getKey() + " Value:" + entry.getValue());
        };

    }
}
