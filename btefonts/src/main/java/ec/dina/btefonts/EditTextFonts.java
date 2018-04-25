package ec.dina.btefonts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by darwinmorocho on 17/3/18.
 */

@SuppressLint("AppCompatCustomView")
public class EditTextFonts extends EditText {
    private int pos;


    public EditTextFonts(Context context) {
        super(context);
    }

    public EditTextFonts(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TextViewFonts, 0, 0);
        pos = a.getInt(R.styleable.TextViewFonts_dm_font, 63);
        a.recycle();
        init();
    }


    public void init() {

        String[] fonts = getResources().getStringArray(R.array.fonts);
        String font = fonts[pos];
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + font);
        setTypeface(tf, 1);
    }
}
