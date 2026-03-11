package Candy;

public class CandyHardFactory extends AbstractCandy {
    @Override
    public Candy getCandy(){
        return new CandyHard();
    }
}
