package triangleException;

import triangleException.IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) throws IllegalTriangleException {
       try {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhập cạnh a");
           int a = scanner.nextInt();
           System.out.println("Nhập cạnh b");
           int b = scanner.nextInt();
           System.out.println("Nhập cạnh c");
           int c = scanner.nextInt();

           if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a){
               throw new IllegalTriangleException("sai con mẹ may rồi");
           }
       } catch (IllegalTriangleException e){
           System.out.println(e.fillInStackTrace());
       }
        System.out.println("chạy tiếp phần sau");
    }
}
