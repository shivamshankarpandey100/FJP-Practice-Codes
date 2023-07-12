import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer>list;
        list=new ArrayList<>();//[]
        System.out.println(list.size()+"->"+list);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size()+"->"+list);
        list.set(1,200);
        System.out.println(list.size()+"->"+list);
        list.add(1,2000);
        System.out.println(list.size()+"->"+list);


        int val=list.get(1);
        System.out.println(val);
        list.remove(1);
        System.out.println(list.size()+"->"+list);

        for(int i=0;i<list.size();i++){
            int data=list.get(i);
            System.out.println(data);
        }
        for(int db:list){
             System.out.println(db);
        }
	}

}