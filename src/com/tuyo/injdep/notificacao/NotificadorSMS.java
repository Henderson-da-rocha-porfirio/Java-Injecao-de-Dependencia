package com.tuyo.injdep.notificacao;

import com.tuyo.injdep.modelo.Cliente;

/*Classe implementa a interface Notificador*//**/
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
