package A06三特征与简单工厂模式综合练习;

public class Fish extends Animal{
    private String swimming;

    Fish(){
        System.out.println("-----一条鱼----");
    }

    Fish(String color,int age,String swimming){
        super(color,age);
        this.swimming = swimming;
    }

    public String getSwimming(){
        return swimming;
    }

    @Override
    public void introduce(){

        System.out.println("I am a fish with "+getColor()+",who is  "+getAge()+"years old!"+"I am good at "+getSwimming());
    }
}
