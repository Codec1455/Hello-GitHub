package cn.zier.javaSE;

/**
 * @author mengshuaibin
 */
public  class Animal   {
      private  String name;
      private  int  age;


    public Animal() {
    }

    public Animal(String s, int i) {
        this.name = s;
        this.age = i ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
