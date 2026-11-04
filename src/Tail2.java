
public class Tail2 {
public static int mystery2(int n)
{
	if(n == 4)
	{
		return 4;
	}
	else return mystery2(n-2);
}
}
