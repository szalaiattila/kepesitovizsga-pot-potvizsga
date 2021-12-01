package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga.zoo;

public class Giraffe {
    String Name;
    int Length;
    int Weight;
    String Type;
    public Giraffe(String Name,int Length){
        this.Name = Name;
        this.Length = Length;
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
