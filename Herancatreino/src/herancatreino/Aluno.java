
package herancatreino;


public class Aluno extends Pessoa{
    
    String ra;
    
    
    public void SetRA(){
        System.out.println("Digite o RA: "+"\n");
        this.ra = this.entrada.nextLine();
    }
    
    public String GetRA(){
        return ra;
    }
    
    public void ExibirRA(){
        System.out.println("o RA é"+ra);
    }
    
}
