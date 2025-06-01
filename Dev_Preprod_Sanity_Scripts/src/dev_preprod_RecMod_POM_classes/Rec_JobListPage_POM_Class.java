package dev_preprod_RecMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rec_JobListPage_POM_Class 
{
//	Side Bar WebElements :: 1) Sidebar 2) Admin > a)User Creation, b) Add support recruiter, c) Equitable hiring d) Bot candidate
//	3)Reports > A}Download reports : a) Recruiter wise activity, b) Recommendations summary c) Hide/Unhide history
//	d) Send mail delivery :> i) Success email delivery, ii)Failed email delivery. e) Bot reports :> i) Chatbot ii)Interview scheduler
//	B} Dashboard reports.
//	4) Settings :> a) Job settings b) Job wizard settings c) LinkedIn enrichment d) Score representation confg
//	e) Video interview confg
//	5) Utilities :> a) Skill upload b) Skill affinity c) Job refresh d) Score lock e) add support recruiter.
//	6) RS plus :> a) RS plus confg b) Rs plus reports c) RS plus candidate 
//	7) Client module: a) Add clients b) Client Summary c) reports
//	7) Jobs 8) Candidates 9) Signout.	
//	JobList Page WebElements :: 1) All jobs 2)My jobs 3) Active 4)Inactive 5) Bulk acion 6) Add job ::>  
//	7) Item Per Page 8) Reset 9) Column Confg:: a)Column Confg b)Statistics Confg c) Apply d) cancel e) Close
//	10) Advanced filter :: a) Apply b) Cancel c) close 11) Select all checkbox 12) Job Req Id sorting 
//	13) Job Req Id Column filter 14) Job Req Id column filter button 15) Job Title sorting 
//	16) Job Title Column filter 17) Job Title column filter button 18) Location (Primary) sorting 
//	19) Location (Primary) Column filter 20) Location (Primary)e column filter button 21) Edit Job icon 22) Add interview scheduler
//	23) Applications count, 24) Recommendations count 25) Pagination :: a) LastPage, b) FirstPage

	
//	Wedriver declared
	private WebDriver driver;
	
//	Mouse actions class variable declared
	private Actions MouseAction;
	
//	Find WebElements from job list page 
//	Side Bar WebElements---------------
//	1) Sidebar
	@FindBy (xpath = "//a [@class='menu-icn']")
	private WebElement Sidebar;
	
//	2) Admin Menu:-
	@FindBy (xpath = "//span [text() = 'Admin']")
	private WebElement Admin;		
	
//	a)User Creation 
	@FindBy (xpath = "//a [text() = 'User Creation']")
	private WebElement UserCreation;	
	
//	b) Add support recruiter
	@FindBy (xpath = "(//a [text() = 'Add Support Recruiter'])[1]")
	private WebElement AddSupportRecruiter;	
	
//	c) Equitable hiring   
	@FindBy (xpath = "//a [text() = 'Equitable Hiring']")
	private WebElement EquitableHiring;		
	
//	d) Bot candidate
	@FindBy (xpath = "//a [text() = 'Bot Candidate']")
	private WebElement BotCandidate;	
	
//	3)Reports Menu:-
	@FindBy (xpath = "//span [text() = 'Reports']")
	private WebElement Reports;	
	
//	A}Download reports:-
	@FindBy (xpath = "//a [text() = 'Download Reports                                        ']")
	private WebElement DownloadReports;
	
//	a) Recruiter wise activity
	@FindBy (xpath = "//a [text() = 'Recruiter Wise Activity']")
	private WebElement RecruiterWiseActivity;
	
//	b) Recommendations summary 
	@FindBy (xpath = "//a [text() = 'Recommendations Summary']")
	private WebElement RecommendationsSummary;
	
//	c) Hide/Unhide history
	@FindBy (xpath = "//a [text() = 'Hide/Unhide History']")
	private WebElement HideUnhideHistory;	
	
//	d) Send mail delivery :-
	@FindBy (xpath = "//a [text() = 'Send Mail Delivery                                                        ']")
	private WebElement SendMailDeliveryReport;
	
//	i) Success email delivery
	@FindBy (xpath = "//a [text() = 'Success Email Delivery']")
	private WebElement SuccessEmailDeliveryReport;
	
//	ii)Failed email delivery
	@FindBy (xpath = "//a [text() = 'Failed Email Delivery']")
	private WebElement FailedEmailDeliveryReport;
	
//	e) Bot reports:-
	@FindBy (xpath = "//a [text() = 'Bot Reports                                                        ']")
	private WebElement BotReports;
	
//	i) Chatbot History Report
	@FindBy (xpath = "//a [text() = 'Chatbot History']")
	private WebElement ChatbotHistoryReport;
	
//	ii)Interview scheduler Report
	@FindBy (xpath = "//a [text() = 'Interview Scheduler History']")
	private WebElement InterviewSchedulerReport;	
	
//	B} Dashboard reports:-
	@FindBy (xpath = "//a [text() = 'Dashboard Reports']")
	private WebElement DashboardReports;
	
//	4) Settings:-
	@FindBy (xpath = "//span [text() = 'Settings']")
	private WebElement Settings;
	
//	a) Job settings 
	@FindBy (xpath = "//a [text() = 'Job Settings']")
	private WebElement JobSettings;
	
//	b) Job wizard settings 
	@FindBy (xpath = "//a [text() = 'Job Wizard Settings']")
	private WebElement JobWizardSettings;
	
//	c) LinkedIn enrichment Configuration 
	@FindBy (xpath = "//a [text() = 'LinkedIn Enrichment Configuration']")
	private WebElement LinkedEnrichmentConfig;
	
//	d) Score representation confg
	@FindBy (xpath = "//a [text() = 'Score Representation Configuration']")
	private WebElement ScoreRepConfig;
	
//	e) Video interview confg
	@FindBy (xpath = "//a [text() = 'Video Interview Configuration']")
	private WebElement VideoInterviewConfig;	
	
//	5) Utilities:-
	@FindBy (xpath = "//span [text() = 'Utilities']")
	private WebElement Utilities;
		
//	a) Skill upload 
	@FindBy (xpath = "//a [text() = 'Skill Upload']")
	private WebElement SkillUpload;
	
//	b) Skill affinity 
	@FindBy (xpath = "//a [text() = 'Skill Affinity']")
	private WebElement SkillAffinity;
	
//	c) Job refresh 
	@FindBy (xpath = "//a [text() = 'Job Refresh']")
	private WebElement JobRefresh;
	
//	d) Score lock 
	@FindBy (xpath = "//a [text() = 'Score Lock']")
	private WebElement ScoreLock;
	
//	e) add support recruiter.
	@FindBy (xpath = "(//a [text() = 'Add Support Recruiter'])[2]")
	private WebElement AddSupportRecruiterUtility;
	
//	6) RS plus Menu:-
	@FindBy (xpath = "//span [text() = 'RS Plus']")
	private WebElement RSPlus;
	
//	a) RS plus confg 
	@FindBy (xpath = "//a [text() = 'RS Plus Configuration']")
	private WebElement RSPlusConfig;
	
//	b) Rs plus reports 
	@FindBy (xpath = "//a [text() = 'RS Plus Reports']")
	private WebElement RSPlusReport;
	
//	c) RS plus candidate 
	@FindBy (xpath = "//a [text() = 'RS Plus Candidates']")
	private WebElement RSPlusCandidates;
	
//	7) Client module: 
	@FindBy (xpath = "//span [text() = 'Client Module']")
	private WebElement ClientModule;
	
//	a) Add clients 
	@FindBy (xpath = "//a [text() = 'Add Client']")
	private WebElement AddClient;
	
//	b) Client Summary 
	@FindBy (xpath = "//a [text() = 'Client Summary']")
	private WebElement ClientSummary;
	
//	c) reports
	@FindBy (xpath = "//a [text() = 'Reports']")
	private WebElement ReportsClients;
	
//	7) Jobs 
	@FindBy (xpath = "//*[@id=\"live_jobs_active\"]/span[2]")
	private WebElement JobListPage;	
	
//	8) Candidates //span [text() = 'Candidates']
	@FindBy (xpath = "//span [text() = 'Candidates']")
	private WebElement Candidates;	
	
//	9) Signout
	@FindBy (xpath = "//span [text() = 'Sign out']")
	private WebElement Signout;
	
		
	
//	JobList Page WebElements
//	1) All jobs
	@FindBy (xpath = "//input [@id='alljobs']")
	private WebElement Alljobs;
	
//	2) My Jobs
	@FindBy (xpath = "//input [@id='myjobs']")
	private WebElement Myjobs;
	
//	3) Active  
	@FindBy (xpath = "//input [@id='activejobs']")
	private WebElement Activejobs;
	
//	4) Inactive 
	@FindBy (xpath = "//input [@id='expiredjobs']")
	private WebElement Inactivejobs;
	
//	5) Bulk acion 
	@FindBy (xpath = "//button [@title='Bulk Action']")
	private WebElement BulkAction;
	
//	6) Add Job 
	@FindBy (xpath = "//a [@title='Add Job']")
	private WebElement AddNewJob;
	
//	7) Item Per Page  
	@FindBy (xpath = "//select [@name='page_size']")
	private WebElement ItemsPerPage;
	
//	7.a) Itmes per page options 
	@FindBy (xpath = "//option [@value='25']")
	private WebElement ItemsPerPage25;
	
//	8) Reset
	@FindBy (xpath = "//a [@id='resetFilter']")
	private WebElement ResetButton;
	
//	9) Column Confg:: a)Column Confg b)Statistics Confg c) Apply d) cancel e) Close
	@FindBy (xpath = "//a [@id='configure_column_id']")
	private WebElement ColumnConfg;
	
//	10) Advanced filter :: a) Apply b) Cancel c) close 
	@FindBy (xpath = "//a [@id='filteroptions']")
	private WebElement AdvancedFilter;
	
//	11) Select all Check box 
	@FindBy (xpath = "//input [@id='all_check']")
	private WebElement SelectAllJobs;
	
//	12) Job Req Id sorting
	@FindBy (xpath = "//span [@title='Job Req Id Sorting']")
	private WebElement JobReqSorting;
		
//	13) Job Req Id Column filter 
	@FindBy (xpath = "//i [@title='Job Req Id Filter']")
	private WebElement JobReqColumnFilter;	
	
//	14) Job Req Id column filter search button
	@FindBy (xpath = "(//button [@class='light-button filterSubmit'])[1]")
	private WebElement JobReqColumnFilterSearch;		
	
//	15) Job Title sorting 
	@FindBy (xpath = "//span [@title='Job Title Sorting']")
	private WebElement JobTitleSorting;
	
//	16) Job Title Column filter 
	@FindBy (xpath = "//i [@title='Job Title Filter']")
	private WebElement JobTitleColumnFilter;
	
//	17) Job Title column filter button 
	@FindBy (xpath = "(//button [@class='light-button filterSubmit'])[2]")
	private WebElement JobTitleColumnFilterSearch;
	
//	18) Location (Primary) sorting 
	@FindBy (xpath = "//span [@title='Location (Primary) Sorting']")
	private WebElement JobLocationSorting;
		
//	19) Location (Primary) Column filter 
	@FindBy (xpath = "//i [@title='Location (Primary) Filter']")
	private WebElement JobLocationColumnFilter;
	
//	20) Location (Primary)e column filter button
	@FindBy (xpath = "(//button [@class='light-button filterSubmit'])[4]")
	private WebElement JobLocationColumnFilterSearch;	
	
//	21) Edit Job icon
	@FindBy (xpath = "(( //a [@title='Edit Job'])[1]")
	private WebElement EditJobIcon;
	
//	22) Add interview scheduler
	@FindBy (xpath = "( //a [@title='Add Interview Team'])[1]")
	private WebElement InterviewPanel;
		
//	23) Applications count,  24) Recommendations count
	
	
//	25) Pagination ::
//	a) LastPage
	@FindBy (xpath = "//li [text () = '2']")         // Replace << with page number if want to go on specific page
	private WebElement PaginationLast;	
	
//	b) FirstPage
	@FindBy (xpath = "//li [text () = '3']")         // Replace >> with page number if want to go on specific page
	private WebElement PaginationFirst;	
	
	
//	Constructor for performing actions
	public Rec_JobListPage_POM_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		this.MouseAction = new Actions (driver);
	}
	
	
