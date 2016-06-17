import java.util.ArrayList;

public class TestCheckOut {
	public static void main(String[] args) {
		int success = 0;
		int failure = 0;
		ArrayList<Bug> failureList = new ArrayList<Bug>();
		
		CheckOutElements checkOut = new CheckOutElements();
				
		// TC01 : Check out with valid data
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/menu.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B01));
		}
		
		// TC02 : Check out with empty email
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.email.sendKeys("");
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B02));
		}
		
		// TC03 : Check out with invalid email
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.email.sendKeys("herlina@gmail");
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B03));
		}
				
		// TC04 : Check out with empty name
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.name.sendKeys("");	
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B04));
		}
				
		// TC05 : Check out with empty address
		checkOut.loadElements();
		checkOut.setValidData();	
		checkOut.address.sendKeys("");
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B05));
		}
		
		// TC06 : Check out while card type is not selected
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.card_type.sendKeys("");
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B06));
		}
		
		// TC07 : Check out while card number is not equal 16 digits
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.card_number.sendKeys("12345678901234");	
		checkOut.submit.click();		
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B07));
		}
		
		// TC08 : Check out while card number contains alphabets
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.card_number.sendKeys("12c456789h123456");	
		checkOut.submit.click();	
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B08));
		}	
		
		// TC09 : Check out with empty card holder name
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.cardholder_name.sendKeys("");
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B09));
		}
		
		// TC10 : Check out while verification number is not equal 3 digits
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.verification_code.sendKeys("12");
		checkOut.submit.click();
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B10));
		}
		
		// TC11 : Check out while verification number contains alphabets
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.verification_code.sendKeys("1a3");
		checkOut.submit.click();		
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B11));
		}
				
		// TC12 : Check out with empty data
		checkOut.loadElements();
		checkOut.setValidData();
		checkOut.submit.click();	
		if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
			success++;
		} else {
			failure++;
			failureList.add(new Bug(Bug.B12));
		}

		// Print the Test Result
		System.out.println("[Test Check Out]\nSuccess = "+success+", Failure = "+failure+",\nList failure = ");
		for(int i = 0 ; i < failureList.size() ; i++){
			System.out.println(failureList.get(i).getBugName());
		}
		
		//Reproduce bug
		int successRe = 0;
		int failureRe = 0;
		ArrayList<Bug> failureListRe = new ArrayList<Bug>();
		
		for(int i = 0 ; i < failureList.size() ; i++){
			int bugId =  failureList.get(i).getBugId();
			switch(bugId){
			case Bug.B01:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/menu.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B01));
				}
				break;
			case Bug.B02:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.email.sendKeys("");
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B02));
				}
				
				break;
			case Bug.B03:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.email.sendKeys("herlina");
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B03));
				}
				break;
			case Bug.B04:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.name.sendKeys("");	
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B04));
				}
				break;
			case Bug.B05:
				checkOut.loadElements();
				checkOut.setValidData();	
				checkOut.address.sendKeys("");
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B05));
				}
				break;
			case Bug.B06:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.card_type.sendKeys("");
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B06));
				}
				break;
			case Bug.B07:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.card_number.sendKeys("098765432109876543");	
				checkOut.submit.click();		
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B07));
				}
				break;
			case Bug.B08:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.card_number.sendKeys("098!65'f2g098g65");	
				checkOut.submit.click();	
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B08));
				}	
				break;
			case Bug.B09:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.cardholder_name.sendKeys("");
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B09));
				}
				break;
			case Bug.B10:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.verification_code.sendKeys("54321");
				checkOut.submit.click();
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B10));
				}
				break;
			case Bug.B11:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.verification_code.sendKeys("a2h");
				checkOut.submit.click();		
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B11));
				}
				break;
			case Bug.B12:
				checkOut.loadElements();
				checkOut.setValidData();
				checkOut.submit.click();	
				if(checkOut.driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")){
					successRe++;
				} else {
					failureRe++;
					failureListRe.add(new Bug(Bug.B12));
				}
				break;
			}
		}
		// Print the Reproduce Test Result
		System.out.println("[Reproduce Test Check Out]\nSuccess = "+successRe+", Failure = "+failureRe+",\nList failure = ");
		for(int i = 0 ; i < failureListRe.size() ; i++){
			System.out.println(failureListRe.get(i).getBugName());
		}
	}
	
	
}
