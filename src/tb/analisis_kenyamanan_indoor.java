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
public class analisis_kenyamanan_indoor {
     //public static void main(String[] args){
    private String sirkuit_udara;
    private String pencahayaan;
    private String kelembapan;
    private int suhu_ruangan;
    
    Scanner scan = new Scanner (System.in);
    
    public void setsirkuit_udara (String sirkuit_udara){
        this.sirkuit_udara = sirkuit_udara;
        String SU = scan.nextLine();
        if("Baik".equals(SU)){
            System.out.println("Sesuai Kriteria");
            return;}
        else if("Buruk".equals(SU)){
            System.out.println("Kondisi Tidak Sesuai Kriteria");
            return
        else
            System.out.println("Inputan Salah");
    }
     public String getsirkuit_udara(){
            return this.sirkuit_udara;
        }
      public void setpencahayaan (String pencahayaan){
        this.pencahayaan = pencahayaan;
    }
     public String getpencahayaan(){
            return this.pencahayaan;
        }
      public void setkelembapan (String kelembapan){
        this.kelembapan= kelembapan;
        String KLP = scan.nextLine();
        if("Baik".equals(KLP))
              System.out.println("Kelembapan Ruanagan Baik");
        else if("Buruk".equals(KLP))
              System.out.println("Kelembapan Ruangan Buruk");
        else
              System.out.println("Inputan Salah");
    }
     public String getkelembapan(){
            return this.kelembapan;
        }
      public void setsuhu_ruangan (int suhu_ruangan){
        this.suhu_ruangan = suhu_ruangan;
        String SR = scan.nextLine();
        if("Baik".equals(SR))
              System.out.println("Suhu Ruangan Baik ");
        else if("Buruk".equals(SR))
              System.out.println("Suhu Ruangan Buruk");
        else
              System.out.println("Inputan Salah");
    }
     public int getsuhu_ruangan(){
            return this.suhu_ruangan;
        }
}