/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author abiyy
 */


public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public double gajiSales(){
        double gajiSales = getPenjualan() * getKomisi();
        return gajiSales;
    }
    @Override
    public String toString() {
        return  "\nSales           : " + getNama() +
                "\nNo. KTP         : " + getNoKTP() +
                "\nTotal Penjualan : " + (double)getPenjualan() +
                "\nBesaran Komisi  : " + getKomisi() +
                "\nPendapatan      : " + "Rp " + (int)gajiSales();
    }
}
