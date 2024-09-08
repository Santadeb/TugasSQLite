package com.example.tugassqlite;

public class Mahasiswa {
    private int id;
    private String nama;
    private String nim;
    private String prodi;

    // Constructor tanpa parameter
    public Mahasiswa() {
    }

    // Constructor dengan parameter
    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    // Getter dan Setter untuk ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan Setter untuk prodi
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
