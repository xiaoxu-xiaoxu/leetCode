package xiaoxu.stock;

import java.util.Stack;

/**
 * @author xx
 * @create 2020/11/10 10:22
 */
public class StockCalculator{

    private static Stack<String> numStack = new Stack<>();

    private static Stack<Character> charStack = new Stack<>();

    // 栈实现计算器
    public static Integer calculatorString(String str){
        if(str == null || str.length() < 3){
            System.out.println("字符串不能为空或者长度小于3");
            return null;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) > '0' && str.charAt(i) < '9'){
                numStack.add(String.valueOf(str.charAt(i)));
            }else{
                if(charStack.size() == 0){
                    charStack.add(str.charAt(i));
                }else{
                    Character popChar = charStack.pop();
                    char newChar = str.charAt(i);
                    int count = 0;
                    // 如果弹出的字符优先级比新加的大，那么先计算再将新加的字符入栈
                    while((popChar == '*' || popChar == '/') && (newChar == '+' || newChar == '-')){
                        String num1 = numStack.pop();
                        String num2 = numStack.pop();
                        Integer result = popChar == '*' ? Integer.parseInt(num1) * Integer.parseInt(num2)
                                : Integer.parseInt(num2) / Integer.parseInt(num1);
                        numStack.push(result.toString());
                        count++;
                        if(charStack.size() == 0){
                            break;
                        }
                        popChar = charStack.pop();
                    }
                    if(count != 0){
                        if(popChar == '+' || popChar == '-'){
                            charStack.push(popChar);
                        }
                        charStack.push(newChar);
                    }else{
                        charStack.push(popChar);
                        charStack.push(newChar);
                    }
                }
            }
        }
        // 当字符串被遍历完，开始依次计算
        while(charStack.size() > 0){
            String num1 = numStack.pop();
            String num2 = numStack.pop();
            Character popChar = charStack.pop();
            Integer result = 0;
            switch(popChar){
                case '+':
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    break;
                case '-':
                    Character peek = charStack.size() == 0 ? null : charStack.peek();
                    if(peek == null || peek != '-'){
                        result = Integer.parseInt(num2) - Integer.parseInt(num1);
                    }else{
                        result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    }
                    break;
                case '*':
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    break;
                case '/':
                    Character peek1 = charStack.size() == 0 ? null : charStack.peek();
                    if(peek1 == null || peek1 != '/'){
                        result = Integer.parseInt(num2) / Integer.parseInt(num1);
                    }else{
                        result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    }
                    break;
            }
            numStack.push(result.toString());
        }
        return Integer.parseInt(numStack.pop());
    }

    public static void main(String[] args){
        System.out.println(calculatorString("2+2-1-1-2+4"));
        //System.out.println(calculatorString("2+2*1/2-1"));
        //System.out.println(calculatorString("2*2/1/1/1/2"));
        //System.out.println(2-2*2-1);
        //System.out.println(calculatorString("2-2*2-1"));
        //System.out.println(calculatorString("1+4/2/2*2"));
        //System.out.println(calculatorString("2+3*4*2-2"));
        //System.out.println(calculatorString("2*2-2/2"));
    }

}
