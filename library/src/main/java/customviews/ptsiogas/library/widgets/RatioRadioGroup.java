package customviews.ptsiogas.library.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.RadioGroup;

import customviews.ptsiogas.library.WidgetHelper;

/**
 * Created by Paris on 8/11/2017.
 */
public class RatioRadioGroup extends RadioGroup {
    private WidgetHelper mWidgetHelper;

    public RatioRadioGroup(Context context) {
        super(context);
    }

    public RatioRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        mWidgetHelper = new WidgetHelper(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (mWidgetHelper != null) {
            Pair<Integer, Integer> dimensions = mWidgetHelper.getProperDimensions(widthMeasureSpec, heightMeasureSpec);
            widthMeasureSpec = dimensions.first;
            heightMeasureSpec = dimensions.second;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public float getAspectRatio() {
        if (mWidgetHelper != null) {
            return mWidgetHelper.getAspectRatio();
        }
        return 1;
    }

    public void setAspectRatio(float mWidthHeightRatio) {
        if (mWidgetHelper != null) {
            mWidgetHelper.setAspectRatio(mWidthHeightRatio);
            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = Math.round(mWidgetHelper.getAspectRatio() * params.width);
            setLayoutParams(params);
        } else {
            Log.d("setAspectRatio", "You should set an aspectRatio in your .xml file!");
        }
        return;
    }
}
