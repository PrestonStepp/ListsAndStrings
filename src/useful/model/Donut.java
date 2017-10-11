package useful.model;

public class Donut 
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.holeCount = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;
	}
	
	public String getFlavor()
	{
		return flavor;
	}

	public Object getShape() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setShape(String testShape) {
		// TODO Auto-generated method stub
		
	}
}
