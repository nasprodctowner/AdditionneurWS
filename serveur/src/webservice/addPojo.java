package webservice;

import javax.jws.WebService;

@WebService
public class addPojo {

	public addPojo() {
	}

	public int addTwo(int a, int b) {
		return a+b;
	}

	public int addThree(int a, int b, int c){
		return a+b+c;
	}

}
