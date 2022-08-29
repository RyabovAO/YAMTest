package framework.baseElement;

public class Field extends BaseElement {

    public void inputChars(String xPath, Object obj) {
        findByXpath(xPath).sendKeys((CharSequence) obj);
    }
}
