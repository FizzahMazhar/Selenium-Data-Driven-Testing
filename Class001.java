package TrainingPakage1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class Class001 {
	@DataProvider(name="login01")
	public Object data(){
		return new Object[][] {
			
			{"Fizzah",  "Mazhar", "fizzah@plumlogix.com", }
				

		};
	}
	
}
