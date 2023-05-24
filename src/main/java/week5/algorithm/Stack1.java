package week5.algorithm;

import java.util.EmptyStackException;

public class Stack1 {
    int[] arr = new int[10000];
    int pointer = 0;

    public void push(int value) {
        arr[pointer++] = value;
        System.out.println(pointer);
    }

//    public int pop() {
//        int temp = this.arr[pointer - 1];
//        pointer--;
//        return temp;
//    }

//    public int pop() {
//        if(!isEmpty()){
//            return arr[--pointer];
//        } else {
//            throw new EmptyStackException();
//        }
//    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(10);
        System.out.println(st.pop());
        st.push(20);
        System.out.println(st.peek());
    }
}
