
public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", TYPE=" + TYPE + "]";
	}
	public Channel(double frequency, ChannelTypeEnum tYPE) {
		super();
		this.frequency = frequency;
		TYPE = tYPE;
	}
	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}
	public void setTYPE(ChannelTypeEnum tYPE) {
		TYPE = tYPE;
	}
}
