
package herancatreino;


public class Professor extends Funcionario{
    int carga_horaria;
    String Titulacao;
    
    public void SetCarga(){
        System.out.println("Digite a carga Horaria: "+"\n");
        this.carga_horaria = this.entrada.nextInt();
    }
    public int GetCarga(){
        return carga_horaria;
    }
    
    public void SetTit(){
        System.out.println("Digite a Titulação: "+"\n");
        this.Titulacao = entrada.nextLine();
    }
    public String GetTit(){
        return Titulacao;
    }
    
    public void ExibirCarga(){
        System.out.println("A Carga Horarioa é : "+carga_horaria);
        
        
    }
    public void ExibirTit(){
        System.out.println("A titulação é : "+Titulacao);
    }
    
}
