package geekbrains;

public class Test_2 {
    public static void main(String[] args) {
        //test2(new int[]{1, 1});

    }

    public boolean[] test2(int[] arr) {
boolean[] result = new boolean[1];
        int a = 0;
        int b = 0;
        for (int arrs : arr) {
            if (arrs == 1) {
                a = 1;
            }
            if (arrs == 4) {
                b = 4;
            }

        }
        if (a == 1 && b == 4) {
            System.out.println(true);
            result[0] = true;
            return  result;

        } else
            System.out.println(false);
        return result;
    }
}
