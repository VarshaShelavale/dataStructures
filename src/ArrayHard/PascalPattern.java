package ArrayHard;

public class PascalPattern {
	public static void main(String[] args) {
		int n=5;
		int r =3;
		int res=1;
		for (int i = 0; i <r-1; i++) {
			res= res*(n-i-1);
			res= res/(i+1);
		}
		System.out.println(res);
		//=======================================
		    for (int j = 1; j <7; j++) {
		    	int ans=1;
				System.out.print(ans+" ");
				for (int i = 1; i <j; i++) {
					ans=ans*(j-i);
					ans=ans/i;
					System.out.print(ans+" ");
				}
				System.out.println();
			}
			
			
			
		}
		
		//===========================================
	}

