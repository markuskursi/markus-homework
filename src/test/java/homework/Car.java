package homework;

import org.junit.jupiter.api.Test;

public class Car {
    public double consumption(double a, double b) {
       // double c = a / b;
        return a / b;
    }
    public double required(double d) {
      // double f = (d / consumption(100.00,5.5));
        return (d / consumption(100.00, 5.5));
    }
    @Test
    public void test(){
        double c = consumption(100.00, 5.5);
        double f = required(500.00);

        System.out.println(c);
        System.out.println(f);

    }
}
