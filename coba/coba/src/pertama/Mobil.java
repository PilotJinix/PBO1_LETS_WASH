package pertama;

import java.util.ArrayList;

public class Mobil extends Kendaraan {
    private ArrayList<String>bagasi=new ArrayList();



    public void besar_Bagasi(){
        System.out.printf("Masukkan volume bagasi = ");
        String bagasi = this.scanner.next();
        this.bagasi.add(bagasi);
    }



    public void hapus(){
        System.out.printf("confirm Id yang ingin dihapus = ");
        int id = scanner.nextInt();
        if (kedaraan_Id.contains(id)){
            int a = kedaraan_Id.indexOf(id);
            bagasi.remove(a);
            kedaraan_Id.remove(a);
        }
    }

}

