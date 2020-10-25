package pertama;

import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.Scanner;

public class Kendaraan {
    protected ArrayList<Integer>kedaraan_Id = new ArrayList();
    protected ArrayList<String>plat_Kendaraan = new ArrayList();
    protected ArrayList<String>nama_Pemilik = new ArrayList();
    protected ArrayList<String>warna = new ArrayList();
    protected ArrayList<String>merk = new ArrayList();

    Scanner scanner = new Scanner(System.in);
    public void Dicuci(){
        //System.out.printf("Masukkan ID Kendaran = ");
        //int kendaraan_id = this.scanner.nextInt();
        //this.kedaraan_Id.add(kendaraan_id);
        System.out.printf("Masukkan Plat Kendaran Anda = ");
        String plat_kendaraan = this.scanner.next();
        this.plat_Kendaraan.add(plat_kendaraan);
        System.out.printf("Masukkan Nama Anda = ");
        String nama_pemilik = this.scanner.next();
        this.nama_Pemilik.add(nama_pemilik);
        System.out.printf("Masukkan Warna Kendaran Anda = ");
        String warna =this.scanner.next();
        this.warna.add(warna);
        System.out.printf("Masukkan Merk Kendaran Anda = ");
        String merk =this.scanner.next();
        this.merk.add(merk);
    }
    public void transanksi(){
        System.out.printf("Masukkan jenis kendaraan = ");
        String ken = scanner.next();
        if (ken.equals("Motor")){
            int total = 10000;
            System.out.println("Total Pembayaran = "+total);
        }else if (ken.equals("Mobil")){
            int total = 50000;
            System.out.println("Total Pembayaran = "+total);
        }else if (ken.equals("Truck")){
            int total = 100000;
            System.out.println("Total Pembayaran = "+total);
        }
        else {
            System.out.println("Maaf Id Tidak Ada");
        }
    }
    public void Rincian(){
        System.out.println("Id = "+kedaraan_Id);
        System.out.println("Nama = "+nama_Pemilik);
        System.out.println("Plat = "+plat_Kendaraan);
        System.out.println("Warna = "+warna);
        System.out.println("Merk = "+merk);

    }
    public void hapusKendaraan(){
        System.out.printf("Masukkan Id yang ingin dihapus = ");
        int id = scanner.nextInt();
        if (kedaraan_Id.contains(id)){
            int a = kedaraan_Id.indexOf(id);
            nama_Pemilik.remove(a);
            plat_Kendaraan.remove(a);
            warna.remove(a);
            merk.remove(a);
        }
    }

    public void antrian() {
        int i=0;
        for(int a=1;a<=kedaraan_Id.size();a++){
            //System.out.println(kedaraan_Id.size());
            i+=1;
        }
        System.out.println("Nomor Antrian = "+i);
    }
    public void buatid(){
        int j=111;
        for (int b=1;b<=plat_Kendaraan.size();b++){
            j+=1;
        }
        this.kedaraan_Id.add(j);
    }
}
