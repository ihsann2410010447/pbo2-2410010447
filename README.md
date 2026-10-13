P04-Hasil Keluaran Layout Manager
1.Desaign dan Navigator
<img width="1233" height="875" alt="Desaign Dan Navigator" src="https://github.com/user-attachments/assets/a1e5504e-09e2-413b-8e29-94ee1fbbc920" />

2.Hasil saat di lebarkan 
<img width="1790" height="638" alt="Tampilan saat dilebarkan" src="https://github.com/user-attachments/assets/8461a234-2475-48ed-aaa8-a42fa476b96d" />
3.Hasil saat di jalankan
<img width="1911" height="1022" alt="tampilan awal" src="https://github.com/user-attachments/assets/b931181b-de4b-4f6c-a3fb-fe47211ddda3" />

1. Weight X namaField = 0.0, lalu jendela dilebarkan
---------------------------------------------------
Hasil : namaField tetap ikut melebar bersama isian lain.
Sebab : Weight X dihitung per KOLOM (diambil nilai terbesar di kolom
        itu). Isian lain di kolom 1 masih ber-Weight 1.0, jadi kolom
        tetap melebar, dan Fill = Horizontal membuat namaField
        memenuhi selnya.
Catatan: namaField baru berhenti melebar jika Fill-nya diubah ke None
        atau semua isian di kolom 1 ber-Weight 0.
 
2. Direction formPanel dari North menjadi Center, lalu jendela ditinggikan[Eksperimen 1 p04.txt](https://github.com/user-attachments/files/33368530/Eksperimen.1.p04.txt)
[Refleksi G - P04 .txt](https://github.com/user-attachments/files/33368529/Refleksi.G.-.P04.txt)

--------------------------------------------------------------------------
North  : form tetap menempel di atas, sisa tinggi kosong di bawah.
Center : formPanel dipaksa mengisi seluruh tinggi isiPanel. Karena
         Weight Y = 0, grid berada di tengah secara vertikal, sehingga
         form tampak melayang di tengah, tidak lagi rapat di atas.
Kesimpulan: North dipakai agar baris form tetap di atas.
 
3. Hapus setMinimumSize(getSize()), lalu jendela dikecilkan sekecil mungkin
---------------------------------------------------------------------------
Hasil : kolom isian (text field, combo box, spinner) menyusut dan
        terpotong lebih dulu, lalu tombol Batal/Simpan ikut terpotong.
        Label di kiri bertahan lebih lama karena lebarnya sudah pas
        dengan teksnya.
Sebab : tanpa batas minimum, jendela bisa lebih kecil dari ukuran
        yang dibutuhkan komponen. setMinimumSize(getSize()) setelah
        pack() mencegah hal itu.
 
1. Mengapa Null/Absolute Layout dihindari?

Komponen memakai koordinat piksel tetap, sehingga tidak menyesuaikan saat jendela diubah ukurannya, tampilannya bisa rusak di platform, DPI, atau font berbeda, dan sulit dipelihara saat komponen ditambah atau dihapus.

2. FlowLayout vs GridLayout saat dilebarkan
FlowLayout: ukuran komponen tetap, hanya posisinya bergeser (dan turun baris jika sempit).
GridLayout: semua sel dan komponen ikut melebar sama besar.
3. Fungsi Weight X dan Fill
Weight X: menentukan pembagian sisa ruang horizontal ke kolom (0 = tidak melebar, 1.0 = menerima sisa ruang).
Fill: menentukan apakah komponen mengisi penuh cell-nya (None, Horizontal, Vertical, Both).

Keduanya dipakai bersama agar text field ikut memanjang.

4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?

Agar form tidak ditarik memenuhi seluruh tinggi jendela. Di North, tinggi form tetap sesuai isinya, lebarnya tetap ikut melebar, dan ruang kosong berada di bawah sehingga baris form tetap rapat.

5. Dua prinsip desain
Konsistensi: label rata kiri di satu kolom, input sejajar dengan lebar sama, jarak antar baris seragam (Insets [0, 0, 6, 0]).
Pengelompokan (proximity): label berdekatan dengan inputnya, radio button Jenis Anggota dikelompokkan dalam satu ButtonGroup, dan tombol Simpan/Hapus dipisah di tombolPane bagian South.
1. flowPanel: Alignment = Center

Yang berubah saat jendela dikecilkan: FlowLayout menyusun komponen dari kiri ke kanan. Saat lebar panel tidak cukup, tombol turun ke baris berikutnya. Dengan Alignment Center, setiap baris (termasuk baris sisa yang isinya lebih sedikit) berada di tengah panel. Pada Left, tombol selalu rata ke kiri.

2.gridPanel: Rows = 0, Columns = 2

Jumlah baris yang terbentuk adalah ⌈n / 2⌉, dengan n jumlah komponen di panel. Misalnya 4 tombol menjadi 2 baris, dan 5 tombol menjadi 3 baris (baris terakhir hanya terisi satu sel).

3. boxPanel: maximumSize dan Vertical Strut

Perubahan lebar tombol: BoxLayout menghormati maximumSize komponen. Tanpa pengaturan ini, tombol hanya selebar ukuran pilihannya (preferredSize), jadi lebarnya berbeda-beda sesuai teks. Dengan maximumSize = (32767, tinggi tombol), tombol boleh melebar sampai batas hampir tak terhingga. Pada BoxLayout sumbu Y, keempat tombol akan melebar memenuhi lebar panel dan seragam, serta ikut melebar atau menyempit saat jendela diubah ukurannya. Tingginya tetap, karena batas maksimumnya sama dengan tinggi tombol

[Eksperimen 2 p04.txt](https://github.com/user-attachments/files/33368528/Eksperimen.2.p04.txt)


P04-Hasil Keluaran Layout Manager
# pbo2-2410010447
P03-Komponen GUI Swing

Mode Gelap
<img width="1152" height="757" alt="Screenshot 2026-10-02 194046" src="https://github.com/user-attachments/assets/e46249e1-f9ec-44c1-8eca-6607a82747ed" />


Mode Terang
<img width="822" height="592" alt="Screenshot 2026-10-02 194040" src="https://github.com/user-attachments/assets/22b2552c-f89a-4c0a-bb77-984e4bd41e61" />

Desaign dan Navigator FromTiketTravel
<img width="1046" height="832" alt="Screenshot 2026-10-13 140946" src="https://github.com/user-attachments/assets/5caadfd7-5c2d-4753-bd46-461c24ca90ec" />

P03-Komponen GUI Swing
