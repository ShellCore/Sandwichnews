package com.shellcore.android.sandwichnews.components;

import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MOGC on 04/12/2017.
 */

public class CompositeImage implements Component {

    private List<Component> components = new ArrayList<>();
    private ImageView imageView;

    public CompositeImage(ImageView imageView, int id) {
        this.imageView = imageView;
        setContent(id);
    }

    @Override
    public void add(Component c) {
        components.add(c);
    }

    @Override
    public void setContent(int id) {
        imageView.setImageResource(id);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);

        for (Component c : components) {
            c.inflate(layout);
        }
    }
}
