## Deskripsi Singkat
Program **To-Do List** ini dibuat menggunakan bahasa Java dengan konsep **CRUD (Create, Read, Update, Delete)** berbasis console.  
Program memungkinkan pengguna untuk:
- Menambahkan kegiatan baru dengan nama dan tanggal.
- Melihat daftar kegiatan beserta statusnya.
- Mengupdate kegiatan (nama, tanggal, dan status).
- Menghapus kegiatan tertentu.
- Keluar dari program.

---

## Alur Program
1. **Tampilan Menu Utama**  
   User diberikan 5 pilihan menu: Tambah, Lihat, Update, Hapus, atau Keluar.  
   Input menu diproses menggunakan `switch-case`.

2. **Tambah Kegiatan (Create)**  
   - Memasukkan nama kegiatan dan tanggal.  
   - Data disimpan ke dalam 3 `ArrayList`: `namaKegiatan`, `tanggal`, `status`.  
3. **Lihat Daftar Kegiatan (Read)**  
   - Jika daftar kosong → tampil pesan "Belum Ada Kegiatan".  
   - Jika ada → tampil semua kegiatan dengan format:  
     ```
     1. Post Test 1 PBO | Tanggal: 10 September 2025 | Status: Belum Selesai
     ```
4. **Update Kegiatan (Update)**  
   - Pilih nomor kegiatan.  
   - Bisa ubah nama, tanggal, status.  
   - Input kosong → data lama tetap dipertahankan.  
5. **Hapus Kegiatan (Delete)**  
   - Pilih nomor kegiatan yang ingin dihapus.  
   - Data dihapus dari semua `ArrayList`.  
6. **Keluar Program**  
   - Program berhenti saat user memilih menu `5`.  

---
