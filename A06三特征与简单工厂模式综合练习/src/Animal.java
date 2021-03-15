public class Animal {
    private String color;
    private int age;

    Animal(){
        super();
    }
    Animal(String color,int age){
        this.color = color;
        this.age = age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getColor() {
        return color;
    }
    public int getAge(){
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        //如果obj==null 返回false
        if (obj == null) {
            return false;
        }
        //如果指向同一个对象 返回true
        if (this == obj) {
            System.out.println("Animal中this与obj指向对象-相同!");
            return true;
        }else {
            System.out.println("Animal中this与obj指向对象-不同!");
        }
        //判断成员变量的内容是否完全相同
        Animal other = (Animal)obj;//下转型
        if (this.age == other.age&&this.color == other.color) {
            System.out.println("成员变量的内容--相同"+"this.age="+this.age+"this.color="+this.color);
            System.out.println("成员变量的内容--相同"+"other.age="+other.age+"other.color="+other.color);
            return true;
        }else {
            System.out.println("成员变量的内容--不相同"+"this.age="+this.age+"this.color="+this.color);
            System.out.println("成员变量的内容--不相同"+"other.age="+other.age+"other.color="+other.color);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Animal{color="+getColor()+"age="+getAge()+"}";
    }

    public void introduce(){
        System.out.println("I am a fish with "+getColor()+",who is  "+getAge()+"years old!");
    }

}
