
# P07-mini-Proyek
## Deklarasi Ai
Claude Ai 
Chat Gpt

Membantu membuat Source Code di bagian KatalogBuku dan DialogBuku

## Tautan Video Demo Katalog Buku
https://drive.google.com/file/d/1VNPYTsvW8ZUDyiiyRHum32v_M8et-E-4/view?usp=drive_link
# P07-mini-proyek


# P07-Label-dan-Menu

## Deklarasi Ai
Claude Ai
Menjelaskan beberapa Langkah yang saya masih kurang Pahami dan membantu untuk memperbaiki sebagian source di Bagian p07-label-dan-menu
## Eksperimen 5
1: Tidak. Tabel tidak diberi tahu ada baris baru, jadi tampilannya baru berubah setelah dimuat ulang (misalnya lewat pencarian).

2: Nama kontak yang salah (kontak di baris 0 daftar asli, bukan Ahmad Fauzi). getSelectedRow() mengembalikan indeks tampilan hasil filter, sedangkan model memakai indeks data asli. Perlu convertRowIndexToModel.

3: Jendela utama bisa diklik saat dialog terbuka, dan kontak tidak ditambahkan. Dialog tidak lagi modal, sehingga kode pemanggil jalan terus tanpa menunggu hasil dialog.

4: Menu Ubah dan Hapus nonaktif saat tidak ada baris dipilih, dan item menu nonaktif mengabaikan accelerator-nya.

5: Baris hapusItem.setAccelerator(...) berubah dari KeyStroke VK_D + CTRL_DOWN_MASK menjadi VK_DELETE dengan modifier 0.

6: NullPointerException, karena model masih null saat initComponents() memakainya. Model harus dibuat sebelum initComponents().
# P07-Label-dan-Menu

# P06-Validasi_Input_dan_Kegunaan

## Tangkapan Layar Label Pesan
<img width="1317" height="782" alt="image" src="https://github.com/user-attachments/assets/17e5977a-491e-4ec8-8e78-45dbb72ae467" />

## Tangkapan Layar dengan Pesan Kesalahan
<img width="466" height="581" alt="image" src="https://github.com/user-attachments/assets/9fdd0a73-8869-4161-8d08-f314fe2fe94f" />

## Tabel Riview

| No. | Temuan dari Teman | Perbaikan yang Dilakukan | Commit |
|---|---|---|---|
| 1 | Input NPM berjalan dengan baik dan hanya menerima angka. | Tidak ada perbaikan. | Tidak ada |
| 2 | Validasi email berjalan dengan baik. | Tidak ada perbaikan. | Tidak ada |
| 3 | Isian Nama berfungsi dengan baik. | Tidak ada perbaikan. | Tidak ada |
| 4 | Tombol Daftar berjalan dengan baik. | Tidak ada perbaikan. | Tidak ada |
| 5 | Tombol Batal menampilkan konfirmasi dengan benar. | Tidak ada perbaikan. | Tidak ada |


## Peer Riview
### Dinilai Oleh Sopiya Nabila
<img width="1053" height="663" alt="image" src="https://github.com/user-attachments/assets/1b220d0c-452f-43da-9bfa-59af549a69b8" />
<img width="1087" height="372" alt="image" src="https://github.com/user-attachments/assets/42e1a63f-3661-470d-a2bd-5fdb97838075" />


## Deklarasi Ai
Claude Ai

Digunakan untuk menjelaskan beberapa langkah yang masih saya tidak pahami

## Eksperimen 4
1. NPM: Huruf tidak bisa dimasukkan karena program hanya mengizinkan angka. Baris penyebabnya adalah evt.consume().
2. Email: Pesan kesalahan muncul saat menekan Tab karena kolom email kehilangan fokus dan format email tidak valid.
3. Nama: Tidak muncul pesan kesalahan karena validasi Nama tidak dijalankan saat kolom kehilangan fokus.
4. Daftar: Fokus kembali ke kolom Nama karena merupakan isian pertama yang wajib diisi.
5. Alt + N: Fokus berpindah ke kolom Nama. Diatur menggunakan properti DisplayedMnemonic dan LabelFor.
6. Batal: Data tetap ada karena memilih No berarti membatalkan proses penghapusan data.

