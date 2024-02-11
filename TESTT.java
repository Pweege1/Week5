package TEST;

import java.lang.System.Logger;

public class TESTT {

	public TESTT() {
		// TODO Auto-generated constructor stub
		abstract class AsteriskLogger implements Logger {
		    public void log(String message) {
		        System.out.println("***" + message + "***");
		    }
		    
		    public void error(String message) {
		        System.out.println("****************\n***Error: " + message + "***\n****************");
	}

}
}}
