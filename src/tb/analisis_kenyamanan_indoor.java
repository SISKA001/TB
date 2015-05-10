package tb;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public abstract class analisis_kenyamanan_indoor {

    //public static void main(String[] args){

    private String sirkuit_udara;
    private String pencahayaan;
    private String kelembapan;
    private int suhu_ruangan;

    Scanner scan = new Scanner(System.in);

    public void setsirkuit_udara(String sirkuit_udara) {
        this.sirkuit_udara = sirkuit_udara;
    }

    public String getsirkuit_udara() {
        return this.sirkuit_udara;
    }

    public void setpencahayaan(String pencahayaan) {
        this.pencahayaan = pencahayaan;
    }

    public String getpencahayaan() {
        return this.pencahayaan;
    }

    public void setkelembapan(String kelembapan) {
        this.kelembapan = kelembapan;
    }

    public String getkelembapan() {
        return this.kelembapan;
    }

    public void setsuhu_ruangan(int suhu_ruangan) {
        this.suhu_ruangan = suhu_ruangan;
    }

    public int getsuhu_ruangan() {
        return this.suhu_ruangan;
    }

    String sirkuit_udara(String sirkuit_udara) {
        if ("lancar".equals(sirkuit_udara)) {
            return "Sesuai";
        } else {
            return "Tidak Sesuai";
        }
    }

    String pencahayaan(String pencahayaan) {
        if ("Standar Kesehatan".equals(pencahayaan)) {
            return "Sesuai";
        } else {
            return "Tidak Sesuai";
        }
    }

    String kelembapan(String kelembapan) {
        if ("Sedang".equals(kelembapan)) {
            return "Sesuai";
        } else {
            return "Tidak Sesuai";
        }
    }

    String suhu(int suhu_ruangan) {
        if (suhu_ruangan <= 25 && suhu_ruangan >= 30) {
            return "Sesuai";
        } else {
            return "Tidak Sesuai";
        }
    }

    abstract void analisis();

}
