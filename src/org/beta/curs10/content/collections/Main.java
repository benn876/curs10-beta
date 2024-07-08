package org.beta.curs10.content.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                /*
                    Ana
                    o1.age = 55
                    Mihai
                    o2.age = 22
                     -prioritate pentru tineri
                    o1 - o2 = 33
                     -prioritate pentru batrani
                     o2 - o1 = -33

                    Mihai
                    o1.age = 22
                    George
                    o2.age = 44
                    o1-o2= -22

                    George
                    o1.age = 44
                    Ana
                    o2.age = 55
                    o1-o2=-11
                 */
                return o2.getAge() - o1.getAge();
            }
        });

        priorityQueue.add(new Person("Ana", 55));
        priorityQueue.add(new Person("Mihai", 22));
        priorityQueue.add(new Person("George", 44));

        System.out.println(priorityQueue.peek());

        System.out.println("Serve:" + priorityQueue.poll());
        System.out.println("Next:" + priorityQueue.peek());
        System.out.println("Serve:" +priorityQueue.poll());
        System.out.println("Next:" +priorityQueue.peek());
        System.out.println("Serve:" +priorityQueue.poll());

        Stack<String> stack = new Stack<>();
        stack.push("dog");
        stack.push("cat");
        stack.push("horse");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
