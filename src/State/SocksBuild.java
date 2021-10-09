package State;

import java.util.List;

public class SocksBuild {
	String name;
	List<String> textiles;
	public void addTextiles(List<String> textiles) {
		this.textiles = textiles;
	}
	void prepare() {
		System.out.println("Prepare " + name);
		System.out.println("New Socks are going to be prepared.");
		for(String textile: textiles) {
			System.out.println("   " + textile);
		}
	}
	void knitting() {
		System.out.println("Raw Materials are washed and spun into yarn.");
	}
	void sewing() {
		System.out.println("All parts are produced in the form of finished tubes. ");
	}
	void boarding() {
		System.out.println("Socks are shaped with the help of steam and heat on metal frame.");
	}
	void pack() {
		System.out.println("After the socks have passed an extensive quality control process they are ready to be packed ");
	}
	public void setName(String name) {
		this.name = name;

	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("" + this.name + "\n");
		for(String textile : textiles) {
			display.append(textile + "\n");
		}
		return display.toString();
	}

}
