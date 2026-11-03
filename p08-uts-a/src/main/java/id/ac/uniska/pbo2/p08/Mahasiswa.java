/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08;

/**
 *
 * @author User
 */
public class Mahasiswa {
 
    private final String npm;
    private final String nama;
 
    public Mahasiswa(String npm, String nama) {
        if (npm == null || !npm.matches("\\d{10}")) {
            throw new IllegalArgumentException("NPM harus terdiri dari 10 digit angka.");
        }
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong.");
        }
        this.npm = npm;
        this.nama = nama.trim();
    }
 
    public String getNpm() {
        return npm;
    }
 
    public String getNama() {
        return nama;
    }
}
 