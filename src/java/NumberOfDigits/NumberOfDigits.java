package hu.nive.ujratervezes.kepesitovizsga_pot_potvizsga;

public class NumberOfDigits {
    public int getNumberOfDigits(int meddig)
    {
        int hanyszam = 0;
        for(int i = 1;i <meddig;i++)
        {
            hanyszam++;
        }
        return hanyszam;
    }
}
