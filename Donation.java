public class Donation extends Resource {

	private string donationID;
	private float amount;
	private string donorDetails;
	private DateTime dateReceived;

	/**
	 * 
	 * @param amount
	 * @param donorInfo
	 */
	public void acceptDonation(float amount, any donorInfo) {
		// TODO - implement Donation.acceptDonation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param to
	 * @param amount
	 */
	public void allocateFunds(String to, float amount) {
		// TODO - implement Donation.allocateFunds
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param donationDetails
	 */
	public void recordDonation(any donationDetails) {
		// TODO - implement Donation.recordDonation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param donationID
	 */
	public any refundDonation(String donationID) {
		// TODO - implement Donation.refundDonation
		throw new UnsupportedOperationException();
	}

}