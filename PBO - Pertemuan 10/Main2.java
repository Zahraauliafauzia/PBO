package com.pboreg;

class ContohArray{
    private int [] angka = {10,5,3,15,12,32};

    //akses array
    public void viewAllManual(){
        //sebut datanya satu-satu berdasarkan index
        System.out.println("Nilai 1 = " + this.angka[0]);
        System.out.println("Nilai 2 = " + this.angka[1]);
        System.out.println("Nilai 3 = " + this.angka[2]);
        System.out.println("Nilai 4 = " + this.angka[3]);
        System.out.println("Nilai 5 = " + this.angka[4]);
        System.out.println("Nilai 6 = " + this.angka[5]);
    }

    public void viewAllFor(){       //Perulangan dengan for
        System.out.println("\nview by loop For");

        for(int i=0; i < this.angka.length; i++){
            System.out.println("Nilai" +  (i+1) + " = " + this.angka[i]);
        }
    }

    public void viewAllWhile(){        //Perulangan dengan while
        //inisialisasi
        System.out.println("\nview by loop While");
        int i=0;
        while (i < this.angka.length){
            System.out.println("Nilai" +  (i+1) + " = " + this.angka[i]);
            i++;
        }
    }

    public void viewByID(int i){
        System.out.println("\nView by index");
        System.out.println("Nilai" +  (i+1) + " = " + this.angka[i]);

    }

    public void totalData(){
        System.out.println("\nTotal Data");

        for(int i=0; i < this.angka.length; i++){
            System.out.println("Nilai" +  (i+1) + " = " + this.angka[i]);
        }
        int jml=0;
        for( int allId : angka) {
            jml = jml + allId;
        }
        System.out.println("Jumlah Array = " + jml);

        int jml2=0;
        for(int i=0; i < 6; i++){
            jml2 = jml2 + this.angka[i];
        }
        System.out.println("Jumlah Array (beda algoritma) = " + jml2 );

    }

    public void ratarata(){
        int jml=0;
        for( int allId : angka) {
            jml = jml + allId;
        }
        System.out.println("\nJumlah Array = " + jml);

        double rata2;
        rata2 = (double) jml / this.angka.length;
        System.out.println("Rata-rata = " + rata2);
        System.out.println(String.format("Rata-rata = %.2f", rata2));

    }

}

public class Main2 {
    public static void main(String [] args){
        //Membuat objek
        ContohArray objArray1 = new ContohArray();
        objArray1.viewAllManual();
        objArray1.viewAllFor();
        objArray1.viewAllWhile();
        objArray1.viewByID(2);
        objArray1.totalData();
        objArray1.ratarata();
    }
}
