package PageObjects;

public class StartPage extends Form{

    private final static String CATALOG_BUTTON = "//*[@id = 'catalogPopupButton']";
    public CatalogForm catalogForm = new CatalogForm();
    public ComputerForm computerForm = new ComputerForm();

    public void openCatalog() {
        button.clickButton(CATALOG_BUTTON);
    }

    public boolean startPageIsOpen() {
        return button.elementIsVisible(CATALOG_BUTTON);
    }
}
