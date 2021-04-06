package AssignmentSet6;

public class TeamEvent extends Event {

	private int noOfParticipants;
	private int teamNo;
	
	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo) {
		super(eventName, participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	@Override
	public void registerEvent() {
		if (getEventName().contentEquals("Singing")) {
			setRegistrationFee(4);
		} else if (getEventName().contentEquals("Dancing")) {
			setRegistrationFee(6);
		} else if (getEventName().contentEquals("DigitalArt")) {
			setRegistrationFee(8);
		} else if (getEventName().contentEquals("Acting")) {
			setRegistrationFee(10);
		} else 
			setRegistrationFee(0);
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	
}
