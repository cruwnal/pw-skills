interface A
{

    void show();
}

interface X{
    void abc();

}


class B implements A,X {

    @Override
    public void show() {
       System.out.println("IN SHOW");
    }

    @Override
    public void abc() {
        System.out.println("IN ABC METHOD");
    }
}



public class Demo {


    public static void main(String[] args){
//        A obj = new B();
    B obj = new B();
    obj.show();
    obj.abc();

    }
}
