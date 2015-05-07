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
public class peralatan_dan_kondisiperalatan {
   private int jumlah_lampu;
    private String kondisi_lampu;
    private String warna_lampu;
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
    private String bandwinth;
    private int jumlah_CCTV;
    private String kondisi_CCTV;
    private String posisi_CCTV;
    private int jumlah_CCV;
    Scanner scan = new Scanner (System.in);

     public void setjumlah_lampu(int jumlah_lampu){
        this.jumlah_lampu = jumlah_lampu;
        if(jumlah_lampu >=6){
            System.out.println("sesuai");
        }
        else if(jumlah_lampu <6){
            System.out.println("tidak sesuai");
        }
    }
     public int getjumlah_lampu(){
            return this.jumlah_lampu;
        }
      public void setkondisi_lampu (String kondisi_lampu){
        this.kondisi_lampu = kondisi_lampu;
      String KL = scan.nextLine();
      if ("Baik".equals(KL))
              System.out.println("Kondisi sesuai kriteria");
      else if("Buruk".equals(KL))
              System.out.println("Kondisi tidak sesuai kriteria");
      else 
              System.out.println("inputan salah");
         }
     public String getkondisi_lampu(){
            return this.kondisi_lampu;   
        }
      public void setwarna_lampu (String warna_lampu){
        this.warna_lampu = warna_lampu;
    }
     public String getwarna_lampu(){
            return this.warna_lampu;
        }
      public void setposisi_lampu (String posisi_lampu){
        this.posisi_lampu = posisi_lampu;
        String PL = scan.nextLine();
        if("Kiri Depan, Kiri Tengah, Kiri Belakang".equals(PL))
              System.out.println("Sesuai Kriteria");
        else if("Kanan Depan, Kanan Tengah, Kanan Belakang".equals(PL))
              System.out.println("Sesuai Kriteria");
        else 
              System.out.println("Inputan salah");  }
    
