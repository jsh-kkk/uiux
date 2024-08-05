package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	// 자동 의존주입 방식 : 선언된 변수의 타입으로 의존 주입한다.
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체생성");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV---전원 켠다");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---전원 끈다");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
		//System.out.println("LgTV---소리 내린다");
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		//System.out.println("LgTV---소리 내린다");
	}
}
