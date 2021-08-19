package lk.ac.vau.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Message;

@RestController
public class MessageController {
 
	@GetMapping("/msg")
	public Message Msg()
	{
		return new Message(1,"Hello Springboot!");
	}
	
	@GetMapping("/msg/{m}")
	public Message myMessage(@PathVariable("m") String message)
	{
		return new Message(1,message);
	}
}
