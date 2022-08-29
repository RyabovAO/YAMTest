package PageObjects;

import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

public class NotebookPage extends Form {

    private final static String SHOW_ALL_BRAND_BUTTON =
            "//*[contains(@data-filter-id, '7893318')]//*[contains(@class, '_2Pukk')]";
    private final static String BRAND_FIELD =
            "//*[contains(@class, '_31fu1')]//*[contains(text(), 'Найти производителя')]//following-sibling::input";
    private final static String BRAND_NAME = "Lenovo";
    private final static String BRAND_CHECKBOX =
            "//*[contains(@data-filter-value-id, '152981')]//*[contains(@class, '_2XaWK')]";
    private final static String MIN_PRICE_FIELD =
            "//*[contains(@data-filter-id, 'glprice')]//*[contains(text(), 'от')]//following-sibling::input";
    private final static String MAX_PRICE_FIELD =
            "//*[contains(@data-filter-id, 'glprice')]//*[contains(text(), 'до')]//following-sibling::input";
    private final static String BRAND_NAME_LOCATOR = "//*[contains(@data-tid, '2e5bde87')]";
    private final static String PRICE_LOCATOR =
            "//*[contains(@class, '_3NaXx _33ZFz _2m5MZ')]//*[contains(@data-auto, 'mainPrice')]" +
                    "//*[not(contains(@class, '-B-PA'))]";
    private final static String MIN_PRICE = "25000";
    private final static String MAX_PRICE = "30000";
    private final static String NOTEBOOK_PAGE_LOCATOR = "//*[contains(@class, '_1c3hh _36SPc _1TjXe')]";

    public void chooseBrand() {
        button.clickButton(SHOW_ALL_BRAND_BUTTON);
        field.waitElement(BRAND_NAME_LOCATOR);
        field.inputChars(BRAND_FIELD, BRAND_NAME);
        button.clickButton(BRAND_CHECKBOX);
    }

    public void setPrice() {
        field.inputChars(MIN_PRICE_FIELD, MIN_PRICE);
        field.inputChars(MAX_PRICE_FIELD, MAX_PRICE);
    }

    public boolean nameIsCorrect() {
        boolean result = false;
        List<WebElement> elementList = label.findElements(BRAND_NAME_LOCATOR);
        List<String> brandList = elementList.stream().map(WebElement::getText).collect(Collectors.toList());
        for (String name : brandList) {
            if (name.contains(BRAND_NAME)) {
                result = true;
            }
        }
        return result;
    }

    public boolean priceIsCorrect() {
        boolean result = false;
        List<WebElement> elementList = label.findElements(PRICE_LOCATOR);
        List<String> priceList = elementList.stream().map(WebElement::getText).collect(Collectors.toList());
        for (String price : priceList) {
            int x = Integer.parseInt(price.replaceAll("\\s", ""));
            result = x >= Integer.parseInt(MIN_PRICE) && x <= Integer.parseInt(MAX_PRICE);
        }
        return result;
    }

    public boolean notebookPageIsOpen() {
        return label.elementIsVisible(NOTEBOOK_PAGE_LOCATOR);
    }
}
