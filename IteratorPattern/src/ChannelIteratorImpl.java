import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

	private ChannelTypeEnum type;
	private List<Channel> channels;
	private int position;
	
	public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> chaList) {
		System.out.println("hello from constructor");
		type = ty;
		channels = chaList;
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		while(position< channels.size()) {
			Channel c = channels.get(position);
			System.out.println(c.getTYPE());
			if(c.getTYPE().equals(type) ) {
				System.out.println("hello");
				return true;
			}
			else {
				position++;
			}
		}
		return false;
	}

	@Override
	public Channel next() {
		// TODO Auto-generated method stub
		Channel channel = channels.get(position);
		
		return channel;
	}

}
