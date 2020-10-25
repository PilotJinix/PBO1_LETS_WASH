package pertama;

import java.util.ArrayList;

public class Admin extends Person implements Data {
     ArrayList<Integer>admin_Id=new ArrayList();
     ArrayList<String>Nama=new ArrayList();
     Motor motor = new Motor();

    public void penangan(){
        System.out.printf("Masukkan Id admin = ");
        int id = scanner.nextInt();
        admin_Id.add(id);

        int a = admin_Id.indexOf(id);
        System.out.printf("Masukkan Nama Admin Penanganan pencucian = ");
        String nama = scanner.next();
        Nama.add(nama);

    }
    public void Rincian(){
        System.out.println("Id Admin = "+admin_Id);
        System.out.println("Nama     = "+Nama);
    }
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