      public String getposisi_lampu(){
            return this.posisi_lampu;
        }
      public void setjumlah_kipas_angin (int jumlah_kipas_angin){
        this.jumlah_kipas_angin= jumlah_kipas_angin;
        if (jumlah_kipas_angin >=2){
            System.out.println("sesuai");
        }
        else if(jumlah_kipas_angin <2){
            System.out.println("tidak sesuai");
        }
    }
     public int getjumlah_kipas_angin(){
            return this.jumlah_kipas_angin;
        }
      public void setkondisi_kipas_angin (String posisi_kipas_angin){
        this.posisi_kipas_angin= posisi_kipas_angin;
        String KA = scan.nextLine();
        if("Baik".equals(KA))
              System.out.println("Sesuai Kriteria");
        else if("Buruk".equals(KA))
              System.out.println("Tidak Sesuai Kriteria");
        else
              System.out.println("inputan salah");
    }
     public String getkondisi_kipas_angin(){
            return this.kondisi_kipas_angin;
        }
      public void setposisi_kipas_angin (String posisi_kipas_angin){
        this.posisi_kipas_angin = posisi_kipas_angin;
        String PKA = scan.nextLine();
        if ("Kiri Depan, Kanan tengah".equals(PKA))
              System.out.println("Sesuai Kriteria");
        else if("Belakang".equals(PKA))
              System.out.println("Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan salah");
    }
     public String getposisi_kipas_angin(){
            return this.posisi_kipas_angin;
        }
      public void setjumlah_AC (int jumlah_AC){
        this.jumlah_AC = jumlah_AC;
        if (jumlah_AC >=2){
            System.out.println("sesuai");
        }
        else if(jumlah_AC <2){
            System.out.println("tidak sesuai");
        }
    }
     public int getjumlah_AC(){
            return this.jumlah_AC;
        }
      public void setkondisi_AC (String kondisi_AC){
        this.kondisi_AC = kondisi_AC;
        String KAC = scan.nextLine();
        if("Baik".equals(KAC))
              System.out.println("Sesuai Kriteria");
        else if("Buruk".equals(KAC))
              System.out.println("Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan salah");
    }
     public String getkondsi_AC(){
            return this.kondisi_AC;
        }
      public void setposisiAC (String posisiAC){
        this.posisiAC = posisiAC;
        String PAC = scan.nextLine();
        if("Pojok Depan".equals(PAC))
              System.out.println("Kondisi Sesuai Kriteria");
        else if("Pojok Belakang".equals(PAC))
              System.out.println("Kondisi Tidak Sesuai");
        else 
              System.out.println("Inputan Salah");
    }
     public String getposisiAC(){
            return this.posisiAC;
        }
      public void setjumlah_LCD (int jumlah_LCD){
        this.jumlah_LCD = jumlah_LCD;
        if (jumlah_LCD >=1){
                System.out.println("sesuai");
            }
            else if(jumlah_LCD <1){
                System.out.println("tidak ");
            }
    }
     public int getjumlah_LCD(){
            return this.jumlah_LCD;
            
        }
      public void setkodisi_LCD(String kondisi_LCD){
        this.kondisi_LCD = kondisi_LCD;
        String KLCD = scan.nextLine();
        if ("Baik".equals(KLCD))
              System.out.println("Sesuai Kriteria");
        else if ("Buruk".equals(KLCD))
              System.out.println("Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan Salah");
    }
     public String getkondisi_LCD(){
            return this.kondisi_LCD;
        }
      public void setjumlah_stopkontak (int jumlah_stopkontak){
        this.jumlah_stopkontak = jumlah_stopkontak;
        if (jumlah_stopkontak >=6){
            System.out.println("sesuai");
        }
        else if(jumlah_stopkontak <6){
            System.out.println("tidak sesuai");
        }
    }
     public int getjumlah_stopkontak(){
            return this.jumlah_stopkontak;
        }
     public void setkondisi_stopkontak (String kondisi_stopkontak){
         this.kondisi_stopkontak = kondisi_stopkontak;
         String KSK = scan.nextLine();
         if("Baik".equals(KSK))
             System.out.println("Sesuai Kriteria");
         else if("Buruk".equals(KSK))
             System.out.println("Tidak Sesuai Kriteria");
         else
             System.out.println("Inputan Salah");
     }
     public String getkondisi_stopkontak(){
         return this.kondisi_stopkontak;
     }
      public void setposisi_stopkontak (String posisi_stopkontak){
        this.posisi_stopkontak = posisi_stopkontak;
        String PST = scan.nextLine();
        if("Kanan Depan, Kanan Kiri".equals(PST))
              System.out.println("Kondisi Sesuai Kriteria");
        else if("Kanan Belakang, Kiri Belakang".equals(PST))
              System.out.println("Kondisi idak Sesuai Kriteria");
        else
              System.out.println("inputan salah");
            
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
      public void setbandwinth (String bandwinth){
        this.bandwinth = bandwinth;
    }
     public String getbandwinth(){
            return this.bandwinth;
        }
      public void setjumlah_CCTV (int jumlah_CCTV){
        this.jumlah_CCTV = jumlah_CCTV;
        if (jumlah_CCTV >=1){
            System.out.println("sesuai");
        }
        else if(jumlah_CCTV <1){
            System.out.println(" tidak sesuai");
        }
    }
     public int getjumlsh_CCTV(){
            return this.jumlah_CCTV;
        }
      public void setkondisi_CCTV (String kondisi_CCTV){
        this.kondisi_CCTV = kondisi_CCTV;
        String KCCTV = scan.nextLine();
        if("Baik".equals(KCCTV))
              System.out.println("Sesuai Kriteria");
        else if ("Buruk".equals(KCCTV))
              System.out.println("Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan Salah");
    }
     public String getkondisi_CCTV(){
            return this.kondisi_CCTV;
        }
      public void setposisi_CCTV (String posisi_CCTV){
        this.posisi_CCTV = posisi_CCTV;
        String PCCTV = scan.nextLine();
        if("Pojok Depan".equals(PCCTV))
              System.out.println("Posisi Sesuai Kriteria");
        else if("Pojok Belakang".equals(PCCTV))
              System.out.println("Posisi Tidak Sesuai Kriteria");
        else
              System.out.println("inputan salah");
    }
     public String getposisi_CCTV(){
            return this.posisi_CCTV;
        }

    void setkondisi_LCD(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setposisi_LCD(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setbandwidth(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     }

