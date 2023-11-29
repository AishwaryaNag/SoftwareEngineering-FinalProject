public class Resource {

	private string resourceID;
	private string type;
	private int availableQuantity;

	public boolean checkAvailability() {
		// TODO - implement Resource.checkAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newQuantity
	 */
	public void updateResourceQuantity(int newQuantity) {
		// TODO - implement Resource.updateResourceQuantity
		throw new UnsupportedOperationException();
	}


	public class AllocationDetail {

		private string allocationID;
		private string resourceID;
		private DateTime allocationDate;

		/**
		 * 
		 * @param resourceID
		 * @param quantity
		 * @param receiverID
		 */
		public void allocateResource(string resourceID, int quantity, string receiverID) {
			// TODO - implement AllocationDetail.allocateResource
			throw new UnsupportedOperationException();
		}

		/**
		 * 
		 * @param resourceID
		 * @param quantity
		 */
		public void releaseResource(string resourceID, int quantity) {
			// TODO - implement AllocationDetail.releaseResource
			throw new UnsupportedOperationException();
		}

		/**
		 * 
		 * @param allocationID
		 * @param newDetails
		 */
		public void updateAllocation(string allocationID, any newDetails) {
			// TODO - implement AllocationDetail.updateAllocation
			throw new UnsupportedOperationException();
		}

	}

}