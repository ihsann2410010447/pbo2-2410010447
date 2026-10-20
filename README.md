

P04-Hasil Keluaran Layout Manager
1.Desaign dan Navigator
<img width="1233" height="875" alt="Desaign Dan Navigator" src="https://github.com/user-attachments/assets/a1e5504e-09e2-413b-8e29-94ee1fbbc920" />

2.Hasil saat di lebarkan 
<img width="1790" height="638" alt="Tampilan saat dilebarkan" src="https://github.com/user-attachments/assets/8461a234-2475-48ed-aaa8-a42fa476b96d" />
3.Hasil saat di jalankan
<img width="1911" height="1022" alt="tampilan awal" src="https://github.com/user-attachments/assets/b931181b-de4b-4f6c-a3fb-fe47211ddda3" />

# Eksperimen dan Refleksi P04
https://github.com/ihsann2410010447/pbo2-2410010447/blob/main/p04-layout-manager/Eksperimen%201%20p04.txt
https://github.com/ihsann2410010447/pbo2-2410010447/blob/main/p04-layout-manager/Eksperimen%202%20p04.txt
https://github.com/ihsann2410010447/pbo2-2410010447/blob/main/p04-layout-manager/Refleksi%20G%20-%20P04%20.txt
# Deklarasi Ai:
https://github.com/ihsann2410010447/pbo2-2410010447/blob/main/p04-layout-manager/Deklarasi%20Penggunaan%20Ai.txt
#  Saling Menilai
https://github.com/ihsann2410010447/pbo2-2410010447/blob/main/p04-layout-manager/Screenshot%202026-10-13%20165845.png
# Sketsa Jframe
<img width="1243" height="1280" alt="6228970956516955380" src="https://github.com/user-attachments/assets/753aca41-92d4-429b-b246-fdcce0bf148b" />
# Table rancangan
<img width="511" height="287" alt="image" src="https://github.com/user-attachments/assets/ea18f214-e443-4619-ae9f-46e57b2af337" />


P04-Hasil Keluaran Layout Manager
# pbo2-2410010447
P03-Komponen GUI Swing

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
