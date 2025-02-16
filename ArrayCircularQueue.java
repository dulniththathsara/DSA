/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

/**
 *
 * @author Dulnith
 */
import java.util.NoSuchElementException;


public class ArrayCircularQueue {
    int SIZE = 5; 
    int front, rear;
    int items[] = new int[SIZE];

    ArrayCircularQueue() {
        front = -1;
        rear = -1;
    }


    boolean isFull() {
        return (front == 0 && rear == SIZE - 1) || (front == rear + 1);
    }


    boolean isEmpty() {
        return front == -1;
    }


    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted: " + element);
        }
    }


    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int element = items[front];

        if (front == rear) {
            front = -1;
            rear = -1; 
        } else {
            front = (front + 1) % SIZE;
        }
        return element;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Items: [");
        int i;
        for (i = front; i != rear; i = (i + 1) % SIZE) {
            System.out.print(items[i] + " ");
        }
        System.out.println(items[i] + "]");

        System.out.print("Indexes: ");
        for (i = front; i != rear; i = (i + 1) % SIZE) {
            System.out.print(i + " ");
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue();


        if (!q.isEmpty()) {
            q.deQueue();
        } else {
            System.out.println("Cannot dequeue from an empty queue.");
        }

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        q.enQueue(6);

        q.display();

        int element = q.deQueue();
        if (element != -1) {
            System.out.println("Deleted Element is " + element);
        }

        q.display();

        q.enQueue(7);

        q.display();

        q.enQueue(8);
    }
}
