package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import instance.BeanClass;
public class TestInstance {
	public static void main(String[] args) {
		//初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//测试构造方法实例化Bean
		BeanClass b1 = (BeanClass)appCon.getBean("constructorInstance");
		System.out.println(b1+b1.message);
		
		//测试静态工厂实例化Bean
		BeanClass b2 = (BeanClass)appCon.getBean("staticFactoryInstance");
		System.out.println(b2+b2.message);
		
		//测试实例工厂方法实例化Bean
		BeanClass b3 = (BeanClass)appCon.getBean("instanceFactoryInstance");
		System.out.println(b3+b3.message);
		
		//测试singleton作用域下使用构造方法实例化Bean
		BeanClass b4 = (BeanClass)appCon.getBean("constructorInstance");
		System.out.println(b4);
		BeanClass b5 = (BeanClass)appCon.getBean("constructorInstance");
		System.out.println(b5);
		
		//测试prototype作用域下使用构造方法实例化Bean
		BeanClass b6 = (BeanClass)appCon.getBean("constructorInstancePrototype");
		System.out.println(b6);
		BeanClass b7 = (BeanClass)appCon.getBean("constructorInstancePrototype");
		System.out.println(b7);
	}
}
