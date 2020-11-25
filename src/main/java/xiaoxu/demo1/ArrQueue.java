package xiaoxu.demo1;

/**
 * @author xx
 * @create 2020/9/8 17:23
 */
public class ArrQueue {
    private Integer rear;

    private Integer front;

    private int[] queueArr;

    public ArrQueue(){
        this.rear = 0;
        this.front = 0;
        this.queueArr = new int[5];
    }

    public void pop(){
        if(!judgeEmpty()){
            System.out.println(queueArr[front++]);
        }else{
            System.out.println("kongde");
        }
    }

    public void push(int num){
        if(!judgeFull()){
            queueArr[rear++] = num;
        }else{
            System.out.println("满了");
        }
    }

    public boolean judgeEmpty(){
        if(rear == front){
            return true;
        }
        return false;
    }

    public boolean judgeFull(){
        if(rear == queueArr.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrQueue arrQueue = new ArrQueue();
        arrQueue.push(1);
        //System.out.println(arrQueue.rear);
        arrQueue.push(2);
        arrQueue.push(3);
        arrQueue.push(4);
        arrQueue.push(5);
        arrQueue.pop();
        arrQueue.pop();
        //System.out.println(arrQueue.rear);

        for(int i = 0; i < arrQueue.queueArr.length; i++){
            System.out.print(arrQueue.queueArr[i] + "\t");
        }
        //arrQueue.push(1);
        //System.out.println(arrQueue.judgeEmpty());
//        arrQueue.pop();
//        arrQueue.pop();
    }
}
