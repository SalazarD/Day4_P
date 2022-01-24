package Practice2;

public class Part {

	private int partId;
	private String partName;
	private String partSN;
	private double cost;
	
	public Part(int partId, String partName, String partSN, double cost) {
		
		this.partId = partId;
		this.partName = partName;
		this.partSN = partSN;
		this.cost = cost;
		
	}

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartSN() {
		return partSN;
	}

	public void setPartSN(String partSN) {
		this.partSN = partSN;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Part [partId=" + partId + ", partName=" + partName + ", partSN=" + partSN + ", cost=" + cost + "]";
	}
	
}
