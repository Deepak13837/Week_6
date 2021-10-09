package State;

public class Socks {

	State newState;
	State dryState;
	State dirtyState;
	State wetState;
	State tornState;
	State state;

	
	public Socks() {
		newState=new NewState(this);
		dryState=new DryState(this);
		dirtyState=new DirtyState(this);
		wetState=new WetState(this);
		tornState=new TornState(this);	
		state=dirtyState;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	public State getNewState() {
		return newState;
	}
	public State getDryState() {
		return dryState;
	}
	public State getDirtyState() {
		return dirtyState;
	}
	public State getWetState() {
		return wetState;
	}
	public State getTornState() {
		return tornState;
	}
	
	public void New() {
		state.New();
	}
	public void Dry() {
		state.Dry();
		
	}
	public void Dirty()
	{
		state.Dirty();
	}
	public void Wet() {
		state.Wet();
	}
	public void Torn() {
		state.Torn();
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nSocks are in " + state + "\n");

		return result.toString();
	}
	
}
