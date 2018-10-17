package org.vaadin.enver;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        DistributionBar dBar = new DistributionBar();
        dBar.setMinPartWidth(1);
        dBar.setValues(Arrays.asList(21,43,11,57,55,100,3));
        dBar.setTexts(Arrays.asList("", "* Test *", "", "", "", "", ""));
        dBar.setWidth(600);
        dBar.setWithTooltips(true);
        add(dBar);
    }
}
