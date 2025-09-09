package com.mycompany.posttest1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> namaKegiatan = new ArrayList<>();
        ArrayList<String> tanggal = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        while (true) {
            System.out.println("\nSelamat Datang Di Program To Do List");
            System.out.println("1. Tambah Kegiatan");
            System.out.println("2. Lihat Daftar Kegiatan");
            System.out.println("3. Update Daftar Kegiatan");
            System.out.println("4. Hapus Kegiatan");
            System.out.println("5. Keluar dari Program");
            System.out.print("Silahkan Pilih Menu: ");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Kegiatan/Tugas: ");
                    String nama = input.nextLine();
                    System.out.print("Tanggal/Deadline Kegiatan/Tugas: ");
                    String tgl = input.nextLine();
                    namaKegiatan.add(nama);
                    tanggal.add(tgl);
                    status.add("Belum Selesai");
                    System.out.println("Kegiatan Berhasil Ditambahkan");
                    break;

                case 2:
                    System.out.println("Daftar Kegiatan Anda");
                    if (namaKegiatan.isEmpty()) {
                        System.out.println("Belum Ada Kegiatan");
                    } else {
                        for (int i = 0; i < namaKegiatan.size(); i++) {
                            System.out.println((i + 1) + ". " + namaKegiatan.get(i) +
                                    " | Tanggal: " + tanggal.get(i) +
                                    " | Status : " + status.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Daftar Kegiatan Anda");
                    if (namaKegiatan.isEmpty()) {
                        System.out.println("Belum Ada Kegiatan");
                    } else {
                        for (int i = 0; i < namaKegiatan.size(); i++) {
                            System.out.println((i + 1) + ". " + namaKegiatan.get(i) +
                                    " | Tanggal: " + tanggal.get(i) +
                                    " | Status : " + status.get(i));
                        }
                    }
                    System.out.print("Pilih nomor kegiatan yang ingin diubah: ");
                    int idx = input.nextInt() - 1;
                    input.nextLine();

                    if (idx >= 0 && idx < namaKegiatan.size()) {
                        System.out.print("Update Nama Kegiatan: ");
                        String newNama = input.nextLine();
                        if (!newNama.isEmpty()) {
                            namaKegiatan.set(idx, newNama);
                        }

                        System.out.print("Update Tanggal: ");
                        String newTanggal = input.nextLine();
                        if (!newTanggal.isEmpty()) {
                            tanggal.set(idx, newTanggal);
                        }

                        System.out.print("Update Status (1 = Selesai, 2 = Belum Selesai): ");
                        int pilihStatus = input.nextInt();
                        input.nextLine();
                        if (pilihStatus == 1) {
                            status.set(idx, "Selesai");
                        } else if (pilihStatus == 2) {
                            status.set(idx, "Belum Selesai");
                        }

                        System.out.print("Kegiatan Berhasil di Update!");
                    } else {
                        System.out.print("Pilihan tidak valid.");
                    }
                    break;


                case 4:
                    System.out.println("Daftar Kegiatan Anda");
                    if (namaKegiatan.isEmpty()) {
                        System.out.println("Belum Ada Kegiatan");
                    } else {
                        for (int i = 0; i < namaKegiatan.size(); i++) {
                            System.out.println((i + 1) + ". " + namaKegiatan.get(i) +
                                    " | Tanggal: " + tanggal.get(i) +
                                    " | Status : " + status.get(i));
                        }
                    }
                    System.out.print("Pilih nomor kegiatan yang ingin dihapus: ");
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

                case 5:
                    System.out.println("Terima kasih telah menggunakan program To Do List");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}