package 生产者消费者同步与通信问题;

public class Product {
    private String name;
    private String color;

    boolean flag = false; //默认状态为：没有商品 即false
    public Product(){}

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
