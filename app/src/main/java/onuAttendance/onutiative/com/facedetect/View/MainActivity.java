package onuAttendance.onutiative.com.facedetect.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import onuAttendance.onutiative.com.facedetect.R;
import onuAttendance.onutiative.com.facedetect.View.PackageCreateAccount.CreateAccount;
import onuAttendance.onutiative.com.facedetect.View.PackageEntry.Entry;
import onuAttendance.onutiative.com.facedetect.View.PackageLeave.Leave;
import onuAttendance.onutiative.com.facedetect.View.PackageViewActivity.ViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Home");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.createEmployeeAccount:
                startActivity(new Intent(this, CreateAccount.class));
                return true;
            case R.id.menuViewActivity:
                startActivity(new Intent(this, ViewActivity.class));
                return true;
            case R.id.menuExit:
                startActivity(new Intent(this, MainActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void entry(View view) {
        startActivity(new Intent(this, Entry.class));
    }

    public void leave(View view) {
        startActivity(new Intent(this, Leave.class));
    }
}