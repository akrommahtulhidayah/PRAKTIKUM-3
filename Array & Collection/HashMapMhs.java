import java.util.HashMap;
import java.util.Map;

public class HashMapMhs {
    public static void main(String[] args) {
        System.out.println("=== DATA MAHASISWA ===");
        
        // Membuat HashMap (Key: String NIM, Value: String Nama)
        HashMap<String, String> dataMhs = new HashMap<>();
        
        // Studi kasus: menambahkan data mahasiswa
        dataMhs.put("001", "Maya");
        dataMhs.put("002", "Ontin");
        dataMhs.put("003", "Lutfiah");
        dataMhs.put("004", "Virna");
        
        // Menampilkan semua data mahasiswa
        System.out.println("-> Daftar mahasiswa:");
        for (Map.Entry<String, String> entry : dataMhs.entrySet()) {
            System.out.println("NIM: " + entry.getKey() + " -> Nama: " + entry.getValue());
        }
        
        // Studi kasus: mencari data berdasarkan NIM
        String cariNIM = "002";
        System.out.println("\n-> Mencari mahasiswa dengan NIM '" + cariNIM + "': " + dataMhs.get(cariNIM));
        
        // Studi kasus: mahasiswa dengan NIM 003 mengundurkan diri
        System.out.println("\n-> Mahasiswa dengan NIM '003' (Lutfiah) mengundurkan diri...");
        dataMhs.remove("003");
        
        // Menampilkan data setelah penghapusan
        System.out.println("\n-> Daftar mahasiswa setelah ada yang mengundurkan diri:");
        for (Map.Entry<String, String> entry : dataMhs.entrySet()) {
            System.out.println("NIM: " + entry.getKey() + " -> Nama: " + entry.getValue());
        }
        
        // Menampilkan jumlah mahasiswa saat ini
        System.out.println("\n-> Jumlah mahasiswa saat ini: " + dataMhs.size());
        
        // Catatan: Key (NIM) harus unik; jika memasukkan NIM yang sama, data lama akan tertimpa.
    }
}