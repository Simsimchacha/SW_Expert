import java.util.*;
public class swe1926 {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		int n;
		n = kb.nextInt();
		for (int i = 1; i <= n; i++) {
			if (1 <= i && i < 10) { //한자리
				if (i == 3 || i == 6 || i == 9) System.out.print("- ");
				else System.out.print(i + " ");
			}
			else if(10<=i && i<100){ //두자리
				int q = i/10;
				int r = i%10;
				int cnt =0;
				if(q==3 || q==6 || q==9) cnt++;
				if(r==3 || r==6 || r==9) cnt++;
				if(cnt==2) System.out.print("-- ");
				else if(cnt==1) System.out.print("- ");
				else if(cnt==0) System.out.print(i+" ");
			}
			else if(100<=i && i<1000){//세자리
				int q1 = i/100;
				int q2 = (i%100)/10;
				int r = (i%100)%10;
				int cnt =0;
				if(q1==3 || q1==6 || q1==9) cnt++;
				if(q2==3 || q2==6 || q2==9) cnt++;
				if(r==3 || r==6 || r==9) cnt++;
				if(cnt == 3) System.out.print("--- ");
				else if(cnt==2) System.out.print("-- ");
				else if(cnt==1) System.out.print("- ");
				else if(cnt==0) System.out.print(i+" ");

			}
		}
	}
}




