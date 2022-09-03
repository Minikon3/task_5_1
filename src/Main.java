import java.util.Scanner;

public class Main {
    public static int findFactorial(int x){
        int result=1;
        for (int i=1;i<=x;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Введите число для нахождения факториала: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(findFactorial(a));
    }
}