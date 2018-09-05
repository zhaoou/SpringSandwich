package beans;

import org.springframework.stereotype.Component;

@Component
public class Ketchup implements Coudiment{

	public String getName() {
		return "Ketchup";
	}

}