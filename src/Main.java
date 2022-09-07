import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ort;

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat=scan.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik=scan.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        turkce=scan.nextInt();

        System.out.println("Tarih notunuzu giriniz:");
        tarih=scan.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        muzik=scan.nextInt();

        ort = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        String output = (ort>60) ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println("Ortalamanız: "+ort+"\nGeçme Durumu: "+output);
    }
}
