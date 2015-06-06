package br.com.senac.pi.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashBoardActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstance){
		super.onCreate(savedInstance);
		setContentView(R.layout.dashboard);
	}
	
	public void selecionarOpcao(View view){
		switch (view.getId()) {
		case R.id.novo_gasto:
			startActivity(new Intent(this, GastoActivity.class));
			break;
		case R.id.nova_viagem:
			startActivity(new Intent(this, ViagemActivity.class));
			break;

		default:
			break;
		}
	}
	

}
