package methodoveriding;

public class prabhubank extends CentralBank {
	@Override
	void getbankname() {
		System.out.println("NMD bank");
		
	}
	@Override
	void getinterestrate() {
		System.out.println("15%");
	}
}
