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
public abstract class identitasruangan {
    private int kode_ruangan;
    private int lokasi_ruangan;
    private String program_study;
    private String fakultas;
    
    //construrtor, yaitu sebuah nama method yg sama dgn nama class.
    String identitasruangan(int kode_ruangan, int lokasi_ruangan, String program_study, String fakultas){
        this.kode_ruangan=kode_ruangan;
        this.lokasi_ruangan=lokasi_ruangan;
        this.program_study=program_study;
        this.fakultas=fakultas;
        return null;
    }
    // overloading nama method yang sama
    String setdata(int kode_ruangan, int lokasi_ruangan){
        this.kode_ruangan=kode_ruangan;
        this.lokasi_ruangan=lokasi_ruangan;
        return null;
    }
    void setdata(int kode_ruangan, int lokasi_ruangan, String program_study, String fakultas){
        this.kode_ruangan=kode_ruangan;
        this.lokasi_ruangan=lokasi_ruangan;
        this.program_study=program_study;
        this.fakultas=fakultas;
    }
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
     String identitas(){
         System.out.println("Kode Ruangan :"+getkode_ruangan());
         System.out.println("Lokasi Ruangan :"+getlokasi_ruangan());
         System.out.println("Program Study :"+getprogram_study());
        // System.out.println("Fakultas :"+getfakultas ());
        return null;
    }
     
      String inputdata(int l,int kr, String p, String f){
        setkode_ruangan(kr);
        setlokasi_ruangan(l);
        setprogram_study(p);
        setfakultas(f);
        return null;
     }
     //abstract void analisis();
}
