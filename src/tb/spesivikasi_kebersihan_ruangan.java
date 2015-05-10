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
public abstract class spesivikasi_kebersihan_ruangan {
     private String kondisi_lantai;
    private String kondisi_atap;
    private String kondisi_pintu;
    private String kondisi_cendela;
    private String kondisi_dinding;
    
    Scanner scan = new Scanner (System.in);
    
public void setkondisi_lantai(String kondisi_lantai){
        this.kondisi_lantai = kondisi_lantai;
       }
    public String getkondisi_lantai(){
            return this.kondisi_lantai;
            }
      public void setkondisi_atap (String kondisi_atap){
        this.kondisi_atap = kondisi_atap;
        }
     public String getkondisi_atap(){
            return this.kondisi_atap;
        }
      public void setkondisi_pintu (String kondisi_pintu){
        this.kondisi_pintu = kondisi_pintu;
        }
     public String getkondisi_pintu(){
            return this.kondisi_pintu;
        }
      public void setkondisi_cendela (String kondisi_cendela){
        this.kondisi_cendela = kondisi_cendela;
        }
     public String getkondisi_cendela(){
            return this.kondisi_cendela;
        }
      public void setkondisi_dinding (String kondisi_dinding){
        this.kondisi_dinding = kondisi_dinding;
        }
     public String getkondisi_dinding(){
            return this.kondisi_dinding;
        }
String kondisi_lantai (String kondisi_lantai){
    if("Baik".equals(kondisi_lantai)){
        return "Sesuai";
    }
    else if("Buruk".equals(kondisi_lantai)){
        return "Tidak Sesuai";
    }
    else{
        return "Inputan Salah";
    }    
    }
String kondisi_atap (String kondsi_atap){
    if("Baik".equals(kondisi_atap)){
        return "Sesuai";
}
    else if("Buruk".equals(kondisi_atap)){
        return "Tidak Sesuai";
    }
    else{
        return "Inputan Salah";
    }
}
String kondisi_pintu (String kondisi_pintu){
    if("Baik".equals(kondisi_pintu)){
        return "Sesuai";
    }
    else if("Buruk".equals(kondisi_pintu)){
        return "Tidak Sesuai";
    }
    else{
        return "Inputan Salah";
    }
}
String kondisi_cendela (String kondisi_cendela){
    if("Baik".equals(kondisi_cendela)){
        return "Sesuai";
    }
    else if("Buruk".equals(kondisi_cendela)){
        return "Tidak Sesuai";
    }
    else{
        return "Inputan Salah";
    }
}
String kodisi_dinding (String kondisi_dinding){
    if("Baik".equals(kondisi_dinding)){
        return "Sesuai";
    }
    else if("Buruk".equals(kondisi_dinding)){
        return "Tidak Sesuai";
    }
    else{
        return "Inputan Salah";
    }
}    
abstract void analisis();
}
 