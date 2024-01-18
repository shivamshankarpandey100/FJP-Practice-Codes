import java.util.*;
public class Main{

public static class Node{
    int data;
    ArrayList<Node> children=new ArrayList<>();

    Node(int data){
        this.data=data;
    }
}
public static void levelOrder(Node root){
    Queue<Node> queue= new ArrayDeque<>();
    queue.add(root);
    while(queue.size()>0){
        //r,o,a
        Node temp=queue.remove();
        System.out.print(temp.data+" ");
        for(Node child:temp.children){
            queue.add(child);
        }
    }
    System.out.println(".");
}


public static void main(String[]args){
    Node root=new Node(10);

    Node rootc1=new Node(20);
    root.children.add(rootc1);

    Node rootc2=new Node(30);
    root.children.add(rootc2);

    Node rootc3=new Node(40);
    root.children.add(rootc3);

    Node fifty=new Node(50);
    rootc1.children.add(fifty);

    Node sixty=new Node(60);
    rootc1.children.add(sixty);

    Node seventy=new Node(70);
    rootc2.children.add(seventy);

    Node eighty=new Node(80);
    rootc2.children.add(eighty);

    Node ninety=new Node(90);
    rootc2.children.add(ninety);


    Node hundred=new Node(100);
    rootc3.children.add(hundred);

    Node hundredten=new Node(110);
    eighty.children.add(hundredten);

    Node hundredtwenty=new Node(120);
    eighty.children.add(hundredtwenty);




    levelOrder(root);
    }
}