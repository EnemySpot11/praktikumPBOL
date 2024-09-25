import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tugas2 {
    private Map<String, String> dataMahasiswa = new HashMap<>();

    public void menuUtama() {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Ubah Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Keluar ");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahMahasiswa(input);
                    break;
                case 2:
                    lihatDataMahasiswa();
                    break;
                case 3:
                    ubahMahasiswa(input);
                    break;
                case 4:
                    hapusMahasiswa(input);
                    break;
                case 5:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan gak ada, coba tekan nomor yang ada.");
            }
        } while (pilihan != 5);

        input.close();
    }

    public void tambahMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        if (dataMahasiswa.containsKey(nim)) {
            System.out.println("NIM sudah terdaftar.");
        } else {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            dataMahasiswa.put(nim, nama);
            System.out.println("Mahasiswa sudah ditambahkan.");
        }
    }

    public void lihatDataMahasiswa() {
        if (dataMahasiswa.isEmpty()) {
            System.out.println("Data mahasiswa gak ada.");
        } else {
            System.out.println("\n=== Data Mahasiswa ===");
            for (Map.Entry<String, String> entry : dataMahasiswa.entrySet()) {
                System.out.println("NIM: " + entry.getKey() + ", Nama: " + entry.getValue());
            }
        }
    }

    public void ubahMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM yang mau di-update: ");
        String nim = input.nextLine();

        if (dataMahasiswa.containsKey(nim)) {
            System.out.print("Masukkan Nama baru: ");
            String namaBaru = input.nextLine();
            dataMahasiswa.put(nim, namaBaru);
            System.out.println("Data mahasiswa sudah di update.");
        } else {
            System.out.println("NIM tidak ada.");
        }
    }

    public void hapusMahasiswa(Scanner input) {
        System.out.print("Masukkan NIM yang mau dihapus: ");
        String nim = input.nextLine();

        if (dataMahasiswa.containsKey(nim)) {
            dataMahasiswa.remove(nim); 
            System.out.println("Mahasiswa dengan NIM " + nim + " sudah dihapus.");
        } else {
            System.out.println("NIM tidak ada.");
        }
    }

    public static void main(String[] args) {
        Tugas2 crud = new Tugas2();
        crud.menuUtama(); 
    }
}
