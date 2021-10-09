package State;

public class SocksBuilderPattern {
	
	public static void main(String []args) {
		Socks socks=new Socks();
		System.out.println(socks);
		socks.New();
		socks.Dirty();
		socks.Dry();
		socks.Wet();
		socks.Torn();
		socks.New();
		
		System.out.println("Socks are packed and yet to be delivered.");

	}

}
