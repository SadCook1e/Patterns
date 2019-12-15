public class ConcreteHouseWithGarage extends HouseBuilder {

    public void SetWall() {
        House.SetWall("Concrete Wall");
    }

    public void SetFloor() {
        House.SetFloor("Concrete Floor");
    }

    public void SetGarage() {
        House.SetGarage("With garage");
    }

}