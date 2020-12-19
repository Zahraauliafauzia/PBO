package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Label label_pesan;
    public TextField text_pesan;
    public Label label_hasil;
    public TextField text_angka1;
    public TextField text_angka2;

    private int a = 0;
    private double angka1,angka2,hasil;
    private String operasi;

    public void buttomPesanKlik(ActionEvent actionEvent) {
        String pesan;
        a++;

        pesan = text_pesan.getText().toUpperCase();
        System.out.println(pesan);

        label_pesan.setText(pesan);
    }


    public void buttomTambahKlik(ActionEvent actionEvent) {
        String tambah;
        tambah = " + ";

        label_hasil.setText("0");
    }

    public void buttomKurangKlik(ActionEvent actionEvent) {
        String kurang;
        kurang = " - ";
        label_hasil.setText("0");
    }

    public void buttomKaliKlik(ActionEvent actionEvent) {
        String kali;
        kali = " * ";
        label_hasil.setText("0");
    }

    public void buttomBagiKlik(ActionEvent actionEvent) {
        String bagi;
        bagi = " / ";
        label_hasil.setText("0");
    }

    public void buttomHapusKlik(ActionEvent actionEvent) {
        String hapus;

        hapus ="0";
        label_hasil.setText(hapus);
    }

    public void buttomHasilKlik(ActionEvent actionEvent) {
        if (operasi == "+"){
            angka1 = Double.parseDouble(text_angka1.getText());
            angka2 = Double.parseDouble(text_angka2.getText());
            text_angka1.setText("");
            text_angka2.setText("");
            hasil = angka1 + angka2;

            label_hasil.setText(angka1 + " + " + angka2 + " = " + hasil);
        }
        if (operasi == "-"){
            angka1 = Double.parseDouble(text_angka1.getText());
            angka2 = Double.parseDouble(text_angka2.getText());
            text_angka1.setText("");
            text_angka2.setText("");
            hasil = angka1 - angka2;

            label_hasil.setText(angka1 + " - " + angka2 + " = " + hasil);
        }
        if (operasi == "*") {
            angka1 = Double.parseDouble(text_angka1.getText());
            angka2 = Double.parseDouble(text_angka2.getText());
            text_angka1.setText("");
            text_angka2.setText("");
            hasil = angka1 * angka2;

            label_hasil.setText(angka1 + " x " + angka2 + " = " + hasil);
        }
        if(operasi == "/"){
            angka1 = Double.parseDouble(text_angka1.getText());
            angka2 = Double.parseDouble(text_angka2.getText());
            text_angka1.setText("");
            text_angka2.setText("");
            hasil = angka1 / angka2;

            label_hasil.setText(angka1 + " / " + angka2 + " = " + hasil);
        }
    }
}
