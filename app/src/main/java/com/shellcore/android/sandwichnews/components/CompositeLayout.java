package com.shellcore.android.sandwichnews.components;

import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOGC on 04/12/2017.
 */

public class CompositeLayout implements Component {

    private List<Component> components = new ArrayList<>();
    private LinearLayout linearLayout;

    public CompositeLayout(LinearLayout linearLayout, int id) {
        this.linearLayout = linearLayout;
        setContent(id);
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void setContent(int id) {
        linearLayout.setBackgroundResource(id);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(linearLayout);

        for (Component c : components) {
            c.inflate(linearLayout);
        }
    }
}
