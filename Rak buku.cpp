#include <iostream>
#include <string>
using namespace std;

// Inisialisasi rak buku sebagai array multidimensi
string rak_buku[][3] = {
    {"Harry Potter", "J.K. Rowling", "2001"},
    {"The Hobbit", "J.R.R. Tolkien", "1937"},
    {"To Kill a Mockingbird", "Harper Lee", "1960"},
    {"1984", "George Orwell", "1949"},
};

// Fungsi untuk menampilkan semua buku di rak
void tampilkanSemuaBuku() {
    cout << "Daftar Buku di Rak:" << endl;
    for (int i = 0; i < 4; i++) {
        cout << "Judul: " << rak_buku[i][0] << ", Penulis: " << rak_buku[i][1] << ", Tahun Terbit: " << rak_buku[i][2] << endl;
    }
}

// Fungsi untuk mencari buku berdasarkan judul
bool cariBuku(string judul) {
    for (int i = 0; i < 4; i++) {
        if (rak_buku[i][0] == judul) {
            cout << "Buku ditemukan:" << endl;
            cout << "Judul: " << rak_buku[i][0] << ", Penulis: " << rak_buku[i][1] << ", Tahun Terbit: " << rak_buku[i][2] << endl;
            return true;
        }
    }
    return false;
}

int main() {
    string pilihan;
    while (true) {
        cout << "\nMenu:" << endl;
        cout << "1. Tampilkan Semua Buku" << endl;
        cout << "2. Cari Buku" << endl;
        cout << "3. Keluar" << endl;
        cout << "Masukkan pilihan Anda: ";
        cin >> pilihan;

        if (pilihan == "1") {
            tampilkanSemuaBuku();
        } else if (pilihan == "2") {
            string judulCari;
            cout << "Masukkan judul buku yang ingin dicari: ";
            cin.ignore(); // Membersihkan buffer sebelum menggunakan getline
            getline(cin, judulCari);
            if (!cariBuku(judulCari)) {
                cout << "Buku tidak ditemukan." << endl;
            }
        } else if (pilihan == "3") {
            cout << "Terima kasih telah menggunakan program rak buku." << endl;
            break;
        } else {
            cout << "Pilihan tidak valid. Silakan pilih lagi." << endl;
        }
    }

    return 0;
}

