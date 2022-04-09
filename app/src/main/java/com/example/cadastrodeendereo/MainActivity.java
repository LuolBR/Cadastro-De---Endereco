package com.example.cadastrodeendereo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_salvar;
    EditText et_nome, et_telefone, et_cep, et_logradouro,
             et_numero, et_complemento, et_bairro,
             et_cidade, et_estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_salvar = findViewById(R.id.btn_salvar);
        et_nome = findViewById(R.id.et_nome);
        et_telefone = findViewById(R.id.et_telefone);
        et_cep = findViewById(R.id.et_cep);
        et_logradouro = findViewById(R.id.et_logradouro);
        et_numero = findViewById(R.id.et_numero);
        et_complemento = findViewById(R.id.et_complemento);
        et_bairro = findViewById(R.id.et_bairro);
        et_cidade = findViewById(R.id.et_cidade);
        et_estado = findViewById(R.id.et_estado);

        Endereco endereco = new Endereco();

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarObrigatorio(et_nome);
                validarObrigatorio(et_telefone);
                validarObrigatorio(et_cep);
                validarObrigatorio(et_logradouro);
                validarObrigatorio(et_numero);

                verificarTelefone(et_telefone.getText().toString());
                verificarLogradouro(et_logradouro.getText().toString());

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

    private void validarObrigatorio(EditText et) {

        if (TextUtils.isEmpty(et.getText().toString())) {
            et.setError("Campo obrigatório");
            et.requestFocus();
        }
    }

    private void verificarTelefone(String s) {
        if (s.length() != 14) {
            et_telefone.setError("Favor inserir 14 carcteres");
            et_telefone.requestFocus();
        }
    }

    private void verificarLogradouro(String s) {
        if (s.length() < 10) {
            et_logradouro.setError("min. 10 carcteres e max. 100 carcteres");
            et_logradouro.requestFocus();
        }
    }
}