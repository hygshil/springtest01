package springzuoye1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {
    @Test
    public void test(){
        String xml = "springzuoye1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Student student = ac.getBean("student", Student.class);
        System.out.println("student = " + student);
    }
}
