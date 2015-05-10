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
public abstract class peralatan_dan_kondisiperalatan {
   private int jumlah_lampu;
    private String kondisi_lampu;
    private String posisi_lampu;
    private int jumlah_kipas_angin;
    private String kondisi_kipas_angin;
    private String posisi_kipas_angin;
    private int jumlah_AC;
    private String kondisi_AC;
    private String posisiAC;
    private int jumlah_LCD;
    private String kondisi_LCD;
    private int jumlah_stopkontak;
    private String kondisi_stopkontak;
    private String posisi_stopkontak;
    private String pilihanSSID;
    private int jumlah_CCTV;
    private String kondisi_CCTV;
    private String posisi_CCTV;
    private int jumlah_CCV;
    Scanner scan = new Scanner (System.in);

     public void setjumlah_lampu(int jumlah_lampu){
        this.jumlah_lampu = jumlah_lampu;
       }
     public int getjumlah_lampu(){
            return this.jumlah_lampu;
        }
      public void setkondisi_lampu (String kondisi_lampu){
        this.kondisi_lampu = kondisi_lampu;
         }
     public String getkondisi_lampu(){
            return this.kondisi_lampu;   
     }
      public void setposisi_lampu (String posisi_lampu){
        this.posisi_lampu = posisi_lampu;
      }
      public String getposisi_lampu(){
            return this.posisi_lampu;
        }
      public void setjumlah_kipas_angin (int jumlah_kipas_angin){
        this.jumlah_kipas_angin= jumlah_kipas_angin;
       }
     public int getjumlah_kipas_angin(){
            return this.jumlah_kipas_angin;
        }
      public void setkondisi_kipas_angin (String posisi_kipas_angin){
        this.posisi_kipas_angin= posisi_kipas_angin;
       }
     public String getkondisi_kipas_angin(){
            return this.kondisi_kipas_angin;
        }
      public void setposisi_kipas_angin (String posisi_kipas_angin){
        this.posisi_kipas_angin = posisi_kipas_angin;
       }
     public String getposisi_kipas_angin(){
            return this.posisi_kipas_angin;
        }
      public void setjumlah_AC (int jumlah_AC){
        this.jumlah_AC = jumlah_AC;
       }
     public int getjumlah_AC(){
            return this.jumlah_AC;
        }
      public void setkondisi_AC (String kondisi_AC){
        this.kondisi_AC = kondisi_AC;
        }
     public String getkondsi_AC(){
            return this.kondisi_AC;
        }
      public void setposisiAC (String posisiAC){
        this.posisiAC = posisiAC;
       }
     public String getposisiAC(){
            return this.posisiAC;
        }
      public void setjumlah_LCD (int jumlah_LCD){
        this.jumlah_LCD = jumlah_LCD;
       }
     public int getjumlah_LCD(){
            return this.jumlah_LCD;
            
        }
      public void setkodisi_LCD(String kondisi_LCD){
        this.kondisi_LCD = kondisi_LCD;
       }
     public String getkondisi_LCD(){
            return this.kondisi_LCD;
        }
      public void setjumlah_stopkontak (int jumlah_stopkontak){
        this.jumlah_stopkontak = jumlah_stopkontak;
       }
     public int getjumlah_stopkontak(){
            return this.jumlah_stopkontak;
        }
     public void setkondisi_stopkontak (String kondisi_stopkontak){
         this.kondisi_stopkontak = kondisi_stopkontak;
       }
     public String getkondisi_stopkontak(){
         return this.kondisi_stopkontak;
     }
      public void setposisi_stopkontak (String posisi_stopkontak){
        this.posisi_stopkontak = posisi_stopkontak;
       }
     public String getposisi_stopkontak(){
            return this.posisi_stopkontak;
        }
      public void setpilihanSSID (String pilihanSSID){
        this.pilihanSSID = pilihanSSID;
    }
     public String getpilihanSSID(){
            return this.pilihanSSID;
        }
      public void setjumlah_CCTV (int jumlah_CCTV){
        this.jumlah_CCTV = jumlah_CCTV;
       }
     public int getjumlsh_CCTV(){
            return this.jumlah_CCTV;
        }
      public void setkondisi_CCTV (String kondisi_CCTV){
        this.kondisi_CCTV = kondisi_CCTV;
       }
     public String getkondisi_CCTV(){
            return this.kondisi_CCTV;
        }
      public void setposisi_CCTV (String posisi_CCTV){
        this.posisi_CCTV = posisi_CCTV;
       }
     public String getposisi_CCTV(){
            return this.posisi_CCTV;
     } 
     String lampu (int jumlah_lampu,String kondisi_lampu,String posisi_lampu){
         if(jumlah_lampu >=4){
             return "Sesuai";
         }
         else if(jumlah_lampu <4){
             return "Tidak Sesuai";
         }
         else if ("Kanan depan kanan belakang dan Kiri depan kiri belakang".equals(posisi_lampu)){
            return "Sesuai";  
         }
            else if("Baik".equals(kondisi_lampu)){
                    return "Sesuai";
                    }
            else if("Buruk".equals(kondisi_lampu)){
                return "Tidak Sesuai";
            }
         else{
             return "Inputan Salah";
         }
     }
     String kipas_angin (int jumlah_kipas_angin, String kondisi_kipas_angin, String posisi_kipas_angin){
         if(jumlah_kipas_angin >=2){
             return "Sesuai";
         }
         else if(jumlah_kipas_angin <2){
             return "Tidak Sesuai";
         }
         
         else if("Kanan Tengah".equals(posisi_kipas_angin) ||"Kiri Tengah".equals(posisi_kipas_angin)){
             return "Sesuai";
         }
         else if("Baik".equals(kondisi_kipas_angin)){
             return "Sesuai";
         }
         else if("Buruk".equals(kondisi_kipas_angin)){
             return "Tidak Sesuai";
         }
         else{
             return "Inputan salah";
         }    
     }
     String AC (int jumlah_AC, String kondisi_AC, String posisi_AC){
         if(jumlah_AC >=1){
             return "Sesuai";
         }
         else if(jumlah_AC <1){
             return "Tidak Sesuai";
         }
         else if("Kanan Depan".equals(posisi_AC)){
             return "Sesuai";
         }
         else if("Baik".equals(kondisi_AC)){
             return "Sesuai";
         }
         else if("Buruk".equals(kondisi_AC)){
             return "Tidak Sesuai";
         }
         else{
             return "Inputan Salah";
         }
     }
     String LCD (int jumlah_LCD, String kondisi_LCD, String posisi_LCD){
         if(jumlah_LCD >=1){
             return "Sesuai";
         }
         else if(jumlah_LCD >1){
             return "Tidak Sesuai";
         }
         else if("Baik".equals(kondisi_LCD)){
             return "Seseuai";
         }
         else if("Buruk".equals(kondisi_LCD)){
             return "Tidak Sesuai";
         }
         else if("Tengah Depan".equals(posisi_LCD)){
             return "Sesuai";
         }
         else{
             return "Inputan Salah";
         }
     }
     String stopkontak (int jumlah_stopkontak, String kondisi_stopkontak, String posisi_stopkontak){
         if(jumlah_stopkontak >=2){
             return "Sesuai";
         }
         else if(jumlah_stopkontak <2){
             return "Tidak Sesuai";
         }
         else if("Kanan Depan dan Kiri Depan".equals(posisi_stopkontak)){
             return "Sesuai";
         }
         else if("Baik".equals(kondisi_stopkontak)){
             return "Sesuai";
         }
         else if("Buruk".equals(kondisi_stopkontak)){
             return "Tidak Sesuai";
         }
         else{
             return "Inputan salah";
         }
     }
     String SSID (String pilihanSSID){
         if("UMM Hotspot".equals(pilihanSSID)){
             return "Sesuai";
         }
         else if("Lab IT".equals(pilihanSSID)){
             return "Sesuai";
         }
         else{
             return "Inputan Salah";
         }
     }
     String CCV (int jumlah_CCTV,String kondisi_CCTV, String posisi_CCTV){
         if(jumlah_CCTV >1){
             return "Sesuai";
         }
         else if("Baik".equals(kondisi_CCTV)){
             return "Sesuai";
         }
         else if("Buruk".equals(kondisi_CCTV)){
             return "Tidak Sesuai";
         }
         else if("Kanan Depan".equals(posisi_CCTV)){
             return "Sesuai";
         }
         else{
             return "Inputan Salah";
         }
     }
     abstract void analisis();
     }

