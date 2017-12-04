package com.shellcore.android.sandwichnews.components;

import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOGC on 04/12/2017.
 */

public class CompositeShell implements Component {

    List<Component> components = new ArrayList<>();

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void setContent(int id) {

    }

    @Override
    public void inflate(ViewGroup layout) {
        for (Component c : components) {
            c.inflate(layout);
        }
    }
}
