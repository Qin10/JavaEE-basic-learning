package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import annotation.controller.TestController;
public class TestMoreAnnotation {
	public static void main(String[] args) {
		//����annotation.dao annotation.service annotation.controller��������annotation���Ӱ�����˲���Ҫ�������ļ�annotationContext.xml������
		ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
		TestController testCon = (TestController)appCon.getBean("testController");
		testCon.save();
	}
}
