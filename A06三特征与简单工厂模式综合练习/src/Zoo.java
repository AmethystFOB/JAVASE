public class Zoo {
    public static void main(String[] args) {
        Animal n1 = new Animal("blank",10);
        Animal n2 = new Animal("green",11);

        System.out.println(n1.equals(n2));
        System.out.println((n1==n2)+"      n1:"+n1+"      n2:"+n2);
        System.out.println("===================================");
        Animal n3 = n1;
        System.out.println(n1 == n3);
        System.out.println(n1.equals(n3));
        System.out.println("===================================");
        System.out.println(n1.getColor() == n2.getColor());
        System.out.println(n1.getColor().equals(n2.getColor()));
        System.out.println(n1.getAge() == n2.getAge());

        new Fish();
        Animal animal = new Fish("pink",23,"can swim");
        animal.introduce();

        Factory.makeAnimal("bird").introduce();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        giveIntrduce(new Birds("yellow",12,"fly around"));
    }

    /**
     * 使用父类做方法的形参，实参是任意子类对象
     * @param animal
     */
    public static void giveIntrduce(Animal animal){
        animal.introduce();
    }
}
