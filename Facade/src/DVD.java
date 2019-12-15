public class DVD {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    public void load() {
        this.data = true;
    }
    public void unload() {
        this.data = false;
    }

}
