package methodoveriding;

public class test {

	public static void main(String[] args) {
		/*
		 * static or early binding of object
		 * 
		 */
		kumari_bank k=new kumari_bank();
		k.getbankname();
		k.getinterestrate();
		
		//up-casting
		CentralBank p=new prabhubank();
		p.getbankname();
	}
	
	//late or dynamic binding of object
	//run time polymorphism
	
	void printbankinfo(CentralBank b){
		
	}
}
