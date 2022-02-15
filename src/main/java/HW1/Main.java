package HW1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//1-st.
    public static void change(Object[] arr, int a, int b){
        Object c = a;
        arr[a] = arr[b];
        arr[b] = c;
    }

//2-d.
    public static void toArrayList(Integer[] arr) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(arr));
    }


}
