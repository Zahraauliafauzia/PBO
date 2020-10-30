package quiz4;

import java.util.Scanner;

class Fasilitas {
    String toko;
    double internet, ngetik, game;
    double jumInter, jumNgetik, jumGame, jumWarna, juMono, jumTeh, jumScan,biayaTot;
    int prWarna, prMono, teh, scan;
    String nama, umur;


    Fasilitas(String toko){
        this.toko = toko;

    }

    public Fasilitas(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public Fasilitas() {

    }


    void hitung(){
            jumInter = (internet/60) * 4000;
            jumNgetik = (ngetik/60) * 2000;
            jumGame = (game/60) * 5000;
            jumScan = scan * 1000;
            jumWarna = prWarna * 500;
            juMono = prMono * 300;
            jumTeh = teh * 3000;

        biayaTot = jumInter+jumNgetik+jumGame+jumWarna+juMono+jumTeh+jumScan;
        System.out.println("\n------------------------------------------------------------------");
        System.out.println("               BIAYA RENTAL KOMPUTER");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Biaya internet            = ("+internet+":60) menit x Rp 4000 = Rp " + jumInter);
        System.out.println("Biaya ngetik              = ("+ngetik+":60) menit x Rp 2000  = Rp " + jumNgetik);
        System.out.println("Biaya game online         = ("+game+":60) menit x Rp 5000  = Rp " + jumGame);
        System.out.println("Biaya Scan                = ("+scan+" file x Rp 1000         = Rp " + jumScan);
        System.out.println("Biaya print warna         = "+prWarna+" lembar x Rp 500         = Rp " + jumWarna);
        System.out.println("Biaya print monokrom      = "+prMono+" lembar x Rp 300         = Rp " + juMono);
        System.out.println("Biaya teh botol           = "+teh+" botol x Rp 3000         = Rp " + jumTeh);

        System.out.println("\nBiaya yang harus dibayar = " + biayaTot);
        System.out.println("-------------------------------------------------------------------");
    }

    void display(){
        Scanner input = new Scanner(System.in);


        System.out.println("Ingin sementara di Warnet " + this.toko + ":D");
        System.out.println("\nIsi fasilitas yang dipakai [banyak/0]");
        System.out.print("Internet    (menit)           = ");
        internet = input.nextDouble();
        System.out.print("Ngetik      (menit)           = ");
        ngetik = input.nextDouble();
        System.out.print("Game online (menit)           = ");
        game = input.nextDouble();
        System.out.print("Scan (jumlah file)            = ");
        scan = input.nextInt();
        System.out.print("Print warna (jumlah lembar)   = ");
        prWarna = input.nextInt();
        System.out.print("Print monokrom(jumlah lembar) = ");
        prMono = input.nextInt();
        System.out.print("Teh botol (jumlah botol)      = ");
        teh = input.nextInt();
    }

    public String getUmur() {
        return umur;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
