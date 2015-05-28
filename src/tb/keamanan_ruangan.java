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
public abstract class keamanan_ruangan extends identitasruangan{
    private String kekokohan_ruangan;
    private String keamanan_kunci_cendela;
    private String keamanan_LCD;
    private String keamanan_kuncipintu;
    
    public keamanan_ruangan(String kekokohan_ruangan, String keamanan_kunci_cendela, String keamanan_LCD, String keamanan_kuncipintu){
        this.kekokohan_ruangan=kekokohan_ruangan;
        this.keamanan_kunci_cendela=keamanan_kunci_cendela;
        this.keamanan_LCD=keamanan_LCD;
        this.keamanan_kuncipintu=keamanan_kuncipintu;
        
    }
    
      public void setkekokohan_ruangan (String kekokohan_ruangan){
        this.kekokohan_ruangan = kekokohan_ruangan;
         }
     public String getkekokohan_ruangan(){
            return this.kekokohan_ruangan;
        }
      public void setkeamanan_kuncipintu (String keamanan_kuncipintu){
        this.keamanan_kuncipintu= keamanan_kuncipintu;
       }
     public String getkeamanan_kuncipintu(){
            return this.keamanan_kuncipintu;
        }
      public void setkeamanan_kunci_cendela (String keamanan_kunci_cendela){
        this.keamanan_kunci_cendela = keamanan_kunci_cendela;
       }
     public String getkeamanan_kunci_cendela(){
            return this.keamanan_kunci_cendela;
        }
      public void setkeamanan_LCD (String keamanan_LCD){
        this.keamanan_LCD = keamanan_LCD;
       }
     public String getkeamanan_LCD(){
            return this.keamanan_LCD;
        }
     String kekokohanRK(String kekokohan_ruangan){
       if("Baik".equals(kekokohan_ruangan)){
           return "Sesuai";
       }
       else if("Buruk".equals(kekokohan_ruangan)){
           return "Tidak Sesuai";
       }
       else{
           return "Inputan Salah";
       }}
   
     String keamanan(String keamanan_LCD, String keamanan_kuncipintu, String kemanan_kunci_cendela){
         if("Baik".equals(keamanan_LCD)){
             return "Sesuai";
         }
         else if("Buruk".equals(keamanan_LCD)){
             return "Tidak Sesuai";
         }
         else if("Baik".equals(keamanan_kuncipintu)){
             return "Sesuai";
         }
         else if("Buruk".equals(keamanan_kuncipintu)){
             return "Tidak Sesuai";
         }
         else if("Baik".equals(keamanan_kunci_cendela)){
             return "Sesuai";
         }
         else{
             return "inputan Salah"; 
     }}
     void setdata(String kekokohan_ruangan, String keamanan_kunci_cendela){
         this.kekokohan_ruangan=kekokohan_ruangan;
         this.keamanan_kunci_cendela=keamanan_kunci_cendela;
         
     }
     void setdata(String kekokohan_ruangan, String keamanan_kunci_cendela, String keamanan_LCD, String keamanan_kuncipintu){
         this.kekokohan_ruangan=kekokohan_ruangan;
         this.keamanan_kunci_cendela=keamanan_kunci_cendela;
         this.keamanan_LCD=keamanan_LCD;
         this.keamanan_kuncipintu=keamanan_kuncipintu;
     }
     @Override
      void identitas(){
         System.out.println("Kode Ruangan :"+getkode_ruangan());
         System.out.println("Lokasi Ruangan :"+getlokasi_ruangan());
    // abstract void analisis();
}}
