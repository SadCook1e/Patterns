public class House {
    private String _wall;
    private String _floor;
    private String _garage;


    public void SetWall(String w){
        _wall=w;
    }
    public void SetFloor(String w){
        _floor=w;
    }
    public void SetGarage(String w){
        _garage=w;
    }

    public String GetWall(){
        return _wall;
    }
    public String GetFloor(){
        return _floor;
    }
    public String GetGarage(){
        return _garage;
    }


}
