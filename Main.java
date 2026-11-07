public class Main {
    public static void main(String[] args) {

        System.out.println("=== MULAI RUTIN SKINCARE HARI INI ===");
        System.out.println();

        // =========================================
        // BAGIAN 1: 5 OBJEK SKINCARE
        // =========================================

        // 1. Sabun Cuci Muka (pakai constructor)
        SabunCuciMuka sabun = new SabunCuciMuka("Hada Labo", 45000, 100);
        boolean rajinCuciMuka = true;
        sabun.cuciMuka(rajinCuciMuka);
        System.out.println("--------------------");

        // 2. Toner
        Toner toner = new Toner();
        toner.merek = "Hada Labo";
        toner.harga = 75000;
        toner.isiMl = 170;
        toner.jenis = "Hydrating";

        boolean pakaiToner = true;
        toner.tuang(pakaiToner);
        System.out.println("--------------------");

        // 3. Serum
        Serum serum = new Serum();
        serum.merek = "Somethinc";
        serum.kandungan = "Niacinamide";
        serum.harga = 120000;
        serum.tetes = 2;

        boolean pakaiSerum = true;
        serum.tetesKeMuka(pakaiSerum);
        System.out.println("--------------------");

        // 4. Moisturizer
        Moisturizer moist = new Moisturizer();
        moist.merek = "Skintific";
        moist.harga = 98000;
        moist.isiMl = 30;
        moist.jenisKulit = "Berminyak";

        boolean pakaiMoist = true;
        moist.oles(pakaiMoist);
        System.out.println("--------------------");

        // 5. Sunscreen
        Sunscreen sunscreen = new Sunscreen();
        sunscreen.merek = "Azarine";
        sunscreen.spf = 50;
        sunscreen.harga = 65000;
        sunscreen.isiMl = 110;

        boolean pakaiSunscreen = true;
        boolean dipakai = sunscreen.pakai(pakaiSunscreen);
        System.out.println("--------------------");

        // =========================================
        // BAGIAN 2: DRAMA KEHIDUPAN (TRUE / FALSE)
        // true = kejadian, false = tidak kejadian
        // =========================================
        boolean begadang = false;
        boolean makanSeblakPedas = false;
        boolean tidurPakaiMakeup = false;
        boolean galauPutusCinta = false;

        // =========================================
        // BAGIAN 3: HITUNG SKOR + HASIL AKHIR
        // =========================================
        System.out.println("=== NGACA DI CERMIN... ===");

        int skor = 0;

        // Yang bikin skor NAIK
        if (rajinCuciMuka) skor += 20;
        if (pakaiToner) skor += 15;
        if (pakaiSerum) skor += 20;
        if (pakaiMoist) skor += 15;
        if (dipakai) skor += 30;

        // Yang bikin skor TURUN
        if (begadang) skor -= 40;
        if (makanSeblakPedas) skor -= 20;
        if (tidurPakaiMakeup) skor -= 50;
        if (galauPutusCinta) skor -= 25;

        System.out.println("Skor Glow Up Kamu: " + skor + "/100");
        System.out.println("--------------------");

        // Cek RANK dari skor
        if (skor >= 100) {
            System.out.println("RANK: SSS - GLASS SKIN KOREA!");
            System.out.println("Muka kinclong kayak kaca!");
            System.out.println("Status: SIAP JADI BA SKINCARE!");
        } else if (skor >= 80) {
            System.out.println("RANK: S - GLOW UP PARAH!");
            System.out.println("Muka cerah, lembab, glowing natural.");
            System.out.println("Status: TINGGAL PERTAHANIN!");
        } else if (skor >= 60) {
            System.out.println("RANK: A - LUMAYAN GLOW!");
            System.out.println("Masih ada 1 jerawat bandel di jidat.");
            System.out.println("Status: BUTUH KONSISTEN 3 HARI LAGI!");
        } else if (skor >= 40) {
            System.out.println("RANK: B - MUKA LAGI MOOD SWING!");
            System.out.println("Kadang cerah, kadang kusam.");
            System.out.println("Status: HATI-HATI, JANGAN SAMPE TURUN!");
        } else if (skor >= 20) {
            System.out.println("RANK: C - NG - KUSAM & MINYAKAN!");
            System.out.println("Muka kayak gorengan, minyakan di mana-mana.");
            System.out.println("Status: DARURAT! WAJIB DOUBLE CLEANSING!");
        } else if (skor >= 0) {
            System.out.println("RANK: D - NG - BREAKOUT PARAH!");
            System.out.println("Jerawat di mana-mana, muka kusam, mata panda.");
            System.out.println("Status: SKINCARE-AN ULANG DARI NOL!");
        } else {
            System.out.println("RANK: F - GAME OVER!");
            System.out.println("Skor minus! Muka rusak total.");
            System.out.println("Status: STOP SCROLL TIKTOK, CUCI MUKA SEKARANG!");
        }

        // Pesan drama tambahan
        System.out.println("--------------------");
        if (tidurPakaiMakeup) {
            System.out.println("BONUS DRAMA: Ketiduran masih pakai makeup! -50 poin");
        }
        if (galauPutusCinta) {
            System.out.println("BONUS DRAMA: Galau putus cinta, jerawat nongol! -25 poin");
        }
        if (makanSeblakPedas) {
            System.out.println("BONUS DRAMA: Seblak level 5 kemarin, jerawat hari ini! -20 poin");
        }
        if (begadang) {
            System.out.println("BONUS DRAMA: Begadang sampe jam 3 pagi! -40 poin");
        }
    }
}

