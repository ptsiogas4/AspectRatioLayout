package customviews.ptsiogas.library.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.Button;

import customviews.ptsiogas.library.WidgetHelper;

/**
 * Created by Paris on 8/11/2017.
 */
public class RatioButton extends android.support.v7.widget.AppCompatButton {
    private WidgetHelper mWidgetHelper;

    public RatioButton(Context context) {
        super(context);
    }

    public RatioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mWidgetHelper = new WidgetHelper(context, attrs);
    }

    public RatioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

    public float getAspectRation() {
        if (mWidgetHelper != null) {
            return mWidgetHelper.getAspectRatio();
        }
        return 1;
    }

    public void setAspectRation(float mWidthHeightRatio) {
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
