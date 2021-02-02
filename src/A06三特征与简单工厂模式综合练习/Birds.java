package A06三特征与简单工厂模式综合练习;

public class Birds extends Animal{
    private String skill;

    Birds(){
        System.out.println("--------一只鸟--------");
    }
    Birds(String color,int age,String skill){
        super(color,age);
        this.skill = skill;
    }

    public String getSkill(){
        return skill;
    }

    @Override
    public void introduce(){
        System.out.println("I am a bird with "+getColor()+",who is  "+getAge()+"years old!"+"I am good at "+getSkill());
    }
}