// =================================================
// CLASS / CETAKAN OBJEK - DI BAWAH MAIN
// =================================================

// OBJEK 1
class SabunCuciMuka {
    String merek;
    int harga;
    int isiMl;

    // Constructor: langsung isi data pas bikin objek
    SabunCuciMuka(String merek, int harga, int isiMl) {
        this.merek = merek;
        this.harga = harga;
        this.isiMl = isiMl;
    }

    void cuciMuka(boolean rajin) {
        if (rajin) {
            System.out.println("Cuci muka pakai " + merek + ", bersih! +20 poin");
        } else {
            System.out.println("MALES cuci muka! +0 poin");
        }
    }
}

// OBJEK 2
class Toner {
    String merek;
    int harga;
    int isiMl;
    String jenis;

    void tuang(boolean dipakai) {
        if (dipakai) {
            System.out.println("Toner " + merek + " (" + jenis + ") ditepuk ke muka. +15 poin");
        } else {
            System.out.println("Skip toner. +0 poin");
        }
    }
}

// OBJEK 3
class Serum {
    String merek;
    String kandungan;
    int harga;
    int tetes;

    void tetesKeMuka(boolean dipakai) {
        if (dipakai) {
            System.out.println("Serum " + merek + " " + kandungan + " ditetes " + tetes + " tetes. +20 poin");
        } else {
            System.out.println("Skip serum. +0 poin");
        }
    }
}

// OBJEK 4
class Moisturizer {
    String merek;
    int harga;
    int isiMl;
    String jenisKulit;

    void oles(boolean dipakai) {
        if (dipakai) {
            System.out.println("Moisturizer " + merek + " untuk kulit " + jenisKulit + " dioles. +15 poin");
        } else {
            System.out.println("Skip moisturizer. +0 poin");
        }
    }
}

// OBJEK 5
class Sunscreen {
    String merek;
    int spf;
    int harga;
    int isiMl;

    boolean pakai(boolean dipakai) {
        if (dipakai) {
            System.out.println("Sunscreen " + merek + " SPF " + spf + " dipakai! +30 poin");
        } else {
            System.out.println("Sunscreen TIDAK dipakai! Bahaya!");
        }
        return dipakai;
    }
}