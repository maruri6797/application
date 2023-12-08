package practice;

@FunctionalInterface
public interface Greeting {
	public String hello();
	
	Greeting greeting = () -> {
		return "こんにちは";
	};
}