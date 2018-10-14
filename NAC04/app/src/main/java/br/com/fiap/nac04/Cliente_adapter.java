package br.com.fiap.nac04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Cliente_adapter extends BaseAdapter {

    Context context;
    List<Cliente> clientes;

    public Cliente_adapter(Context context, List<Cliente> clientes) {
        this.context = context;
        this.clientes = clientes;
    }

    @Override
    public int getCount() {
        return this.clientes.size();
    }

    @Override
    public Object getItem(int i) {
        return this.clientes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Cliente cliente = this.clientes.get(position);

        View v = layoutInflater.inflate(R.layout.listview, null);

        TextView txt_nome = v.findViewById(R.id.txt_nome);
        TextView txt_telefone = v.findViewById(R.id.txt_telefone);
        TextView txt_email = v.findViewById(R.id.txt_email);

        txt_nome.setText(cliente.getNome());
        txt_telefone.setText(cliente.getTelefone());
        txt_email.setText(cliente.getEmail());

        return v;
    }
}
