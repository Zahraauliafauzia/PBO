package com.pboreg;

class Data {

    private int nim;
    String nama, prodi, unive;
    private int tahun = 20;
    double IPK;


    //Method
    public int tampilkan_nim(){
        return this.nim;
    }
    public int tampilkan_tahun(){

        return this.tahun;
    }


    public void inputNim(int nilai){
        this.nim = nilai;
    }
    public void inputB(int nilai){
        this.tahun = nilai;
    }


    void run(){
        System.out.println("Nama        : " + nama );
        System.out.println("Jurusan     : " + prodi);
        System.out.println("IPK         : " + IPK);
    }
    void univ(){
        System.out.println("Universitas : " + unive);
    }

}


