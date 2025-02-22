class Bil{
	private String regNum;
	private int numPassengers;

	Bil(String regNum, int numPassengers){
		this.regNum = regNum;
		this.numPassengers = numPassengers;
	}

	public String getRegNum(){
		return regNum;
	}

	public int getNumPassengers(){
		return numPassengers;
	}
}
