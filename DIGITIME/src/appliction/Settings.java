package appliction;

public class Settings {

	public static final Settings instance = new Settings();
	
	private String standardtakst;
	
	public Settings() {
		this.standardtakst = "";
	}
	
	public void setStandardtakst(final String takst) {
		this.standardtakst = takst;
	}
	
	public String getStandardtakst() {
		return this.standardtakst;
	}
}
