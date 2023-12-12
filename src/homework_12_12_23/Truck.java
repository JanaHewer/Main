package homework_12_12_23;

public class Truck extends Transport {

    private boolean isLoaded;
    public Truck(int weight, byte[] coordinate) {
        super(weight,coordinate);
    }
    public Truck(int weight, byte[] coordinate,boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }


    protected void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }
    public String getLoaded(){
        if (isLoaded)
            return "Unloaded ";
        else
            return "The truck is not loaded";
    }
}