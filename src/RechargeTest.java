import com.perficient.samples.patterns.services.ITopupService;
import com.perficient.samples.patterns.services.TopUpService;

public class RechargeTest {

	public static void main(String[] args) {

		ITopupService topUp=new TopUpService();
		topUp.recharge("1234567890", 100, "American Cell");
		topUp.recharge("9876543210", 50, "European Cell");
	}

}
