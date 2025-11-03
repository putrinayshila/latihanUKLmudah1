import java.util.Scanner;

public class soalmudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Hitung biaya berdasarkan jarak
        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double biayaBerat = berat * biayaPerKg;

        // Tambahan biaya volume jika melebihi 100 cm^3
        double biayaVolume = (volume > 100) ? 50000 : 0;

        // Total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        // Output hasil
        System.out.println("Volume paket: " + volume + " cm^3");
        System.out.println("Biaya pengiriman: Rp " + totalBiaya);

        input.close(); //menutup Scanner 
    }
}