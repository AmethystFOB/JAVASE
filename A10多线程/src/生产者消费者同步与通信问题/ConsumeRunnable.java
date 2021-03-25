package 生产者消费者同步与通信问题;

public class ConsumeRunnable implements Runnable{
//    private final Product product = new Product();
    private final Product product;

    public ConsumeRunnable(Product product){
        this.product = product;
    }
    int i = 0;

//    boolean flag = false; //写到该类中没有与商品关联，需写到Product类中
    @Override
    public void run() {
        while (i<200){
            synchronized (product){
                // 1、如果没有商品就等待,wait()让出cpu进入阻塞状态、并放弃锁！
                if(!product.flag){
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 2、如果有商品就消费
                System.out.println("消费者消费了"+product.getName()+"\t"+product.getColor());
                i++;
                // 3、消费之后，修改标记flag为false ：即没商品
                product.flag = false;
                // 4、通知生产者进行生产
//                product.notify();
                product.notifyAll();
            }
        }
    }
}
