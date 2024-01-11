import java.util.*;
public class Main{
    public static class person{
        String name;
        int age;
        void sayhi(){
            if(this.age>30){
                System.out.println("hello from"+this.name);
            }
            else{
            System.out.println("hi from"+this.name);
            }
            
        }
    }
    public static void main(String [] args){
        person p1;
        p1=new person();
        p1.name="shiv";
        p1.age="22"
        p1.sayhi();

        person p2;
        p2=new person();
        p2.name="rahul";
        p2.age="45"
        p2.sayhi();
    }
}