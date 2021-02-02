package A06三特征与简单工厂模式综合练习;

public class Factory {
    public static Animal makeAnimal(String type){
        Animal animal;
        if("fish".equals(type)){
            animal = new Fish("pink",19,"can swim");
        }else if ("bird".equals(type)) {
            animal = new Birds("red",18,"can fly");
        }else {
            animal = null;
        }
        return animal;
    }

}
