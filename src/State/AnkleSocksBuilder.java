package State;

public class AnkleSocksBuilder extends SocksBuilder {
	
	public AnkleSocksBuilder() {
		this.name = "Ankle Socks";
	}
	
	public SocksBuilder addCotton() {
	 this.textiles.add("Cotton");
		return this;
	}

	@Override
	public SocksBuilder addNylon() {
		return this;
	}

	@Override
	public SocksBuilder addWool() {
		 this.textiles.add("Wool");
		return this;
	}

	@Override
	public SocksBuilder addPolyester() {
		this.textiles.add("Ployester");
		return this;
	}

	@Override
	public SocksBuilder addOlefins() {
		return this;
	}

	@Override
	public SocksBuilder addAcrylic() {
		return this;
	}

}
