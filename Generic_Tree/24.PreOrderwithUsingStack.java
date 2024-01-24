import java.io.*;
import java.util.*;

public class Main124 {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }
  
  public static Node getTail(Node node){
    while(node.children.size() > 0){
        node = node.children.get(0);
    }
    return node;
  }

  public static void preorder(Node node){
    System.out.println(node.data + " ");
    for(Node child : node.children){
        preorder(child);
    }
  }

  static class Pair{
    int state;
    Node node;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    String preorder = "";
    String postorder = "";
    Stack<Pair> stack = new Stack<>();

    Pair rootp = new Pair();
    rootp.state = -1;
    rootp.node = root;

    stack.push(rootp);
    while(stack.size() > 0){
        Pair peekp = stack.peek();

        if(peekp.state == -1){
            preorder += peekp.node.data + " ";
            peekp.state++;
        }else if(peekp.state < peekp.children.size()){
            Pair cp = new Pair();
            cp.state = -1;
            cp.node = peekp.children.get(peekp.state);
            stack.push(cp);
            peekp.state++;
        }else if(peekp.state == peekp.children.size()){
            postorder += peekp.node.data + " ";
            peekp.state++;
        }else{
            stack.pop();
        }
    }
     
    System.out.println(preorder + ".");
    System.out.println(postorder + ".");
  }

}