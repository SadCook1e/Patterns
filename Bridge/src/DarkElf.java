public class DarkElf extends Race {

    public DarkElf(Enemy e) {
        super(e);
    }

    @Override
    void attack() {
        enemy.setEnemy();
        System.out.println(" is attack");
    }
}
