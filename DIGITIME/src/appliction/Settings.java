package appliction;

public class Settings {

	public static final Settings instance = new Settings();
	
	private String standardtakst;
	private String advarselsbel�b;
	
	public Settings() {
		
	}
	
	public void setStandardtakst(final String takst) {
		this.standardtakst = takst;
	}
	
	public String getStandardtakst() {
		return this.standardtakst;
	}
	
	public void setAdvarselsbel�b(String bel�b) {
		this.advarselsbel�b = bel�b;
	}
	
	public String getAdvarselsbel�b() {
		return this.advarselsbel�b;
	}
}
