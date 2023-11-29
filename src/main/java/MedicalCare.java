public class MedicalCare extends CareService {

	private string careId;
	private string typeOfCare;
	private int availableSpace;
	private string location;

	/**
	 * 
	 * @param patientID
	 * @param treatmentType
	 */
	public void provideCare(string patientID, string treatmentType) {
		// TODO - implement MedicalCare.provideCare
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param patientID
	 * @param timeSlot
	 */
	public DateTime scheduleCare(string patientID, DateTime timeSlot) {
		// TODO - implement MedicalCare.scheduleCare
		throw new UnsupportedOperationException();
	}

	public boolean checkAvailability() {
		// TODO - implement MedicalCare.checkAvailability
		throw new UnsupportedOperationException();
	}

}