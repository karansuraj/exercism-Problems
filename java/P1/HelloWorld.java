public class HelloWorld {
	
	public String hello (String in){
		String a;
		if(in==null || in=="") a = "Hello, World!";
		else a = "Hello, " + in + "!";
		return a;
	}
}