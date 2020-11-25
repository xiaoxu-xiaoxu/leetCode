package xiaoxu.stock;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/9 9:11
 */
public class ArrayStackDemo{

    private int[] arr;

    private int front;


    public ArrayStackDemo(int length){
        this.arr = new int[length];
        this.front = -1;
    }

    public boolean isEmpty(){
        return this.front == -1;
    }

    public boolean isFull(){
        return this.front == this.arr.length - 1;
    }

    public void push(int num){
        if(isFull()){
            System.out.println("栈满了，无法添加元素");
            return;
        }
        arr[++front] = num;
    }

    public int pop() throws Exception{
        if(isEmpty()){
           throw new Exception("栈为空，无法弹出元素");
        }
        return arr[front--];
    }

    public static void main(String[] args) throws Exception{
        ArrayStackDemo stack = new ArrayStackDemo(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("sssssssssssssssssssssssssssss");
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}




