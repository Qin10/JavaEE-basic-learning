package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import instance.BeanClass;
public class TestInstance {
	public static void main(String[] args) {
		//��ʼ��Spring����ApplicationContext�����������ļ�
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//���Թ��췽��ʵ����Bean
		BeanClass b1 = (BeanClass)appCon.getBean("constructorInstance");
		System.out.println(b1+b1.message);
		
		//���Ծ�̬����ʵ����Bean
		BeanClass b2 = (BeanClass)appCon.getBean("staticFactoryInstance");
		System.out.println(b2+b2.message);
		
		//����ʵ����������ʵ����Bean
		BeanClass b3 = (BeanClass)appCon.getBean("instanceFactoryInstance");
		System.out.println(b3+b3.message);
		
		//����singleton��������ʹ�ù��췽��ʵ����Bean
		BeanClass b4 = (BeanClass)appCon.getBean("constructorInstance");
		System.out.println(b4);
		BeanClass b5 = (BeanClass)appCon.getBean("constructorInstance");
		System.out.println(b5);
		
		//����prototype��������ʹ�ù��췽��ʵ����Bean
		BeanClass b6 = (BeanClass)appCon.getBean("constructorInstancePrototype");
		System.out.println(b6);
		BeanClass b7 = (BeanClass)appCon.getBean("constructorInstancePrototype");
		System.out.println(b7);
	}
}
