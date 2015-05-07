package tb;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class identitasruangan {
    private int kode_ruangan;
    private int lokasi_ruangan;
    private String program_study;
    private String fakultas;
    
    public void setfakultas (String fakultas){
        this.fakultas = fakultas;
    }
    public String getfakultas (){
        return this.fakultas;
    }
    
    public void setkode_ruangan (int kode_ruangan){
        this.kode_ruangan= kode_ruangan;
    }
     public int getkode_ruangan(){
            return this.kode_ruangan;
        }
     public void setlokasi_ruangan (int lokasi_ruangan){
        this.lokasi_ruangan= lokasi_ruangan;
    }
     public int getlokasi_ruangan(){
            return this.lokasi_ruangan;
        }
    public void setprogram_study(String program_study){
       this.program_study = program_study;
        
    }
     public String getprogram_study(){
            return this.program_study;
        }
     public void tampilanruangan(){
         System.out.println("Kode Ruangan :"+getkode_ruangan());
         System.out.println("Lokasi Ruangan :"+getlokasi_ruangan());
         System.out.println("Program Study :"+getprogram_study());
         System.out.println("Fakultas :"+getfakultas ());
     }
     public void inputdata(int l,int kr, String p, String f){
        setkode_ruangan(kr);
        setlokasi_ruangan(l);
        setprogram_study(p);
        setfakultas(f);
     }
     
}
