import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INPUT NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("INPUT JENIS KELAMIN (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "Laki-laki" : "Perempuan";

        System.out.print("INPUT TANGGAL LAHIR (YYYY-MM-DD): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate tanggalSekarang = LocalDate.now();

        int tahunSelisih = tanggalSekarang.getYear() - tanggalLahir.getYear();
        int bulanSelisih = tanggalSekarang.getMonthValue() - tanggalLahir.getMonthValue();

        if (bulanSelisih < 0) {
            tahunSelisih--;
            bulanSelisih += 12;
        }

        System.out.println("\n=== DATA ===");
        System.out.println("NAMA: " + nama);
        System.out.println("JENIS KELAMIN: " + jenisKelamin);
        System.out.println("TANGGAL LAHIR: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("UMUR: " + tahunSelisih + " TAHUN " + bulanSelisih + " BULAN");

        scanner.close();
    }

    @Override
    public String toString() {
        return "CODELAB1 []";
    }
}
