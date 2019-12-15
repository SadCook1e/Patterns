public abstract class Race {
    Enemy enemy;
    public Race(Enemy e) {
        this.enemy = e;
    }
    abstract void attack();
}
