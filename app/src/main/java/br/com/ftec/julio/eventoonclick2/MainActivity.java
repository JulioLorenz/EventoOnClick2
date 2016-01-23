package br.com.ftec.julio.eventoonclick2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private static final String TAG = "FTEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao1 = (Button) findViewById(R.id.btnBotao1);
        botao1.setOnClickListener(this);

        Button botao2 = (Button) findViewById(R.id.btnBotao2);
        botao2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId() == R.id.btnBotao1){
            Log.d(TAG,"Clicou no botão 1");
        } else if (view.getId() == R.id.btnBotao2){
            Log.d(TAG,"Clicou no botão 2");
        }
    }
}