//	Side Bar WebElements to perform actions
//	1) Side bar
	public void Sidebar()
	{
		Sidebar.click();
	}
	
//	2) Admin Menu:-
	public void Admin()
	{
		MouseAction.moveToElement(Admin).perform();  // Perform mouse hover using Actions
	}
	
//	a)User Creation 
	public void UserCreation()
	{
		UserCreation.click();
	}
	
//	b) Add support recruiter
	public void AddSupportRecruiter()
	{
		AddSupportRecruiter.click();
	}
	
//	c) Equitable hiring   
	public void EquitableHiring()
	{
		EquitableHiring.click();
	}
	
//	d) Bot candidate
	public void BotCandidate()
	{
		BotCandidate.click();
	}
	
//	3)Reports Menu 
	public void Reports()
	{
		MouseAction.moveToElement(Reports).perform();  // Perform mouse hover using Actions
	}
	
//	A}Download reports Menu: DownloadReports
	public void DowloadReports()
	{
		MouseAction.moveToElement(DownloadReports).perform();  // Perform mouse hover using Actions
	}
		
//	a) Recruiter wise activity
	public void RawReport()
	{
		RecruiterWiseActivity.click();
	}
	
//	b) Recommendations summary 
	public void RecommendationsSummary()
	{
		RecommendationsSummary.click();
	}
	
