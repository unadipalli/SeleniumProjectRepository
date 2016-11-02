import org.openqa.selenium.chrome.ChromeDriver;

public class openApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver chdriver = new ChromeDriver();
		chdriver.get("https://www.facebook.com/");
		
		chdriver.getTitle();
		System.out.println("Face book is open");
	}

}
