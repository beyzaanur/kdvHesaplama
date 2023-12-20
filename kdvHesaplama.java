
import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double fiyat , kdv = 0,kdvfiyat,kdvtutari;


        Scanner inp =new Scanner(System.in);

        System.out.print("fiyatı giriniz:");
        fiyat = inp.nextDouble();
        System.out.println("fiyat: "+ fiyat);


        if (fiyat >=0 && fiyat <= 1000) {
            kdv = fiyat * 0.18;
        }
        else{
            kdv = fiyat * 0.8;
        }


        kdvfiyat = (fiyat+kdv);
        System.out.println("kdv'li fiyat: "+ kdvfiyat);

        kdvtutari = (kdvfiyat - fiyat);
        System.out.println("kdv tutarı: "+ kdvtutari);

    }
}