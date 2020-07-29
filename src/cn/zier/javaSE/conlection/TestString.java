package cn.zier.javaSE.conlection;

/**
 * @author mengshuaibin
 */
public class TestString {
    public static void main(String[] args) {
        System.out.println("MAX_MEMORY:"+byteToM(Runtime.getRuntime().maxMemory())+"M");
        System.out.println("TOTAL_MEMORY:"+byteToM(Runtime.getRuntime().totalMemory())+"M");

    }
    public static double round (long num ,int scale){
        return Math.round(Math.pow(10,scale)*num)/Math.pow(10,scale);
    }
    static double byteToM(long num){
        return round(num/1024/1024,2);
    }

    }

