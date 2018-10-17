package org.vaadin.enver;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

import java.util.Collections;
import java.util.List;

@Tag("alump-dbar")
@HtmlImport("frontend://bower_components/alump-dbar/alump-dbar.html")
public class DistributionBar extends PolymerTemplate<DistributionBar.AlumpDbar> {

    /*
     * https://www.webcomponents.org/element/alump/alump-dbar/elements/alump-dbar#property-values
     */
    public interface AlumpDbar extends TemplateModel{ // pity it has to be public.
        void setMinPartWidth(Integer minWith);
        void setTexts(List<String> texts);
        void setValues(List<Integer> values);
        void setWidth(int pixels);
        void setWithTitles(boolean titles);
    }

    public DistributionBar(){
        AlumpDbar model = getModel();
        model.setMinPartWidth(40);
        model.setValues(Collections.singletonList(0));
        model.setWithTitles(false);
    }

    public void setMinPartWidth(Integer minWith) {
        getModel().setMinPartWidth(minWith);
    }

    public void setTexts(List<String> texts) {
        getModel().setTexts(texts);
    }

    public void setValues(List<Integer> values) {
        getModel().setValues(values);
    }

    public void setWidth(int pixels) {
        getModel().setWidth(pixels);
    }

    public void setWithTooltips(boolean titles) {
        getModel().setWithTitles(titles);
    }

}
