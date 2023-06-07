import hewan.Cat;

public class Main {
    public static void main(String[] args) {

        manusia.CatLover catLover = new manusia.CatLover("Cokro",22,"Driver Taxi");
        Cat coco = new Cat("Coco", 5,catLover);

        System.out.println("================== No4 ==================");

        catLover.mengenalkanPeliharaan(coco);

        System.out.println("------------------------------------------");

        coco.kucingNgobrol();

        System.out.println("================== No5 ==================");

        System.out.println(Cat.jenisHewan);
        //menggunakan final karena semua kucing adalah mamalia sehingga atribut tidak perlu berubah
        //menggunakan Static karena semua kucing adalah mamalia maka atribut melekat pada kelas dan bukan objek tertentu

        catLover.manusiaMeninggal();
        //Menggunakan final karena semua manusia meninggal sama (kehilangan nyawa) sehingga method tidak perlu di overide
    }
}