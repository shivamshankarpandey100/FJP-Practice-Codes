import java.io.*;

public class Main1 {
    private static class Node{
        int data;
        Node next;
    }
private static class Linklist{
    Node head;
    Node tail;
    int size;

    int size(){
        return size;
    }


    void addLast(int val){
        Node node=new Node();
        node.data=val;
        node.next=null;
        if (size==0){
          head=tail=node;
        }
        else{
          tail.next=node;
          tail=node;
        }
        tail.next=node;
        tail=node;
        size++;

    }


    void display(){

        for(Node temp=head; tem!=null; temp=temp.next){
            System.out.println(temp.data+" ");
        }
        System.out.println();

    }
}


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}