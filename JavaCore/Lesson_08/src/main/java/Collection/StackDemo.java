package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //Ngăn xếp
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(15);
        stack.push(20);

//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

        // Hàng đợi
        Queue<Integer> queue = new LinkedList<>();
        queue.add(8);
        queue.add(18);
        queue.add(1);
        queue.add(9);
        queue.add(50);
        queue.add(4);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
