package com.tt.android.samples.openglflag;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class OpenGLFlagActivity extends Activity {

    private OpenGLFlagSurfaceView surfaceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        surfaceView = (OpenGLFlagSurfaceView) findViewById(R.id.surface_view);
    }

}
