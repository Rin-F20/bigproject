public static String IntegerToRomanNumeral (int input) {
	if (input < 1 || input > 3999)
		return "Invalid Roman Number Value";
	String s = "";
	while (input >= 1000){
		s += "M";
		input -= 1000;		
	}
	while (input >= 900){
		s += "CM";
		input -= 900;
	}
	while (input >= 500){
		s += "D";
		input -= 500;
	}
	while (input >= 400){
		s += "CD";
		
	}
}