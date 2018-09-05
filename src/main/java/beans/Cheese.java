package beans;

import org.springframework.stereotype.Component;

@Component
public class Cheese implements Coudiment{

	public String getName() {
		return "Cheese";
	}

}