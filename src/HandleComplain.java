
public abstract class HandleComplain {

	protected HandleComplain nextHandleComplain;

	public void setNextHandleComplain(HandleComplain nextHandleComplain) {
		this.nextHandleComplain = nextHandleComplain;
	}

	public abstract void handleComplain(int level);
}
