package com.shellcore.android.sandwichnews.components;

import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by MOGC on 04/12/2017.
 */

public class ImageLeaf implements Component {

    private ImageView imageView;

    public ImageLeaf(ImageView imageView, int id) {
        this.imageView = imageView;
        setContent(id);
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void setContent(int id) {
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        dp(120)
                )
        );

        imageView.setImageResource(id);
    }

    private int dp(int px) {
        float scale = imageView.getResources()
                .getDisplayMetrics()
                .density;
        return (int) (scale * px + 0.5f);
    }

    @Override
    public void inflate(ViewGroup layout) {
        layout.addView(imageView);
    }
}
