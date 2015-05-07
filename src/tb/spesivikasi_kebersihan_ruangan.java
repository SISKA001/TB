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
public class spesivikasi_kebersihan_ruangan {
     private String kondisi_lantai;
    private String kondisi_atap;
    private String kondisi_pintu;
    private String kondisi_cendela;
    private String kondisi_dinding;
    
    Scanner scan = new Scanner (System.in);
    
public void setkondisi_lantai(String kondisi_lantai){
        this.kondisi_lantai = kondisi_lantai;
        String KL = scan.nextLine();
        if("Baik".equals(KL))
            System.out.println("Sesuai kriteria");
        else if("Buruk".equals(KL))
            System.out.println("Tidak Sesuai Kriteria");
        else
            System.out.println("Inputan Salah");
}
    public String getkondisi_lantai(){
            return this.kondisi_lantai;
           
        }
      public void setkondisi_atap (String kondisi_atap){
        this.kondisi_atap = kondisi_atap;
        String KAP = scan.nextLine();
        if("Baik".equals(KAP))
              System.out.println("Kondisi Sesuai Kriteria");
        else if("Buruk".equals(KAP))
              System.out.println("Kondisi Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan Salah");
        
    }
     public String getkondisi_atap(){
            return this.kondisi_atap;
        }
      public void setkondisi_pintu (String kondisi_pintu){
        this.kondisi_pintu = kondisi_pintu;
        String KP = scan.nextLine();
        if("Baik".equals(KP))
              System.out.println("Kondisi Sesuai Kriteria");
        else if ("Buruk".equals(KP))
              System.out.println("Kondisi Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan Salah");
    }
     public String getkondisi_pintu(){
            return this.kondisi_pintu;
        }
      public void setkondisi_cendela (String kondisi_cendela){
        this.kondisi_cendela = kondisi_cendela;
        String KC = scan.nextLine();
        if("Baik".equals(KC))
              System.out.println("Kondisi Sesuai Kriteria");
        else if("Burk".equals(KC))
              System.out.println("Kondisi Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan Salah");
    }
     public String getkondisi_cendela(){
            return this.kondisi_cendela;
        }
      public void setkondisi_dinding (String kondisi_dinding){
        this.kondisi_dinding = kondisi_dinding;
        String KDG = scan.nextLine();
        if("Baik".equals(KDG))
              System.out.println("Kondisi Sesuai Kriteria");
        else if("Buruk".equals(KDG))
              System.out.println("Kondisi Tidak Sesuai Kriteria");
        else
              System.out.println("Inputan Salah");
    }
     public String getkondisi_dinding(){
            return this.kondisi_dinding;
        }

    void setkondisi_jendela(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
