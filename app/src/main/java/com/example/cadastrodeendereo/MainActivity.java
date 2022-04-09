package com.example.cadastrodeendereo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_salvar = findViewById(R.id.btn_salvar);
        EditText et_nome = findViewById(R.id.et_nome);
        EditText et_telefone = findViewById(R.id.et_telefone);
        EditText et_cep = findViewById(R.id.et_cep);
        EditText et_logradouro = findViewById(R.id.et_logradouro);
        EditText et_numero = findViewById(R.id.et_numero);
        EditText et_complemento = findViewById(R.id.et_complemento);
        EditText et_bairro = findViewById(R.id.et_bairro);
        EditText et_cidade = findViewById(R.id.et_cidade);
        EditText et_estado = findViewById(R.id.et_estado);

        Endereco endereco = new Endereco();

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endereco.setNome(et_nome.getText().toString());
                endereco.setTelefone(et_telefone.getText().toString());
                endereco.setCep(et_cep.getText().toString());
                endereco.setLogradouro(et_logradouro.getText().toString());
                endereco.setNumero(et_numero.getText().toString());
                endereco.setComplemento(et_complemento.getText().toString());
                endereco.setBairro(et_bairro.getText().toString());
                endereco.setCidade(et_cidade.getText().toString());
                endereco.setEstado(et_estado.getText().toString());

                Log.d("Nome.......: ", endereco.getNome());
                Log.d("Telefone...: ", endereco.getTelefone());
                Log.d("CEP........: ", endereco.getCep());
                Log.d("Logradouro.: ", endereco.getLogradouro());
                Log.d("Número.....: ", endereco.getNumero());
                Log.d("Complemento: ", endereco.getComplemento());
                Log.d("Bairro.....: ", endereco.getBairro());
                Log.d("Cidade.....: ", endereco.getCidade());
                Log.d("Estado.....: ", endereco.getEstado());
            }
        });
    }
}