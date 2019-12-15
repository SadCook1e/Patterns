public abstract class HouseBuilder {
    protected House House;

    public void createNewHouse(){
        House = new House();
    }
    public House getHouse(){
        return House;
    }

    public  abstract void  SetWall();
    public  abstract void SetFloor();
    public  abstract void SetGarage();

    public  void  print (){
        System.out.println(House.GetFloor()+"\n"+House.GetWall()+"\n"+House.GetGarage()+"\n");
    }
}