package instance;

public class BeanInstanceFactory {
	public BeanClass createBeanClassInstance() {
		return new BeanClass("调用实例工厂方法来实例化Bean");
	}
}
