package 生产者消费者同步与通信问题;

/**
 * 生产者线程通信过程：
 *         //1、如果已经有了商品就等待
 *         //2、没有商品就生产商品，并输出
 *         //3、生产好后，修改flag使状态变为：有商品
 *         //4、通知消费者进行消费
 */
public class ProduceRunnable implements Runnable{
//    private final Product product = new Product();

    private Product product;

    public void setProduct(Product product){
        this.product = product;
    }

//    boolean flag = false; //写到该类中没有与商品关联，需写到Product类中
    @Override
    public void run() {
        int i = 0;
        while (i<200){
            synchronized (product){
                //1、如果已经有了商品就等待，wait()让出cpu进入阻塞状态、并放弃锁！
                if (product.flag){
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //2、没有商品就生产商品，并输出
                if (i % 2 != 0) {
                    product.setName("蛋糕");
//                try {
//                    Thread.sleep(10);     //sleep(parm):让出cpu进入阻塞状态、但不放弃锁！
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                    product.setColor("白色");
                }else {
                    product.setName("冰激凌");
                    product.setColor("蓝色");
                }
                System.out.println("生产者生产了"+product.getName()+"\t"+product.getColor());
                i++;
                //3、生产好后，修改flag使状态变为：有商品true
                product.flag = true;
                //4、通知消费者进行消费
//                product.notify();
                product.notifyAll();
            }

        }
    }
}
