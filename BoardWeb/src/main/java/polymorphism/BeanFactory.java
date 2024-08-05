package polymorphism;

public class BeanFactory {
	// bean == 객체
	
	public Object getBean(String beanName) {
		
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else {
			return new LgTV();
		}
		
	}	
}	
