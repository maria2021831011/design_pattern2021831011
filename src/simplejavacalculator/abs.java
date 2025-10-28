package simplejavacalculator;

public class abs implements operation{
    @Override
    public double op( double num) {
        return Math.abs(num);
    }
}