//	c) Hide/Unhide history
	public void HideUnhideHistory()
	{
		HideUnhideHistory.click();
	}
	
//	d) Send mail delivery :-
	public void SendMailDeliveryReport()
	{
		MouseAction.moveToElement(SendMailDeliveryReport).perform();
	}
	
//	i) Success email delivery
	public void SuccessEmailDeliveryReport()
	{
		SuccessEmailDeliveryReport.click();
	}
	
//	ii)Failed email delivery
	public void FailedEmailDeliveryReport()
	{
		FailedEmailDeliveryReport.click();
	}
	
//	e) Bot reports:-
	public void BotReports()
	{
		MouseAction.moveToElement(BotReports).perform();
	}
	
//	i) Chatbot History Report
	public void ChatbotHistoryReport()
	{
		ChatbotHistoryReport.click();
	}
	
//	ii)Interview scheduler Report
	public void InterviewSchedulerReport()
	{
		ChatbotHistoryReport.click();
	}
	
//	B} Dashboard reports:-
	public void DashboardReports()
	{
		DashboardReports.click();
	}
	
//	4) Settings For Click:-
	public void SettingsClick()
	{
		Settings.click();
	}
	
//	4) Settings For MoveCursor:-
	public void SettingsCursorMove()
	{
		MouseAction.moveToElement(Settings).perform();
	}
	
