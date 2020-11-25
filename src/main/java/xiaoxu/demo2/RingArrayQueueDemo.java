package xiaoxu.demo2;

/**
 * @author xx
 * @create 2020/10/13 16:39
 */
public class RingArrayQueueDemo{
    public static void main(String[] args){
        RingArrayQueue queue = new RingArrayQueue(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.get();
        queue.get();
        queue.get();
        queue.add(9);
        queue.add(7);
        queue.show();
        System.out.println(queue.get());
    }
}
// 数组模拟环形队列
class RingArrayQueue{
    private int rear;// 指向最后一个元素的后一个位置
    private int front;// 指向第一个元素
    private int[] arr;

    public RingArrayQueue(int maxSize){
        this.rear = 0;
        this.front = 0;
        this.arr = new int[maxSize];
    }
    // 判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    // 判断队列是否满
    public boolean isFull(){
        return (rear + 1) % arr.length == front;
    }

    // 向队列中添加元素
    public void add(int num){
        if(isFull()){
            System.out.println("队列满了，无法添加元素");
            return;
        }
        arr[rear] = num;
        rear = (rear + 1) % arr.length;
    }

    // 向队列中取出元素
    public Integer get(){
        if(isEmpty()){
            System.out.println("队列为空，无法取出元素");
            return null;
        }
        int temp = arr[front];
        front = (front + 1) % arr.length;
        return temp;
    }

    // 打印队列中的元素
    public void show(){
        if(isEmpty()){
            System.out.println("队列为空，无法打印");
        }else{
            for(int i = front; i < front + ((rear + arr.length - front) % arr.length); i++){
                System.out.println(arr[i % arr.length]);
            }
        }
    }




}
