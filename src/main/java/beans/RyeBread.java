package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RyeBread implements Bread{

	public String getName() {
		return "ryeBread";
	}


}