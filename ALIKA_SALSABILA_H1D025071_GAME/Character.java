package ALIKA_SALSABILA_H1D025071_GAME;

    public abstract class Character {
        public static final int MAX_HP = 100;
        private final String heroId;

        private String name;
        private int hp;
        private int energy;

        public Character(String heroId, String name) {
            this(heroId, name, 100, 50);
        }

        public Character(String heroId, String name, int hp, int energy) {
            this.heroId = heroId;
            this.name = name;
            this.hp = Math.min(hp, MAX_HP);
            this.energy = energy;
        }

        public void rest() {
            this.energy += 20;
            System.out.println(name + " beristirahat. Energy bertambah 20!");
        }

        public String getStatusInfo() {
            return "[" + heroId + "] " + name + " | HP: " + hp + "/" + MAX_HP + " | Energy: " + energy;
        }

        public abstract void specialSkill();

        public String getHeroId() { return heroId; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getHp() { return hp; }
        public void setHp(int hp) { this.hp = Math.min(hp, MAX_HP); }
        public int getEnergy() { return energy; }
        public void setEnergy(int energy) { this.energy = energy; }
    }

