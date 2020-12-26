package service;

import dao.TestDIDao;

public class TestDIServiceImpl implements TestDIService {
	//接口声明的变量，赋值为该接口实现类对象的引用
	private TestDIDao testDIDao;
	//构造方法，用于实现依赖注入接口对象
	public TestDIServiceImpl(TestDIDao testDIDao) {
		super();
		this.testDIDao = testDIDao;
	}
	@Override
	public void sayHello() {
		testDIDao.sayHello();
		System.out.println("TestDIService 构造方法注入say: Hello, study hard!");
	}
}
