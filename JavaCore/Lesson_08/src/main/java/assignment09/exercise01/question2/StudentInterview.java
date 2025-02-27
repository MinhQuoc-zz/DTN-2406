package assignment09.exercise01.question2;

import java.util.*;

public class StudentInterview {
    public static void main(String[] args) {
        Stack<Student> stack = new Stack<>();
        stack.push(new Student("Nguyễn Văn Nam"));
        stack.push(new Student("Nguyễn Văn Huyên"));
        stack.push(new Student("Trần Văn Nam"));
        stack.push(new Student("Nguyễn Văn A"));

        System.out.println("a Thứ tự tới (Stack - sớm nhất tới muộn nhất):");
        printArrivalOrderStack(stack);

        System.out.println("b Thứ tự tới (Queue - muộn nhất tới sớm nhất):");
//        printArrivalOrderQueue();
    }

    public static void printArrivalOrderStack(Stack<Student> students) {
        Stack<Student> stack = new Stack<>();
        for (Student student : students) {
            stack.push(student);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void printArrivalOrderQueue(Queue<Student> students) {
        Queue<Student> queue = new LinkedList<>();
        for (Student student : students) {
            queue.offer(student);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
