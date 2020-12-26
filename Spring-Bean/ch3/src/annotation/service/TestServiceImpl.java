package annotation.service;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import annotation.dao.TestDao;
@Service("testService")  //�൱��@Service
public class TestServiceImpl implements TestService {
	@Resource(name="testDao")
	//�൱��@Autowired��@AutowiredĬ�ϰ���Bean����װ��
	//����ʹ��@resourceע�⣬��ͨ�����췽��ʵ������ע��ӿڶ���
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
