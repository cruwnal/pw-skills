
interface D{
    void show();

    default void config(){
        System.out.println("IN CONFIG");
    }

    static void abc(){
        System.out.println("IN ABC");
    }
}

class E implements D{

    @Override
    public void show() {
        System.out.println("IN SHOW");
    }
}

public class Java8Feat
{
    public static void main(String[] args) {
        E obj = new E();
        obj.show();
     D.abc();
     obj.config();
    }
}
