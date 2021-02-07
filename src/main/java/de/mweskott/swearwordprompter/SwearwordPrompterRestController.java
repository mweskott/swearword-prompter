package de.mweskott.swearwordprompter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwearwordPrompterRestController {

	@GetMapping(path = "/swearword")
	public String getSwearword() {
		return "Vollpfosten";		
	}
	
}
