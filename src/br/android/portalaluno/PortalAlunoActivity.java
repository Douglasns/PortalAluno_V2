package br.android.portalaluno;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.app.*;

public class PortalAlunoActivity extends Activity {
	public void CarregaTelaPrincipal() {
		setContentView(R.layout.main);
		Button btentrar = (Button) findViewById(R.id.btentrar);
		btentrar.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arg0) {
				CarregaPrincipal();
			}
		});
	}
	public void CarregaPrincipal() {
		setContentView(R.layout.principal);

		//Boletim
		ImageView imgboletim = (ImageView)findViewById (R.id.imgboletim);
		imgboletim.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arq0) {
				CarregaBoletim();
			}
		});

		//consulta
		ImageView imgconsulta = (ImageView)findViewById (R.id.imgconsulta);
		imgconsulta.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arq0) {
				CarregaConsulta();

			}
		});	
		
		//notificações
		ImageView imgnotificacoes = (ImageView)findViewById (R.id.imgnotificacoes);
		imgnotificacoes.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arq0) {
				CarregaNotificacoes();

			}
		});	
		//solicitacoes
		ImageView imgsolicitacoes = (ImageView)findViewById (R.id.imgsolicitacoes);
		imgsolicitacoes.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arq0) {
				CarregaSolicitacoes();

			}
		});

	}



	//Boletim
	public void CarregaBoletim(){
		setContentView(R.layout.boletim);

		Button btnVoltarBoletim = (Button) findViewById(R.id.btnVoltarBoletim);
		btnVoltarBoletim.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaPrincipal();

			}
		});
	}	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CarregaTelaPrincipal();}
	//notificacoes	
	public void CarregaNotificacoes(){

		setContentView(R.layout.notificacoes);
		
		Button btnVoltarNotificacoes = (Button) findViewById(R.id.btnVoltarNotificacoes);
		btnVoltarNotificacoes.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaPrincipal();

			}
		});
	}
	
	
	
	private static final String[] Solicitar = {"Solicitar:A", "Solicitar:B","Solicitar:C"};
	ArrayAdapter<String> aSolicitar;
	Spinner spnsolicitar;
	
	//solicitação_A
	public void CarregaSolicitacaoA(){  
		setContentView(R.layout.solicitacoes_a);
		
		Button btnVoltarA = (Button) findViewById(R.id.btnVoltarA);
		btnVoltarA.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaSolicitacoes();

			}
		});
	}
	
	//Solicitação_B
	public void CarregaSolicitacaoB(){  
		setContentView(R.layout.solicitacoes_b);
		
		Button btnVoltarB = (Button) findViewById(R.id.btnVoltarB);
		btnVoltarB.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaSolicitacoes();

			}
		});
	}
	
	//Solicitação_C
	public void CarregaSolicitacaoC(){  
		setContentView(R.layout.solicitacoes_c);
		
		Button btnVoltarC = (Button) findViewById(R.id.btnVoltarC);
		btnVoltarC.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaSolicitacoes();

			}
		});
	}
	
	//solicitações	
	public void CarregaSolicitacoes(){
		setContentView(R.layout.solicitacoes);
		
		Button btnsolicitar = (Button) findViewById(R.id.btnsolicitar);
		
			aSolicitar = new
			ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, Solicitar);
			spnsolicitar = (Spinner) findViewById(R.id.spnOpcoesSolicitacao);
			spnsolicitar.setAdapter(aSolicitar);
		
			btnsolicitar.setOnClickListener(new View.OnClickListener(){
				public void onClick(View arg0) {
				
					switch(spnsolicitar.getSelectedItemPosition()) {
					case 0: CarregaSolicitacaoA(); break;
					case 1: CarregaSolicitacaoB(); break;
					case 2: CarregaSolicitacaoC(); break; 
					}
		
				}
			});
		
		
		
		Button btvoltar_solicitacoes = (Button) findViewById(R.id.btvoltar_solicitacoes);
		btvoltar_solicitacoes.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaPrincipal();

			}
		});
	}

	
	public void ConsultaApoio(){  
		setContentView(R.layout.consultas_apoio);
		
		Button btnVoltarApoio = (Button) findViewById(R.id.btnVoltarApoio);
		btnVoltarApoio.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaConsulta();

			}
		});
	}	

	
	public void ConsultaStatus(){  
		setContentView(R.layout.consultas_apoio);
		
		Button btnVoltarStatus = (Button) findViewById(R.id.btnVoltarStatus);
		btnVoltarStatus.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaConsulta();

			}
		});
	}	
	
	public void ConsultaSala(){  
		setContentView(R.layout.consultas_apoio);
		
		Button btnVoltarSala = (Button) findViewById(R.id.btnVoltarSala);
		btnVoltarSala.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaConsulta();

			}
		});
	}	
	
	
	//consulta
	//Tela de consulta utilizando Spinner
	private static final String[] consulta = {"Material de Apoio", "Status de pedidos","Consultar sala"};
		ArrayAdapter<String> aConsultar;
		Spinner spnconsultar;
		
	public void CarregaConsulta(){
		setContentView(R.layout.consultas);
		
		Button btconsultar = (Button) findViewById(R.id.btconsultar);
		
		aConsultar = new
				ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, consulta);
		spnconsultar = (Spinner) findViewById(R.id.spopcoes);
		spnconsultar.setAdapter(aConsultar);
		
		btconsultar.setOnClickListener(new View.OnClickListener(){
			public void onClick(View arg0) {
				
			switch(spnconsultar.getSelectedItemPosition()) {
			case 0: ConsultaApoio(); break;
			case 1: ConsultaStatus(); break;
			case 2: ConsultaSala(); break; }
		
			}
		});
		Button btvoltar_consulta = (Button) findViewById(R.id.btvoltar_consulta);
		btvoltar_consulta.setOnClickListener(new View.OnClickListener(){

			public void onClick(View arq0) {
				CarregaPrincipal();

				}
		
			
		});	
		
		}


}