package manusia;

import hewan.Cat; //Contoh Pemanggilan dengan import

public class CatLover {

    public String nama;
    public int umur;
    public String pekerjaan;

    public CatLover(String nama, int umur, String pekerjaan) {
        this.nama = nama;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
    }

    public void mengenalkanPeliharaan(Cat cat){//Contoh Pemanggilan dengan import
        System.out.println("kenalin nih kucing aku namanya "+cat.nama);//Contoh Pemanggilan dengan import
        System.out.println("dia cukup gemuk loo, beratnya "+cat.beratBadan+" Kg");//Contoh Pemanggilan dengan import
    }

    public final void manusiaMeninggal(){
        System.out.println("nyawa telah dicabut");
    }
}
