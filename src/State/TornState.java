package State;

public class TornState implements State {
	Socks socks;
	public TornState(Socks socks) {
		this.socks = socks;
	}

	@Override
	public void New() {
		System.out.println("Socks  are ready to be worn");
		
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
		socks.setState(socks.getNewState());
	}
	public String toString() {
		return "Torn State";
	}

}
