public class MyClass{
    public void spew(int status){
        System.out.println("spewed" + status);
    }
    public static void main(String[] args){
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MySub1();
            MySub1 obj3 = new MySub1();
            MySub2 obj4 = new MySub2();
            obj1.spew(11);
            obj2.spew(13);
            obj3.spew(17);
            obj4.spew();
            obj4.spew(19);
        
    }
}
class MySub1 extends MyClass{
    public void holla(){
        System.out.println("spilled");
    }public void spew(int status){
        System.out.println("spilld" + status);
    }
}
class MySub2 extends MyClass{
    public void spew(){
        System.out.println("spewed nothing");
    }
}