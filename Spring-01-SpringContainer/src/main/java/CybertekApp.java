import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        // two ways to create container
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        //Mentor mentor = (Mentor)container.getBean("partTimeMentor");
        Mentor mentor = container.getBean("partTimeMentor", Mentor.class);
        Mentor mentor1 = (Mentor)container.getBean("fullTimeMentor");

        mentor.createAccount();
        mentor1.createAccount();


    }
}
