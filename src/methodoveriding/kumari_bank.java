package methodoveriding;

public class kumari_bank extends CentralBank{

	@Override
	void getbankname() {
		System.out.println("kumari bank");
	}
	@Override
	void getinterestrate() {
		System.out.println("16%");
	}
}
