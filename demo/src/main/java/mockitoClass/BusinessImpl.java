package mockitoClass;

public class BusinessImpl {
	
	private DataService dataService;
	
	public BusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int fetchReliableDataService(){
		int[] services=dataService.retrieveAllData();
		int greatest=Integer.MIN_VALUE;
		for(int value:services){
			if(greatest <value)
				greatest=value;
		}
		
		return greatest;
	}

}

