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
public class analisis_outdoor {
     private String kebisingan_ruangan;
    private String bau;
    private String kebocora_ruangan;
    private String kebersihan_ruangan;
    private String kerusakan;
    private String keausan;
    
    Scanner scan = new Scanner (System.in);
            
     public void setkebisingan_ruangan (String kebisingan_ruangan){
        this.kebersihan_ruangan= kebisingan_ruangan;
        String KSR = scan.nextLine();
        if("Baik".equals(KSR))
             System.out.println("Kondisi Baik");
        else if("Buruk".equals(KSR))
             System.out.println("Kondisi Buruk");
        else
             System.out.println("Inputan Salah");
    }
     public String getkebisingan_ruangan(){
            return this.kebisingan_ruangan;
        }
      public void setbau (String bau){
        this.bau = bau;
        String BAU = scan.nextLine();
        if("Normal".equals(BAU))
              System.out.println("Kondisi Sesuai Ruangan");
        else if("Tidak Normal".equals(BAU))
              System.out.println("Kondisi Tidak Sesuai Ruangan");
        else
              System.out.println("Inputan Salah");
    }
     public String getbau(){
            return this.bau;
        }
      public void setkebocoran_ruangan (String kebocoran_Ruangan){
        this.kebocora_ruangan = kebocoran_Ruangan;
        String KBR = scan.nextLine();
        if("Aman".equals(KBR))
              System.out.println("Kodisi Sesuai ");
        else if("Berbahaya".equals(KBR))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
    }
     public String getkebocoran_ruangan(){
            return this.kebocora_ruangan;
        }
      public void setkebersihan_ruangan (String kebersihan_ruangan){
        this.kebersihan_ruangan = kebersihan_ruangan;
        String KRB = scan.nextLine();
        if("Baik".equals(KRB))
              System.out.println("Kondisi Sesuai");
        else if("Kotor".equals(KRB))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");              
    }
     public String getkebersihan_ruangan(){
            return this.kebersihan_ruangan;
        }
      public void setkerusakan (String kerusakan){
        this.kerusakan = kerusakan;
        String KKR = scan.nextLine();
        if("Baik".equals(KKR))
              System.out.println("Kondisi Sesuai");
        else if("Buruk".equals(KKR))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("ainputan Salah");
    }
     public String getkerusakan(){
            return this.kerusakan;
        }
      public void setkeausan (String keausan){
        this.keausan= keausan;
        String KS = scan.nextLine();
        if("Baik".equals(KS))
              System.out.println("Kondisi Sesuai");
        else if("Buruk".equals(KS))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
    }
     public String getkeausan(){
            return this.keausan;
        }
}
