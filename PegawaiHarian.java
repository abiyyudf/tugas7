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

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;


    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    @Override
    public double gaji(){
        if (totalJam <= 40){
            return upahPerJam * totalJam;
        }else{
            return (40 *upahPerJam) + ((totalJam-40) * upahPerJam *1.5);
        }
    }

    @Override
    public String toString() {
        return  "\nPegawai Harian  : " + getNama() +
                "\nNo. KTP         : " + getNoKTP() +
                "\nUpah/jam        : " + "Rp " + getUpahPerJam() +
                "\nTotal jam kerja : " + (double)getTotalJam() +
                "\nPendapatan      : " +  "Rp " + (int)gaji() ;
    }
}
