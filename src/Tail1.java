
public class Tail1
	{

		public static void main(String[] args)
			{
				System.out.println(mystery(5));
				System.out.println(Tail2.mystery2(8));
				System.out.println(Char1.recur("dog"));

			}
		public static int mystery(int n) {
			if(n == 1)
				{
					return 1;
				}
			else return mystery(n-2);
		}

	}
