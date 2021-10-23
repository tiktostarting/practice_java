package callback;

public class App2 implements OnGeekEventListener{
	
	@Override
	public void onGeekEvent() 
	{
		System.out.println("Performing callback after synchronous task");
	}

}
