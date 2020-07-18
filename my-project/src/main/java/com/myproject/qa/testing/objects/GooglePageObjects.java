package com.myproject.qa.testing.objects;

public enum GooglePageObjects {

	GOOGLE_PAGE_SEARCH_BAR_XPATH("//input[@title='Search']"),
	GOOGLE_PAGE_GOOGLE_SEARCH_BTN_XPATH("(//input[@aria-label='Google Search'])[1]")
	
	; 
	
	private String value ;
	
	GooglePageObjects(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
    @Override
    public String toString() {
        return this.getValue();
    }
}
