package springzuoye3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
    @Test
    public void test01(){
        String xml = "springzuoye3/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        Keyboard keyboard = ac.getBean("keyboard", Keyboard.class);
        keyboard.play();
    }
}
