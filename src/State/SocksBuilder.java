package State;

import java.util.ArrayList;
import java.util.List;

public abstract class SocksBuilder {
	String name;
	List<String> textiles = new ArrayList<String>();
	public abstract SocksBuilder addCotton();
	public abstract SocksBuilder addNylon();
	public abstract SocksBuilder addWool();
	public abstract SocksBuilder addPolyester();
	public abstract SocksBuilder addOlefins();
	public abstract SocksBuilder addAcrylic();


	public SocksBuild build() {
		SocksBuild socksBuild = new SocksBuild();

		socksBuild.setName(this.name);
		socksBuild.addTextiles(textiles);
		return socksBuild;
}
}
