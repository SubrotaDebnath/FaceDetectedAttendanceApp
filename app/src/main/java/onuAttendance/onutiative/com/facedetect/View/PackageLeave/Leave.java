package onuAttendance.onutiative.com.facedetect.View.PackageLeave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import onuAttendance.onutiative.com.facedetect.R;

public class Leave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);

        getSupportActionBar().hide();
    }
}