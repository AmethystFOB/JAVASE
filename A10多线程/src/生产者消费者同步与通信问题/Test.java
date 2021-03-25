package 生产者消费者同步与通信问题;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();

        /**
         * 通过setProduct(Product product) 使生产者与消费者之间通过产品联系起来
         */
        ProduceRunnable produceRunnable = new ProduceRunnable();
        produceRunnable.setProduct(product);
        Thread produceThread = new Thread(produceRunnable);
        /**
         * 通过构造方法使生产者与消费者之间通过产品联系起来
         */
        ConsumeRunnable consumeRunnable = new ConsumeRunnable(product);
        Thread consumeThread = new Thread(consumeRunnable);

        produceThread.start();
        consumeThread.start();
    }
}
