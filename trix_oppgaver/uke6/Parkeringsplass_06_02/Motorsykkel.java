class Motorsykkel{
    private String regNum;
	private int ccm;

	Motorsykkel(String regNum, double ccm){
		this.regNum = regNum;
		this.ccm = (int) Math.round(ccm);
	}

	public String getRegNum(){
		return regNum;
	}

    public int getCCM(){
		return ccm;
	}

	@Override
	public String toString(){
		return "Bike with registration number "+regNum;
	}
}