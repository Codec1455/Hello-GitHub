package cn.zier.javaSE;

/**
 * @author mengshuaibin
 */
public class Child  extends Parent{
    /**
     * 在子类的实例初始化时，子类的构造方法会默认调用父类的无参构造方法，如果，父类中没有无参构造时，会编译出错。这时必须显示调用父类的
     * 带参构造。
     * @param s 1111
     */
    Child( String s){
        System.out.println("子类的有参构造！"+s);
    }

    public static void main(String[] args) {
        new Child("a");
    }


    }

