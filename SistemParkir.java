import java.util.Scanner;

public class SistemParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = input.nextLine();

        int lamaParkir = 1; // Asumsikan lama parkir 1 jam
        int biayaPerJamMobil = 5000;
        int biayaPerJamMotor = 3000;
        int totalBiaya = 0;

        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            totalBiaya = lamaParkir * biayaPerJamMobil;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            totalBiaya = lamaParkir * biayaPerJamMotor;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return;
        }

        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya parkir: Rp" + totalBiaya);
    }
}