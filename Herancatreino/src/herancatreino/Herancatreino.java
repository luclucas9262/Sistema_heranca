
package herancatreino;


public class Herancatreino {

    
    public static void main(String[] args) {
       
        Pessoa p = new Pessoa();
        
        do{
            p.ExibirMenu();
            p.SetOPC();
            if(p.GetOPC() ==1){
                Aluno a = new Aluno();
                a.SetNome();
                a.SetSexo();
                a.SetRA();
                a.ExibirDadosPessoa();
                a.ExibirRA();
            }
            if(p.GetOPC() ==2){
                Funcionario f = new Funcionario ();
                f.SetNome();
                f.SetSexo();
                f.SetCargo();
                f.ExibirDadosPessoa();
                f.ExibirCargo();
            }
            if(p.GetOPC()==3){
                Professor pro = new Professor();
                pro.SetNome();
                pro.SetSexo();
                pro.SetCargo();
                pro.SetCarga();
                pro.SetTit();
                pro.ExibirDadosPessoa();
                pro.ExibirCargo();
                pro.ExibirCarga();
                pro.ExibirTit();
            }
            if(p.GetOPC() ==0){
                p.Sair();
            }
            
            
            
        }while(p.GetOPC()>=1 && p.GetOPC()<=3);
        
        
    }
    
}
