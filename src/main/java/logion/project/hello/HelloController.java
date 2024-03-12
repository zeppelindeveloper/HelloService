package logion.project.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

	@GetMapping("/sayhello")
	public String sayHello(@RequestParam String value) {
	    return "HELLO : " + value;	
	}
	
}
