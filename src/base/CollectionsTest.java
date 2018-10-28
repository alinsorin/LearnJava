package base;

import com.sun.javafx.collections.MappingChange;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsTest {
    public static void main(String[]args){
        listTest();

        MapTest();
    }

    private static void MapTest() {
        TreeMap<Integer, String> mapsofString = new TreeMap<>();

        mapsofString.put(2, "second");
        mapsofString.put(3, "third");
        mapsofString.put(1, "first");

        Set<Integer> keys = mapsofString.keySet();
        System.out.println("Keys:" + keys);
        System.out.println("Value: " + mapsofString.values());

        for(int key : keys){
            System.out.println(key + " : " + mapsofString.get(key));
        }
        //keys.forEach(System.out::println);
    }

    public static void listTest (){
        ArrayList<String> listOfStrings = new ArrayList<>();

        listOfStrings.add("first");
        listOfStrings.add("second");
        listOfStrings.add("third");

        for (int i=0; i < listOfStrings.size(); i++)
        {
            System.out.println(listOfStrings.get(i));
        }



    }
}
