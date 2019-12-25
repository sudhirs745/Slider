package com.bassbosster.slider.autoimageslider.IndicatorView.animation.data.type;

import com.bassbosster.slider.autoimageslider.IndicatorView.animation.data.Value;
import com.bassbosster.slider.autoimageslider.IndicatorView.animation.data.type.WormAnimationValue;

public class ThinWormAnimationValue extends WormAnimationValue implements Value {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
