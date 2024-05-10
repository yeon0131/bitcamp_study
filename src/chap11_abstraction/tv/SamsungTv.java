package chap11_abstraction.tv;

public class SamsungTv extends Tv {
	@Override
	public void powerOn() {
		System.out.println("OLED TV의 전원을 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("OLED TV의 전원을 켭니다.");
	}
	
	@Override
	public void operate(int channel) {
		lastChannel = channel;
		System.out.println("OLED TV "+channel + "로 이동합니다.");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("OLED TV "+ ++this.lastChannel + "로 이동합니다.");
	}
	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("OLED TV "+ --this.lastChannel + "로 이동합니다.");
	}

}
