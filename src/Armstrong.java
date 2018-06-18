
public class Armstrong {
	
	public static void main(String[] args) {
		
		int num=371;
		int sum=0;
		int pnum=num;
	
		while(num>0){
				int rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
		}
		
		if(sum==pnum){
			System.out.println("Number  "+pnum+" is armstrong ..........");
		}else{
			System.out.println("Number  "+pnum+" is not armstrong ..........");
					
		}
		
	}

}
