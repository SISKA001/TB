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
public class jenis_ruangan extends identitasruangan {
    public void tampilkan(){
      String warna_ruangan="hijau";
      String bentuk_ruangan="persegi";
      
      identitasruangan d = new identitasruangan();
      d.tampilanruangan();
      d.inputdata(4, 403,"PBO","Teknik");
        System.out.println("Warna ruangan :"+warna_ruangan);
        
    }
    
}
