package bai4;

public enum PageInfor {
	
	PAGE_001("PAGE_001", "Login", "/login"), 
    PAGE_002("PAGE_002", "Add new user", "/addUser"), 
    PAGE_003("PAGE_003", "List user", "/listUser");
	
	private String pageID;
	private String pageTitle;
    private String pageURL;
    
	private PageInfor(String pageID, String pageTitle, String pageURL) {
		this.pageID = pageID;
		this.pageTitle = pageTitle;
		this.pageURL = pageURL;
	}

	public String getPageID() {
		return pageID;
	}

	public void setPageID(String pageID) {
		this.pageID = pageID;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}
	

    
    
}
