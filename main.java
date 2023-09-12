import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (x,yz şeklinde) giriniz :");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle endeksiniz :" + indeks);
    }
}