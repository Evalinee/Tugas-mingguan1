import java.util.Scanner;

public class RakBukumain {
    // Inisialisasi rak buku sebagai array multidimensi
    static String[][] rakBuku = {
        {"Harry Potter", "J.K. Rowling", "2001"},
        {"The Hobbit", "J.R.R. Tolkien", "1937"},
        {"To Kill a Mockingbird", "Harper Lee", "1960"},
        {"1984", "George Orwell", "1949"},
    };

    // Fungsi untuk menampilkan semua buku di rak
    static void tampilkanSemuaBuku() {
        System.out.println("Daftar Buku di Rak:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Judul: " + rakBuku[i][0] + ", Penulis: " + rakBuku[i][1] + ", Tahun Terbit: " + rakBuku[i][2]);
        }
    }

    // Fungsi untuk mencari buku berdasarkan judul
    static boolean cariBuku(String judul) {
        for (int i = 0; i < 4; i++) {
            if (rakBuku[i][0].equals(judul)) {
                System.out.println("Buku ditemukan:");
                System.out.println("Judul: " + rakBuku[i][0] + ", Penulis: " + rakBuku[i][1] + ", Tahun Terbit: " + rakBuku[i][2]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Semua Buku");
            System.out.println("2. Cari Buku");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.next();

            if (pilihan.equals("1")) {
                tampilkanSemuaBuku();
            } else if (pilihan.equals("2")) {
                input.nextLine(); // Membersihkan newline character sebelum membaca judul buku
                System.out.print("Masukkan judul buku yang ingin dicari: ");
                String judulCari = input.nextLine();
                if (!cariBuku(judulCari)) {
                    System.out.println("Buku tidak ditemukan.");
                }
            } else if (pilihan.equals("3")) {
                System.out.println("Terima kasih telah menggunakan program rak buku.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }

        input.close();
    }
}
