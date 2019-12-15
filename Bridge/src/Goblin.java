public class Goblin extends Race {

    public Goblin(Enemy e) {
        super(e);
    }

    @Override
    void attack() {
        enemy.setEnemy();
        System.out.println(" is attack");
    }
}
