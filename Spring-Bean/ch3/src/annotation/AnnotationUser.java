package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
/*
 * 相当于@Component("annotaionUser")或@Component(Value = "annotationUser"),
 * annotationUser为Bean的id，默认为首字母小写的类名
 */
public class AnnotationUser {

	@Value("Qin Zhenghan") // 只注入了简单的值，对于复杂值的注入目前使用该方式还解决不了
	private String uname;

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUname() {
		return this.uname;
	}

}
