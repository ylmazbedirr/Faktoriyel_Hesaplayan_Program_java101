import java.util.Scanner;

public class Pratik4_Faktoriyel_Hesaplayan_Program {
    public static void main(String[] args) {

    /*    Scanner input = new Scanner(System.in);
        System.out.print("Giriniz :");

     int n = input.nextInt();
        int total = 1;
        for(int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.print(n + "! : " + total);
*/

        // While Dongusu
        int i = 1;
        int n;
        int total = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi gir :");
        n = scn.nextInt();

        while(i <= n){
            total *= i;
            i++;
        }
        System.out.println(n + "! : " + total);
    }
}
