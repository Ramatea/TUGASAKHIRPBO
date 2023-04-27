package kopi_project;

import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Kopi> datakopi = new ArrayList<>();
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader input = new BufferedReader(p);


    // static void sleep(int sec) {
    //     try {
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    // }

    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean lanjut = true;
        while (lanjut) {
            clear();
            System.out.println("======================");
            System.out.println("=      Data kopi     =");
            System.out.println("======================");
            System.out.println("= 1.  Tambah Kopi    =");
            System.out.println("= 2.  Lihat  Kopi    =");
            System.out.println("= 3.  Update Kopi    =");
            System.out.println("= 4.  Hapus  Kopi    =");
            System.out.println("= 5.  Keluar Program =");
            System.out.println("======================");
            System.out.print("Masukkan pilihan Anda >> ");
            int pilihan = Error_int();
            switch (pilihan) {
                case 1:
                    clear();
                    nambah_kopi();
                    break;
                case 2:
                    clear();
                    lihat_data();
                    break;
                case 3:
                    clear();
                    Update_data();
                    break;
                case 4:
                    clear();
                    delete_data();
                    break;
                case 5:
                    clear();
                    System.exit(0);
                    break;
                default:
                    System.out.println("=================");
                    System.out.println("pilihan tidak ada");
                    System.out.println("=================");
                    break;
            }
        }
    }

    static void nambah_kopi() throws NumberFormatException, IOException {
        System.out.println("========================");
        System.out.println("1. Tambah KOPI      SUSU");
        System.out.println("2. Tambah KOPI CAPPUCINO");
        System.out.println("========================");
        System.out.print("Masukkan pilihan >> ");
        int p = Error_int();
        switch (p) {
            case 1:
                clear();
                System.out.print("Masukkan id kopi >> ");
                int id_kopi = Error_int();
                System.out.print("Masukkan nama kopi >> ");
                String nm_kopi = input.readLine();
                System.out.print("Masukkan harga kopi >> ");
                int hr_kopi = Error_int();
                System.out.print("Masukkan berat kopi >> ");
                float br_kopi = Error_float();
                Cappucino nCappucino = new Cappucino(id_kopi, hr_kopi, nm_kopi, br_kopi, "Kopi Cappucino");
                datakopi.add(nCappucino);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                break;
            case 2:
                clear();
                System.out.print("Masukkan id kopi >> ");
                int id = Error_int();
                System.out.print("Masukkan nama kopi >> ");
                String nm = input.readLine();
                System.out.print("Masukkan harga kopi >> ");
                int hr = Error_int();
                System.out.print("Masukkan berat kopi >> ");
                float br = Error_float();
                Kopi_susu kSusu = new Kopi_susu(id, hr, nm, br, "Kopi susu");
                datakopi.add(kSusu);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                break;
            default:
                System.out.println("=================");
                System.out.println("pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }

    static void Update_data() throws NumberFormatException, IOException {
        System.out.println("=============================");
        System.out.println("1. UPDATE DATA KOPI SUSU     ");
        System.out.println("2. UPDATE DATA KOPI CAPPUCINO");
        System.out.println("=============================");
        System.out.print("Masukkan pilihan >> ");
        int p = Error_int();
        switch (p) {
            case 1:
                clear();
                System.out.print("Masukkan nama kopi >>> ");
                String na = input.readLine();
                for (Kopi ks : datakopi) {
                    if (ks.getproduk_kopi().equals(na)) {
                        System.out.println("=================================================================================================================================");
                        System.out.println("\n| ID KOPI |\tPRODUK KOPI            |\tHARGA KOPI                 |\tBERAT KOPI\t         |\tJENIS\t        |");
                        System.out.println("=================================================================================================================================");
                        ks.lihat();
                        System.out.print("Masukkan nama kopi >> ");
                        ks.setnama_produk(input.readLine());
                        System.out.print("Masukkan harga kopi >> ");
                        ks.setHarga(Error_int());
                        System.out.print("Masukkan berat kopi >> ");
                        ks.set_berat(Error_float());
                        System.out.println("");
                        System.out.println("===========================");
                        System.out.println("=  DATA BERHASIL DIRUBAH  =");
                        System.out.println("===========================");
                        System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                        break;
                    }
                }
                break;
            case 2:
                clear();
                System.out.print("Masukkan nama kopi >>> ");
                String n = input.readLine();
                for (Kopi c : datakopi) {
                    if (c.getproduk_kopi().equals(n)) {
                        System.out.println("=================================================================================================================================");
                        System.out.println("\n| ID KOPI |\tPRODUK KOPI            |\tHARGA KOPI                 |\tBERAT KOPI\t         |\tJENIS\t        |");
                        System.out.println("=================================================================================================================================");
                        c.lihat();
                        System.out.print("Masukkan nama kopi >> ");
                        c.setnama_produk(input.readLine());
                        System.out.print("Masukkan harga kopi >> ");
                        c.setHarga(Error_int());
                        System.out.print("Masukkan berat kopi >> ");
                        c.set_berat(Error_float());
                        System.out.println("");
                        System.out.println("===========================");
                        System.out.println("=  DATA BERHASIL DIRUBAH  =");
                        System.out.println("===========================");
                        System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                        break;
                    }
                }
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }
    }

    static void delete_data() throws NumberFormatException, IOException {
        System.out.println("======================");
        System.out.println("1.Hapus kopi      susu");
        System.out.println("2.Hapus kopi Cappucino");
        System.out.println("======================");
        System.out.print("Masukkan pilihan anda >> ");
        int pilihan = Error_int();
        switch (pilihan) {
            case 1:
                clear();
                System.out.print("Masukkan nama kopi >>> ");
                String nm = input.readLine();
                for (int i = 0; i < datakopi.size(); i++) {
                    if (datakopi.get(i).getproduk_kopi().equals(nm)) {
                        System.out.println("=================================================================================================================================");
                        System.out.println("\n| ID KOPI |\tPRODUK KOPI            |\tHARGA KOPI                 |\tBERAT KOPI\t         |\tJENIS\t        |");
                        System.out.println("=================================================================================================================================");
                        datakopi.get(i).lihat();
                        System.out.println("Yakin ingin menghapus Data [Y/N] >>> ");
                        String yakin = input.readLine();
                        if(yakin.equalsIgnoreCase("y")){
                            datakopi.remove(i);
                            System.out.println("=======================");
                            System.out.println(" DATA BERHASIL DIHAPUS ");
                            System.out.println("=======================");
                            System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                        }
                        else if(yakin.equalsIgnoreCase("n")){
                            System.out.println("====================================");
                            System.out.println("Data tidak berhasil dihapus Tuan >_<");
                            System.out.println("====================================");
                        }
                        else{
                            System.err.println("=======================");
                            System.err.println("= Error 404 Not Found =");
                            System.err.println("=======================");
                        }
                    }
                }
                // sleep(1);
                break;
            case 2:
                clear();
                System.out.print("Masukkan nama kopi >>> ");
                String u_name = input.readLine();
                for (int i = 0; i < datakopi.size(); i++) {
                    if (datakopi.get(i).getproduk_kopi().equals(u_name)) {
                        System.out.println("=================================================================================================================================");
                        System.out.println("\n| ID KOPI |\tPRODUK KOPI            |\tHARGA KOPI                 |\tBERAT KOPI\t         |\tJENIS\t        |");
                        System.out.println("=================================================================================================================================");
                        datakopi.get(i).lihat();
                        System.out.println("Yakin ingin menghapus Data [Y/N] >>> ");
                        String yakin = input.readLine();
                        if(yakin.equalsIgnoreCase("y")){
                            datakopi.remove(i);
                            System.out.println("=======================");
                            System.out.println(" DATA BERHASIL DIHAPUS ");
                            System.out.println("=======================");
                            System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                        }
                        else if(yakin.equalsIgnoreCase("n")){
                            System.out.println("=========================");
                            System.out.println(" DATA TIDAK JADI DIHAPUS ");
                            System.out.println("=========================");
                            System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                        }
                        else{
                            System.err.println("=======================");
                            System.err.println("= Error 404 Not Found =");
                            System.err.println("=======================");
                        }
                    }
                }
                // sleep(1);
                break;
            default:
                System.out.println("=================");
                System.out.println("Pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }

    static void lihat_data() throws NumberFormatException, IOException {
        System.out.println("Lihat data");
        System.out.println("========================");
        System.out.println("1. Lihat KOPI       SUSU");
        System.out.println("2. LIHAT KOPI  CAPPUCINO");
        System.out.println("========================");
        System.out.print("Masukkan pilihan >> ");
        int pil = Error_int();
        switch (pil) {
            case 1:
            clear();
            System.out.println("=================================================================================================================================");
            System.out.println("\n| ID KOPI |\tPRODUK KOPI            |\tHARGA KOPI                 |\tBERAT KOPI\t         |\tJENIS\t        |");
            System.out.println("=================================================================================================================================");
                for (Kopi kp : datakopi) {
                    kp.lihat();
                }
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                break;
            case 2:
            clear();
            System.out.println("=================================================================================================================================");
            System.out.println("\n| ID KOPI |\tPRODUK KOPI            |\tHARGA KOPI                 |\tBERAT KOPI\t         |\tJENIS\t        |");
            System.out.println("=================================================================================================================================");
                for (Kopi kp : datakopi) {
                    kp.lihat();
                }
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");input.readLine();
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }
    }

    private static int Error_int() throws IOException{
        int masukkan_integer = 0;
        while(true){
            try{
                masukkan_integer = Integer.parseInt(input.readLine());
                break;
            }catch(NumberFormatException  e){
                System.err.print("Inputan harus Integer >> ");
            }
        }
        return masukkan_integer;
    }

    private static float Error_float() throws IOException{
        float masukan_float = 0;
        while(true){
            try{
                masukan_float = Float.parseFloat(input.readLine());
                break;
            }catch(NumberFormatException  e){
                System.err.print("Inputan harus Float >> ");
            }
        }
        return masukan_float;
    }
}
