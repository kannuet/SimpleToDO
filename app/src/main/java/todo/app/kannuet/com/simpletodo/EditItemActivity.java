package todo.app.kannuet.com.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    private String previousItem;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        previousItem = getIntent().getStringExtra("item");
        position = getIntent().getIntExtra("position", 0);
        EditText editItem = (EditText) findViewById(R.id.etUpdateItem);
        editItem.setText(previousItem);
    }


    public void onSave (View view){
        EditText etUpdateItem = (EditText) findViewById(R.id.etUpdateItem);
        Intent data = new Intent();
        data.putExtra("position", position);
        data.putExtra("updateItem", etUpdateItem.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }


}
