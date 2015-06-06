package br.com.senac.pi.boaviagem;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class ViagemActivity extends Activity {
	
	private int dia, mes, ano;
	private Button dataChegada, dataSaida; 
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_novaviagem);
		
		Calendar calendar = Calendar.getInstance();
		ano = calendar.get(Calendar.YEAR);
		mes = calendar.get(Calendar.MONTH);
		dia = calendar.get(Calendar.DAY_OF_MONTH);
		
		dataChegada = (Button) findViewById(R.id.dataChegada);
		dataChegada.setText(dia+"/"+(mes+1)+"/"+ano);
		
		dataSaida = (Button) findViewById(R.id.dataSaida);
		dataSaida.setText(dia+"/"+(mes+1)+"/"+ano);
	}
	
	public void selecionarData(View view){
		onCreateDialog(view.getId()).show();
	}
	
	@Override
	protected Dialog onCreateDialog(int id){
		switch (id) {
		case R.id.dataChegada:
			return new DatePickerDialog(this, dataChegadaListener, ano, mes, dia);
		case R.id.dataSaida:
			return new DatePickerDialog(this, dataSaidaListener , ano, mes, dia);
		}
		
		return null;
		
	}
	
	private OnDateSetListener dataChegadaListener = new OnDateSetListener(){
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMont){
			ano = year;
			mes = monthOfYear;
			dia = dayOfMont;
			
			dataChegada.setText(dia+"/"+(mes+1)+"/"+ano);
								
		}
	};

	private OnDateSetListener dataSaidaListener = new OnDateSetListener(){
		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMont){
			ano = year;
			mes = monthOfYear;
			dia = dayOfMont;
			
			dataSaida.setText(dia+"/"+(mes+1)+"/"+ano);
								
		}
	};

}
