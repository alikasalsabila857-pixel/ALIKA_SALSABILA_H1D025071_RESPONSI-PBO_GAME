package ALIKA_SALSABILA_H1D025071_GAME;

public class MainGame {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI GAME HERO ARENA ===");

        Interaksi player1 = new warrior("H-01", "Arthur", 90, 40, 15);
        Interaksi player2 = new Mage("H-02", "Merlin");

        System.out.println("\n--- 1. Aksi Pemain (Polimorfisme Interface) ---");
        player1.aksi();
        player2.aksi();

        warrior warrior = (warrior) player1;

        System.out.println("\n--- 2. Status Awal & Super Chaining ---");
        System.out.println(warrior.getStatusInfo());

        System.out.println("\n--- 3. Pengujian Logika State Percabangan ---");
        warrior.specialSkill();
        warrior.specialSkill();

        System.out.println("\n--- 4. Pengujian Multiple Interface (Level Up) ---");
        warrior.LevelUp();

        System.out.println("\n--- 5. Status Akhir ---");
        System.out.println(warrior.getStatusInfo());
    }
}