import java.util.ArrayList;
import java.util.Scanner;



class Mahasiswa {
    static String universitas = "Universitas Muhammadiyah Malang";
    static ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

    String nama;
    String nim;
    String jurusan;


    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    static void tampilUniversitas() {
        System.out.println(universitas);
    }

    static void tampilDataMahasiswa() {
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mahasiswa : dataMahasiswa) {
            System.out.println("Nama: " + mahasiswa.nama + ", NIM: " + mahasiswa.nim + ", Jurusan: " + mahasiswa.jurusan);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:\n1. Tambah Data Mahasiswa\n2. Tampilkan Data Mahasiswa\n3. Keluar");
            System.out.print("\nPilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                tambahDataMahasiswa(scanner);
            } else if (pilihan == 2) {
                Mahasiswa.tampilDataMahasiswa();
                Mahasiswa.tampilUniversitas();
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
        scanner.close();

    }

    /**
     * @param scanner
     */
    static void tambahDataMahasiswa(Scanner scanner) {
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        while (nim.length() != 15) {
            System.out.println("NIM Harus 15 Digit!!!");
            System.out.print("Masukkan NIM mahasiswa: ");
            nim = scanner.nextLine();
        }

        System.out.print("Masukkan jurusan mahasiswa: ");
        String jurusan = scanner.nextLine();

        Mahasiswa.dataMahasiswa.add(new Mahasiswa(nama, nim, jurusan));

        System.out.println("\nData mahasiswa berhasil ditambahkan.");
    }
}

