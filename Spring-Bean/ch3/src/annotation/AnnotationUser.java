package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
/*
 * �൱��@Component("annotaionUser")��@Component(Value = "annotationUser"),
 * annotationUserΪBean��id��Ĭ��Ϊ����ĸСд������
 */
public class AnnotationUser {

	@Value("Qin Zhenghan") // ֻע���˼򵥵�ֵ�����ڸ���ֵ��ע��Ŀǰʹ�ø÷�ʽ���������
	private String uname;

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUname() {
		return this.uname;
	}

}
