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
public abstract class criteriaruangan {
    
    private int panjang_ruangan;
    private int lebar_ruangan;
    private int jumlah_kursi;
    private int jumlah_cendela;
    private int jumlah_pintu;
    private int jumlah_papantulis;
    private double luasruangan, rasioluas;

public void setpanjan_ruangan (int panjang_ruangan){
    this.panjang_ruangan = panjang_ruangan;
}    
    
    public int getpanjang_ruangan(){
        return this.panjang_ruangan;
        }
      public void setlebar_ruangan (int lebar_ruangan){
        this.lebar_ruangan = lebar_ruangan;
    }
     public int getlebar_ruangan(){
            return this.lebar_ruangan;
        }
      public void setjumlah_kursi (int jumlah_kursi){
        this.jumlah_kursi = jumlah_kursi;
    }
     public int getjumlah_kursi(){
            return this.jumlah_kursi;
        }
      public void setjumlah_cendela (int jumlah_cendela){
        this.jumlah_cendela = jumlah_cendela;
    }
     public int getjumlahcendela(){
            return this.jumlah_cendela;
        }
      public void setjumlah_pintu (int jumlah_pintu){
        this.jumlah_pintu = jumlah_pintu;
        }
     public int getjumlah_pintu(){
            return this.jumlah_pintu;
        }
      public void setjumlah_papantulis(int jumlah_papantulis){
        this.jumlah_papantulis= jumlah_papantulis;
        }
     public int getjumlah_papan_tulis(){
            return this.jumlah_papantulis;
        }
     public void setrasioluas (double rasioluas){
         this.rasioluas = rasioluas;
     }
     public double getrasioluas(){
         return this.rasioluas;
     }
     public void setluasruangan (double luasruangan){
        this.luasruangan = luasruangan;
     }
     public double getluasruangan(){
         return this.luasruangan;
     
     }
     Scanner scan = new Scanner (System.in);
     
     double hitungluasruangan (int panjangruangan, int lebarruangan){
         luasruangan = panjang_ruangan * lebar_ruangan;
         System.out.println("jadi luas ruangan = ");
         return luasruangan;
     }
     
     double hitungrasioluas (double luasruangan, int jumlah_kursi){
         rasioluas = luasruangan / jumlah_kursi;
         if(rasioluas >= 0.5){
             System.out.println("sesuai..");
         }
         else if (rasioluas <= 0.5){
             System.out.println("tidak sesuai");
         }
         System.out.println("rasio luas ="+ rasioluas);
         return rasioluas;
         }   
     String jumlahPeralatan (int jumlah_kursi,int jumlah_cendela, int jumlah_pintu, int jumlah_papantulis){
         if(jumlah_kursi >=40 && jumlah_cendela >=4 && jumlah_pintu <=1 && jumlah_papantulis >=3){
             return "Sesuai";
         }
         else if(jumlah_kursi <40 && jumlah_cendela <4 && jumlah_pintu >1 && jumlah_papantulis <3){
             return "Tidak Sesuai";
         }
         else{
             return "Inputan Salah";
         }
         
     }
     abstract void analisis();
     }

     
         
         
             
         
     
     
     

