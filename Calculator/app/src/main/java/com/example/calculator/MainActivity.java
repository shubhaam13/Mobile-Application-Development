import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;public class MainActivity extends AppCompatActivity {
 EditText e1,e2;
 TextView tv1;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 e1 = (EditText)findViewById(R.id.editText1);
 e2 = (EditText)findViewById(R.id.editText2);
 tv1 = (TextView)findViewById(R.id.textView1);
 }
 public void doAdd(View V){
 int a1 = Integer.parseInt(e1.getText().toString());
 int a2 = Integer.parseInt(e2.getText().toString());
 int result= a1+a2;
 tv1.setText(""+result);
 }
 public void doSub(View V){
 int a1 = Integer.parseInt(e1.getText().toString());
 int a2 = Integer.parseInt(e2.getText().toString());
 int result= a1-a2;
 tv1.setText(""+result);
 }
 public void doMul(View V){
 int a1 = Integer.parseInt(e1.getText().toString());
 int a2 = Integer.parseInt(e2.getText().toString());
 int result= a1*a2;
 tv1.setText(""+result);
 }
 public void doDiv(View V){
 int a1 = Integer.parseInt(e1.getText().toString());
 int a2 = Integer.parseInt(e2.getText().toString());
 float result= a1/a2;
 tv1.setText(""+result);
 }
}
