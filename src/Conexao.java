import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

public class Conexao {
    
    private ObjectContainer db = null;
    
    private void AbrirConexao(){
        db = Db4oEmbedded.openFile("Banco");
    }
    
    private void FecharConexao(){
        db.close();
    }
    // salva um pedido no Banco
    public void CadastrarPedido(Pedido p){
        AbrirConexao();
        db.store(p);
        FecharConexao();
        
        int num = p.getNum();
        System.out.println("Pedido: " + num + " cadastrado.");
    }
    // cadastra uma midia no banco
    public void CadastrarMidia(Midia m){
        AbrirConexao();
        db.store(m);
        FecharConexao();
        
        System.out.println("Midia: " + m.toString() + " cadastrada.");
    }
    
    // retorna todos os pedidos salvos no banco
    public List<Pedido> SelectAllPedido(){
        AbrirConexao();
        ObjectSet listPedidos = db.queryByExample(Pedido.class);
        List<Pedido> lp = new ArrayList<>();
        for (Object pedido : listPedidos) {
            lp.add((Pedido)pedido);
        }
        FecharConexao();
        return lp;
    }
    // retorna um pedido especifico
    public Pedido SelectPedido(Pedido p){
        AbrirConexao();
        ObjectSet resultado = db.queryByExample(p);
        Pedido pedido = (Pedido)resultado.next();
        FecharConexao();
        return pedido;
    }
    // retorna todas as midias
    public List<Midia> SelectAllMidia(){
        AbrirConexao();
        ObjectSet listMedias = db.queryByExample(Midia.class);
        List<Midia> lm = new ArrayList<>();
        for (Object midia : listMedias) {
            lm.add((Midia)midia);
        }
        FecharConexao();
        return lm;
    }
    
    // retorna uma midia especifica
    public Midia SelectMidia(Midia m){
        AbrirConexao();
        ObjectSet resultado = db.queryByExample(m);
        Midia midia = (Midia)resultado.next();
        FecharConexao();
        return midia;
    }
    
    /*public void UpdateMidia(Livro procura, Livro editado){
        AbrirConexao();
        ObjectSet result = db.queryByExample(procura);
        Livro lresult = (Livro) result.next();
        lresult.setAno(editado.getAno());
        lresult.setAutor(editado.getAutor());
        lresult.setISBN(editado.getISBN());
        db.store(lresult);
        FecharConexao();
    }*/
    
    // livro
    public void UpdateMidia(String cod, Livro editado){
        AbrirConexao();
        
        Midia m = new Livro();
        m.setCod(cod);
        ObjectSet result = db.queryByExample(m);
        
        Livro mresult = (Livro) result.next();
        
        mresult.setAno(editado.getAno());
        mresult.setAutor(editado.getAutor());
        mresult.setCod(cod);
        mresult.setISBN(editado.getISBN());
        mresult.setTitulo(editado.getTitulo());
        
        db.store(mresult);
        FecharConexao();
    }
    
    // livro
    public void UpdateMidia(String cod, DVD editado){
        AbrirConexao();
        
        Midia m = new DVD();
        m.setCod(cod);
        ObjectSet result = db.queryByExample(m);
        
        DVD mresult = (DVD) result.next();
        
        mresult.setAno(editado.getAno());
        mresult.setDiretor(editado.getDiretor());
        mresult.setCod(cod);
        mresult.setProdutor(editado.getProdutor());
        mresult.setTitulo(editado.getTitulo());
        
        db.store(mresult);
        FecharConexao();
    }
    
    public void DeleteMidia(String cod){
        AbrirConexao();
        Midia m = new Midia();
        m.setCod(cod);
        ObjectSet result = db.queryByExample(m);
        Midia mresult = (Midia) result.next();
        db.delete(mresult);
        FecharConexao();
    }
}