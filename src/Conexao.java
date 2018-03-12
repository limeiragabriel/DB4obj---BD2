import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class Conexao {
    
    private ObjectContainer db = null;
    
    private void AbrirConexao(){
        db = Db4oEmbedded.openFile("Banco");
    }
    
    private void FecharConexao(){
        db.close();
    }
    
    public void CadastrarPedido(Pedido p){
        AbrirConexao();
        db.store(p);
        FecharConexao();
        
        int num = p.getNum();
        System.out.println("Pedido: " + num + " cadastrado.");
    }
}