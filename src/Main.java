import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String, String> adminCredentials;
    private Map<String, String> mahasiswaCredentials;

    public Main() {
        adminCredentials = new HashMap<>();
        adminCredentials.put("admin", "adminn");

        mahasiswaCredentials = new HashMap<>();
        mahasiswaCredentials.put("202310370311427", "password427");
    }

    public boolean loginAdmin(String username, String password) {
        return adminCredentials.containsKey(username) && adminCredentials.get(username).equals(password);
    }

    public boolean loginMahasiswa(String nim) {
        return nim.length() == 15 && mahasiswaCredentials.containsKey(nim);
    }

    public static void main(String[] args) {
        Main library = new Main();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            System.out.println("Silakan pilih menu:");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Mahasiswa");
            System.out.println("3. Exit");

            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Username admin: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Password admin: ");
                    String adminPassword = scanner.nextLine();

                    if (library.loginAdmin(adminUsername, adminPassword)) {
                        System.out.println("Login admin berhasil!");
                    } else {
                        System.out.println("Admin User Not Found !!");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = scanner.nextLine();

                    if (library.loginMahasiswa(nim)) {
                        System.out.println("Login mahasiswa berhasil!");
                    } else {
                        System.out.println("User Not Found !!");
                    }
                    break;
                case 3:
                    System.out.println("Iterasai !");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }

        scanner.close();
    }
}