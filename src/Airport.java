import java.util.ArrayList;
import java.util.LinkedList;

public class Airport extends Traveller
{
	Address adress;
	private ArrayList<Flight> flights;
	private ArrayList<Traveller> travellers;
	private String source;
	private String destination;
	


	public String getSource() {
		return source;
	}

	
	public String getDestination() {
		return destination;
	}



	public boolean addFlight(Flight flight)
	    {   flights.add(flight);
	        return true;
	    }

	public boolean searchFlight(String source,String destination)

    {
        if(flights.contains(source) && flights.contains(destination))
            return true;
        return false;

    }
	
	//ArrayList<Traveller> tlist=new ArrayList<>();
	public void bookTicket(String flightId,Traveller traveller)

    {

        for(int i=0;i<flights.size();i++)

        {

            if(flights.contains(flightId) && (flights.get(i)).getAvailabletickets()>0)

            {


            flights.get(i).setAvailabletickets(flights.get(i).getAvailabletickets()-1);

            }

        }

    }
	
	
	}


			
		
	


