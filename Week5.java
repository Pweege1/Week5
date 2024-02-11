package Week5;

public class Week5 {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		
		
		public interface Logger {
			void log(String message);
			void error(String Message);
		}
			
		public class AsteriskLogger implements Logger {
			@Override
			public void log(String message) {
				System.out.println("***" + message + "***");
			}
			
			@Override
			public void error(String message) {
				System.out.println("****************\n***Error: " + message + "***\n****************");
			}
		}
		
		public class SpacedLogger implements Logger {
			@Override
			public void log(String message) {
				System.out.println(message.replaceAll("", " ").trim());
				
				}
			@Override
			public void error(String message) {
				System.out.println("ERROR: " + message.replaceAll("", " ").trim());
			}
		}}

			
	




		
		
				
			
		
