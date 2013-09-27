package appliction;

public class Settings {

	public static final Settings instance = new Settings();
	
	private String standardtakst;
	private String advarselsbeløb;
	
	public Settings() {
		
	}
	
	public void setStandardtakst(final String takst) {
		this.standardtakst = takst;
	}
	
	public String getStandardtakst() {
		return this.standardtakst;
	}
	
	public void setAdvarselsbeløb(String beløb) {
		this.advarselsbeløb = beløb;
	}
	
	public String getAdvarselsbeløb() {
		return this.advarselsbeløb;
	}
}
