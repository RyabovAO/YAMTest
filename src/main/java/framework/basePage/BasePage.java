package framework.basePage;

import framework.baseElement.Button;
import framework.baseElement.Field;
import framework.baseElement.Label;

public abstract class BasePage {

    public Button button = new Button();
    protected Field field = new Field();
    protected Label label = new Label();
}
