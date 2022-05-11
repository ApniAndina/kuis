/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;


public class Handphone {
    
    private int  harga;
    private String merek, warna, tanggal_produksi, jenis;

    public Handphone(int id, int harga, String merek, String warna, String tanggal_produksi, String jenis) {
        
        this.harga = harga;
        this.merek = merek;
        this.warna = warna;
        this.tanggal_produksi = tanggal_produksi;
        this.jenis = jenis;
    }

   public Handphone() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTanggal_produksi() {
        return tanggal_produksi;
    }

    public void setTanggal_produksi(String tanggal_produksi) {
        this.tanggal_produksi = tanggal_produksi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
   
    
}
