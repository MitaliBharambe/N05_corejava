package org.tnsif.jumping;
import java.util.Scanner;
public class ContinueExecutor {

	public static void main(String[] args) {
				Scanner s= new Scanner(System.in);
				int n= s.nextInt();
				for(int i=1; i<=n;i++)
				{
					if(i==5)
					{
						continue;
					}
					else
					{
						System.out.println(i+"");
					}
				}
	}
}
