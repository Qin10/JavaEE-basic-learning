package life;

public class BeanLife {
	public void initMyself() {
		//this.getClass().getName()��ȡ����޶����ƣ��˴���life.BeanLife
		System.out.println(this.getClass().getName() + "ִ���Զ���ĳ�ʼ������");
	}
	public void destroyMyself() {
		System.out.println(this.getClass().getName() + "ִ���Զ�������ٷ���");
	}
}