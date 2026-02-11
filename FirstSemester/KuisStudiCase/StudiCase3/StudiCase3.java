package FirstSemester.KuisStudiCase.StudiCase3;
import java.text.DecimalFormat;

public class StudiCase3 {
    public static void main(String[] args) {
        double modalAwal = 1000; // modal awal Rp1.000
        double[] bungaList = {0.04, 0.05, 0.06, 0.07}; // 4%, 5%, 6%, 7%
        DecimalFormat df = new DecimalFormat("####.0");

        System.out.println("Simulasi Kenaikan Bunga Tahunan (Tabel)\n");
        System.out.println("Modal awal: Rp " + df.format(modalAwal) + "\n");

        // Header tabel
        System.out.printf("%-8s", "Tahun");
        for (double bunga : bungaList) {
            System.out.printf("%15s", (int)(bunga * 100) + "%");
        }
        System.out.println();

        // Loop tahun (baris)
        for (int tahun = 1; tahun <= 10; tahun++) {
            System.out.printf("%-8d", tahun);

            // Loop bunga (kolom)
            for (double bunga : bungaList) {
                // bunga sederhana: modal + (modal * bunga * tahun)
                double nilai = modalAwal + (modalAwal * bunga * tahun);
                nilai = Math.round(nilai * 10.0) / 10.0; // bulatkan ke 1 angka desimal
                System.out.printf("%15s", df.format(nilai));
            }

            System.out.println(); // pindah baris
        }
    }
}