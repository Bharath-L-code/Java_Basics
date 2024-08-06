class CapitalCity
{
	String name;
	int population;
	
	CapitalCity(String name,int population)
	{
		this.name=name;
		this.population=population;
	}
	public void display()
	{
		System.out.println("City_name:"+this.name);
		System.out.println("City_population:"+this.population);
	}
}

class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("Bendakaluru",20000000);
	
	public State(String name,String language)
	{
		this.name=name;
		this.language=language;
	}
	 public void print()
	 {
		 System.out.println("State_name:"+this.name);
		 System.out.println("Language_Spoken_here:"+this.language);
		 capitalCity.display();
	 }
}
class Country
{
	String name;
	String continent;
	State state=new State("Karunaadu","Kannada");
	
	public Country(String name,String continent)
	{
		this.name=name;
		this.continent=continent;
	}
	
	public void show()
	{
		System.out.println("Country_name:"+this.name);
		System.out.println("Continent_name:"+this.continent);
		state.print();
	}
	
}

/* op 

Country_name:India
Continent_name:Asia
State_name:Karunaadu
Language_Spoken_here:Kannada
City_name:Bendakaluru
City_population:20000000

*/                         // nan makla code nandu //



