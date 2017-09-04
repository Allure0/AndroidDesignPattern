package com.allure.designPattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allure on 2017/9/1.
 */

public class SafeComposite implements SafeComponent {

    private String name;

    private List<SafeComponent> safeComponents = new ArrayList<>();

    public SafeComposite(String name) {
        this.name = name;
    }

    @Override
    public void println(String space) {
        System.out.println(space + '+' + this.name);

        if (this.safeComponents != null) {
            space += "  ";

            for (SafeComponent component : safeComponents) {
                component.println(space);
            }
        }


    }

    public void addChild(SafeComponent safeComponent) {
        safeComponents.add(safeComponent);
    }

    public void removeChild(SafeComponent safeComponent) {
        safeComponents.remove(safeComponent);
    }

    public void clear() {
        safeComponents.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SafeComponent> getSafeComponents() {
        return safeComponents;
    }

    public void setSafeComponents(List<SafeComponent> safeComponents) {
        this.safeComponents = safeComponents;
    }
}
