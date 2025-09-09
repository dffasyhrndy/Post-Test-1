## Deskripsi Singkat
Program **To-Do List** ini dibuat menggunakan bahasa Java dengan konsep **CRUD (Create, Read, Update, Delete)**.
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

## Penjelasan Kode
1. **Deklarasi Class Main**

```java
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> namaKegiatan = new ArrayList<>();
        ArrayList<String> tanggal = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();
```

Bagian ini membuat objek Scanner untuk menerima input dari pengguna dan tiga ArrayList untuk menyimpan data kegiatan, tanggal, serta status. Struktur data ini memungkinkan program menambah, mengubah, dan menghapus data dengan mudah.

2. **Perulangan dan Menu Awal**

```java
while (true) {
    System.out.println("\nSelamat Datang Di Program To Do List");
    System.out.println("1. Tambah Kegiatan");
    System.out.println("2. Lihat Daftar Kegiatan");
    System.out.println("3. Update Daftar Kegiatan");
    System.out.println("4. Hapus Kegiatan");
    System.out.println("5. Keluar dari Program");
    System.out.println("Silahkan Pilih Menu: ");

    int pilihan = input.nextInt();
    input.nextLine();
```

Bagian ini menggunakan perulangan while(true) untuk menampilkan menu utama secara terus-menerus sampai pengguna memilih keluar. Input pilihan menu disimpan dalam variabel pilihan.

3. **Switch Case Menu**
```java
switch (pilihan) {
    case 1: ...
    case 2: ...
    case 3: ...
    case 4: ...
    case 5: ...
    default: ...
}
```
Bagian ini menggunakan switch-case untuk menjalankan fitur sesuai menu yang dipilih pengguna, mulai dari menambah, melihat, memperbarui, menghapus, hingga keluar dari program.

4. **Tambah Kegiatan**
```java
case 1:
    System.out.println("Masukkan Nama Kegiatan/Tugas: ");
    String nama = input.nextLine();
    System.out.println("Tanggal/Deadline Kegiatan/Tugas: ");
    String tgl = input.nextLine();
    namaKegiatan.add(nama);
    tanggal.add(tgl);
    status.add("Belum Selesai");
    System.out.println("Kegiatan Berhasil Ditambahkan");
    break;
```
Menu ini memungkinkan pengguna menambahkan kegiatan baru dengan menginput nama dan tanggal, lalu otomatis memberi status "Belum Selesai". Data tersebut disimpan ke dalam ArrayList.

5. **Lihat Daftar Kegiatan**
```java
case 2:
    System.out.println("Daftar Kegiatan Anda");
    if (namaKegiatan.isEmpty()) {
        System.out.println("Belum Ada Kegiatan");
    } else {
        for (int i = 0; i < namaKegiatan.size(); i++) {
            System.out.println((i + 1) + ". " + namaKegiatan.get(i) +
                    "| Tanggal: " + tanggal.get(i) +
                    "| Status : " + status.get(i));
        }
    }
    break;
```
Menu ini menampilkan semua kegiatan yang sudah tersimpan. Jika daftar masih kosong, program memberi pesan bahwa belum ada kegiatan.

6. **Update Daftar Kegiatan**
```java
case 3:
    System.out.println("Pilih nomor kegiatan yang ingin diubah: ");
    int idx = input.nextInt() - 1;
    input.nextLine();

    if (idx >= 0 && idx < namaKegiatan.size()) {
        System.out.println("Update Nama Kegiatan: ");
        String newNama = input.nextLine();
        if (!newNama.isEmpty()) {
            namaKegiatan.set(idx, newNama);
        }
        System.out.println("Update Tanggal: ");
        String newTanggal = input.nextLine();
        if (!newTanggal.isEmpty()) {
            tanggal.set(idx, newTanggal);
        }
        System.out.println("Update Status Kegiatan: ");
        String newStatus = input.nextLine();
        if (!newStatus.isEmpty()) {
            status.set(idx, newStatus);
        }
        System.out.println("Kegiatan Berhasil di Update!");
    } else {
        System.out.println("Pilihan tidak valid.");
    }
    break;
```
Menu ini memberikan opsi untuk memperbarui nama, tanggal, atau status kegiatan. Jika pengguna tidak mengisi input baru, data lama tetap dipertahankan.

7. **Hapus Daftar Kegiatan**
```java
case 4:
    ...
    System.out.println("Pilih nomor kegiatan yang ingin dihapus: ");
    int del = input.nextInt() - 1;
    input.nextLine();
    if (del >= 0 && del < namaKegiatan.size()) {
        namaKegiatan.remove(del);
        tanggal.remove(del);
        status.remove(del);
        System.out.println("Kegiatan Berhasil Dihapus!");
    } else {
        System.out.println("Pilihan tidak valid.");
    }
    break;
```
Menu ini memungkinkan pengguna menghapus kegiatan berdasarkan nomor yang ditampilkan di daftar. Program juga memvalidasi agar nomor yang dimasukkan sesuai.

8. **Keluar Dari Program**
```java
case 5:
    System.out.println("Terima kasih telah menggunakan program To Do List");
    input.close();
    return;
```
Menu ini menutup Scanner, menampilkan pesan terima kasih, dan keluar dari program dengan return.

---

## Output Program

Tampilan awal ketika program dijalankan, disini kita dapat memilih untuk menambah, melihat, mengupdate, dan menghapus daftar kegiatan atau juga keluar dari program

<img width="673" height="292" alt="image" src="https://github.com/user-attachments/assets/ac8a8b22-02a8-4ab6-9525-fb9848ef7c2e" />

Tampilan ketika kita memilih menu 1, kita diminta menginputkan Nama Kegiatan/Tugas, dan juga Tanggal/Deadline Kegiatan/Tugas

<img width="481" height="329" alt="image" src="https://github.com/user-attachments/assets/5811d744-2f22-4973-b01c-c925d66d2557" />

Tampilan saaat memilih menu 2, program menampilkan data kegiatan yang sudah ditambahkan melalui menu 1

<img width="695" height="102" alt="image" src="https://github.com/user-attachments/assets/1b0cc8b4-e4f7-437a-a808-e286ca690c79" />

Tampilan ketika kita memilih menu 3, program menampilkan data kegiatan yang tersedia, lalu meminta inputan untuk mengubah data kegiatan dari Nama, Tanggal dan juga Status Kegiatan, ketika hanya ingin mengubah salah satu saja dapat mengosongkan inputan yang lain

<img width="690" height="439" alt="image" src="https://github.com/user-attachments/assets/f4e00fe1-1b3d-4860-983f-3677442486e4" />

Tampilan ketika memilih menu 4, disini program kembali menampilkan data kegiatan yang tersedia, dan meminta inputan data kegiatan yang ingin di hapus

<img width="653" height="351" alt="image" src="https://github.com/user-attachments/assets/9ce029bb-bf54-4dbd-b9bb-6305df282dae" />

Tampilann ketika memilih menu 5, program berhenti dan menampilkan kata "Terimakasih telah menggunakan program To Do List"

<img width="574" height="179" alt="image" src="https://github.com/user-attachments/assets/bf38c825-4d85-428f-8ac3-2c0a0552190d" />
