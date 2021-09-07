import java.util.ArrayList;

public class DataBuah {

    ArrayList<Buah> dataBuah = new ArrayList<Buah>();

    void tambahBuah(Buah buah) {
        this.dataBuah.add(buah);
    }

    ;

    void hapusBuah(String kode) {
        this.dataBuah.removeIf(item -> item.kode_buah == kode);
    }

    ;

    void cariBuah(String kode) {
        boolean available = false;

        int index = -1;

        for (int i = 0; i < this.dataBuah.size(); i++) {
            if (this.dataBuah.get(i).kode_buah == kode) {
                index = i;

                available = true;
            }
        }

        if (available == true) {
            this.dataBuah.get(index).print();
        } else {
            System.out.println("Data Buah tidak ditemukan");
        }
    }

    void tampilBuah() {
        System.out.println("===================");
        for (Buah item : this.dataBuah) {
            item.print();
        }
    }
}
