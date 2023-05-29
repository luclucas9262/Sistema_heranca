package herancatreino;

public class Funcionario extends Pessoa {

    String cargo;

    public void SetCargo() {
        System.out.println("Digite o Cargo: " + "\n");
        this.cargo = this.entrada.nextLine();

    }

    public String GetCargo() {
        return cargo;
    }
    
    public void ExibirCargo(){
        System.out.println("O Cargo é: "+cargo);
    }
}
