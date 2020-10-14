package onuAttendance.onutiative.com.facedetect.View.PackageCreateAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import onuAttendance.onutiative.com.facedetect.R;
import onuAttendance.onutiative.com.facedetect.View.MainActivity;
import onuAttendance.onutiative.com.facedetect.View.PackageViewActivity.ViewActivity;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        getSupportActionBar().setTitle("Create Account");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.createEmployeeAccount);
        item.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.createEmployeeAccount:
                item.setVisible(false);
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