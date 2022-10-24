class BloodData1 {
	
	static String bloodType;
	static String rhFactor;
	
	BloodData1(){
		bloodType = "O";
		rhFactor = "+";
	}
	
	BloodData1(String bt, String rh){
		bloodType = bt;
		rhFactor = rh;
	}
	
	public void display(){
		System.out.print(bloodType + rhFactor + " is added to the blood bank.");
	}
}