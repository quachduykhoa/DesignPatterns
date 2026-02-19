package Candy;

public class CandyGummyFactory extends AbstractCandy {
   
    @Override
    public Candy getCandy(){
        return new CandyGummy();
    }
}
