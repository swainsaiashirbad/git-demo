package git.example.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {

	@GetMapping("getNAme")
	public String getNAme() {
		return "sai";
	}
}
