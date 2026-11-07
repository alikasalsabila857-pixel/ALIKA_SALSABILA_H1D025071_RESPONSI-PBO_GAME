package ALIKA_SALSABILA_H1D025071_GAME;

    public class Mage extends Character implements Interaksi {
        private int mana;

        public Mage(String heroId, String name) {
            super(heroId, name, 80, 100);
            this.mana = 50;
        }

        @Override
        public void specialSkill() {
            if (mana >= 20) {
                mana -= 20;
                System.out.println(getName() + " melempar Fireball! Mana berkurang 20.");
            } else {
                System.out.println(getName() + " kehabisan Mana!");
            }
        }

        @Override
        public void aksi() {
            System.out.println(getName() + " menyerang dengan sihir!");
        }
    }

