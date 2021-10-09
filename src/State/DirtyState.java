package State;

public class DirtyState implements State {
	Socks socks;
	public DirtyState(Socks socks) {
		this.socks = socks;
	}

	@Override
	public void New() {
		System.out.println("Socks are Ready");

	}

	@Override
	public void Dry() {
		System.out.println("Socks are in dry state  you can wear them.");
	}

	@Override
	public void Dirty() {
		System.out.println("Socks are dirty, kindly wash.");
		socks.setState(socks.getWetState());
	}

	@Override
	public void Wet() {
		System.out.println("Socks are in wet state wait them to dry");
		socks.setState(socks.getDryState());
	}

	@Override
	public void Torn() {
		System.out.println("Socks are in Torn State Kindly buy new Socks");
		socks.setState(socks.getNewState());
	}
	public String toString() {
		return "Dirty State";
	}

}
