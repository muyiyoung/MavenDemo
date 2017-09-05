package muyi;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class GreetingController{

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public HelloContent hello(HelloMessage message) throws Exception{
        Thread.sleep(1000);
        return new HelloContent("Hello, " + message.getName());

    }



}