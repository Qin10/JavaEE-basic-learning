package test;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import life.BeanLife;
public class TestLife {

	public static void main(String[] args) {
		//��ʼ��Spring���������������ļ�
		//Ϊ�˷�����ʾ���ٷ�����ִ�У�����ʹ��ClassPathXmlApplicationContext
		//ʵ������������
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("��ȡ����ǰ");
		BeanLife blife = (BeanLife)ctx.getBean("beanLife");
		System.out.println("��ȡ�����" + blife);
		//�ر�����������Bean����
		ctx.close();
	}

}
