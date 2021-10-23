package callback;

public class App {
	private OnGeekEventListener mListener;
	
	public void registerOnGeekEventListener(OnGeekEventListener mListener) 
	{
		this.mListener = mListener;
	}
	
    // my synchronous task
    public void doGeekStuff()
    {
  
        // perform any operation
        System.out.println("Performing callback before synchronous Task");
  
        // check if listener is registered.
        if (this.mListener != null) {
  
            // invoke the callback method of class A
            mListener.onGeekEvent();
        }
    }
    
    public static void main(String[] args)
    {
        App obj = new App();
        OnGeekEventListener mListener = new App2();
        obj.registerOnGeekEventListener(mListener);
        obj.doGeekStuff();
    }
}
