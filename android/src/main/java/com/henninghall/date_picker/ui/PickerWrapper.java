package com.henninghall.date_picker.ui;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.String;

import com.henninghall.date_picker.R;

class PickerWrapper {
    private final LinearLayout view;

    PickerWrapper(View rootView) {
        view = (LinearLayout) rootView.findViewById(R.id.pickerWrapper);
        view.setWillNotDraw(false);
    }

    void addPicker(View wheel) { view.addView(wheel); }

    void addPicker(View wheel, int index) { view.addView(wheel,index); }

    void addText(String text) {
        TextView tv = new TextView(view.getContext());
        tv.setText(text);
        view.addView(tv);
    }

    void removeAll() {
        view.removeAllViews();
    }
}
