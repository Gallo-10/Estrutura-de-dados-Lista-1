import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        Aluno aluno1 = new Aluno("Fabio", 60, 40, 25);
        Aluno aluno2 = new Aluno("Marcos", 30, 50, 10);
        Aluno aluno3 = new Aluno("Pedro", 90, 100, 100);
        Aluno aluno4 = new Aluno("Gabriel", 100, 100, 100);

        Aluno aluno5 = new Aluno(null, 0, 0, 0);
        System.out.println("Digite o nome do aluno 5: ");
        aluno5.nome = input.next();
        System.out.println("Digite as notas do aluno 5: ");
        aluno5.v1 = input.nextInt();
        aluno5.v2 = input.nextInt();
        aluno5.v3 = input.nextInt();

        Aluno aluno6 = new Aluno(null, 0, 0, 0);
        System.out.println("Digite o nome do aluno 6: ");
        aluno6.nome = input.next();
        System.out.println("Digite as notas do aluno 6: ");
        aluno6.v1 = input.nextInt();
        aluno6.v2 = input.nextInt();
        aluno6.v3 = input.nextInt();

        input.close();

        System.out.println("\n\n\nBoletin dos alunos: \n");

        System.out.println(aluno1.mostrarNome());
        System.out.println(aluno1.mostrarNotas());
        System.out.println(aluno1.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno2.mostrarNome());
        System.out.println(aluno2.mostrarNotas());
        System.out.println(aluno2.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno3.mostrarNome());
        System.out.println(aluno3.mostrarNotas());
        System.out.println(aluno3.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno4.mostrarNome());
        System.out.println(aluno4.mostrarNotas());
        System.out.println(aluno4.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno5.mostrarNome());
        System.out.println(aluno5.mostrarNotas());
        System.out.println(aluno5.calcularMedia());

        System.out.println("\n");

        System.out.println(aluno6.mostrarNome());
        System.out.println(aluno6.mostrarNotas());
        System.out.println(aluno6.calcularMedia());
    }
}
