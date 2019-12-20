package structure.controller1;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public int sum(int var1, int var2) {
        System.out.println("Adding values: " + var1 + " + " + var2);
        return var1 + var2;
    }

    public String concat(String var1, String var2) {
        System.out.println("Adding values: " + var1 + " " + var2);
        return var1 + " " + var2;
    }

    public boolean isEvenNumber(int number){
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

    public double temperature(double temperature, String unit){
        if(unit.equals("F"))
            return temperature - 32*(5.0/9.0);
        else
            return temperature*(9.0/5.0) +32;
    }


}
