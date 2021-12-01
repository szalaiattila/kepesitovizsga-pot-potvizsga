package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.zoo;

public class Elephant {
    String Name;
    int Length;
    int Weight;
    String Type;
    public Elephant(String Name,int Length,int Weight) {
        this.Name = Name;
        this.Length = Length;
        this.Weight = Weight;
    }
    public String getName() {
        return Name;
    }
    public int getLength()
    {
        return Length;
    }
    public int getWeight() {
        return Weight;
    }
    public String getType() {
        return Type;
    }
}
