
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone iphone  = new Iphone();
		System.out.println(iphone.showConfig());
		
		Phone samsung = new Samsung();
		System.out.println(samsung.showConfig());
		
	}

}

 abstract class Phone{
	public abstract String showConfig();
}

class Iphone extends Phone{
	public String showConfig(){
		return "IOS 9, 2gb";
	}
	
}
class Samsung extends Phone{
	public String showConfig(){
		return "Kitkat, 4gb ram";
	}
}