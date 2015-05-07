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
public class keamanan_ruangan {
    private String kekokohan_ruangan;
    private String keamana_kuncipintu;
    private String keamanan_kunci_cendela;
    private String kemanan_LCD;
    private String bahaya;
    private String keamanan_kuncipintu;
    
    Scanner scan = new Scanner (System.in);
    
      public void setkekokohan_ruangan (String kekokohan_ruangan){
        this.kekokohan_ruangan = kekokohan_ruangan;
        String KHR =scan.nextLine();
        if("Baik".equals(KHR))
              System.out.println("Kondisi Sesuai");
        else if("Buruk".equals(KHR))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
         }
     public String getkekokohan_ruangan(){
            return this.kekokohan_ruangan;
        }
      public void setkeamanan_kuncipintu (String keamana_kuncipintu){
        this.keamana_kuncipintu = keamanan_kuncipintu;
        String KKP = scan.nextLine();
        if("Baik".equals(KKP))
              System.out.println("Kondisi Sesuai");
        else if("Buruk".equals(KKP))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
    }
     public String getkeamanan_kuncipintu(){
            return this.keamana_kuncipintu;
        }
      public void setkeamanan_kunci_cendela (String keamanan_kunci_cendela){
        this.keamanan_kunci_cendela = keamanan_kunci_cendela;
        String KKC = scan.nextLine();
        if("Baik".equals(KKC))
              System.out.println("Kondisi Sesuai Kriteria");
        else if("buruk".equals(KKC))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
    }
     public String getkeamanan_kunci_cendela(){
            return this.keamanan_kunci_cendela;
        }
      public void setkeamanan_LCD (String keamanan_LCD){
        this.kemanan_LCD = keamanan_LCD;
        String KLCD = scan.nextLine();
        if("Baik".equals(KLCD))
              System.out.println("Kondisi Sesuai");
        else if("Buruk".equals(KLCD))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
    }
     public String getkeamanan_LCD(){
            return this.kemanan_LCD;
        }
      public void setbahaya (String bahaya){
        this.bahaya = bahaya;
        String BY = scan.nextLine();
        if ("Terkendali".equals(BY))
              System.out.println("Kondisi Sesuai");
        else if("Berbahaya".equals(BY))
              System.out.println("Kondisi Tidak Sesuai");
        else
              System.out.println("Inputan Salah");
    }
     public String getbahaya(){
            return this.bahaya;
        }

    void setkeamanan_kunci_jendela(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
