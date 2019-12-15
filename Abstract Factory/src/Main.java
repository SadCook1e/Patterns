public class Main {

    public  static void  main(String[] args){
        SquadronFactory factory = new ElfSquadronFactory();

        Archer archer =  factory.createArcher();
        Mage mage = factory.createMage();
        Warrior warrior = factory.createWarrior();

        archer.shoot();
        mage.cast();
        warrior.attack();

    }
}