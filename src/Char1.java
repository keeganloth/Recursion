
public class Char1
	{
		public static String recur(String s) {
			if(s.length() > 0)
				{
					return  s.charAt(s.length()-1) + recur(s.substring(s.length()-1));
				}
			return"";
		}
	}
