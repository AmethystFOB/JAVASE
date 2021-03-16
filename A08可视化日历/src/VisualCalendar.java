import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可以判断这个月一共多少天
 * 判断某一天是星期几
 * 实现过程：
 *        1、按照提示输入一个日期
 *        2、打印日历：
 *              1、打印日历头：日   一   二   三   四   五   六
 *              2、循环打印 1号 之前的空格
 *              3、循环打印每一天，周六换行
 *
 *
 */
public class VisualCalendar {
    public static void main(String[]args){
        System.out.println("请输入日期（按照格式2001-01-03）：");
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();//输入一个时间，以字符串的格式；
        DateFormat b=new SimpleDateFormat("yyyy-MM-dd");//两者格式要相等；
        try {
            Date date =b.parse(temp);//核心代码： 把字符串转为时间！！！！
            Calendar calendar=new GregorianCalendar();
            calendar.setTime(date);//这三行代码是为了把字符串转换为calendar类目的是变成计算机能处理的日期
            int today=calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE, 0);//初始化，让输入的数是1号；
            //System.out.println(d.get(Calendar.DAY_OF_WEEK));输入的日期1号是星期几
            //System.out.println(d.getActualMaximum(Calendar.DATE));日期所在的月份的最大天数；
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for(int i=0;i<calendar.get(Calendar.DAY_OF_WEEK);i++){//1号在星期几，前面的都打印空字符；
                System.out.print("\t");
            }
            for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++){//打印本月的天数
                if(i==today){
                    System.out.print("*");//把今天用*表示出来
                }
                System.out.print(i+"\t");

                int w=calendar.get(Calendar.DAY_OF_WEEK);//获得星期几；
                if(w==6)//如果是星期6则换行；
                {
                    System.out.println();
                }
                calendar.add(Calendar.DATE,1);//循环一次+一天；
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block自动填写捕获异常；
            e.printStackTrace();
        }
    }
}