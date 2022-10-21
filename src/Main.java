import java.util.Scanner;

public class Main {
    static int usluSayi(int a,int b){
            int result=1;
            if (b == 0) {
                result = 1;
            }
            else {
                    result = usluSayi(a,(b-1) ) * a;

            }

            return result;


    }
    public static void main(String[] args) {
        int a ,b;

        Scanner input =new Scanner(System.in);
        System.out.println("Taban değeri giriniz: ");
        a=input.nextInt();
        System.out.println("Üs değeri giriniz: ");
        b=input.nextInt();

        System.out.println(usluSayi(a,b));
        

        }
}