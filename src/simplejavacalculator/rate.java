package simplejavacalculator;

public class rate implements operation{
    @Override
    public double op(double num) {
        return num / 100;
    }
}

