package State;

public class CrewSocksBuilder  extends SocksBuilder{
	
	public CrewSocksBuilder() {
		this.name="Crew Socks";
	}

	@Override
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
		return this;
	}

	@Override
	public SocksBuilder addOlefins() {
		this.textiles.add("Olefins");
		return this;
	}

	@Override
	public SocksBuilder addAcrylic() {
		this.textiles.add("Acrylic");
		return this;
	}

}
