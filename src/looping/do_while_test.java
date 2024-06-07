package looping;

public class do_while_test {
	public static void main(String[] args) {
		int i=0,n =9,a;
		do {
			a=i*n;
			System.out.println(n+"*"+i+"="+a);
			i++;
		}
		while(i<=10);
	}

}