# P06-Validasi_Input_dan_Kegunaan
# P05-event-handling

## Deklarasi Ai
[Deklarasi Ai-P05.txt](https://github.com/user-attachments/files/33704415/Deklarasi.Ai-P05.txt)
Deklarasi Ai

Ai Yang di pakai: Claude Ai

1. Menjelaskan Sebagian Materi yang masih saya kurang pahami
2. membuat coding/ source koding di bagian FormAnggota Perpustakaan untuk melanjutkan pertemuan 4
3. membantu membuat eksperimen dan table pengamatan



## Eksperimen 4
[eksperimen 4-p05.txt](https://github.com/user-attachments/files/33704321/eksperimen.4-p05.txt)


1. Pesan "kali" tercetak 2 kali setiap tombol diklik.
   Event dari Events dan lambda di konstruktor sama-sama mendaftarkan
   ActionListener pada kaliButton, jadi keduanya dipanggil.
   Satu tombol sebaiknya satu cara karena aksi berjalan dobel, kode
   tersebar di dua tempat sehingga sulit dilacak, dan urutan eksekusi
   antar-listener tidak boleh diandalkan.

2. Tombol % (modulus).
   Tab Design:
   - Tambah JButton dari Palette, text "%".
   - Ganti nama variabel menjadi modButton.
   - Rapikan posisi dan ukuran.
   Tab Source:
   - Buat handler actionPerformed untuk modButton (satu cara saja).
   - Tambah operasi hasil = a % b;
   - Tangani pembagi nol (int: ArithmeticException, double: NaN).
   - Jangan edit blok initComponents() yang berwarna abu-abu.

3. Kursor langsung di isian pertama karena handler Hapus memanggil
   setText("") lalu requestFocus() / requestFocusInWindow() pada isian
   pertama. Tanpa itu, fokus tetap di tombol dan pengguna harus
   mengklik isian dulu.

## Eksperimen 3


1. Pesan "item berubah" tercetak 2 kali setiap pilihan diganti.
   ItemListener dipanggil dua kali: sekali untuk DESELECTED (item lama)
   dan sekali untuk SELECTED (item baru). Pemeriksaan getStateChange()
   == SELECTED sebelumnya menyaring pemanggilan pertama.

2. Hasil terlambat satu karakter karena saat keyPressed dijalankan,
   karakter yang baru ditekan belum masuk ke teks field. getText()
   masih mengembalikan isi sebelumnya (mengetik "25" baru "2" yang
   dikonversi). Pada keyReleased teks sudah terbarui, sehingga sinkron.

3. Di jendela Output muncul stack trace:
   java.lang.NumberFormatException: For input string: "a"
   (atau "empty String" jika isian kosong).
   Aplikasi tidak tertutup, tetapi label hasil tidak diperbarui dan
   error terus muncul setiap tombol dilepas. Karena itu try-catch
   diperlukan untuk menangani input yang tidak valid.[eksperiman 3-p05.txt](https://github.com/user-attachments/files/33704304/eksperiman.3-p05.txt)


## Tabel Pengamatan 
<img width="607" height="393" alt="Screenshot 2026-10-20 122647" src="https://github.com/user-attachments/assets/b0a54511-c258-4bfa-a347-b8165afae768" />


## Event Tombol Daftar
<img width="1911" height="1013" alt="Screenshot 2026-10-20 123440" src="https://github.com/user-attachments/assets/1f67c92c-fb31-4724-8195-59f065f5d71d" />



## Peta Event
| Komponen | Menu Events | Aksi |
|---|---|---|
| Kotak centang setuju | Item: itemStateChanged | Tombol Daftar hanya aktif jika dicentang |
| Tombol Batal | Action: actionPerformed | Kosongkan semua isian dan kembalikan fokus ke NPM |
| Tombol Daftar | Action: actionPerformed | Tampilkan ringkasan data dengan JOptionPane |
| Isian NPM | Key: keyReleased | Label kecil menampilkan jumlah digit, misalnya "8 dari 10 digit" |
| Form (JFrame) | Window: windowClosing | Minta konfirmasi sebelum aplikasi ditutup |
<img width="695" height="33" alt="Screenshot 2026-10-20 124437" src="https://github.com/user-attachments/assets/92c114cf-b4ec-426b-86d7-23f7e4067455" />

## Tampilan Perpustakaan awal saat di jalankan
<img width="640" height="602" alt="Screenshot 2026-10-20 124647" src="https://github.com/user-attachments/assets/1a3ee467-4e23-4df5-8980-7324ffd8a7f2" />

## Dialog Konfirmasi Keluar
<img width="647" height="596" alt="Screenshot 2026-10-20 124721" src="https://github.com/user-attachments/assets/62528c1c-8dd1-4d4b-9ceb-683ef178d122" />

## Dialog Tampilan Ringkasan
<img width="505" height="563" alt="Screenshot 2026-10-20 124703" src="https://github.com/user-attachments/assets/dc83a1ab-bf67-481f-980f-709c5e89453f" />

# P05-event-handling

# P04-Hasil Keluaran Layout Manager
1.Desaign dan Navigator
<img width="1233" height="875" alt="Desaign Dan Navigator" src="https://github.com/user-attachments/assets/a1e5504e-09e2-413b-8e29-94ee1fbbc920" />

2.Hasil saat di lebarkan 
<img width="1790" height="638" alt="Tampilan saat dilebarkan" src="https://github.com/user-attachments/assets/8461a234-2475-48ed-aaa8-a42fa476b96d" />
3.Hasil saat di jalankan
<img width="1911" height="1022" alt="tampilan awal" src="https://github.com/user-attachments/assets/b931181b-de4b-4f6c-a3fb-fe47211ddda3" />

# Eksperimen 1 P04
[1. flowPanel: Alignment = Center

Yang berubah saat jendela dikecilkan: FlowLayout menyusun komponen dari kiri ke kanan. Saat lebar panel tidak cukup, tombol turun ke baris berikutnya. Dengan Alignment Center, setiap baris (termasuk baris sisa yang isinya lebih sedikit) berada di tengah panel. Pada Left, tombol selalu rata ke kiri.

2.gridPanel: Rows = 0, Columns = 2

Jumlah baris yang terbentuk adalah ⌈n / 2⌉, dengan n jumlah komponen di panel. Misalnya 4 tombol menjadi 2 baris, dan 5 tombol menjadi 3 baris (baris terakhir hanya terisi satu sel).

3. boxPanel: maximumSize dan Vertical Strut

Perubahan lebar tombol: BoxLayout menghormati maximumSize komponen. Tanpa pengaturan ini, tombol hanya selebar ukuran pilihannya (preferredSize), jadi lebarnya berbeda-beda sesuai teks. Dengan maximumSize = (32767, tinggi tombol), tombol boleh melebar sampai batas hampir tak terhingga. Pada BoxLayout sumbu Y, keempat tombol akan melebar memenuhi lebar panel dan seragam, serta ikut melebar atau menyempit saat jendela diubah ukurannya. Tingginya tetap, karena batas maksimumnya sama dengan tinggi tombol

Uploading Eksperimen 1 p04.txt…]()

# eksperimen 2 P04
[Uploadi1. Weight X namaField = 0.0, lalu jendela dilebarkan
---------------------------------------------------
Hasil : namaField tetap ikut melebar bersama isian lain.
Sebab : Weight X dihitung per KOLOM (diambil nilai terbesar di kolom
        itu). Isian lain di kolom 1 masih ber-Weight 1.0, jadi kolom
        tetap melebar, dan Fill = Horizontal membuat namaField
        memenuhi selnya.
Catatan: namaField baru berhenti melebar jika Fill-nya diubah ke None
        atau semua isian di kolom 1 ber-Weight 0.
 
2. Direction formPanel dari North menjadi Center, lalu jendela ditinggikan
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
 ng Eksperimen 2 p04.txt…]()

# Refleksi
[Refleksi G - P04 .txt](https://github.com/user-attachments/files/33700152/Refleksi.G.-.P04.txt)
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

# Deklarasi Ai:
AI: Claude Ai

 1.menjelaskan beberapa Praktikum Yang masih saya tidak pahami 
 2.membantu saya untuk beberapa letak panel di Frame yang masih saya tidak pahami 
 3.membantu saya dibagian layout seperti di bagian gridbaglayout 



#  Saling Menilai
<img width="673" height="511" alt="Screenshot 2026-10-13 165845" src="https://github.com/user-attachments/assets/1f75fecd-952f-47c6-ae29-68519fd18522" />


# Sketsa Jframe
<img width="1243" height="1280" alt="6228970956516955380" src="https://github.com/user-attachments/assets/753aca41-92d4-429b-b246-fdcce0bf148b" />

# Table rancangan
<img width="511" height="287" alt="image" src="https://github.com/user-attachments/assets/ea18f214-e443-4619-ae9f-46e57b2af337" />


# P04-Hasil Keluaran Layout Manager


# P03-Komponen GUI Swing

# Mode Gelap
<img width="1152" height="757" alt="Screenshot 2026-10-02 194046" src="https://github.com/user-attachments/assets/e46249e1-f9ec-44c1-8eca-6607a82747ed" />


# Mode Terang
<img width="822" height="592" alt="Screenshot 2026-10-02 194040" src="https://github.com/user-attachments/assets/22b2552c-f89a-4c0a-bb77-984e4bd41e61" />

# Desaign dan Navigator FromTiketTravel
<img width="1046" height="832" alt="Screenshot 2026-10-13 140946" src="https://github.com/user-attachments/assets/5caadfd7-5c2d-4753-bd46-461c24ca90ec" />

# Refleksi G


1. Top-level container, intermediate container, atomic component
   - Top-level container: wadah paling luar yang punya jendela sendiri
     dan menjadi akar hierarki. Contoh: JFrame.
   - Intermediate container: wadah di dalam top-level untuk
     mengelompokkan dan mengatur tata letak komponen. Contoh: JPanel.
   - Atomic component: komponen dasar yang berinteraksi langsung dengan
     pengguna dan tidak menampung komponen lain. Contoh: JButton.

2. JRadioButton perlu buttonGroup yang sama agar saling eksklusif:
   memilih satu otomatis membatalkan yang lain. Tanpa grup, beberapa
   radio bisa terpilih bersamaan.

3. Pilih JComboBox jika pilihan banyak atau ruang form terbatas
   (contoh: program studi). Pilih JRadioButton jika pilihan sedikit
   (2-4) dan sebaiknya terlihat sekaligus (contoh: jenis anggota).

4. initComponents() adalah kode otomatis NetBeans yang dibuat ulang
   setiap tab Design berubah, sehingga edit manual akan tertimpa atau
   merusak sinkronisasi Design dan Source. Kode tambahan ditulis di
   konstruktor setelah initComponents(), di method handler event, atau
   di method buatan sendiri di luar blok abu-abu.

5. FlatLightLaf.setup() harus dipanggil sebelum form dibuat karena look
   and feel dipasang saat komponen dibuat. Jika dipanggil setelahnya,
   komponen tetap memakai tampilan lama. Letakkan di awal main, sebelum
   new FormAnggotaPerpustakaan().setVisible(true).

# P03-Komponen GUI Swing
