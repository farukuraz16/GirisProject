package girisProject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {
    // TODO TASK 2. step ---->>>>

    ArrayList<Kullanıcı> kullanıcıKisiler = new ArrayList<>(); //kullanıcı classta oluşturulacak objlerin tutulacağıu list yaptık

    public ArrayList<Kullanıcı> kayıtAl (){//kullanıcı, class'dan obj üretmek
        // için name ve kayıtZamanı bilgilerini oluşturup, oluşan obj'yi liste ekler.
        //<> arasına, liste ekleyeceğimiz data type'ını yazmalıyız. Bunlar Integer, String vs.
        //ama burada ekleyeceklerimiz ne String ne Integer.
        // "Kullanıcı" classından ürettiğimiz objleri ekleyeceğiz.
        //Bu yüzden <> arasına class adını yazıyoruz. Bu classdan gelecek objeleri ekleyeceğimizi belirtiyoruz.

        Scanner sc = new Scanner(System.in);
        System.out.println("adınızı giriniz :");
        String ad = sc.nextLine();
        Kullanıcı k1= new Kullanıcı(ad, LocalDateTime.now());
        kullanıcıKisiler.add(k1);//oluşturulan k1 objsi liste eklendi.

return kullanıcıKisiler;
    }

    // TODO TASK 3. step ---->>>>
    public void sanslıKullanıcı (ArrayList<Kullanıcı> kllObj){
        //Kullanıcı listindeki objlerin kayıt zamanına bakmak için...
        for ( Kullanıcı k: kllObj ) {

            //burada kullanacağım obj ("kllObj" bu metot için isim verdik) 'yi çağırmak için
            // foreach döngüsünde bir type atamam gerek. String mi Integer mi Boolean mı ne?
            // bu obj'nin type'ı "Kullanıcı" dır.. "Kullanıcı" classından gelendir.
            // ArrayList olşutururken de aynı type kulanılmıştı.
            //k datası, foreach döngüsünde çekirdeklerimizi elimize almamız için oluşturuldu.

            if (k.kayıtZamanı.getSecond()<=10){
                System.out.println(k.name+"! şanslı kişisin! 10 saniyeden kısa sürede işlem yaptın. bravo!"+" sisteme giriş zamanı= "+ k.kayıtZamanı);
            }
            else System.out.println(k.name+"! maalesef 10 saniyeden daha uzun sürede işlem yaptın. şanssız günündesin."+" sisteme giriş zamanı= "+ k.kayıtZamanı);
            
        }

    }

    public void listele(ArrayList<Kullanıcı> kllObj){
        System.out.println(kllObj);//objleri Kullanıcı classtaki toString metotu print eder.

    }

}
