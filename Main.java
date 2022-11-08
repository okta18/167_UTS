public class Main {
            public static void main(String[] args) throws Exception {
                Tendik karyawan1 = new Tendik(197,"Melia", "Bantul","12-April-1969","Perempuan", 1997);
                karyawan1.display();
                karyawan1.waktuLembur(30);
                karyawan1.setUangLembur(0);
                karyawan1.displaygaji();
                System.out.println();
                System.out.println();

                Dosen dosen1 = new Dosen(780, "Elia", "Wates","16-Maret-1980" , "Perempuan", 2000);
                dosen1.setNomorIndukDosen(781928);
                dosen1.setJurusan("Teknik Informatika");
                dosen1.display();
                dosen1.displayDosen_Jurusan();
                dosen1.waktuLembur(8);
                dosen1.displaygaji();
            }


}