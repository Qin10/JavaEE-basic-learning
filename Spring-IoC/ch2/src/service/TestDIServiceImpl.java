package service;

import dao.TestDIDao;

public class TestDIServiceImpl implements TestDIService {
	//�ӿ������ı�������ֵΪ�ýӿ�ʵ������������
	private TestDIDao testDIDao;
	//���췽��������ʵ������ע��ӿڶ���
	public TestDIServiceImpl(TestDIDao testDIDao) {
		super();
		this.testDIDao = testDIDao;
	}
	@Override
	public void sayHello() {
		testDIDao.sayHello();
		System.out.println("TestDIService ���췽��ע��say: Hello, study hard!");
	}
}
