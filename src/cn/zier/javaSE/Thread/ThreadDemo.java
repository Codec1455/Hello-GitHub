package cn.zier.javaSE.Thread;

/**
 * @author mengshuaibin
 */
public class ThreadDemo extends Thread  {


    @Override
    public  void run() {
            System.out.println("多线程测试！"+Thread.currentThread().getName()+"正在执行任务！");
        }

    }


