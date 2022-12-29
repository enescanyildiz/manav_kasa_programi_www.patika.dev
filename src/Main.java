import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        double armut,elma,domates,muz,patlican,armut_kg=2.14,elma_kg=3.67,domates_kg=1.11,muz_kg=0.95,patlican_kg=5.00,
                armut_fiyat,elma_fiyat,domates_fiyat,muz_fiyat,patlican_fiyat,toplam;
        System.out.print("Armut Fiyat: "+ armut_kg + " Kaç Kilo: " );
        armut=input.nextDouble();
        System.out.print("Elma Fiyat: "+ elma_kg + " Kaç Kilo: " );
        elma=input.nextDouble();
        System.out.print("Domates Fiyat: "+ domates_kg + " Kaç Kilo: " );
        domates=input.nextDouble();
        System.out.print("Muz Fiyat: "+ muz_kg + " Kaç Kilo: " );
        muz=input.nextDouble();
        System.out.print("Patlıcan Fiyat: "+ patlican_kg + " Kaç Kilo: " );
        patlican=input.nextDouble();

        armut_fiyat=armut_kg*armut;
        elma_fiyat=elma*elma_kg;
        muz_fiyat=muz_kg*muz;
        patlican_fiyat=patlican_kg*patlican;
        domates_fiyat=domates_kg*domates;

        System.out.println("-------Alışveriş Sepetiniz-------");
        System.out.println(armut+ " KG Armut"+ " Fiyat: "+armut_fiyat);
        System.out.println(elma+ " KG Elma"+ " Fiyat: "+ elma_fiyat);
        System.out.println(domates+ " KG Domates"+ " Fiyat: "+domates_fiyat);
        System.out.println(muz+ " KG Muz"+ " Fiyat: "+muz_fiyat);
        System.out.println(patlican+ " KG Patlıcan"+ " Fiyat: "+patlican_fiyat);
        toplam=muz_fiyat+armut_fiyat+elma_fiyat+patlican_fiyat+domates_fiyat;
        System.out.println("Toplam Tutar: "+ toplam);
    }
}