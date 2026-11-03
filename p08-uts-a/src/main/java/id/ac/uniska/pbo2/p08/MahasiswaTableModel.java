/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;
 
public class MahasiswaTableModel extends AbstractTableModel {
 
    private static final Locale ID = Locale.forLanguageTag("id-ID");
    private static final String[] KOLOM = {"npm0", "nama", "tugas", "uts", "uas", "Akhir", "Huruf"};
 
    private final List<NilaiMahasiswa> data = new ArrayList<>();
 
    /** Format 82.5 -> "82,50". */
    public static String format2(double nilai) {
        return String.format(ID, "%.2f", nilai);
    }
 
    /** Format 80.0 -> "80", 72.5 -> "72,5". */
    private static String formatNilai(double nilai) {
        if (nilai == Math.rint(nilai)) {
            return String.valueOf((long) nilai);
        }
        return String.format(ID, "%s", nilai).replace('.', ',');
    }
 
    public void tambah(NilaiMahasiswa m) {
        data.add(m);
        int baris = data.size() - 1;
        fireTableRowsInserted(baris, baris);
    }
 
    public boolean sudahAda(String npm) {
        return data.stream().anyMatch(m -> m.getnpm().equals(npm));
    }
 
    public int getJumlah() {
        return data.size();
    }
 
    public double getRataRataAkhir() {
        return data.isEmpty() ? 0 : data.stream().mapToDouble(NilaiMahasiswa::getAkhir).average().orElse(0);
    }
 
    @Override
    public int getRowCount() {
        return data.size();
    }
 
    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }
 
    @Override
    public String getColumnName(int column) {
        return KOLOM[column];
    }
 
    @Override
    public Object getValueAt(int row, int col) {
        NilaiMahasiswa m = data.get(row);
        return switch (col) {
            case 0 -> m.getnpm();
            case 1 -> m.getnama();
            case 2 -> formatNilai(m.getTugas());
            case 3 -> formatNilai(m.getuts());
            case 4 -> formatNilai(m.getuas());
            case 5 -> format2(m.getAkhir());
            case 6 -> m.getHuruf();
            default -> null;
        };
    }
}