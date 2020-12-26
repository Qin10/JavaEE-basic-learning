package annotation.service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import annotation.dao.TestDao;
@Service("testService")  //相当于@Service
public class TestServiceImpl implements TestService {
	@Resource(name="testDao")
	//相当于@Autowired，@Autowired默认按照Bean类型装配
	//若不使用@resource注解，则通过构造方法实现依赖注入接口对象
	/*
	 * private TestDao testDao;
	 * public TestServiceImpl(TestDao testDao){
	 *     this.testDao = testDao;
	 * }
	 */
	private TestDao testDao;
	@Override
	public void save() {
		testDao.save();
		System.out.println("testService save");
	}

}
