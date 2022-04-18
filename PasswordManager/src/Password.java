
public class Password {
	String name;
	String pass;
	Password(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String toString() {
		return "["+name+", "+pass+"]";
	}
}
