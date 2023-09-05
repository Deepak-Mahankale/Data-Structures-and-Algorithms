public class Left_Rotate_Array_By_One {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
