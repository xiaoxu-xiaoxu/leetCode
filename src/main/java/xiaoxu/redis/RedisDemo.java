package xiaoxu.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author xx
 * @create 2021/1/22 9:23
 */
public class RedisDemo{

    @Test
    public void test() throws InterruptedException{
        Jedis jedis = new Jedis("localhost", 6379);

        jedis.set("xiao", "li");
        jedis.expire("xiao", 5);

        System.out.println(jedis.get("flg"));

        System.out.println(jedis.get("xiao"));

        Thread.sleep(5005);
        System.out.println(jedis.get("xiao"));
    }
}
