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
        Pedido p = new Pedido(123);
        Conexao c = new Conexao();
        
        p.AdicionaItem(new Item(l, 3));
        
        c.CadastrarPedido(p);
    }
    
}
