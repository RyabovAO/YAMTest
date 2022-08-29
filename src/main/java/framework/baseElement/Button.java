package framework.baseElement;

public class Button extends BaseElement {

    public void clickButton(String xpath) {
        waitElement((xpath)).click();
    }
}
