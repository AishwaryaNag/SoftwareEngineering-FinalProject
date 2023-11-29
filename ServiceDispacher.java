public class ServiceDispacher {

	private string dispatcherId;
	private string requestedServices;
	private string status;
	private string callerNumber;
	private string callerName;

	/**
	 * 
	 * @param serviceType
	 * @param urgencyLevel
	 * @param location
	 */
	public void dispatchService(string serviceType, string urgencyLevel, string location) {
		// TODO - implement ServiceDispacher.dispatchService
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param serviceId
	 */
	public string trackService(string serviceId) {
		// TODO - implement ServiceDispacher.trackService
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param serviceId
	 * @param resources
	 */
	public void allocateResources(string serviceId, List<Resource> resources) {
		// TODO - implement ServiceDispacher.allocateResources
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param urgencyLevel
	 * @param serviceType
	 * @param location
	 */
	public void createIncidentReport(string urgencyLevel, string serviceType, string location) {
		// TODO - implement ServiceDispacher.createIncidentReport
		throw new UnsupportedOperationException();
	}

}