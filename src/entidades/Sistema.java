package entidades;
import java.util.Locale;
import java.util.Scanner;
import entidades2.Calculo;
public class Sistema {
public static void main(String[] args) {

	Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
Calculo calculo = new Calculo();

System.out.println("DIGITE A MATÉRIA");
calculo.materia = sc.nextLine();
System.out.println("QUAL A MÉDIA ?HISTORIA");
calculo.media = sc.nextDouble();
System.out.println("NOTA DA PRIMEIRA UNIDADE");
calculo.unidade1 = sc.nextDouble();
System.out.println("NOTA DA SEGUNDA UNIDADE");
calculo.unidade2 = sc.nextDouble();
System.out.println("NOTA DA TERCEIRA UNIDADE");
calculo.unidade3 = sc.nextDouble();
System.out.println("NOTA DA QUARTA UNIDADE");
calculo.unidade4 = sc.nextDouble();

System.out.printf("NOTA FINAL: %.2f%n", calculo.finalGrade());

if (calculo.finalGrade() < calculo.mediaCL()) {
System.out.println("REPROVADO!");
System.out.printf("FALTOU %.2f PONTOS%n", calculo.missingPoints());
}
else {
System.out.println("PARABENS VOCÊ FOI APROVADO!");
}
sc.close();
}
}