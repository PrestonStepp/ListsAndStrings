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
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("this is a word sequence");
		tempList.add("");
		tempList.add("");
		tempList.add("");
		
		
		donutList.add(temp);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "dark chocolate with coffee";
		
		for(int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
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

	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + "was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still contans: " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");
	}
	
	public int maxLength(ArrayList<String> myList)
	{
		int max =0;
		
		for (int index = 0; index < myList.size(); index += 1)
		{
			if (max < myList.get(index).length())
			{
				max = myList.get(index).length();
			}
		}
			
		return max;
	}
	
	public String getLongesString(ArrayList<String> myList)
	{
		String longest = "";
		int max = 0;
		
		for(int index = 0; index < myList.size(); index += 1)
		{
			if(myList.get(index).length() > max)
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
		
		return longest;
	}

	
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}
