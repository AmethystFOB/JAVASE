package A06三特征与简单工厂模式综合练习;

public class Birds extends Animal{
    private String singIng;

    Birds(){
        System.out.println("--------一只鸟--------");
    }
    Birds(String color,int age,String singIng){
        super(color,age);
        this.singIng = singIng;
    }

    public String getSpecial(){
        return singIng;
    }

    @Override
    public void introduce(){
        System.out.println("I am a bird with "+getColor()+",who is  "+getAge()+"years old!"+"I am good at "+getSpecial());
    }
}
