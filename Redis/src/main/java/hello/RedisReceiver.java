package hello;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisReceiver{

    private static final Logger log = LoggerFactory.getLogger(RedisReceiver.class);

    private CountDownLatch latch;

    @Autowired
    public RedisReceiver(CountDownLatch latch){
        this.latch = latch;
    }

    public void receiveMessage(String message){
        log.info("Received <" + message + ">");
        latch.countDown();
    }






}