public class ArrayMhs {
    public static void main(String[] args) {
        System.out.println("=== MAHASISWA ===");
        
        // Membuat array dengan ukuran tetap (3 elemen)
        String[] namaSiswa = {"Maya", "Ontin", "Lutfiah"};
        
        // Menampilkan isi array
        System.out.println("Daftar nama mahasiswa:");
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println((i + 1) + ". " + namaSiswa[i]);
        }
    }
}
