package onuAttendance.onutiative.com.facedetect.View.PackageViewActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import onuAttendance.onutiative.com.facedetect.R;
import onuAttendance.onutiative.com.facedetect.View.MainActivity;
import onuAttendance.onutiative.com.facedetect.View.PackageCreateAccount.CreateAccount;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        getSupportActionBar().setTitle("Activity");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.menuViewActivity);
        item.setVisible(false);
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
}