import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

interface Time
{
	void Print();
	
}

class DisplayTime implements Time
{
	public void Print()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		DisplayTime dt=new DisplayTime();
		dt.Print();
	

	}

}
