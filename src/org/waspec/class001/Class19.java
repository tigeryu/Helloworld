package org.waspec.class001;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by v-daisyq on 3/4/2015.
 */
public class Class19 {

    public static void main(String[]args){
    Node treeNode=buildATree();
     inorderDFT(treeNode);
    }

//中序遍历   先左 自己 右  inorder depth transeral
     public static void inorderDFT(Node root){
        if(root==null){
            return;
        }
        inorderDFT(root.leftChild);
        System.out.println(root.var);
        inorderDFT(root.rightChild);
    }
    //广度优先遍历
    public static void BFT(Node root){
        Queue<Node> queue=new LinkedList<Node>();
        queue.offer(root);
        while (queue.peek()!=null){
            Node temp=queue.poll();
            System.out.println(temp.var);
            queue.offer(temp.leftChild);
            queue.offer(temp.rightChild);

        }
    }

//    //前序
    public static void preorderDFT(Node root){
        if(root==null){
            return;
        }else
        System.out.println(root.var);
        preorderDFT(root.leftChild);
        preorderDFT(root.rightChild);
    }

//后序
    public static void postorderDFT(Node root,int level){
        if(root==null){
            return;
        }
        level++;
        postorderDFT(root.leftChild,level);
        postorderDFT(root.rightChild,level);
        System.out.printf("%d on level %d", root.var, level);
        System.out.println();

    }

    public static Node buildATree(){
        Node root=new Node(1);
        root.leftChild=new Node(2);
        root.rightChild=new Node(3);

        root.leftChild.leftChild=new Node(4);
        root.leftChild.rightChild=new Node(5);

        root.rightChild.leftChild=new Node(6);
        root.rightChild.rightChild=new Node(7);
        return root;
    }
}
class Node {
    public int var;
    Node leftChild;
    Node rightChild;
    Node(int x){
        var=x;
    }
}