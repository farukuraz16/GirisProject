package girisProject;

import java.util.ArrayList;
import java.util.Scanner;

public class GirişPaneli {
    //public static void giris() {//->> istersek static yapmayız. ve bu methodu obj ile çağırırız..
    public void giris() {


        Scanner dat = new Scanner(System.in);
        Kayıt yeniKayıt = new Kayıt();
        //"Kayıt" classında herhangi bir constructor oluşturmadık.
        //bu yüzden parametresiz bir "yeniKayıt" objsi oluşturduk.

        //TODO Kayıt classdaki metotlar static yapılsaydı metot adıyla çağırabilirdik.

        ArrayList<Kullanıcı> kisi = new ArrayList<>();
        //"Kullanıcı" classındaki method bana list olarak return verdiği için boş bir list oluşturdum.
        //"Kullanıcı" classından çekeceğim objleri bu liste ekleyeceğim.

        boolean cikilsinMi = true;
        while (cikilsinMi) {
            System.out.println("yapmak istediğiniz işlem: "
                    + "\n1-> Kullanıcı kaydı al \n2->Şanslı kişiyi bul \n3-> Listele \n4->Çıkış");
            int tercih = dat.nextInt();

            switch (tercih) {
                case 1:
                    kisi=yeniKayıt.kayıtAl();//"yeniKayıt" objsiyle "Kayıt" classından metot çağırdık.
                    break;
                case 2:
                    yeniKayıt.sanslıKullanıcı(kisi);
                    break;
                case 3:
                    yeniKayıt.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=false;
                    System.out.println("iyi günler dileriz");
                    break;
                default: System.out.println("hatalı giriş yaptınız. tekrar deneyiniz");
            }

        }

    }
}
