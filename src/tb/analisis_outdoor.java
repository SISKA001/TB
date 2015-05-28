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
public class analisis_outdoor extends identitasruangan{
     private String kebisingan_ruangan;
    private String bau;
    private String kebocora_ruangan;
    private String kebersihan_ruangan;
    private String keausan;

   
    
            
     public void setkebisingan_ruangan (String kebisingan_ruangan){
        this.kebersihan_ruangan= kebisingan_ruangan;
        }
     public String getkebisingan_ruangan(){
            return this.kebisingan_ruangan;
        }
      public void setbau (String bau){
        this.bau = bau;
        }
     public String getbau(){
            return this.bau;
        }
      public void setkebocoran_ruangan (String kebocoran_Ruangan){
        this.kebocora_ruangan = kebocoran_Ruangan;
        }
     public String getkebocoran_ruangan(){
            return this.kebocora_ruangan;
        }
      public void setkebersihan_ruangan (String kebersihan_ruangan){
        this.kebersihan_ruangan = kebersihan_ruangan;
        }
     public String getkebersihan_ruangan(){
            return this.kebersihan_ruangan;
        }
      public void setkeausan (String keausan){
        this.keausan= keausan;
        }
     public String getkeausan(){
            return this.keausan;
        }
     String kebisingan_ruangan(String kebisingan_ruangan){
         if("Tidak Bising".equals(kebisingan_ruangan)){
             return "Sesuai";
         }
         else {
             return "Tidak Sesuai";
         }
     }
     String bau (String bau){
     
         if("Tidak Ada Bau".equals(bau)){
             return "Sesuai";
         }
         else {
             return "Tidak Sesuai";
         }
     }
     String kebocoran_Ruangan (String kebocoran_ruangan){
         if("Tidak Terdapat Kebocoran".equals(kebocoran_ruangan)){
             return "Sesuai";
         }
         else {
             return "Tidak Sesuai";
         }
     }
     String kebersihan_ruangan (String kebersihan_ruangan){
         if("bersih".equals(kebersihan_ruangan)){
             return "Sesuai";
         }
         else {
             return "Tidak Sesuai";
         }
     }
     
    String keausan (String keausan){
        
        if("Baik".equals(keausan)){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
    } 
    @Override
     void identitas(){
         System.out.println("Kode Ruangan :"+getkode_ruangan());
         System.out.println("Lokasi Ruangan :"+getlokasi_ruangan());
     }
   
    }
     
