package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController 
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "dark chocolate with coffee";
		
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String curretFlavor = donutList.get(index).getFlavor();
			
			Donut currentFlavor = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if(currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText("The best flavor ever!!!!!!!!!!!!");
				}
			}
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut trashDonut = new Donut();
		Donut bleachDonut = new Donut("meme bleach");
		Donut springSmitch = new Donut("spring smitch for lunatics");
		Donut rustyNail = new Donut("rusty nail get tetanus shot");
		
		donutList.add(bleachDonut);
		donutList.add(jellyFilled);
		donutList.add(rustyNail);
		donutList.add(springSmitch);
		donutList.add(trashDonut);
	}
	
}
