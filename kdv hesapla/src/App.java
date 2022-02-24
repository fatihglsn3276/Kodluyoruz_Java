import java.util.Scanner;
public class App {
   public static void main(String[] args) {
    double tutar;
    double kdv=0.18;
    double kdvtutar;
    double kdvlitutar;
    Scanner oku = new Scanner(System.in);

    System.out.print("ürün tutarını giriniz: ");
    tutar = oku.nextInt();

    kdvtutar=tutar*kdv;
    kdvlitutar=tutar+kdvtutar;


    
    oku.close();
    System.out.println("kdv siz tutar: " + tutar);
    System.out.println("kdv oranı: " + kdv);
    System.out.println("kda miktarı: " + kdvtutar);
    System.out.println("kdv li tutar: " + kdvlitutar);
    
   }
}
