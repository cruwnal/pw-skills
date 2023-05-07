
//member
class F{

    public void show(){
        System.out.println("in show");
    }

    class G{
        public void display(){
            System.out.println("in display");
        }
    }
}
//static
class H{
    static class I{

    }
}

public class InnerDemo
{
    public static void main(String [] args){
     F obj = new F();
 obj.show();
 F.G obj1 = obj.new G();
 obj1.display();
    }
}
