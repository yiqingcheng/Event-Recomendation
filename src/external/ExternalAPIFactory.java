package external;

public class ExternalAPIFactory {
	private static final String DEFAULT_PIPELINE = "ticketmaster";
	
	public static ExternalAPI getExternalAPI(String pipeline) {
		switch(pipeline) {
			case "ticketmaster":
				return new TicketMasterAPI();
			default:
				throw new IllegalArgumentException("Invaild pipeline" + pipeline);
		}
	}
	
	public static ExternalAPI getExternalAPI() {
		return getExternalAPI(DEFAULT_PIPELINE);
	}
}
