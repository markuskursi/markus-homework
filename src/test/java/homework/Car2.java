package homework;

import org.junit.jupiter.api.Test;

public class Car2 {
    public double consumption(){
        double a = 100.00;
        double b = 5.5;
        double c = a / b;
        return c;
    }
    public double required(){
        double e = 500.00;
        double f = (e / consumption());
        return f;
    }
    @Test
    public void test(){
        double c = consumption();
        double f = required();

        System.out.println(consumption());
        System.out.println(required());
    }

}
