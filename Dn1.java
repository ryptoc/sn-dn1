public class Dn1 {
    public static void main(String[] args) {

        int num = 16;
		
		for(int i = 0; i < num; i++){
			if(i%3 == 0 && i%5 == 0){
				System.out.println("fizzbuzz");
			} else if(i%5 == 0){
				System.out.println("buzz");
				
			}else if(i%3 == 0){
				System.out.println("fizz");
				
			}else{
				System.out.println(i);
				
			}
		}
    }
}