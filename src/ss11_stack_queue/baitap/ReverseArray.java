package ss11_stack_queue.baitap;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        //Case1: Integer
        Stack<Integer> stack = new Stack<>();
        int[] array = {1,2,3,4,5};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        int length = array.length;
        for(int i = 0; i < length;i++) {
            stack.push(array[i]);
        }


        for(int  i = 0; i<length;i++) {
            array[i] = stack.pop();
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));

        //Case2: String
        Stack<String> stackString = new Stack<>();
        String str = "DING AN";
        String[] strArr = str.split(" ");

        System.out.println("Array before sorting: " + Arrays.toString(strArr));

        int length2 = strArr.length;

        for(int i = 0; i < length2;i++) {
            stackString.push(strArr[i]);
        }

        for(int  i = 0; i < length2;i++) {
            strArr[i] = stackString.pop();
        }
        System.out.println("Array after sorting: " + Arrays.toString(strArr));
    }
}
