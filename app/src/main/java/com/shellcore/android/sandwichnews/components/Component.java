package com.shellcore.android.sandwichnews.components;

import android.view.ViewGroup;

/**
 * Created by MOGC on 04/12/2017.
 */

public interface Component {

    void add(Component c);
    void setContent(int id);
    void inflate(ViewGroup layout);
}
