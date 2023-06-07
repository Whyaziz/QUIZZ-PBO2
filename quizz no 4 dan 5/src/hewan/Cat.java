package hewan;


public class Cat {

    public String nama;
    public int beratBadan;
    public final static String jenisHewan = "Mamalia"; //penggunaan final dan static pada atribut
    manusia.CatLover pemilik; //pemanggilan langsung dengan alamat lengkap

    public Cat(String nama, int beratBadan, manusia.CatLover pemilik) {//pemanggilan langsung dengan alamat lengkap
        this.nama = nama;
        this.beratBadan = beratBadan;
        this.pemilik = pemilik;
    }

    public void kucingNgobrol(){
        System.out.println("Aku punya Babu namanya "+pemilik.nama);
        System.out.println("kadang gabecus banget, aku sering ditinggal buat kerja jadi "+pemilik.pekerjaan);
    }
}
