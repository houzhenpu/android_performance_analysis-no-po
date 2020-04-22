package com.didichuxing.doraemondemo;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.baidu.location.LocationClient;

import androidx.appcompat.app.AppCompatActivity;


public class MainReleaseActivity extends AppCompatActivity {
    public static final String TAG = "MainReleaseActivity";


    private LocationManager mLocationManager;
    LocationClient mBaiduLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView tvEnv = findViewById(R.id.tv_env);
        tvEnv.setText("当前编译环境:Release");
    }


    private void test1() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test2();
    }

    private void test2() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test3();
    }

    private void test3() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test4();
    }


    private void test4() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private LocationListener mLocationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            if (location != null) {
                String string = "lat====>" + location.getLatitude() + "  lng====>" + location.getLongitude();
                Log.i(TAG, "系统定位====>" + string);

            }
        }

        @Override
        public void onProviderDisabled(String arg0) {
        }

        @Override
        public void onProviderEnabled(String arg0) {
        }

        @Override
        public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
        }
    };

    /**
     * 启动普通定位
     */
    @SuppressLint("MissingPermission")
    public void startNormaLocation() {

        mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, mLocationListener);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }
}
