/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan60.akatsuki;

/**
 *
 * @author  Nama : Firman Ardhiansyah
 *         Kelas : IF-2 (PB02)
 *         NIM : 10117056
 * Deskripsi Program : program untuk mengetahui karakter dalam anggota akatsuki
 *                     di dalam anime (NARUTO)
 */
public class Akatsuki {
    private String nama;
    private String asalDesa;
    private String elemen;
    private String cincin;
    private String CiriKhasCincin;
    
    
     public void jurus(){
        System.out.println("Memiliki Jurus : ");
    }

    public String getNama() {
        return nama;
    }

    public String getAsalDesa() {
        return asalDesa;
    }
    public String getElemen() {
        return elemen;
        
    }

    public String getCincin() {
        return cincin;
    }

    public String getCiriKhasCincin() {
        return CiriKhasCincin;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }
    public void setCincin(String cincin) {
        this.cincin = cincin;
    }

    public void setCiriKhasCincin(String CiriKhasCincin) {
        this.CiriKhasCincin = CiriKhasCincin;
    }    
}
   
