package pertama;
import java.util.Scanner;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.util.ArrayList;
//import java.text.Collator;//membandingkan string dengan hasil -1,0,1

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        Mobil mobil = new Mobil();
        Motor motor = new Motor();
        Truck truck = new Truck();
        Admin admin = new Admin();
        Pengguna pengguna = new Pengguna();

        pengguna.isi();
        admin.isi();
        int pilihan;
        String Username;
        String Password;
        Scanner scanner = new Scanner(System.in);//buat agar bisa inputan scanner
        //Collator collator = Collator.getInstance();
        while (true) {
            while (true) {
                System.out.println("=========================");
                System.out.println("SELAMAT DATANG DI WELCOME");
                System.out.println("=========================");
                System.out.println("Masuk Sebagai = ");
                System.out.println("1 . Customer \n2 . Admin ");
                System.out.print("Pilih sesuai angka = ");
                pilihan = scanner.nextInt();
                if (pilihan == 1) {
                    System.out.println("Apakah anda sudah mempunayi akun ? ya/tidak ");
                    String Pilihan = scanner.next();
                    if (Pilihan.equals("tidak")) {
                        pengguna.tambahakun();
                    } else if (Pilihan.equals("ya")) {
                        System.out.printf("Masukkan Username = ");
                        String user = scanner.next();
                        System.out.printf("Masukkan Password = ");
                        String pas = scanner.next();

                        if (pengguna.Username.contains(user) && pengguna.Password.contains(pas)) {
                            while (true) {
                                System.out.println("==============================");
                                System.out.println("Selamat datang Silakan mencuci");
                                System.out.println("==============================");
                                System.out.println();

                                System.out.println("==============================");
                                System.out.println("Ingin Mencuci Apa Hari Ini ? ");
                                System.out.println("1. Motor \n2. Mobil\n3.Truck\n4.selesai");
                                System.out.printf("Pilih Sesuai Nomer = ");
                                pilihan = scanner.nextInt();
                                if (pilihan == 1) {
                                    System.out.println("1");
                                    motor.Dicuci();
                                    motor.buatid();
                                    motor.besar_Bagasi();
                                    motor.transanksi();
                                    motor.antrian();
                                } else if (pilihan == 2) {
                                    System.out.println("2");
                                    mobil.Dicuci();
                                    mobil.buatid();
                                    mobil.besar_Bagasi();
                                    mobil.transanksi();
                                    mobil.antrian();

                                } else if (pilihan == 3) {
                                    System.out.println("3");
                                    truck.Dicuci();
                                    truck.buatid();
                                    //truck.getVolume_Box();
                                    truck.transanksi();
                                    truck.antrian();
                                } else if (pilihan == 4) {
                                    break;
                                } else {
                                    System.out.println("Silakan Coba lagi");
                                }

                            }
                        } else {
                            System.out.println("Password yang salah !!!");
                        }
                    }


                } else if (pilihan == 2) {
                    while (true) {
                        System.out.println("Apakah anda sudah mempunayi akun ? ya/tidak ");
                        String Pilihan = scanner.next();
                        if (Pilihan.equals("tidak")) {
                            admin.tambahakun();
                        } else if (Pilihan.equals("ya")) {
                            System.out.printf("Masukkan Username = ");
                            String user = scanner.next();
                            System.out.printf("Masukkan Password = ");
                            String pas = scanner.next();

                            if (admin.Username.contains(user) && admin.Password.contains(pas)) {
                                while (true) {
                                    System.out.println("===================");
                                    System.out.println("ADMIN");
                                    System.out.println("===================");
                                    System.out.println("1.Rincian kendaraan\n2.Penanganan\n3.Hapus rincian\n4.Rincian Admin");
                                    pilihan = scanner.nextInt();
                                    if (pilihan == 1) {
                                        System.out.println("=========Motor==========");
                                        motor.Rincian();
                                        System.out.println("==========Mobil=========");
                                        mobil.Rincian();
                                        System.out.println("=========Truck==========");
                                        truck.Rincian();
                                        System.out.println("===================");
                                    } else if (pilihan == 2) {
                                        admin.penangan();
                                    }
                                    else if (pilihan == 3){
                                        while (true) {
                                            System.out.println("1.Motor\n2.Mobil\n3.Truck\n4.selesai");
                                            pilihan = scanner.nextInt();
                                            if (pilihan == 1){
                                                System.out.println("===================");
                                                System.out.println("MOTOR");
                                                System.out.println("===================");
                                                motor.Rincian();
                                                System.out.println("===================");
                                                motor.hapusKendaraan();
                                                motor.hapus();
                                            }
                                            else if (pilihan == 2){
                                                System.out.println("===================");
                                                System.out.println("MOBIL");
                                                System.out.println("===================");
                                                mobil.Rincian();
                                                System.out.println("===================");
                                                mobil.hapusKendaraan();
                                                mobil.hapus();
                                            }
                                            else if (pilihan == 3){
                                                System.out.println("===================");
                                                System.out.println("TRUCK");
                                                System.out.println("===================");
                                                truck.Rincian();
                                                System.out.println("===================");
                                                truck.hapusKendaraan();
                                                truck.hapus();
                                            }
                                            else if (pilihan == 4){
                                                break;
                                            }
                                            else {
                                                System.out.println("Yang anda masukkan tidak  benar");
                                            }
                                        }
                                    }
                                    else if (pilihan == 4){
                                        admin.Rincian();
                                    }
                                    else {
                                        System.out.println("Coba Lagi");
                                    }
                                }
                            }
                        }
                    }
                }

            }

//                System.out.println("Masukkan Username dan Password anda hiya hiya hiya");
//
//                do {
//                    System.out.printf("Username = ");
//                    Username = scanner.next();
//                    System.out.printf("Password = ");
//                    Password = scanner.next();
//                    if (!Username.equals(U) && !Password.equals(P)) {
//                        System.out.println("Maaf Silakan coba lagi");
//                    }
//
//                }
//                while (!Username.equals(U) && !Password.equals(P));
//                System.out.println(U);
//                System.out.println(P);
//                System.out.println("==============================");
//                System.out.println("Selamat datang Silakan mencuci");
//                System.out.println("==============================");
//                System.out.println();
//                do {
//                    System.out.println("==============================");
//                    System.out.println("Ingin Mencuci Apa Hari Ini ? ");
//                    System.out.println("1. Motor \n2. Mobil\n3.Truck");
//                    System.out.printf("Pilih Sesuai Nomer = ");
//                    pilihan = scanner.nextInt();
//                    if (pilihan == 1) {
//                        System.out.println("1");
//                        kendaraan.Dicuci();
//                        mobil.besar_Bagasi();
//                        mobil.transanksi();
////                    for (int i=0;i<kendaraan.getKedaraan_Id().size();i++){
////                        //System.out.println(kendaraan.getKedaraan_Id().get(i));
////                    }
//                    }
//                    if (pilihan == 2) {
//                        System.out.println("2");
//                        kendaraan.Dicuci();
//                    }
//                    if (pilihan == 3) {
//                        System.out.println("3");
//                        kendaraan.Dicuci();
//                    }
//                    if (pilihan != 1 & pilihan != 2 & pilihan != 3) {
//                        System.out.println("Silakan Coba lagi");
//                    }
//                } while (pilihan != 1 & pilihan != 2 & pilihan != 3);
//
//            }
//            if (pilihan == 2) {
//
//            }


        }
    }
}
