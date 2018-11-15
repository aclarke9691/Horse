public class Mustang implements Horse {
    private String horseName;
    private int horseWeight;

    public Mustang (String horseName, int horseWeight)
    {
        this.horseName= horseName;
        this.horseWeight= horseWeight;
    }

    public String getName()
    {
        return this.horseName;
    }

    public int getWeight()
    {
        return this.horseWeight;
    }
}
