import java.util.Scanner;
import java.util.ArrayList;
class Aluno{
    String nome;
    String turma;
    int nota;
    public Aluno(String n, String t, int n2){
        this.nome=n;
        this.turma=t;
        this.nota=n2;
        }
        public void mostrar(){
            System.out.print("nome: "+nome+"turma: "+ turma);
        }
    public String getNome(){
        return nome;
    }
    public String getTurma(){
        return turma;
    }
    public int getNota(){
        return nota;
    }
    }
public class Main{
    static ArrayList<Aluno> lista = new ArrayList<>();
	    public static void Menu(){
	    Scanner sc = new Scanner(System.in);
	    int opcao = 1;
	    while (opcao!=0){
	        System.out.println("0 sair:");
            System.out.println("1 cadastrar");
            System.out.println("2 mostrar");
            System.out.println("3 remover");
            System.out.println("4 buscar");
            opcao = sc.nextInt();
           if(opcao==1){
               cadastrar();
               }
            if(opcao==2){
                mostrar();
           }
           if(opcao==3){
               remover();
           }
           if(opcao==4){
               buscar();
           }
	    }
	 }
    public static void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome:");
        String nome = sc.nextLine();
        System.out.println("digite turma:");
        String turma = sc.nextLine();
        System.out.println("digite a nota ");
        int nota = sc.nextInt();
        lista.add(new Aluno(nome,turma,nota));
    }
    public static void mostrar(){
        for(Aluno a : lista){
        System.out.println(a.getNome());
        System.out.println(a.getTurma());
        System.out.println(a.getNota());
    }
}
    public static void remover(){
        Scanner sc = new Scanner(System.in);
        System.out.println("quem voçe deseja remover: ");
        String rr = sc.nextLine();
        lista.removeIf(a->a.getNome().equalsIgnoreCase(rr));
    }
    public static void buscar(){
        Scanner sc = new Scanner(System.in);
        String bb = sc.nextLine();
        for(Aluno a : lista){
            if(a.getNome().toLowerCase().contains(bb.toLowerCase())){
                a.mostrar();
            }
        }
    }
    public static void main(String[] args){
		Menu();
	}
}