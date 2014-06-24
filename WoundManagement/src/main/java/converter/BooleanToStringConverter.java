package converter;

public class BooleanToStringConverter {

		private static final String trueString = "j";
		private static final String falseString = "n";

		private BooleanToStringConverter() {
			
		}
		
		public static String convert(boolean inputBoolean) {
			return inputBoolean ? trueString : falseString;
		}
		
		public static boolean convertBack(String inputString) {
			return inputString.equals(trueString);
		}
	
}
