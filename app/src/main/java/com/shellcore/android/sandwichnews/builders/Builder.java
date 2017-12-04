package com.shellcore.android.sandwichnews.builders;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shellcore.android.sandwichnews.R;
import com.shellcore.android.sandwichnews.components.Component;
import com.shellcore.android.sandwichnews.components.CompositeImage;
import com.shellcore.android.sandwichnews.components.CompositeLayout;
import com.shellcore.android.sandwichnews.components.CompositeShell;
import com.shellcore.android.sandwichnews.components.ImageLeaf;
import com.shellcore.android.sandwichnews.components.TextLeaf;

/**
 * Created by MOGC on 04/12/2017.
 */

public class Builder {

    private Context context;

    public Component header;
    public Component headline;


    public Builder(Context context) {
        this.context = context;
        init();
    }

    public Component headerGroup() {
        Component c = new CompositeImage(new ImageView(context), R.drawable.sandwich);
        c.add(headline);
        return c;
    }

    public TextLeaf setText(int t) {
        TextLeaf leaf = new TextLeaf(new TextView(context), t);
        return leaf;
    }

    public ImageLeaf setImage(int i) {
        ImageLeaf leaf = new ImageLeaf(new ImageView(context), i);
        return leaf;
    }

    public Component sandwichArray() {
        Component c = new CompositeShell();
        c.add(setImage(R.drawable.sandwich_01));
        c.add(setImage(R.drawable.sandwich_02));
        c.add(setImage(R.drawable.sandwich_03));

        return c;
    }

    public Component sandwichLayout() {
        Component c = new CompositeLayout(new LinearLayout(context), R.color.colorAccent);
        c.add(sandwichArray());
        return c;
    }

    public Component storyLine() {
        Component c = new CompositeImage(new ImageView(context), R.drawable.sandwich_01);
        c.add(setText(R.string.welcome));
        return c;
    }

    private void init() {
        header = new ImageLeaf(new ImageView(context), R.drawable.sandwich);
        headline = new TextLeaf(new TextView(context), R.string.headline);
    }
}
