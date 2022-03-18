package ss10_stack_queue.baitap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        String str = "Abc Defg hiKlm Defg nopQ";
        String[] strArr = str.split(" ");

        System.out.println(Arrays.toString(strArr));

        for(int i = 0; i <strArr.length; i++) {
            String key = strArr[i].toLowerCase();
            if(myMap.containsKey(key)) {

                System.out.println("1 " + key);
                myMap.put(key, myMap.get(key) + 1 );
            }else {
                System.out.println("2 " + key);
                myMap.put(key,1);
            }
        }
        System.out.println(myMap.toString());
    }
}
