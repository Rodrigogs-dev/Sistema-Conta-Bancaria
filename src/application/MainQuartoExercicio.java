package application;

import java.time.LocalDate;

import cliente.Cliente;
import cliente.TipoCliente;
import conta.ContaBancaria;
import conta.ContaCorrente;
import conta.ContaEmpresarial;
import conta.ContaPoupanca;
import servicos.MonthlyInvestment;

public class MainQuartoExercicio {

	static int contadorArray;

	static ContaBancaria[] bancarias = new ContaBancaria[20];

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Rodrigo", "111.111.111-11", "500", TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente2 = new Cliente("Jos�", "222.222.222-22", "300", TipoCliente.PESSOA_FISICA);
		Cliente cliente3 = new Cliente("Julio Cesar", "333.333.333-33", "600", TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente4 = new Cliente("Valentina", "444.444.444-44", "900", TipoCliente.FUNCIONARIO_BANCO);
		Cliente cliente5 = new Cliente("Breno", "555.555.555-55", "750", TipoCliente.PESSOA_FISICA);
		Cliente cliente6 = new Cliente("Caio", "666.666.666-66", "537", TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente7 = new Cliente("Florisvaldo", "777.777.777-77", "495", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente8 = new Cliente("Augusto", "888.888.888-88", "237", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente9 = new Cliente("Vanessa", "999.999.999-99", "623", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente10 = new Cliente("Rodrigo", "111.111.111-11", "500", TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente11 = new Cliente("Francisco", "111.111.111-12", "685", TipoCliente.FUNCIONARIO_BANCO);
		Cliente cliente12 = new Cliente("Paulo", "111.111.111-13", "323", TipoCliente.PESSOA_FISICA);
		Cliente cliente13 = new Cliente("Raimundo", "111.111.111-14", "143", TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente14 = new Cliente("Josefa", "111.111.111-15", "268", TipoCliente.FUNCIONARIO_BANCO);
		Cliente cliente15 = new Cliente("Joaquim", "111.111.111-16", "482", TipoCliente.PESSOA_FISICA);
		Cliente cliente16 = new Cliente("S�nia", "111.111.111-17", "198", TipoCliente.FUNCIONARIO_BANCO);
		Cliente cliente17 = new Cliente("Benedito", "111.111.111-18", "851", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente18 = new Cliente("Rita", "111.111.111-19", "533", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente19 = new Cliente("Manoel", "111.111.111-20", "754", TipoCliente.PESSOA_JURIDICA);
		Cliente cliente20 = new Cliente("M�rcia", "111.111.111-21", "621", TipoCliente.PESSOA_JURIDICA);

		// Instanciando objetos do tipo Conta Corrente
		ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, "Ita�", "341", "11111", "1111", 1000.00,
				LocalDate.parse("2008-02-07"), LocalDate.parse("2017-03-08"), "Mudan�a de Institui��o Banc�ria",
				new MonthlyInvestment(), 5, 4);
		ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, "Santander", "033", "22222", "2222", 500.00,
				LocalDate.parse("2015-04-08"), null, null, new MonthlyInvestment(), 10, 8);
		ContaCorrente contaCorrente3 = new ContaCorrente(cliente3, "Original", "212", "33333", "3333", 1700.00,
				LocalDate.parse("2013-02-09"), null, null, new MonthlyInvestment(), 4, 3);
		ContaCorrente contaCorrente4 = new ContaCorrente(cliente10, "Cooperativo Sicredi S.A.", "748", "11111", "1111",
				74.00, LocalDate.parse("2012-09-20"), null, null, new MonthlyInvestment(), 6, 2);
		ContaCorrente contaCorrente5 = new ContaCorrente(cliente11, "Agibank S.A.", "121", "12347", "5206", 864.00,
				LocalDate.parse("2006-01-30"), null, null, new MonthlyInvestment(), 3, 3);
		ContaCorrente contaCorrente6 = new ContaCorrente(cliente12, "BMG S.A.", "318", "11111", "1111", 5327.65,
				LocalDate.parse("2001-12-24"), LocalDate.parse("2010-05-22"), "Mudan�a de Institui��o Banc�ria",
				new MonthlyInvestment(), 10, 7);
		ContaCorrente contaCorrente7 = new ContaCorrente(cliente13, "Cargill S.A", "040", "32687", "3685", 3561.96,
				LocalDate.parse("2012-01-02"), null, null, new MonthlyInvestment(), 6, 4);

		// Instanciando objetos do tipo Conta Corrente
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente4, "Banco do Brasil", "756", "44444", "4444", 3400.00,
				LocalDate.parse("2002-09-30"), null, null, new MonthlyInvestment(), 150, 135, 1);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente5, "Votorantim", "655", "55555", "5555", 1238.75,
				LocalDate.parse("2017-09-12"), null, null, new MonthlyInvestment(), 300, 200, 2);
		ContaPoupanca contaPoupanca3 = new ContaPoupanca(cliente6, "Bradesco S.A", "237", "66666", "6666", 357.79,
				LocalDate.parse("2016-12-01"), null, null, new MonthlyInvestment(), 127, 50, 3);
		ContaPoupanca contaPoupanca4 = new ContaPoupanca(cliente14, "Ita�", "341", "11111", "1111", 1000.00,
				LocalDate.parse("2015-05-02"), LocalDate.parse("2018-02-11"), "Falecimento", new MonthlyInvestment(),
				300, 75, 4);
		ContaPoupanca contaPoupanca5 = new ContaPoupanca(cliente15, "Citibank S.A.", "745", "83647", "2196", 7462.99,
				LocalDate.parse("2012-11-12"), null, null, new MonthlyInvestment(), 247, 400, 2);
		ContaPoupanca contaPoupanca6 = new ContaPoupanca(cliente16, "Daycoval S.A.", "707", "85324", "3695", 2534.50,
				LocalDate.parse("2014-01-12"), null, null, new MonthlyInvestment(), 500, 1000, 6);

		// Instanciando objetos do tipo Conta Empresarial
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial(cliente7, "Inter S.A", "077", "77777", "7777",
				1103.03, LocalDate.parse("2010-11-28"), null, null, new MonthlyInvestment(), "Ambev");
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial(cliente8, "Caixa Econ�mica Federal", "104", "88888",
				"8888", 135.01, LocalDate.parse("2013-05-22"), null, null, new MonthlyInvestment(), "JBS");
		ContaEmpresarial contaEmpresarial3 = new ContaEmpresarial(cliente9, "Banco Safra S.A", "422", "99999", "9999",
				4922.01, LocalDate.parse("2007-08-17"), null, null, new MonthlyInvestment(), "TAM");
		ContaEmpresarial contaEmpresarial4 = new ContaEmpresarial(cliente17, "Smartbank S.A.", "630", "86254", "6358",
				9838.22, LocalDate.parse("2017-05-28"), null, null, new MonthlyInvestment(), "P�o de A��car");
		ContaEmpresarial contaEmpresarial5 = new ContaEmpresarial(cliente18, "Western Union do Brasil S.A.", "119",
				"83265", "1865", 15025.72, LocalDate.parse("2020-01-13"), null, null, new MonthlyInvestment(),
				"Microsoft");
		ContaEmpresarial contaEmpresarial6 = new ContaEmpresarial(cliente19, "Xp S/A", "348", "36825", "9352", 7563.81,
				LocalDate.parse("2018-07-22"), null, null, new MonthlyInvestment(), "Sabesp");
		ContaEmpresarial contaEmpresarial7 = new ContaEmpresarial(cliente20, "Magliano S.A", "113", "23856", "7562",
				6352.76, LocalDate.parse("2019-06-17"), LocalDate.parse("2018-02-11"), "Fal�ncia da Empresa",
				new MonthlyInvestment(), "Nextel");

		adicionarElementosNoArrayConta(contaCorrente1);
		adicionarElementosNoArrayConta(contaCorrente2);
		adicionarElementosNoArrayConta(contaCorrente3);
		adicionarElementosNoArrayConta(contaCorrente4);
		adicionarElementosNoArrayConta(contaCorrente5);
		adicionarElementosNoArrayConta(contaCorrente6);
		adicionarElementosNoArrayConta(contaCorrente7);
		adicionarElementosNoArrayConta(contaPoupanca1);
		adicionarElementosNoArrayConta(contaPoupanca2);
		adicionarElementosNoArrayConta(contaPoupanca3);
		adicionarElementosNoArrayConta(contaPoupanca4);
		adicionarElementosNoArrayConta(contaPoupanca5);
		adicionarElementosNoArrayConta(contaPoupanca6);
		adicionarElementosNoArrayConta(contaEmpresarial1);
		adicionarElementosNoArrayConta(contaEmpresarial2);
		adicionarElementosNoArrayConta(contaEmpresarial3);
		adicionarElementosNoArrayConta(contaEmpresarial4);
		adicionarElementosNoArrayConta(contaEmpresarial5);
		adicionarElementosNoArrayConta(contaEmpresarial6);
		adicionarElementosNoArrayConta(contaEmpresarial7);

		imprimirOPrimeiroElementoDoArrayConta();
		imprimirOUltimoElementoDoArrayConta();
		imprimirQuantidadeElementosDoArrayConta();
	}

	// M�todos de manipula��o de array da Conta
	public static void adicionarElementosNoArrayConta(ContaBancaria conta) {
		if (contadorArray < bancarias.length) {
			bancarias[contadorArray] = conta;
			contadorArray++;
		} else {
			System.out.println("Capacidade m�xima de armazenamento atingida, n�o � poss�vel adicionar mais contas.");
		}
	}

	public static void imprimirQuantidadeElementosDoArrayConta() {

		System.out.println("\nExistem " + contadorArray + " elementos cadastradas no nosso sistema.");

	}

	public static void imprimirOPrimeiroElementoDoArrayConta() {

		if (bancarias[0] != null) {
			System.out.println("\n------------------------ ");
			System.out.println(bancarias[0]);
			System.out.println("------------------------");
		} else {
			System.out.println("N�o foi poss�vel exibir. \nN�o h� contas cadastradas.");
		}
	}

	public static void imprimirOUltimoElementoDoArrayConta() {

		System.out.println("\n------------------------ ");
		System.out.println(bancarias[contadorArray - 1]);
		System.out.println("------------------------");

	}

}
