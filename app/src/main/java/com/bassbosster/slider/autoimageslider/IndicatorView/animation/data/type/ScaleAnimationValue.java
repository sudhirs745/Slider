package com.bassbosster.slider.autoimageslider.IndicatorView.animation.data.type;

import com.bassbosster.slider.autoimageslider.IndicatorView.animation.data.Value;
import com.bassbosster.slider.autoimageslider.IndicatorView.animation.data.type.ColorAnimationValue;

public class ScaleAnimationValue extends ColorAnimationValue implements Value {

    private int radius;
    private int radiusReverse;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadiusReverse() {
        return radiusReverse;
    }

    public void setRadiusReverse(int radiusReverse) {
        this.radiusReverse = radiusReverse;
    }
}
