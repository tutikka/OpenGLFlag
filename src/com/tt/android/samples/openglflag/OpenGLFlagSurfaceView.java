package com.tt.android.samples.openglflag;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class OpenGLFlagSurfaceView extends GLSurfaceView {

    private OpenGLFlagRenderer renderer;

    public OpenGLFlagSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        renderer = new OpenGLFlagRenderer(context);
        setRenderer(renderer);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            renderer.togglePause();
            return (true);
        } else {
            return (false);
        }
    }

}
