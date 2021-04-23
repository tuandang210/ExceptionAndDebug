package Triangle;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        check(a,b,c);
    }

    public static void check(int a, int b, int c) throws MyException {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a) || (a <= 0) || (b <= 0) | (c <= 0)) {
            throw new MyException();
        } else {
            System.out.println("Là 3 cạnh của tam giác");
        }
    }

}
