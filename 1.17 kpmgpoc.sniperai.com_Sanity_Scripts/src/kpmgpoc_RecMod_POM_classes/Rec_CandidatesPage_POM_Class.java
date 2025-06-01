package kpmgpoc_RecMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rec_CandidatesPage_POM_Class 
{
//	Candidates Page WebElements: 1) Filter By selecting multiple jobs :: a) search Icon 2) Ribbon :: a) All b) New Recommendations, 
//	c) forward, d) new Application, 3) AdvancedFilterArrow, 4) Sources 5) Experience, 6) Last Updated, 7)Tags, 8) Status
//	9) Apply Button, 10) CV relevency, 11) CV Score 12) Age, 13) Bot Response, 14) CV Updated date, 15) Select degree
//	16) Select Major, 17) Select current title, 18) Current comapny, 19) Candidate hiding, 20) Anonymized data
//	21) Gender, 22) Items Per Page, 23) Bulk Action :: a)Bulk CV, b) Bulk CSV 24) Reset, 25) Column Config :: a) Close, b) Apply, c) Cancel 
//	26) Select All candidate checkbox, 27) Name Sorting filter, 28) Name column filter :: a) Name column filter search
//	29) Email Sorting filter, 30) Email column filter :: a) Email column filter search 31) Download CV, 
//	32) View CV :: a) View CV next, b) View CV Previous, c) View CV Close, 33) Burger Menu: a)View candiadte details window
//	b) Can details next, c) Can details previous, d) Can details close, 34) Pagination.
	
//	WebDriver declared 
	private WebDriver driver;
	
//	Mouse actions class variable declared
	private Actions MouseAction;
	
//	Find WebElements
//	1) Filter By selecting multiple jobs
	@FindBy (xpath = "//input [@id='job_filter']")
	private WebElement SelectJobs;
	
//	1.a) Select jobs search Icon
	@FindBy (xpath = "//div[@id='search_selected_jobs']")
	private WebElement SearchJobs;
	
//	2) Ribbon :: a) All Candidates
	@FindBy (xpath = "//span [text()= 'All']")
	private WebElement AllCandidates;	
	
//	b) Ribbon New Recommendations
	@FindBy (xpath = "//span [text()= 'New Recommendations']")
	private WebElement NewRecommendations;		
	
//	c) forward, 
	@FindBy (xpath = "//span [text()= 'Forwarded']")
	private WebElement ForwardCandidates;
	
//	d) new Application, 
	@FindBy (xpath = "//span [text()= 'New Application']")
	private WebElement NewApplications;	
	
//	3) AdvancedFilterArrow, >> Remaining Xpath not able to found
	
	
//	4) Sources 
	@FindBy (xpath = "//span [@class='multiSel']")
	private WebElement Sources;	
	
//	5) Experience,   >> Remaining
	
	
//	6) Last Updated,    >> Remaining
	
	
//	7)Tags, 8) Status >> Remaining
	
	
//	9) Apply Button
	@FindBy (xpath = "(//input [@value='Apply'])[1]")
	private WebElement ApplyNow;	
	
//	10) CV relevency, 11) CV Score 12) Age, 13) Bot Response, 14) CV Updated date, 15) Select degree
//	16) Select Major, 17) Select current title, 18) Current comapny, 19) Candidate hiding, 20) Anonymized data
//	21) Gender, 
	
	
//	22) Items Per Page
	@FindBy (xpath = "//select [@id='page_size']")
	private WebElement ItemsPerPage;
	
//	22.a) 25 items Per Page
	@FindBy (xpath = "//option [@value='25']")
	private WebElement ItemsPerPage_25;
	
//	23) Bulk Action :: 
	@FindBy (xpath = "//button [@class='btn cus-drop dropdown-toggle']")
	private WebElement BulkAction;
	
//	23.a)Bulk CV,
	@FindBy (xpath = "//input [@id='downloadcv']")
	private WebElement BulkCVDownload;
	
//	23.b) Bulk CSV 
	@FindBy (xpath = "//input [@id='downloadcsv']")
	private WebElement BulkCSVDownload;
	
//	24) Reset, 
	@FindBy (xpath = "//i [@class='fa fa-refresh']")
	private WebElement Reset;
	
//	25) Column Config :: 
	@FindBy (xpath = "//a[@id='configure_column_id']")
	private WebElement ColumnConfig;
	
//	25.a) Close, 
	@FindBy (xpath = "//button [@class='close']")
	private WebElement ColumnConfigClose;
	
//	25.b) Apply, 
	@FindBy (xpath = "(//input [@value='Apply'])[4]")
	private WebElement ColumnConfigApply;
	
//	25.c) Cancel,	
	@FindBy (xpath = "//input [@value='Cancel']")
	private WebElement ColumnConfigCancel;
	
//	26) Select All candidate checkbox, >> Remaining
	
//	27) Name Sorting filter,
	@FindBy (xpath = "(//i [@class='fa fa-fw fa-sort sorting-arrow '])[1]")
	private WebElement NameSortingFilter;
	
//	28) Name column filter :: 
	@FindBy (xpath = "//i [@column_ui_title='Name']")
	private WebElement NameColumnFilter;
	
//	28.a) Name column filter search 
	@FindBy (xpath = "//button [@data-id='0']")
	private WebElement NameColumnFilterSearch;
	
//	29) Email Sorting filter, 
	@FindBy (xpath = "(//i [@class='fa fa-fw fa-sort sorting-arrow '])[2]")
	private WebElement EmailSortingFilter;
	
//	30) Email column filter :: 
	@FindBy (xpath = "//i [@column_ui_title='Email']")
	private WebElement EmailColumnFilter;
	
//	30.a) Email column filter search 
	@FindBy (xpath = "//button [@data-id='1']")
	private WebElement EmailColumnFilterSearch;
	
//	31) Download CV,  
	@FindBy (xpath = "(//img [@title='Download CV : English'])[1]")
	private WebElement DownloadCV;
	
//	32) View CV :: 
	@FindBy (xpath = "(//img [@title='Preview CV : English'])[1]")
	private WebElement ViewCV;
	
//	32.a) View CV next
	@FindBy (xpath = "//img [@class='next cv_next']")
	private WebElement ViewCVNext;
	
//	32.b) View CV Previous, 
	@FindBy (xpath = "//img [@class='previous cv_previous']")
	private WebElement ViewCVPrevious;
		
//	32.c) View CV Close, 
	@FindBy (xpath = "//img [@style='height:20px;']")
	private WebElement ViewCVClose;
	
//	33) Burger Menu: 
	@FindBy (xpath = "(//img [@class='toggle'])[1]")
	private WebElement BurgerMenu;
	
//	a)View candiadte details window
	@FindBy (xpath = "(//span [@class=' promot1  View View_jd_user'])[1]")
	private WebElement ViewCandidate;	
	
//	b) Can details next, 
	@FindBy (xpath = "//img [@class='nextUser']")
	private WebElement ViewCandidateNext;
	
//	c) Can details previous, 
	@FindBy (xpath = "//img [@class='previousUser']")
	private WebElement ViewCandidatePrevious;
	
//	d) Can details close
	@FindBy (xpath = "//img [@style='height: 20px;']")
	private WebElement ViewCandidateClose;
	
//	e) Edit candidate
	@FindBy (xpath = "//img [@id='edit_candidate_detail']")
	private WebElement ViewCandidateEdit;
	
//	f) Personal Details 
	@FindBy (xpath = "//span [text() = 'Personal Details']")
	private WebElement PersonalDetails;
	
//	g) Employment Details  
	@FindBy (xpath = "//span [text() = ' Employment Details']")
	private WebElement EmploymentDetails;
	
//	h) Education Details  
	@FindBy (xpath = "//span [text() = ' Education Details']")
	private WebElement EducationDetails;
	
//	i) Other Details  
	@FindBy (xpath = "//span [text() = ' Other Details']")
	private WebElement OtherDetails;
	
//	j) Submit
	@FindBy (xpath = "//a [@id='submit_candidate_details']")
	private WebElement CandidatedetailsSubmit;
	
//	k) Cancel
	@FindBy (xpath = "//a [@id='cancel_btn']")
	private WebElement CandidateDetailsCancel;
	
//	34) Pagination
	@FindBy (xpath = "(//li [@p='2'])[1]")
	private WebElement Pagination2ndPage;
	
//	Constructor to perfrom actions on the web elements
	public Rec_CandidatesPage_POM_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		this.MouseAction = new Actions (driver);
		
	}
	
