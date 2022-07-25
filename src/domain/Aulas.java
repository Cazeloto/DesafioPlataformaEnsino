package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Aulas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? : ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.print("Dados da " + (i+1) + " aula");
			System.out.print("(c)onteudo ou (t)tarefa ? : ");
			char ch = sc.next().charAt(0);
			if (ch == 'c') {
				System.out.print("Entre com o Titulo    : ");
				String titulo = sc.next();
				System.out.print("URL do video          : ");
				String url = sc.next();
				System.out.print("Duração em segundos : ");
				int seg = sc.nextInt();
				Lesson lesson = new Video(titulo, url, seg);
				list.add(lesson);
			}
			else {
				System.out.print("Entre com o Titulo      : ");
				String titulo = sc.next();
				System.out.print("Descrição               : ");
				String descricao = sc.next();
				System.out.print("Quantidade de questoes: ");
				int seg = sc.nextInt();
				Lesson lesson = new Task(titulo, descricao, seg);
				list.add(lesson);
				
			}
		
			
			
		}
		int sum = 0;
		for (Lesson les : list) {
			sum = sum + les.duration();
		}
		System.out.println("DURACAO TOTAL DO CURSO = " + sum + " segundos");
	}
	

}
