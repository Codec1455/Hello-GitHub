package cn.zier.javaSE;

/**
 * @author mengshuaibin
 */
public class Singleton {
    static volatile Singleton singleton;
    private Singleton(){
    }
    public  static synchronized Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    }

