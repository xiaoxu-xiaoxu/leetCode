package xiaoxu.leetCode;

import org.junit.Test;

/**
 * @author xx
 * @create 2020/11/11 13:26
 */
public class ReplaceSpace{

    @Test
    public void test(){
        System.out.println(replaceSpace("a sd f"));
    }

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                builder.append("%20");
            }else{
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
