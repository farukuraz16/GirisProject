package girisProject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kullanıcı {

    String name;
    LocalDateTime kayıtZamanı;
// TODO  TASK 1. step ---->>>>

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı  ;//obj dataları print etmek için string diline çevirir.
    }


}
