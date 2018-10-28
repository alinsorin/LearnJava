package base;

public class Test {
    public static void main(String... args){
        String name = "SDA";

        // instance (onject) method
        Loops loops = new Loops();
        loops.printSimpleArray();
        
       System.out.println(Loops.message());
    }
}
