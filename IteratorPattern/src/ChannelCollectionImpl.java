import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	List<Channel> channels ;
	public ChannelCollectionImpl() {
		// TODO Auto-generated constructor stub
		channels = new ArrayList<>();
	}
	
	@Override
	public void addChannel(Channel c) {
		// TODO Auto-generated method stub
		channels.add(c);
		
//this.channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		// TODO Auto-generated method stub
		this.channels.remove(c);

	}

	@Override
	public ChannelIterator interator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIteratorImpl(type, channels);
	}

}
