package com.belajar.gunungindonesia;

public class Gunung {
    private String namaGunung;
    private String imageUrl;
    private String tinggiGunung;
    private String deskripsiGunung;

    public String getDeskripsiGunung() { return deskripsiGunung; }

    public void setDeskripsiGunung(String deskripsiGunung) { this.deskripsiGunung = deskripsiGunung; }

    public String getTinggiGunung() {
        return tinggiGunung;
    }

    public void setTinggiGunung(String tinggiGunung) { this.tinggiGunung = tinggiGunung; }

    public String getNamaGunung() {
        return namaGunung;
    }

    public void setNamaGunung(String namaGunung) {
        this.namaGunung = namaGunung;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
