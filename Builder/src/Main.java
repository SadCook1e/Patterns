public class Main {

    public  static void  main(String[] args){
        HouseBuilder beton = new ConcreteHouse();
        beton.createNewHouse();
        beton.SetFloor();
        beton.SetWall();
        beton.SetGarage();

        HouseBuilder wood = new WoodenHouseWithGarage();
        wood.createNewHouse();
        wood.SetFloor();
        wood.SetWall();
        wood.SetGarage();
        beton.print();
        wood.print();
    }
}