
interface Computer{

void compilCode();

}


class Laptop implements Computer{

    public void compilCode(){
        System.out.println("you got five error and you have to rectifide those error");
    }
}

class Desktop implements Computer{

    public void compilCode(){
        System.out.println("you got five error , Faster");
    }
}

class Developer{

    public void buildApp(Computer obj){
    System.out.println("building app for testting ");
    obj.compilCode();
    }

}



public class Main
{
    public static void main(String[] args) {
       Computer obj = new Desktop();
         Developer dev = new Developer();

         dev.buildApp(obj);



    }
}
