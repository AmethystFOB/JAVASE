public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        /* a先用(b=10)后加(a=11) */
        int c = (--b) + (++a);
        /* b先减(b=9)后用(b=9) ;a先加(a=12)后用(a=12) ;c=b+a=9+12=21 */
        int d = (c++) - (a--) + (++b);
        /* c先用(c=21)后加(c=22) ;a先用(a=12)后减(a=11) ;b先加(b=10)后用(b=10) */
        /* d=c-a+b=21-12+10=19 */
        /* 此时a=11 ;b=10 ;c=22 ;d=19 */
        int e = (--d) + (c++) - (++b) + (a--);
        /* d先减(d=18)后用(d=18) ;c先用(c=22)后加(c=23) ;b先加(b=11)后用(b=11) */
        /* a先用(a=11)后减(a=10) ;e=d+c-b+a=18+22-11+11=40*/
        System.out.println(a);  // a=10
        System.out.println(b);  // b=11
        System.out.println(c);  // c=23
        System.out.println(d);  // d=18
        System.out.println(e);  // e=40
    }
}