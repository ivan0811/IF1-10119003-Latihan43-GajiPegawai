package com.ivanfaathirza.gajipegawai;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung total gaji pegawai
 * menggunakan getter dan setter berorientasi objek
 */

public class IF110119003Latihan43 {

    public static void main(String[] args) {
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Ivan Faathirza");
        pegawai.setAlamat("RT 23, RW 06, Nomor 08, Caracas");
        pegawai.setGajiPokok(4500000);
        pegawai.setUangTunjangan(250000);
        pegawai.setUangTransport(300000);
        pegawai.setTotalGaji(
                pegawai.totalGaji(
                        pegawai.getUangTunjangan(),
                        pegawai.getUangTransport(),
                        pegawai.getGajiPokok()
                )
        );
        pegawai.tampilData(
                pegawai.getNama(),
                pegawai.getAlamat(),
                pegawai.getUangTunjangan(),
                pegawai.getUangTransport(),
                pegawai.getGajiPokok(),
                pegawai.getTotalGaji()
        );
    }
}
