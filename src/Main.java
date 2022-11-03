import   java.util.Scanner;
public class Main {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Sonuç : " + result);
        return  a + b;
    }
    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int divided(int a, int b) {
        if (b == 0 || a == 0){
            System.out.println("Herhangi bir sayı 0'a bölünemez!");
            return 0;
        }
        int result = a / b;
        System.out.println("Sonuç : " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i<=b; i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi : " + (2 * (a+b)));
        System.out.println("Alanı : " + (a*b));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
    while (true) {
        System.out.print("Bir işlem seçiniz : ");
        select = scan.nextInt();
        if (select == 0){
            break;
        }
        System.out.print("İlk sayıyı giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = scan.nextInt();
        switch (select){
            case 1:
                sum(a,b);
                break;
            case 2:
                minus(a,b);
                break;
            case 3:
               times(a,b);
                break;
            case 4:
                divided(a,b);
                break;
            case 5:
                System.out.println("Sonuç : " + power(a,b));
                break;
            case 6:
                System.out.println("Sonuç : " + mod(a,b));
                break;
            case 7:
                calc(a,b);
                break;
            default:
                System.out.println("Geçersiz bir işlem girdiniz");
        }
    }
        System.out.println("Güle Güle");
    }
}