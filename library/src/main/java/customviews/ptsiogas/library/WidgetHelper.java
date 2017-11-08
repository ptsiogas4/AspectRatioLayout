package customviews.ptsiogas.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;

import customviews.ptsiogas.aspectRatioLayout.R;

/**
 * Created by Paris on 8/11/2017.
 */

public class WidgetHelper {
    public static final float DEFAULT_RATIO_VALUE = -1f;
    private float mAspectRatio = DEFAULT_RATIO_VALUE;
    private RatioType mRatioType = RatioType.BY_WIDTH;

    public WidgetHelper(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.RatioViewAttrs,
                    0, 0);
            try {
                mAspectRatio = a.getFloat(R.styleable.RatioViewAttrs_aspectRatio, -1f);
                mRatioType = RatioType.valueOf(a.getInt(R.styleable.RatioViewAttrs_ratioType, 0));
            } finally {
                a.recycle();
            }
        }
    }

    public Pair<Integer, Integer> getProperDimensions(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<Integer, Integer> res;
        if (mAspectRatio < 0) {
            res = new Pair<>(widthMeasureSpec, heightMeasureSpec);
        } else {
            if (mRatioType == RatioType.BY_WIDTH) {
                final int width = View.MeasureSpec.getSize(widthMeasureSpec);
                final int height = Math.round(getAspectRatio() * width);
                res = new Pair<>(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, View.MeasureSpec.EXACTLY));
            } else {
                final int height = View.MeasureSpec.getSize(heightMeasureSpec);
                final int width = Math.round(getAspectRatio() * height);
                res = new Pair<>(View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY), heightMeasureSpec);
            }
        }
        return res;
    }

    public float getAspectRatio() {
        return mAspectRatio;
    }

    public void setAspectRatio(float mWidthHeightRatio) {
        this.mAspectRatio = mWidthHeightRatio;
    }
}
