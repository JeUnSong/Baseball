import java.util.Random;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int[] a  = new int[3];
		for(int i=0; i < 3; i++) {
			a[i] = random.nextInt(9)+1;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		}
		for(int b=0;b<3;b++) {
			System.out.println(a[b]);
		}
	}
}