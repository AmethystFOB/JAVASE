package A06三特征与简单工厂模式综合练习;

public class Zoo {
    public static void main(String[] args) {
        new Fish();
        Animal animal = new Fish("pink",23,"can swim");
        animal.introduce();

        Factory.makeAnimal("bird").introduce();

    }
}
