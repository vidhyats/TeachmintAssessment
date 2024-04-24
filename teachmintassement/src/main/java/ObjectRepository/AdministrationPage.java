package ObjectRepository;



import org.openqa.selenium.By;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Basepackage.BasePage;


public class AdministrationPage extends BasePage {

	public AdministrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Handle Adminstration Tab

	@FindBy(xpath = "//div[text()='Administration']")
	private WebElement Administration;

	public void clickadmimistration() {
		Administration.click();
	}

	// Handle Certificates

	@FindBy(xpath = "//a[text()='Certificates']")
	private WebElement certificates;

	public void clickcertificates() {
		certificates.click();
	}

	public WebElement getAdministration() {
		return Administration;
	}

	public void setAdministration(WebElement administration) {
		Administration = administration;
	}

	public WebElement getCertificates() {
		return certificates;
	}

	public void setCertificates(WebElement certificates) {
		this.certificates = certificates;
	}

	// Handle popup

	@FindBy(tagName = "releases-panel")
	private WebElement shadowHostElement;

	public WebElement getShadowHostElement() {
		return shadowHostElement;
	}

	public void setShadowHostElement(WebElement shadowHostElement) {
		this.shadowHostElement = shadowHostElement;
	}

	// handle shadow root element

	public void handleShadowRoot() {
		SearchContext shadowRootElement = shadowHostElement.getShadowRoot();
		shadowRootElement.findElement(By.cssSelector("path[d='M6 18L18 6M6 6l12 12']")).click();
	}
	// Handle school certificate

	@FindBy(xpath = "//h6[text()='School leaving certificate']/ancestor::div[@data-qa='plain-card']")
	private WebElement schoolLeavingCertificate;

	public WebElement getSchoolLeavingCertificate() {
		return schoolLeavingCertificate;
	}

	public void setSchoolLeavingCertificate(WebElement schoolLeavingCertificate) {
		this.schoolLeavingCertificate = schoolLeavingCertificate;
	}

	public void clickschoolcertificate() {
		schoolLeavingCertificate.click();
	}

	// Generate School Certificate

	@FindBy(xpath = "//div[text()='Generate']")
	private WebElement generateschoolcertificate;

	public WebElement getGenerateschoolcertificate() {
		return generateschoolcertificate;
	}

	public void setGenerateschoolcertificate(WebElement generateschoolcertificate) {
		this.generateschoolcertificate = generateschoolcertificate;
	}

	public void clickongenerateschoolcertificate() {
		generateschoolcertificate.click();
	}

	// Search By Name

	@FindBy(xpath = "//input[@placeholder='Search by name']")
	private WebElement searchname;

	public WebElement getSearchname() {
		return searchname;
	}

	public void setSearchname(WebElement searchname) {
		this.searchname = searchname;
	}

	public void clicksearchname() {
		searchname.click();
		searchname.sendKeys("sam");
	}

	// Select Student

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement studentselectCheckBox;

	public WebElement getStudentselectCheckBox() {
		return studentselectCheckBox;
	}

	public void setStudentselectCheckBox(WebElement studentselectCheckBox) {
		this.studentselectCheckBox = studentselectCheckBox;
	}

	public void clickoncheckbox() {
		studentselectCheckBox.click();
	}

	// Handle Generate Button

	@FindBy(xpath = "//div[text()='Generate']")
	private WebElement clickongenerateButton;

	public WebElement getClickongenerateButton() {
		return clickongenerateButton;
	}

	public void setClickongenerateButton(WebElement clickongenerateButton) {
		this.clickongenerateButton = clickongenerateButton;
	}

	public void ClickonGenerateTab() {

		clickongenerateButton.click();
	}

	// Enter in Remarks field

	@FindBy(xpath = "//input[@placeholder='Remarks']")
	private WebElement remarkstextfield;

	public WebElement getRemarkstextfield() {
		return remarkstextfield;
	}

	public void setRemarkstextfield(WebElement remarkstextfield) {
		this.remarkstextfield = remarkstextfield;
	}

	public void clickonremarks() throws InterruptedException {

		Thread.sleep(2000);
		getRemarkstextfield().click();

		remarkstextfield.sendKeys("Good");
	}

	@FindBy(xpath = "//span[text()='Show changes in preview']")
	private WebElement previewCertificateButton;

	public WebElement getPreviewCertificateButton() {
		return previewCertificateButton;
	}

	public void setPreviewCertificateButton(WebElement previewCertificateButton) {
		this.previewCertificateButton = previewCertificateButton;
	}

}