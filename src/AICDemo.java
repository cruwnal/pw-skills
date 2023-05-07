
//functional interface
@FunctionalInterface
interface Car{
    void drive(int avg);
}



public class AICDemo
{
    public static void main(String[] args) {
           //anonymous inner class

//            Car obj = new Car(){
//              public void drive(){
//                  System.out.println("driving>>>>>>");
//              }
//            };

        Car obj = ( avg) ->

                System.out.println("driving>>>>>>"+avg);

        obj.drive(5);
    }
}
