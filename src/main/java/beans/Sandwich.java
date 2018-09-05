package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Sandwich {
	private Coudiment firstCoudiment;
	private Coudiment secondCoudiment;
	private Coudiment thirdCoudiment;
	private Bread ryeBread;

	/*@Autowired
	public Sandwich(@Qualifier("cheese") Coudiment firstCoudiment,
			@Qualifier("ketchup") Coudiment secondCoudiment, @Qualifier("salami") Coudiment thirdCoudiment,
			Bread ryeBread)  {


	public Sandwich(Coudiment firstCoudiment, Coudiment secondCoudiment, Coudiment thirdCoudiment, Bread ryeBread)  {
		this.firstCoudiment = firstCoudiment;
		this.secondCoudiment = secondCoudiment;
		this.thirdCoudiment = thirdCoudiment;
		this.ryeBread = ryeBread;
	}*/

	public Sandwich() {	
	}

	@Autowired
	public void setFirstCoudiment(@Qualifier("cheese") Coudiment coudiment) {
		// TODO Auto-generated method stub
		firstCoudiment = coudiment;

	}

	public Coudiment getFirstCoudiment() {
		// TODO Auto-generated method stub
		return firstCoudiment;
	}

	@Autowired
	public void setSecondCoudiment(@Qualifier("ketchup") Coudiment coudiment) {
		// TODO Auto-generated method stub
		secondCoudiment = coudiment;

	}

	public Coudiment getSecondCoudiment() {
		// TODO Auto-generated method stub
		return secondCoudiment;
	}

	@Autowired
	public void setThirdCoudiment(@Qualifier("salami") Coudiment coudiment) {
		// TODO Auto-generated method stub
		thirdCoudiment = coudiment;

	}

	public Coudiment getThirdCoudiment() {
		// TODO Auto-generated method stub
		return thirdCoudiment;
	}

	@Autowired
	public void setTheBread(Bread bread) {
		// TODO Auto-generated method stub
		ryeBread = bread;

	}

	public Bread getTheBread() {
		// TODO Auto-generated method stub
		return ryeBread;
	}

	public String makeSandwich() {
		// TODO Auto-generated method stub
		String a = "The Sandwich is made of "
				+ getFirstCoudiment().getName()+", " + getSecondCoudiment().getName()+","
				+ " "+ getThirdCoudiment().getName()+", "+ getTheBread().getName();
		return a;
	}



}
