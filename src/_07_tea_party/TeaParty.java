package _07_tea_party;

public class TeaParty {

	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
	
	public String welcome(String name, boolean isWoman, boolean isKnighted){	
		this.name = name;
		this.isWoman = isWoman;
		this.isKnighted = isKnighted;
		
		if(isKnighted && !isWoman) {
			return "Hello Sir " + name;
		}
		else if(!isKnighted && !isWoman) {
			return "Hello Mr. " + name;
		}
		else if(isKnighted && isWoman) {
			return "Hello Lady " + name;
		}
		else if (!isKnighted && isWoman == true) {
			return "Hello Ms. " + name;
		}
		else {
			return "null case";
		}
		}
	
}

