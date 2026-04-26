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
            //mostrar utilizado no metodo de busca
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
    //retorna as coisas ai 
}
public class Main{
    static ArrayList<Aluno> lista = new ArrayList<>();
	    public static void Menu(){
	    Scanner sc = new Scanner(System.in);
	    int opcao = 1;
	    while (opcao!=0){
	        //esse e simples enquanto nao digitar zero o comando vai continuar
	        System.out.println("0 sair:");
            System.out.println("1 cadastrar");
            System.out.println("2 mostrar");
            System.out.println("3 remover");
            System.out.println("4 buscar");
            opcao = sc.nextInt();
            //agr q percebi eu posso usar tipo um nunero aleatorio ex 9 e nak vai dar erro
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
    //por algum motivo o switch nao funcionou corretamente tive q apelar
           }
	    }
	 }
    public static void cadastrar(){
        boolean t1=false;
        String[] turmas= {"1a","1b","2a","2b"};//podia adicionar por um scanner mais ia ficar bagunçado e geralmente essas coisas de turma existe antes do sistema 
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome:");
        String nome = sc.nextLine();
        System.out.println("digite turma:");
        String turma = sc.nextLine();
        System.out.println("digite uma nota");
        int nota = sc.nextInt();
        if(nota>10 || nota<0){
            nota=0;
            System.out.println("nota invalida");
        }
        for (int i = 0;i<turmas.length;++i ){
        if(turma.equals(turmas[i])){
            lista.add(new Aluno(nome,turma,nota));
            t1 = true;
            break;
            //essa parte ficou boa me superei
        }
    }
    if(t1==false){
        System.out.println("turma invalida");
    }
}
    public static void mostrar(){
        for(Aluno a : lista){
        System.out.println("nome "+a.getNome());
        System.out.println("turma "+a.getTurma());
        System.out.println("nota "+a.getNota());
        System.out.println("______________");
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
                //essa parte e meio confunsa mais nao tem muito oq fazer esses dois metodos ficaram lindos
            }
        }
    }
    public static void main(String[] args){
		Menu();
		//aura
	}
}