//	a) Job settings 
	public void JobSettings()
	{
		JobSettings.click();
	}
	
//	b) Job wizard settings 
	public void JobWizardSettings()
	{
		JobWizardSettings.click();
	}
	
//	c) LinkedIn enrichment Configuration 
	public void LinkedEnrichmentConfig()
	{
		LinkedEnrichmentConfig.click();
	}
	
//	d) Score representation confg
	public void ScoreRepConfig()
	{
		ScoreRepConfig.click();
	}
	
//	e) Video interview confg
	public void VideoInterviewConfig()
	{
		VideoInterviewConfig.click();
	}
	
//	5) Utilities:-
	public void Utilities()
	{
		MouseAction.moveToElement(Utilities).perform();
	}
		
//	a) Skill upload 
	public void SkillUpload()
	{
		SkillUpload.click();
	}
	
//	b) Skill affinity 
	public void SkillAffinity()
	{
		SkillAffinity.click();
	}
	
//	c) Job refresh 
	public void JobRefresh()
	{
		JobRefresh.click();
	}
	
//	d) Score lock 
	public void ScoreLock()
	{
		ScoreLock.click();
	}
	
//	e) add support recruiter.
	public void AddSupportRecruiterUtility()
	{
		AddSupportRecruiterUtility.click();
	}
	
//	6) RS plus Menu:-
	public void RSPlus()
	{
		MouseAction.moveToElement(RSPlus).perform();
	}
	
//	a) RS plus confg 
	public void RSPlusConfig()
	{
		RSPlusConfig.click();
	}
	
