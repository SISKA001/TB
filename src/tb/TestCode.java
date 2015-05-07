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
public class TestCode {
    private Scanner input;
   private void setidentitasruangan(){
       
        
        identitasruangan[]java;
        java = new identitasruangan[1];
        java[0]= new identitasruangan();
        input = new Scanner(System.in);
        input.next();
        
        System.out.println("Identitas Ruagan");
        System.out.println("Kode Ruangan :");
        java[0].setkode_ruangan(input.nextInt());
        System.out.println("Lokasi Ruangan :");
        java[0].setkode_ruangan(input.nextInt());
        System.out.println("Fakultas :");
        java[0].setfakultas(input.nextLine());
        System.out.println("Program Study :");
        java[0].setprogram_study(input.nextLine());
   }
   
   private void setcriteriaruangan(){
       criteriaruangan[]acc;
       acc = new criteriaruangan[1];
       input = new Scanner(System.in);
       input.next();
     
        System.out.println("Kriteria Ruangan ");
        System.out.println("panjang_ruangan");
        acc[0].setpanjan_ruangan(input.nextInt());
        System.out.println("Lebar Ruangan");
        acc[0].setlebar_ruangan(input.nextInt());
        System.out.println("JUmlah Kursi Yang Tersedia");
        acc[0].setjumlah_kursi(input.nextInt());
        System.out.println("Jumlah Jendela Yang Tersedia");
        acc[0].setjumlah_cendela(input.nextInt());
        System.out.println("jumlah pintu yang tersedia");
        acc[0].setjumlah_pintu(input.nextInt());
        System.out.println("jumlah papan tulis yang tersedia");
        acc[0].setjumlah_papantulis(input.nextInt());
        System.out.println("rasio luas");
        acc[0].setrasioluas(input.nextInt());
   }
   
   public void setperalatan_dan_kondisiperalatan(){
       peralatan_dan_kondisiperalatan[]add;
       add = new peralatan_dan_kondisiperalatan[1];
       add[0]= new peralatan_dan_kondisiperalatan();
       input = new Scanner (System.in);
       
     System.out.println("Jumlah lampu");
     add[0].setjumlah_lampu(input.nextInt());
     System.out.println("Kondisi Lampu");
     add[0].setkondisi_lampu(input.nextLine());
     System.out.println("Warna Lampu");
     add[0].setwarna_lampu(input.nextLine());
     System.out.println("posisi lampu");
     add[0].setposisi_lampu(input.nextLine());
     System.out.println("Jumlah Kipas Angin");
     add[0].setjumlah_kipas_angin(input.nextInt());
     System.out.println("Kondisi Kipas Angin");
     add[0].setkondisi_kipas_angin(input.nextLine());
     System.out.println("Posisi Kipas Angin");
     add[0].setposisi_kipas_angin(input.nextLine());
     System.out.println("Jumlah AC");
     add[0].setjumlah_AC(input.nextInt());
     System.out.println("Kondisi AC");
     add[0].setkondisi_AC(input.nextLine());
     System.out.println("Posisi AC");
     add[0].setposisiAC(input.nextLine());
     System.out.println("Jumlah LCD");
     add[0].setjumlah_LCD(input.nextInt());
     System.out.println("Kondisi LCD");
     add[0].setkondisi_LCD(input.nextLine());
     System.out.println("Posisi LCD");
     add[0].setposisi_LCD(input.nextLine());
     System.out.println("Jumlah Stop Kontak");
     add[0].setjumlah_stopkontak(input.nextInt());
     System.out.println("Kondisi Stop Kontak");
     add[0].setkondisi_stopkontak(input.nextLine());
     System.out.println("Posisi Stop Kontak");
     add[0].setposisi_stopkontak(input.nextLine());
     System.out.println("Pilihan SSID");
     add[0].setpilihanSSID(input.nextLine());
     System.out.println("Masukkan bandwidth");
     add[0].setbandwidth(input.nextLine());
     System.out.println ("Jumlah CCTV");
     add[0].setjumlah_CCTV(input.nextInt());
     System.out.println("Kondisi CCTV");
     add[0].setkondisi_CCTV(input.nextLine());
     System.out.println("Posisi CCTV");
     add[0].setposisi_CCTV(input.nextLine());
   } 
     public void setspesivikasi_kebersihan_ruangan(){
     spesivikasi_kebersihan_ruangan[]abb;
     abb = new spesivikasi_kebersihan_ruangan[1];
     abb[0] = new spesivikasi_kebersihan_ruangan();
     input = new Scanner (System.in);
    input.next();
    
    System.out.println("Kondisi Lantai");
     abb[0].setkondisi_lantai(input.nextLine());
     System.out.println("Kondisi Atap");
     abb[0].setkondisi_atap(input.nextLine());
     System.out.println("Kondisi Pintu");
     abb[0].setkondisi_pintu(input.nextLine());
     System.out.println("Kondisi Jendela");
     abb[0].setkondisi_jendela(input.nextLine());
     System.out.println("Kondisi Dinding");
     abb[0].setkondisi_dinding(input.nextLine());
     }
     
     private void setanalisis_kenyamanan_indoor(){
        analisis_kenyamanan_indoor[]aff;
        aff = new analisis_kenyamanan_indoor[1];
        aff[0]= new analisis_kenyamanan_indoor();
        input = new Scanner (System.in);
        input.next();
        
     System.out.println("Sirkuit Udara");
     aff[0].setsirkuit_udara(input.nextLine());
     System.out.println("Pencahayaan");
     aff[0].setpencahayaan(input.nextLine());
      System.out.println("Kelembapan");
     aff[0].setkelembapan(input.nextLine());
     System.out.println("Suhu Ruangan");
     aff[0].setsuhu_ruangan(input.nextInt());
     }
     
     private void setanalisis_outdoor(){
         analisis_outdoor[]all;
         all= new analisis_outdoor[1];
         all[0]= new analisis_outdoor();
         input = new Scanner (System.in);
        // input.next();
         
     System.out.println("Kebisingan Ruangan");
     all[0].setkebisingan_ruangan(input.nextLine());
     System.out.println("Bau di Ruangan");
     all[0].setbau(input.nextLine());
     System.out.println("Kebocoran Ruangan");
     all[0].setkebocoran_ruangan(input.nextLine());
     System.out.println("Kebersihan Ruangan");
     all[0].setkebersihan_ruangan(input.nextLine());
     System.out.println("Kerusakan");
     all[0].setkerusakan(input.nextLine());
     System.out.println("Keausan");
     all[0].setkeausan(input.nextLine());
     }
     
     private void setkemanan_ruangan(){
         keamanan_ruangan[]arr;
         arr = new keamanan_ruangan[1];
         arr[0]= new keamanan_ruangan();
         input = new Scanner (System.in);
         input.next();
         
      System.out.println("Kekokohan Ruangan");
     arr[0].setkekokohan_ruangan(input.nextLine());
     System.out.println("Keamanan Kunci Pintu");
     arr[0].setkeamanan_kuncipintu(input.nextLine());
     System.out.println("Keamanan Kunci Jendela");
     arr[0].setkeamanan_kunci_jendela(input.nextLine());
     System.out.println("Keamanan LCD");
     arr[0].setkeamanan_LCD(input.nextLine());
     System.out.println("Bahaya");
     arr[0].setbahaya(input.nextLine());
     
             
         }   
    }
