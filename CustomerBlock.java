import java.util.Date;

public class CustomerBlock {
	
	public String hash;
	public String previousHash;
	public String cust_Company; 
	public int cust_Salary; 
	public int cust_num_Skills; 
	public int cust_prof; 
	private String data; //our data will be a simple message.
	private long timeStamp; //as number of milliseconds since 1/1/1970.
	private int nonce;
	
	
	//Block Constructor.  
	public CustomerBlock(String name,String previousHash, String company, int salary, int numSkills, int proficiency ) {
		this.cust_Company = company; 
	
		this.cust_Salary = salary; 
		this.cust_num_Skills = numSkills; 
		this.cust_prof = proficiency; 
		this.data = name;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		
		this.hash = calculateHash(); //Making sure we do this after we set the other values.
	}
	
	//Calculate new hash based on blocks contents
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				Integer.toString(nonce) + 
				data 
				);
		return calculatedhash;
	}
	
	public void mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
		while(!hash.substring( 0, difficulty).equals(target)) {
			nonce ++;
			hash = calculateHash();
		}
		System.out.println("Block Mined!!! : " + hash);
	}
}
