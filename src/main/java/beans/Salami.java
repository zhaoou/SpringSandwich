package beans;

import org.springframework.stereotype.Component;

@Component
public class Salami implements Coudiment{

	public String getName() {
		return "Salami";
	}

}