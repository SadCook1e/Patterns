public class Prototipe implements Copy {
    private Type type;
    public enum Type {
        ONE, TWO
    }
    public Prototipe copy() {
        Prototipe complicatedobject = new Prototipe();
        return complicatedobject;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public void print(){
        System.out.println(type);
    }
}