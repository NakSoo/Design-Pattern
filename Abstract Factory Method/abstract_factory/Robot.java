package abstract_factory;

public class Robot {
	private Head itsHead;
	private Body itsBody;
	private Hand itsLeftHand;
	private Hand itsrightHand;
	private Leg itsLeftLeg;
	private Leg itsrightLeg;
	public Head getItsHead() {
		return itsHead;
	}
	public void setItsHead(Head itsHead) {
		this.itsHead = itsHead;
	}
	public Body getItsBody() {
		return itsBody;
	}
	public void setItsBody(Body itsBody) {
		this.itsBody = itsBody;
	}
	public Hand getItsLeftHand() {
		return itsLeftHand;
	}
	public void setItsLeftHand(Hand itsLeftHand) {
		this.itsLeftHand = itsLeftHand;
	}
	public Hand getItsrightHand() {
		return itsrightHand;
	}
	public void setItsrightHand(Hand itsrightHand) {
		this.itsrightHand = itsrightHand;
	}
	public Leg getItsLeftLeg() {
		return itsLeftLeg;
	}
	public void setItsLeftLeg(Leg itsLeftLeg) {
		this.itsLeftLeg = itsLeftLeg;
	}
	public Leg getItsrightLeg() {
		return itsrightLeg;
	}
	public void setItsrightLeg(Leg itsrightLeg) {
		this.itsrightLeg = itsrightLeg;
	}
	
	
}

