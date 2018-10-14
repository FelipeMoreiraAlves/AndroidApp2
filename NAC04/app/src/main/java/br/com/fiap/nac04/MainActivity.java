package br.com.fiap.nac04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lst_clientes;
    List<Cliente> clientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst_clientes = findViewById(R.id.lst_clientes);

        clientes = new Banco(this).getAll();

        Cliente_adapter adapter = new Cliente_adapter(this, clientes);

        lst_clientes.setAdapter(adapter);
    }
}
