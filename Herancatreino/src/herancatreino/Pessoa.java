package herancatreino;

import java.util.Scanner;

public class Pessoa {

    Scanner entrada = new Scanner(System.in);
    String nome, sexo;
    int opc;

    
    
    public void SetNome() {
        System.out.println("Digite o Nome: " + "\n");
        this.nome = this.entrada.nextLine();
    }

    public String GetNome() {
        return nome;
    }

    public void SetSexo() {
        System.out.println("Digite o Sexo: \n" );
        this.sexo = this.entrada.nextLine();
    }

    public String GetSexo() {
        return sexo;
    }
    
    public void ExibirDadosPessoa(){
          System.out.println("Nome: "+nome);
          System.out.println("Sexo: "+sexo);
          
    }
    
    
    public void ExibirMenu(){
         System.out.println("********MENU**************");
         System.out.println("***-1 - Aluno*************");
         System.out.println("***-2 - Funcionario*******");
         System.out.println("***-3 - Professor*********");
         System.out.println("***-0 - Sair so Sistema***");
    }
    
    public void Sair(){
        System.out.println("Sistema Encerrado");
        System.exit(0);
    }
    
    public void SetOPC(){
        System.out.println("Digite uma opção");
        this.opc = this.entrada.nextInt();
    }
    
    public int GetOPC(){
        return opc;
    }
    
    public void ExibirMsg(){
        System.out.println("***Opção Invalida***");
    }
        

}
