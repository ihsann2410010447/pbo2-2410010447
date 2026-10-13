[README.md](https://github.com/user-attachments/files/33368965/README.md)
P04-Hasil Keluaran Layout Manager
1.Desaign dan Navigator
<img width="1233" height="875" alt="Desaign Dan Navigator" src="https://github.com/user-attachments/assets/a1e5504e-09e2-413b-8e29-94ee1fbbc920" />

2.Hasil saat di lebarkan 
<img width="1790" height="638" alt="Tampilan saat dilebarkan" src="https://github.com/user-attachments/assets/8461a234-2475-48ed-aaa8-a42fa476b96d" />
3.Hasil saat di jalankan
<img width="1911" height="1022" alt="tampilan awal" src="https://github.com/user-attachments/assets/b931181b-de4b-4f6c-a3fb-fe47211ddda3" />


# P04 - Layout Manager: Form Anggota Perpustakaan

Proyek praktikum Pemrograman Berorientasi Objek 2 (PBO2) yang menerapkan **Layout Manager** pada Java Swing menggunakan NetBeans. Form dibuat dengan `GridBagLayout` dan `BorderLayout` agar tampilannya responsif saat jendela diubah ukurannya.

## Tampilan

![Form Anggota Perpustakaan](screenshot.png)

> Letakkan screenshot form di root repositori dengan nama `screenshot.png`.

## Fitur Form

| Field | Komponen |
|---|---|
| Nama Lengkap | `JTextField` |
| NPM | `JTextField` |
| Program Studi | `JComboBox` |
| Jenis Anggota (Mahasiswa, Dosen, Umum) | `JRadioButton` + `ButtonGroup` |
| Email/No.Hp | `JTextField` |
| Alamat | `JTextArea` di dalam `JScrollPane` |
| Persetujuan | `JCheckBox` |
| Aksi | Tombol **Simpan** dan **Hapus** (`JButton`) |

## Struktur Layout

```
JFrame (FormAnggotaPerpustakaan)
├── isiPane [JPanel, BorderLayout]
│   └── formPanel [JPanel, GridBagLayout]   (posisi North)
│       ├── Label (kolom 0)
│       └── Input (kolom 1)
└── tombolPane [JPanel]                      (posisi South)
    ├── Simpan
    └── Hapus
```

## Pengaturan GridBagLayout

| Komponen | Fill | Weight X | Anchor |
|---|---|---|---|
| Label (kolom 0) | None | 0 | West |
| Input (kolom 1) | Horizontal | 1.0 | West |
| Alamat (`JScrollPane`) | Both | 1.0 | West |

Jarak antar baris memakai Insets `[0, 0, 6, 0]`.

## Struktur Proyek

```
p04-layout-manager
├── pom.xml
└── src/main/java/id/ac/uniska/pbo2/p04
    ├── FormAnggotaPerpustakaan.java
    ├── FormBiodata.java
    └── GaleriLayout.java
```

## Cara Menjalankan

1. Clone repositori ini.
   ```bash
   git clone https://github.com/<username>/p04-layout-manager.git
   ```
2. Buka proyek di **Apache NetBeans** (File → Open Project).
3. Jalankan `FormAnggotaPerpustakaan.java` (**Shift + F6**).
4. Tarik tepi jendela untuk melihat kolom input ikut melebar.

## Ringkasan Konsep

### 1. Mengapa Null/Absolute Layout dihindari?
Komponen memakai koordinat piksel tetap, sehingga tidak menyesuaikan saat jendela diubah ukurannya, tampilannya bisa rusak di platform, DPI, atau font berbeda, dan sulit dipelihara saat komponen ditambah atau dihapus.

### 2. FlowLayout vs GridLayout saat dilebarkan

| Layout | Perilaku |
|---|---|
| `FlowLayout` | Ukuran komponen tetap, hanya posisinya bergeser (dan turun baris jika sempit). |
| `GridLayout` | Semua sel dan komponen ikut melebar sama besar. |

### 3. Fungsi Weight X dan Fill
- **Weight X**: menentukan pembagian sisa ruang horizontal ke kolom (0 = tidak melebar, 1.0 = menerima sisa ruang).
- **Fill**: menentukan apakah komponen mengisi penuh cell-nya (`None`, `Horizontal`, `Vertical`, `Both`).

Keduanya dipakai bersama agar text field ikut memanjang.

### 4. Mengapa formPanel dibungkus isiPanel dan diletakkan di North?
Agar form tidak ditarik memenuhi seluruh tinggi jendela. Di North, tinggi form tetap sesuai isinya, lebarnya tetap ikut melebar, dan ruang kosong berada di bawah sehingga baris form tetap rapat.

### 5. Dua prinsip desain yang diterapkan
- **Konsistensi**: label rata kiri di satu kolom, input sejajar dengan lebar sama, jarak antar baris seragam (Insets `[0, 0, 6, 0]`).
- **Pengelompokan (proximity)**: label berdekatan dengan inputnya, radio button Jenis Anggota dikelompokkan dalam satu `ButtonGroup`, dan tombol Simpan/Hapus dipisah di `tombolPane` bagian South.

## Teknologi

- Java
- Java Swing
- Apache NetBeans
- Maven

## Identitas

- **Nama**: _isi nama Anda_
- **NPM**: _isi NPM Anda_
- **Mata Kuliah**: Pemrograman Berorientasi Objek 2
- **Institusi**: Universitas Islam Kalimantan (UNISKA)


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
