/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class LinkedList {
    public int size;
    
      class Node{
          int data;
          Node next;
          
          public Node(int data){
              this.data = data;
              this.next = null;
          }
}
      // enqueue
      Node head = null;
      public void enQueue(int data){
          Node temp = new Node(data);
          if(head == null){
              head = temp;
          } else{
              Node p = head;
              while(p.next != null){
                  p = p.next;
              }
              p.next = temp;
          }
          size++;
      }
    //Display Size of Queue
    public int size()
    {
        return size;
    } 
      
      // dequeue
      public void deQueue(){
          // if queue is empty.
          if(head == null){
              System.out.println("No data to remove");
          }else{
              // if there is only one element in the quueue.
              if(head.next == null){
                  head = null;
              } else{
                  Node p = head.next;
                  head = p;
              }
          }
          size--;
      }
      
      public void listAll(){
          if(head == null){
              System.out.println("No element to print.");
          } else{
              while(head.next != null){
                  System.out.println(head.data);
                  head = head.next;
              }
              System.out.println(head.data);
          }
      }
      
      public int find(int el){
          if(head == null){
              return -1;
          } else{
              int i = 0;
              
              Node p1 = head;
              Node p2 = p1;
              while(p1 != null){
                  if(p1.data == el){
                      return i;
                  } else{
                      i++;
                      p2 = p1;
                      p1 = p1.next;
                  }
              } 
              return -1;
          }
      }
      
      
      public int sizeOf(){
          if(head == null){
              return 0;
          } else{
              int i = 1;
              while(head.next != null){
                  i++;
                  head = head.next;
              }
              return i;
          }
      }
      
    
}
