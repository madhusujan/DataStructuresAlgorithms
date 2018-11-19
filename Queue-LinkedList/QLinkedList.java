
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */

public class QLinkedList {
    
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        char continueOrNot;
        do{
System.out.println("\n Perfom the following operation (Number Input)!! ");
System.out.println("1. Add elements. ");
System.out.println("2. Number of elements. ");
System.out.println("3. Remove elements: ");
System.out.println("4. Get the location of an element: ");   
Scanner keyboard = new Scanner (System.in);
String input = keyboard.nextLine();
switch(input){
    //User input to add the elements in Queue
    case "1":
        System.out.println("How many elements you want to add ");
        int n = keyboard.nextInt();
        System.out.println("Enter the Elements ");
        for (int i = 0; i < n; i++){
                        l.enQueue(keyboard.nextInt());
        }
        break;
    //Find total number of elements in Queue
    case "2":
        System.out.println("Size of the Queue " + l.size());
    //Input to Remove elements from Queue
        break;
    case "3":
        if (l.size==0){
            System.out.println("Error !! Empty Queue");
            break;
        }
        else{
        System.out.println("Number of Elements to remove? ");
        int remove = keyboard.nextInt();
        for (int i = 0; i < remove; i++){
        l.deQueue();
        }
            System.out.println("Removed Sucessfully");
        }
        break;
        //Find the position of an element in queue
    case "4":
        if (l.size==0){
            System.out.println("Error !! Empty Queue");
            break;
        }
        else{
        System.out.println("Enter the element to search from the Queue: ");
        int search = keyboard.nextInt();
        System.out.println("Index : "+ l.find(search)); 
        break;
        }
    }            
            System.out.println(" Do you want to continue (y/n)?");
            continueOrNot = keyboard.next().charAt(0);
} 
            while (continueOrNot == 'Y'|| continueOrNot == 'y');

}
}