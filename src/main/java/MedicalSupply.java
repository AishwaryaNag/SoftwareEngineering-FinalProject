public class MedicalSupply extends Resource {

	private string supplyID;
	private DateTime expirationDate;
	private DateTime maintenanceSchedule;
	private string model;

	/**
	 * 
	 * @param quantity
	 * @param supplierID
	 */
	public any orderSupplies(int quantity, string supplierID) {
		// TODO - implement MedicalSupply.orderSupplies
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param quantityUsed
	 * @param userID
	 */
	public void recordUsage(int quantityUsed, string userID) {
		// TODO - implement MedicalSupply.recordUsage
		throw new UnsupportedOperationException();
	}

}