public class Buah {
    String nama, kode_buah;
    int harga;

    public Buah(String nama, String kode_buah, int harga) {
        this.nama = nama;
        this.kode_buah = kode_buah;
        this.harga = harga;
    }

    void print(){
        System.out.println("Kode Buah: " + this.kode_buah);
        System.out.println("Nama: " + this.nama);
        System.out.println("Harga: " + this.harga);
    }
}
