import java.util.Scanner;

public class KategorisasiUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        
        // Validasi input untuk memastikan hanya angka positif yang dimasukkan
        while (!input.hasNextInt()) {
            System.out.println("Usia harus berupa angka positif. Silakan coba lagi.");
            input.next(); // Hapus input yang salah
        }
        
        int usia = input.nextInt();

        if (usia >= 0 && usia <= 12) {
            System.out.println("Anda termasuk kategori: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Anda termasuk kategori: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Anda termasuk kategori: Dewasa");
        } else if (usia >= 65) {
            System.out.println("Anda termasuk kategori: Lansia");
        } else {
            System.out.println("Usia tidak valid.");
        }
    }
}