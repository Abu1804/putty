package UnitProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping(value="/getValue")
	public String getValue() {
		return "this is program";
	}

}
