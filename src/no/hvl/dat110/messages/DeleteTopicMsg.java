package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {

	// message sent from client to delete topic on the broker
	
	private String topic;
	
	public DeleteTopicMsg (String user, String topic) {
		super(MessageType.DELETETOPIC, user);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "DeleteTopicMsg [topic=" + topic + "]";
	}

}
