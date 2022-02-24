import java.util.Scanner;
public class App {
   public static void main(String[] args) {
    int mat, fizik,kimya,turkce,tarih,muzik;
    Scanner oku = new Scanner(System.in);

    System.out.print("Matematik notunuzu giriniz: ");
    mat = oku.nextInt();

    System.out.print("Fizik notunuzu giriniz: ");
    fizik = oku.nextInt();

    System.out.print("Kimya notunuzu giriniz: ");
    kimya = oku.nextInt();

    System.out.print("Türkçe notunuzu giriniz: ");
    turkce = oku.nextInt();

    System.out.print("Tarih notunuzu giriniz: ");
    tarih = oku.nextInt();

    System.out.print("Müzik notunuzu giriniz: ");
    muzik = oku.nextInt();

    int toplam = (mat+fizik+turkce+tarih+muzik+kimya);
    double sonuc = toplam/6.0;
    oku.close();
    System.out.println("Ortalamanız: " + sonuc);
    System.out.println(sonuc> 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");
    
   }
}
