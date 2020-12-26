package life;

public class BeanLife {
	public void initMyself() {
		//this.getClass().getName()获取类的限定名称，此处即life.BeanLife
		System.out.println(this.getClass().getName() + "执行自定义的初始化方法");
	}
	public void destroyMyself() {
		System.out.println(this.getClass().getName() + "执行自定义的销毁方法");
	}
}