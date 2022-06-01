package yyyf.Design_pattern;
//双重检测
public class Singleton {
    private Singleton(){}//隐藏默认的构造函数
    private static Singleton instance = null;
    public static Singleton getInstance(){          //对外提供的方法
        if(instance == null){                       //第一次检测
            synchronized (Singleton.class){         //同步锁
                if(instance == null){               //第二次检测
                    instance = new Singleton();     //初始化
                }
            }
        }
        return instance;
    }
}

//懒汉模式
class Singleton1{
    private Singleton1(){}
    private static Singleton1 instance = null;
    public static synchronized Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}