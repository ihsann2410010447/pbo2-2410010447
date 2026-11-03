/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08;

/**
 *
 * @author User
 */

public class NilaiMahasiswa extends Mahasiswa {
 
    private final double tugas;
    private final double uts;
    private final double uas;
 
    public NilaiMahasiswa(String npm, String nama, double tugas, double uts, double uas) {
        super(npm, nama);
        this.tugas = cekRentang("Tugas", tugas);
        this.uts = cekRentang("UTS", uts);
        this.uas = cekRentang("UAS", uas);
    }
 
    private static double cekRentang(String label, double nilai) {
        if (nilai < 0 || nilai > 100) {
            throw new IllegalArgumentException("Nilai " + label + " harus antara 0 sampai 100.");
        }
        return nilai;
    }
 
    public double getTugas() {
        return tugas;
    }
 
    public double getUts() {
        return uts;
    }
 
    public double getUas() {
        return uas;
    }
 
    public double getAkhir() {
        return tugas * 0.30 + uts * 0.30 + uas * 0.40;
    }
 
    public String getHuruf() {
        double akhir = getAkhir();
        if (akhir >= 80) return "A";
        if (akhir >= 70) return "B";
        if (akhir >= 60) return "C";
        if (akhir >= 50) return "D";
        return "E";
    }
}