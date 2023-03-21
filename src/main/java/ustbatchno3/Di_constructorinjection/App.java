package ustbatchno3.Di_constructorinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("Application.xml");  
    	Roles r = context.getBean("S1",Roles.class);
    	r.Display();


    	    }
    	}

    	


    	
    	
    	    	

    

