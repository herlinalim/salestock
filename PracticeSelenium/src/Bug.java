
public class Bug {
	public final static int B01 = 0;
	public final static int B02 = 1;
	public final static int B03 = 2;
	public final static int B04 = 3;
	public final static int B05 = 4;
	public final static int B06 = 5;
	public final static int B07 = 6;
	public final static int B08 = 7;
	public final static int B09 = 8;
	public final static int B10 = 9;
	public final static int B11 = 10;
	public final static int B12 = 12;
	
	private int bugId;
	private String bugName;
	
	public Bug(int bugId){
		setBug(bugId);
	}
	
	public void setBug(int bugId){
		this.bugId = bugId;
		switch(bugId){
		case B01:
			bugName = "B01 Failed - Wrong direct page";
			break;
		case B02:
			bugName = "B02 Failed - Submit success for empty email";
			break;
		case B03:
			bugName = "B03 Failed - Submit success for invalid email";
			break;
		case B04:
			bugName = "B04 Failed - Submit success for empty name";
			break;
		case B05:
			bugName = "B05 Failed - Submit success for empty address";
			break;
		case B06:
			bugName = "B06 Failed - Submit success while card type is not selected";
			break;
		case B07:
			bugName = "B07 Failed - Submit success while card number is not equal 16 digits";
			break;
		case B08:
			bugName = "B08 Failed - Submit success while card number contains alphabets";
			break;
		case B09:
			bugName = "B09 Failed - Submit success for empty card holder name";
			break;
		case B10:
			bugName = "B10 Failed - Submit success while verification number is not equal 3 digits";
			break;
		case B11:
			bugName = "B11 Failed - Submit success while verification number contains alphabets";
			break;
		case B12:
			bugName = "B12 Failed - Submit success for empty data";
			break;
		}
	}
	
	public int getBugId(){
		return bugId;
	}
	
	public String getBugName(){
		return bugName;
	}
}
