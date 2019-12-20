package myerror;

public class Sample {
    static void cal(int a) throws MyErrExample {
        if(a > 100){
            throw new MyErrExample(a);
        }
        System.out.println("No Found Any Error");

    }
    public static  void main(String[] args){
        try{
            cal(44);
            System.out.println("--------------------");
            cal(111);
        }
        catch(MyErrExample e){
            System.out.println(e);
        }
    }
}
