import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int intro_price= 10;

        double per_price = 2.2 ;

        System.out.println("Merhaba taksimizin açılış ücreti "+ intro_price + " Tl dır.");

        System.out.println("Kaç km yol gittiniz?");

        double uzunluk_km= input.nextDouble();

        double Tota_tutar = (per_price * uzunluk_km) + intro_price ;

        double compare = Tota_tutar < 20 ? 20.0 : Tota_tutar ;

        System.out.println("Odecek tutar:"+ compare);






    }
}
