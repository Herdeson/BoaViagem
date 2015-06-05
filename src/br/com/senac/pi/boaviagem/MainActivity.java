package br.com.senac.pi.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText usuario, senha;
	private String errorLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.usuario = (EditText) findViewById(R.id.usuario);
		this.senha = (EditText) findViewById(R.id.senha);
		
	}
	
	public void login(View v){
		String usuarioInformado = this.usuario.getText().toString();
		String senhaInformada = this.senha.getText().toString();
		this.errorLogin = getString(R.string.erro_login);
		
		if ("aluno".equals(usuarioInformado) && "123".equals(senhaInformada)){
			startActivity(new Intent(this, DashBoardActivity.class));
		} else{
			Toast.makeText(this, this.errorLogin, Toast.LENGTH_LONG).show();
		}
		
	}


}
