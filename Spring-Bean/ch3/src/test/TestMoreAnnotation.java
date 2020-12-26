package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import annotation.controller.TestController;
public class TestMoreAnnotation {
	public static void main(String[] args) {
		//由于annotation.dao annotation.service annotation.controller包都属于annotation的子包，因此不需要在配置文件annotationContext.xml中声明
		ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
		TestController testCon = (TestController)appCon.getBean("testController");
		testCon.save();
	}
}
