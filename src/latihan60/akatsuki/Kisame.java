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
public class Kisame {
    private String kekuatanSamehada;
    private String senjataKhusus;
    
    public void Keahlian(){
        System.out.println("Kisame Memiliki Jurus : ");
        System.out.println("1. Mizu Bunshin no Justu");
        System.out.println("2. Suiro Sameodori no Justu");
        System.out.println("3. Suiro no Justu");
        System.out.println("4. Suiton Senjikizame");
        System.out.println("5. Suiton Bakusui Shoha");
        System.out.println("");
    }

    public String getKekuatanSamehada() {
        return kekuatanSamehada;
    }

    public String getSenjataKhusus() {
        return senjataKhusus;
    }

    public void setKekuatanSamehada(String kekuatanSamehada) {
        this.kekuatanSamehada = kekuatanSamehada;
    }

    public void setSenjataKhusus(String senjataKhusus) {
        this.senjataKhusus = senjataKhusus;
    }
}
