package pertama;

import java.util.ArrayList;

public class Pengguna extends Person implements Data {


    public void isi(){
        Username.add("agung");
        Password.add("agung123");
    }


    @Override
    public void tambahakun() {
        System.out.printf("Masukkan Username = ");
        String username = scanner.next();
        Username.add(username);

        System.out.printf("Masukkan Password = ");
        String pass = scanner.next();
        Password.add(pass);
    }
}
