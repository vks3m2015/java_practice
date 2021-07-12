package payment;

import org.springframework.stereotype.Service;

@Service
public class PaytmPayment implements Payment{

	@Override
	public void doTransaction() {
		System.out.println(" transaction through PAYTM....");
		
	}
}
