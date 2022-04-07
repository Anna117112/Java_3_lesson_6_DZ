package geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_1 {


    public static void main(String[] args) {
     //   test(new int[]{1, 2, 3});
      //  test(new int[]{1, 2, 3, 4, 1, 6});
       // test(new int[]{1, 4, 5, 6});
      //  test(new int[]{1, 4});
    }

    public  int[] test(int[] arr) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        if (arr[arr.length - 1] == 4) {
            String s = "Последний элемент содержит 4";
            System.out.println(s);
            int[] nullArr = new int[0];
            System.out.println(Arrays.toString(nullArr));
            return nullArr;

        }
        for (int i =0; i<arr.length; i++) {
            if (arrList.isEmpty() && arr[i]==4){
            for (int j = i+1; j < arr.length; j++) {

                if ( arr[j] != 4) {
                        arrList.add(arr[j]);
                    } else {
                        arrList.clear();

                    }
                }
            }
        }
        if (!arrList.isEmpty()) {
            int[] ars = new int[arrList.size()];
           for (int i =0; i<ars.length; i++){
               ars[i] = arrList.get(i);
               //System.out.println(Arrays.toString(ars));
           }
           // Integer[] newarr = arrList.toArray(new Integer[arrList.size()]);

            System.out.println(Arrays.toString(ars));

            return ars;

        } else {

            throw new RuntimeException("В массиве нет 4");
        }
    }
}

               





    

