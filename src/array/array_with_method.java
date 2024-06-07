package array;

public class array_with_method {
/*
 * array as parameter:
 * e.g void add(a[]){
 * }
 * 
 * array as return type:
 * int[] GetIntValue(){
 * int data[]={1,2,3,4,5,6,7,8,9,10}
 * return data;
 * 
 * }
 */
/*	public static void main(String[] args) {
		int data[]= {1,2,3,4,5,6};
		sum(data);
		
	}
	static void sum(int values[]){
		int s=0;
		for(int x:values) {
			s=x+s;
		}
		System.out.println(s);
	}
	*/
	/*public static void main(String[] args) {
		String cities[]= {"ktm","bkt","lpt"};
		prntcities(cities);
	}
	static void prntcities(String val[]) {
		for(String x:val) {
			System.out.println(x);
		}
	}
	*/
	public static void main(String[] args) {
		odd();
		
	}
	static void odd() {
			int[] oddnum =new int[50];
			int j=0;
		for (int i=1;i<=100;i++) {
			if(i%2==1) {
				oddnum[j]=i;
				j++;
			}
		}
		for(int x:oddnum)
		{
			System.out.println(x);
		}
	}
	
}
