public class Fish extends Animal{
    private String special;

    Fish(){
        System.out.println("-----一条鱼----");
    }

    Fish(String color,int age,String special){
        super(color,age);
        this.special = special;
    }

    public String getSpecial(){
        return special;
    }

    @Override
    public boolean equals(Object obj) {
        //先调用父类的equals()方法 不仅判断了color/age是否相同，还判断了是否==null
        boolean flag = super.equals(obj);
        if (flag) {//flag==true
            Fish other = (Fish)obj;
            if (this.getColor() == other.getColor()&&this.getAge()==other.getAge()) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Fish{color="+getColor()+"age="+getAge()+"special="+getSpecial()+"}";
    }

    @Override
    public void introduce(){
        System.out.println("I am a fish with "+getColor()+",who is  "+getAge()+"years old!"+"I am good at "+getSpecial());
    }
}