//	b) Rs plus reports 
	public void RSPlusReport()
	{
		RSPlusReport.click();
	}
	
//	c) RS plus candidate 
	public void RSPlusCandidates()
	{
		RSPlusCandidates.click();
	}
	
//	7) Client module: 
	public void ClientModule()
	{
		MouseAction.moveToElement(ClientModule).perform();
	}
	
//	a) Add clients 
	public void AddClient()
	{
		AddClient.click();
	}
	
//	b) Client Summary 
	public void ClientSummary()
	{
		ClientSummary.click();
	}
	
//	c) reports
	public void ReportsClients()
	{
		ReportsClients.click();
	}
	
//	7) Jobs 
	public void JobListPage()
	{
		JobListPage.click();
	}
	
//	8) Candidates //span [text() = 'Candidates']
	public void Candidates()
	{
		Candidates.click();
	}	
	
//	9) Signout
	public void Signout()
	{
		Signout.click();
	}
	
//	----------------------------------------------------------------
	
//	JobList Page WebElements
//	1) All jobs
	public void Alljobs()
	{
		Alljobs.click();
	}
	
//	2) My Jobs
	public void Myjobs()
	{
		Myjobs.click();
	}
	
//	3) Active  
	public void Activejobs()
	{
		Activejobs.click();
	}
	
//	4) Inactive 
	public void Inactivejobs()
	{
		Inactivejobs.click();
	} 
	
//	5) Bulk acion 
	public void BulkAction()
	{
		BulkAction.click();
	} 
	
//	6) Add Job 
	public void AddNewJob()
	{
		AddNewJob.click();
	} 
	
//	7) Item Per Page  
	public void ItemsPerPage()
	{
		ItemsPerPage.click();
	}  
	
//	7.a) Itmes per page dropdown options 
	public void ItemsPerPage25()
	{
		ItemsPerPage25.click();
	} 
	
	
//	8) Reset
	public void ResetButton()
	{
		ResetButton.click();
	}  
	
//	9) Column Confg:: a)Column Confg b)Statistics Confg c) Apply d) cancel e) Close
	public void ColumnConfg()
	{
		ColumnConfg.click();
	} 
	
//	10) Advanced filter :: a) Apply b) Cancel c) close 
	public void AdvancedFilter()
	{
		AdvancedFilter.click();
	} 
	
//	11) Select all Check box 
	public void SelectAllJobs()
	{
		SelectAllJobs.click();
	} 
	
//	12) Job Req Id sorting
	public void JobReqSorting()
	{
		JobReqSorting.click();
	}
		
//	13) Job Req Id Column filter 
	public void JobReqColumnFilter()
	{
		JobReqColumnFilter.click();
	}	
	
//	14) Job Req Id column filter search button
	public void JobReqColumnFilterSearch()
	{
		JobReqColumnFilterSearch.click();
	} 		
	
//	15) Job Title sorting 
	public void JobTitleSorting()
	{
		JobTitleSorting.click();
	}  
	
//	16) Job Title Column filter 
	public void JobTitleColumnFilter()
	{
		JobTitleColumnFilter.click();
	}  
	
//	17) Job Title column filter button 
	public void JobTitleColumnFilterSearch()
	{
		JobTitleColumnFilterSearch.click();
	}  
	
//	18) Location (Primary) sorting 
	public void JobLocationSorting()
	{
		JobLocationSorting.click();
	}  
		
//	19) Location (Primary) Column filter 
	public void JobLocationColumnFilter()
	{
		JobLocationColumnFilter.click();
	} 
	
//	20) Location (Primary)e column filter button
	public void JobLocationColumnFilterSearch()
	{
		JobLocationColumnFilterSearch.click();
	}  	
	
//	21) Edit Job icon
	public void EditJobIcon()
	{
		EditJobIcon.click();
	}   
	
//	22) Add interview scheduler
	public void InterviewPanel()
	{
		InterviewPanel.click();
	}  
		
//	23) Applications count,  24) Recommendations count
	
	
//	25) Pagination ::
//	a) LastPage
	public void PaginationLast()
	{
		PaginationLast.click();
	} 
	
//	b) FirstPage
	public void PaginationFirst()
	{
		PaginationFirst.click();
	} 
	
	
	
}
