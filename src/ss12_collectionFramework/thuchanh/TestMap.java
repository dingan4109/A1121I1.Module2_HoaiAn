package ss12_collectionFramework.thuchanh;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        //HASH MAP
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);

        System.out.println("Display entries in hashmap");
        System.out.println(hashMap);

        //TREE MAP
        //ASCENDING ORDER by default
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        //DESCENDING ORDER using Collections reverseOrder()
        Map<String, Integer> treeMap1 = new TreeMap<>(Collections.reverseOrder());
        treeMap.putAll(hashMap);
        System.out.println("Display entries in descending order of key");
        System.out.println(treeMap);

        //LINKED HASH MAP
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true); //recheck
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("The age for Lewis is " + linkedHashMap.get("Lewis"));
    }
}
