package cn.zier.javaSE;

/**
 * @author mengshuaibin
 */
public   class Test {
    public static void main(String[] args) {
       Animal animal = new Animal("旺旺", 12);
       Animal animal2 = new Animal("旺旺", 15);
        Animal animal1 = change(animal);
        System.out.println("animal=="+animal);
        System.out.println("animal1=="+animal1);
        System.out.println(animal2 ==animal1);
    }

     static Animal  change (Animal a){
        a.setAge(15);
        return a;
    }

}