//	WebElements to perform actions
//	1) Filter By selecting multiple jobs  >>  Remaining

	
//	1.a) Select jobs search Icon  >>  Remaining

	
//	2) Ribbon :: a) All Candidates
	public void AllCandidates()
	{
		AllCandidates.click();
	}
	
//	b) Ribbon New Recommendations
	public void NewRecommendations()
	{
		NewRecommendations.click();
	}
	
//	c) forward, 
	public void ForwardCandidates()
	{
		ForwardCandidates.click();
	}
	
//	d) new Application, 
	public void NewApplications()
	{
		NewApplications.click();
	}
	
//	3) AdvancedFilterArrow, >> Remaining Xpath not able to found
	
	
//	4) Sources 
	public void Sources()
	{
		Sources.click();
	}
	
//	5) Experience,   >> Remaining
	
	
//	6) Last Updated,    >> Remaining
	
	
//	7)Tags, 8) Status >> Remaining
	
	
//	9) Apply Button
	public void ApplyNow()	
	{
		ApplyNow.click();
	}
//	10) CV relevency, 11) CV Score 12) Age, 13) Bot Response, 14) CV Updated date, 15) Select degree
//	16) Select Major, 17) Select current title, 18) Current comapny, 19) Candidate hiding, 20) Anonymized data
//	21) Gender, 
	
	
//	22) Items Per Page
	public void ItemsPerPage()
	{
		ItemsPerPage.click();
	}
	
