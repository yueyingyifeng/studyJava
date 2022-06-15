interface I{
    public int getA();
    public void say();
}

class A implements I{
    int a = 0;
    @Override
    public int getA(){
        return a;
    }

    public void say(){
        System.out.println("abc");
    }
}

public class TEST{

    public static void main(String[] args){
        I i = new I(){
            public int getA(){
                return 0;

            }
            public void say(){
                System.out.println("hi");
            }
        };

        I i1 = i;
        i1.say();
    }
}