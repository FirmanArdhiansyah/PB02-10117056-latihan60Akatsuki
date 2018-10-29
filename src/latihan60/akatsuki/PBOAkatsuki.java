/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan60.akatsuki;

/**
 *
 * @author Firman
 */
public class PBOAkatsuki {
     public static void main(String[] args) {
        PBOAkatsuki PBOAkatsuki = new PBOAkatsuki();
        PBOAkatsuki.setNama("Uchiha Itachi");
        PBOAkatsuki.setAsalDesa("Konohagakure");
        itachi.setElemen("Api");
        itachi.setPartner("Kisame Hosigaki");
        itachi.setKekuatanMata("Mangekyo Sharingan");
        System.out.println("Nama : "+itachi.getNama());
        System.out.println("Asal Desa : "+itachi.getAsalDesa());
        System.out.println("Elemen Utama : "+itachi.getElemen());
        System.out.println("Nama Partner : "+itachi.getPartner());
        System.out.println("Kekuatan Khusus : "+itachi.getKekuatanMata());
        itachi.jurus();
        
        Kisame PBOAkatsuki = new Kisame();
        kisame.setNama("Hosigaki Kisame");
        kisame.setAsalDesa("Kirigakure");
        kisame.setElemen("Air");
        kisame.setPartner("Uchiha Itachi");
        kisame.setKekuatanSamehada("Bijuu Tanpa Ekor");
        kisame.setSenjataKhusus("Samehada");
        System.out.println("Nama : "+kisame.getNama());
        System.out.println("Asal Desa : "+kisame.getAsalDesa());
        System.out.println("Elemen Utama : "+kisame.getElemen());
        System.out.println("Nama Partner : "+kisame.getPartner());
        System.out.println("Kekuatan Khusus : "+kisame.getKekuatanSamehada());
        System.out.println("Senjata Khsusus : "+kisame.getSenjataKhusus());
        kisame.jurus();
    
}
}