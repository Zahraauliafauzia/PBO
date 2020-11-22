package com.pboreg; // Array List
import java.util.ArrayList;

class DataMobil {
    private ArrayList<String> mobil = new ArrayList<String>();

    public void setMobil(String data){
        this.mobil.add(data);
    }

    public void viewAll(){
        System.out.println("List Mobil : ");
        for(int i = 0; i< mobil.size(); i++){
            System.out.println("- " + mobil.get(i));
        }
    }

    public void viewAll2(){
        System.out.println("\nList Mobil : ");
        for(String data : mobil){
            System.out.println("- " + data);
        }
    }

    public void cariData(String cari){
        if (mobil.contains(cari)) {
            System.out.println("Data ketemu ");
        }else {
            System.out.println("Data tidak ketemu");
        }
    }

    public void gantiMobil(int index, String data){
        this.mobil.set(index, data);
    }

    public void gantiMobil2(String dataAsli, String dataGanti){
        int i;
        if (mobil.contains(dataAsli)) {
            i = mobil.indexOf(dataAsli);
            mobil.set(i,dataGanti);
        }
        else {
            System.out.println("Data asli tidak ketemu, " +
                    "maka data tidak ke ganti ");
        }

    }

    public void hapusMobil(String dataAsli) {
        int i;
        if (mobil.contains(dataAsli)) {
            i = mobil.indexOf(dataAsli);
            mobil.remove(i);
        }
        else {
            System.out.println("Data asli tidak ketemu, " +
                    "maka data tidak ke ganti ");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        DataMobil dm1 = new DataMobil();
        dm1.setMobil("Volvo");
        dm1.setMobil("Ford");
       // dm1.cariData("Volvo");
        //dm1.viewAll();
        //dm1.viewAll2();
        dm1.setMobil("Opel");
        dm1.gantiMobil2("Opel", "Kijang");
        dm1.viewAll2();

        dm1.hapusMobil("Volvo");
        dm1.viewAll2();
    }
}
