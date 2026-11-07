package ALIKA_SALSABILA_H1D025071_GAME;

    public class warrior extends Character implements Interaksi, upgradeLevel {
        private int armor;
        private int level;

        public warrior(String heroId, String name) {
            super(heroId, name);
            this.armor = 10;
            this.level = 1;
        }

        public warrior(String heroId, String name, int hp, int energy, int armor) {
            super(heroId, name, hp, energy);
            this.armor = armor;
            this.level = 1;
        }

        @Override
        public void specialSkill() {
            if (getEnergy() >= 30) {
                setEnergy(getEnergy() - 30);
                setHp(getHp() + 20);
                System.out.println(getName() + " mengaktifkan Shield Wall! HP +20, Energy -30.");
            } else {
                System.out.println(getName() + " gagal skill! Energy tidak cukup.");
            }
        }

        @Override
        public void aksi() {
            if (getEnergy() >= 10) {
                setEnergy(getEnergy() - 10);
                System.out.println(getName() + " menebas musuh! Damage: " + (15 + armor));
            } else {
                System.out.println(getName() + " terlalu lelah untuk menyerang!");
            }
        }

        @Override
        public void LevelUp() {
            this.level++;
            this.armor += 5;
            setHp(MAX_HP);
            System.out.println(getName() + " naik ke Level " + level + "! Armor bertambah jadi " + armor);
        }

        @Override
        public String getStatusInfo() {
            return super.getStatusInfo() + " | Armor: " + armor + " | Level: " + level;
        }

        public int getArmor() { return armor; }
        public void setArmor(int armor) { this.armor = armor; }
        public int getLevel() { return level; }
    }


