package pertama;

import java.util.ArrayList;

public class Motor extends Kendaraan {
    private ArrayList<String>jock = new ArrayList();


    public void besar_Bagasi(){
        System.out.printf("Masukkan volume bagasi = ");
        String bagasi = this.scanner.next();
        this.jock.add(bagasi);
    }



    public void hapus(){
        System.out.printf("confirm Id yang ingin dihapus = ");
        int id = scanner.nextInt();
        if (kedaraan_Id.contains(id)){
            int a = kedaraan_Id.indexOf(id);
            jock.remove(a);
            kedaraan_Id.remove(a);
        }
    }
}
