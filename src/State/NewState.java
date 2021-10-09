package State;

public class NewState implements State {
	Socks socks;
	public NewState(Socks socks) {
		this.socks = socks;
	}

	@Override
	public void New() {
		System.out.println("Socks  are ready to be worn");
		System.out.println("Preparing Socks.....");
		
		SocksBuilder socksBuilder=new AnkleSocksBuilder();
		SocksBuild socksBuild=socksBuilder.addCotton().addNylon().addWool().addAcrylic().addPolyester().addOlefins().build();
		socksBuild.prepare();
		socksBuild.knitting();
		socksBuild.sewing();
		socksBuild.boarding();
		socksBuild.pack();
		

		System.out.println(socksBuild);
		
		socksBuilder=new CrewSocksBuilder();
		socksBuild=socksBuilder.addCotton().addNylon().addWool().addAcrylic().addPolyester().addOlefins().build();
		socksBuild.prepare();
		socksBuild.knitting();
		socksBuild.sewing();
		socksBuild.boarding();
		socksBuild.pack();
//		System.out.println(socksBuild);
		
	}

	@Override
	public void Dry() {
		System.out.println("Socks are in dry state and you can wear them.");
	}

	@Override
	public void Dirty() {
		System.out.println("Socks are dirty Kindly wash them.");
		socks.setState(socks.getWetState());
	}

	@Override
	public void Wet() {
		System.out.println("Socks are in Wet state 'Kindly dry them.");
	}

	@Override
	public void Torn() {
		System.out.println("Socks are torned, Buy New one");
	}
	public String toString() {
		return "New socks are going to be ready";
	}

}
