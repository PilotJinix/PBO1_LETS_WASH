package pertama;

import java.util.ArrayList;

public class Truck extends Kendaraan {
    private ArrayList<Integer>volume_Box=new ArrayList<Integer>();

    public ArrayList<Integer> getVolume_Box() {
        return volume_Box;
    }

    public void setVolume_Box(ArrayList<Integer>volume_Box) {
        this.volume_Box = volume_Box;

    }

    public void hapus(){
        System.out.printf("confirm Id yang ingin dihapus = ");
        int id = scanner.nextInt();
        if (kedaraan_Id.contains(id)){
            int a = kedaraan_Id.indexOf(id);
            volume_Box.remove(a);
            kedaraan_Id.remove(a);
        }
    }
}
