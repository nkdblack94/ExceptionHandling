import java.util.Scanner;

public class ArrayExample {
    public static int[] createRandom(){
        int[] array = new int[100];
        System.out.println("Danh sách phần tử của mảng");
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.floor(Math.random() *100);
            System.out.printf("%d ",array[i]);
        }

        return array;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Vui lòng nhập chỉ số của 1 phần tử bất kỳ");
        int n = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử chỉ số " + n + " là " + arr[n]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
        System.out.println("chạy tiếp");
    }
}
