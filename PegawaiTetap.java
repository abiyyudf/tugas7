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


public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

  

    @Override
    public String toString() {
        return  "\nPegawai Tetap   : " + getNama() +
                "\nNo. KTP         : " + getNoKTP() +
                "\nUpah            : " + getUpah() +
                "\nPendapatan      : " + "Rp " + (int)getUpah();
    }
}
