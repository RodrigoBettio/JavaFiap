package exercicios_aula8;

import java.util.Calendar;

public class exercicio2 {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);

		switch (diaSemana) {
		case 1: {
			String diaSemanaString = "Domingo";

		}

		case 2: {
			String diaSemanaString = "Segunda-Feira";

		}

		case 3: {
			String diaSemanaString = "Terça-Feira";
			System.out.printf("Hoje é %s, dia de feira", diaSemanaString);

		}
		case 4: {
			String diaSemanaString = "Quarta-Feira";

		}
		case 5: {

			String diaSemanaString = "Quinta-Feira";
		}
		case 6: {
			String diaSemanaString = "Sexta-Feira";

		}

		case 7: {
			String diaSemanaString = "Sabado";
		}

		}
	}
}
