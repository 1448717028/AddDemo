package meitu.activity;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

/**
 * @author zhw QQ:1448717028
 * @version 1.0
 * @date 2019/4/2
 */
public class MyAutText extends AppCompatAutoCompleteTextView {
    public MyAutText(Context context) {
        super(context);
    }

    public MyAutText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyAutText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean enoughToFilter() {

        return getText().toString().contains("@")&&getText().toString().indexOf(0)>0;
    }
}
