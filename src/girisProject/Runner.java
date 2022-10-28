package girisProject;

import javax.security.sasl.SaslClient;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //GirişPaneli.giris(); //methodu static yaptığımızda bunu kullanırız. direkt metod adıyla çağırırız.

        //method static değil. obj ile metdohu çağırıyoruz--->>>
        GirişPaneli grsObj = new GirişPaneli();
        grsObj.giris();


    }
}
