import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========Selamat Datang==========");
        System.out.println("------MENU UTAMA-----");


        Scanner scanner = new Scanner(System.in);

        int pilihan = 0;

        System.out.println("====Silahkan Pilih Menu===");
        System.out.println("1. Buah");
        System.out.println("2. exit");

        System.out.print("Pilihan : ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                DataBuah dataBuah = new DataBuah();

                dataBuah.tambahBuah(new Buah("Apel","B0001", 75000));
                dataBuah.tambahBuah(new Buah("Durian","B2017", 75000));
                dataBuah.tambahBuah(new Buah("Apel","B0011", 75000));

                System.out.println("====Silahkan Pilih Menu===");
                System.out.println("1. Tampilkan Data Buah");
                System.out.println("2. Cari Data Buah");
                System.out.println("3. Hapus Data Buah");

                System.out.print("Pilihan : ");
                pilihan = scanner.nextInt();

                switch (pilihan){
                    case 1:
                        dataBuah.tampilBuah();
                        break;

                    case 2:
                        dataBuah.cariBuah("B0001");
                        break;

                    case 3:
                        dataBuah.hapusBuah("B0011");
                        break;
                }
                break;

            case 3:
                System.exit(0);
                break;
        }
    }
}
