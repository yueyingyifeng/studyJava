package yyyf.study.annotation;

public class anno {
    @Deprecated
    static void fun(){
        System.out.println("this is a deprecated method");
    }

    @newAnno("mainMethod")
    public static void main(String[] args) {
        saying();
    }

    @newAnno(value = "sayMethod")
    public static void saying(){}

}
