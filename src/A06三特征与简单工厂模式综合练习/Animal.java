package A06三特征与简单工厂模式综合练习;

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

    public String getColor() {
        return color;
    }

    public int getAge(){
        return age;
    }

    public void introduce(){
        System.out.println("I am a fish with "+getColor()+",who is  "+getAge()+"years old!");
    }

}