//	22.a) 25 items Per Page
	public void ItemsPerPage_25()
	{
		ItemsPerPage_25.click();
	}
	
//	23) Bulk Action :: 
	public void BulkAction()
	{
		BulkAction.click();
	}
	
//	23.a)Bulk CV,
	public void BulkCVDownload()
	{
		BulkCVDownload.click();
	}
	
//	23.b) Bulk CSV 
	public void BulkCSVDownload()
	{
		BulkCSVDownload.click();
	}
	
//	24) Reset, 
	public void Reset()
	{
		Reset.click();
	}
	
//	25) Column Config :: 
	public void ColumnConfig()
	{
		ColumnConfig.click();
	}
	
//	25.a) Close, 
	public void ColumnConfigClose()
	{
		ColumnConfigClose.click();
	}
	
//	25.b) Apply, 
	public void ColumnConfigApply()
	{
		ColumnConfigApply.click();
	}
	
//	25.c) Cancel,	
	public void ColumnConfigCancel()
	{
		ColumnConfigCancel.click();
	}
	
//	26) Select All candidate checkbox, >> Remaining
	
//	27) Name Sorting filter,
	public void NameSortingFilter()
	{
		NameSortingFilter.click();
	}
	
//	28) Name column filter :: 
	public void NameColumnFilter()
	{
		NameColumnFilter.click();
	}
	
//	28.a) Name column filter search 
	public void NameColumnFilterSearch()
	{
		NameColumnFilterSearch.click();
	}
	
//	29) Email Sorting filter, 
	public void EmailSortingFilter()
	{
		EmailSortingFilter.click();
	}
	
//	30) Email column filter :: 
	public void EmailColumnFilter()
	{
		EmailColumnFilter.click();
	}
	
//	30.a) Email column filter search 
	public void EmailColumnFilterSearch()
	{
		EmailColumnFilterSearch.click();
	}
	
//	31) Download CV,  
	public void DownloadCV()
	{
		DownloadCV.click();
	}
	
//	32) View CV :: 
	public void ViewCV()
	{
		ViewCV.click();
	}
	
//	32.a) View CV next
	public void ViewCVNext()
	{
		ViewCVNext.click();
	}
	
//	32.b) View CV Previous, 
	public void ViewCVPrevious()
	{
		ViewCVPrevious.click();
	}
		
//	32.c) View CV Close, 
	public void ViewCVClose()
	{
		ViewCVClose.click();
	}
	
//	33) Burger Menu: 
	public void BurgerMenu()
	{
		MouseAction.moveToElement(BurgerMenu).perform();
	}
	
//	a)View candiadte details window
	public void ViewCandidate()
	{
		ViewCandidate.click();
	}
	
//	b) Can details next, 
	public void ViewCandidateNext()
	{
		ViewCandidateNext.click();
	}
	
//	c) Can details previous, 
	public void ViewCandidatePrevious()
	{
		ViewCandidatePrevious.click();
	}
	
//	d) Can details close
	public void ViewCandidateClose()
	{
		ViewCandidateClose.click();
	}
	
//	e) Edit candidate
	public void ViewCandidateEdit()
	{
		ViewCandidateEdit.click();
	}
	
//	f) Personal Details 
	public void PersonalDetails()
	{
		PersonalDetails.click();
	}
	
//	g) Employment Details  
	public void EmploymentDetails()
	{
		EmploymentDetails.click();
	}
	
//	h) Education Details  
	public void EducationDetails()
	{
		EducationDetails.click();
	}
	
//	i) Other Details  
	public void OtherDetails()
	{
		OtherDetails.click();
	}
	
//	j) Submit
	public void CandidatedetailsSubmit()
	{
		CandidatedetailsSubmit.click();
	}
	
//	k) Cancel
	public void CandidateDetailsCancel()
	{
		CandidateDetailsCancel.click();
	}
	
//	34) Pagination
	public void Pagination2ndPage()
	{
		Pagination2ndPage.click();
	}
	
		
	

}
