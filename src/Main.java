
import EDU.purdue.cs.bloat.editor.Type;
import java.util.List;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author limei
 */
public class Main {

    public static void main(String[] args) {
        
        Midia l = new Livro("abc", "paulo", "123", "pai de familia", 2017);
        Midia l2 = new Livro("cba", "artur", "321", "engenheiro", 2017);
        //Pedido p = new Pedido(123);
        Conexao c = new Conexao();
        
        //p.AdicionaItem(new Item(l2, 2));
        
        //c.CadastrarPedido(p);
        //c.CadastrarMidia(l);
        //c.CadastrarMidia(l2);
        
        //List <Pedido> lp = c.SelectAllPedido();
        //for (Pedido pedido : lp) {
        //    pedido.ListarPedido();
        //}
        
        List <Midia> lm = c.SelectAllMidia();
        for (Midia m : lm) {
            System.out.println(m);
        }
        
        //Midia mEX = new Midia();
        //mEX.setCod("123");
        //Midia m1 = c.SelectMidia(mEX);
        //System.out.println(m1);
        
        //Pedido p2 = new Pedido();
        //Vector<Item> v = new Vector<>();
        //v.add(new Item(l, 3));
        //p2.setItens(v);
        //Pedido p1 = c.SelectPedido(p2);
        //System.out.println(p1);
        
        
        //String cod = "321";
        //Livro editado = new Livro("dba", "joao", cod, "teste", 2018);
        //c.UpdateMidia(cod,editado);
    
        //c.DeleteMidia("123");
    }
    
}
