package com.gee.peter.tinkerdemo;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tinkerpatch.sdk.TinkerPatch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadPatch();

    }

    private void loadPatch() {
        Log.d("peter","loadPatch");
        TinkerPatch.with().fetchPatchUpdate(true);
    }
}
