package livraria;


public class Principal {

    
    public static void main(String[] args) {
        Livraria i = new Livraria();
        i.show();
        
       
        Livro a = new Livro();
        a.setTitulo("Sherlock Homes");
        a.setAutor("Sir. Arthur Conan Deil");
        a.setISBN(281964);
        a.setPaginas(250);
        a.setAno(1858);
        a.setEditora("Leiturinha");
        a.setValor(55.75);
        a.venda(545);
        a.exibir();
        
        Livro b = new Livro();
        b.setTitulo("Alice nos pais das maravilhas");
        b.setAutor("Lewis Carroll");
        b.setISBN(515705);
        b.setPaginas(132);
        b.setAno(1898);
        b.setEditora("Leiturinha");
        b.setValor(45.15);
        b.venda(175);
        b.exibir();
        
        Livro c= new Livro();
        c.setTitulo("Crime e Castigo");
        c.setAutor("Fiodor Dostoievski");
        c.setISBN(173508);
        c.setPaginas(1626);
        c.setAno(1878);
        c.setEditora("Leiturinha");
        c.setValor(150.15);
        c.venda(831);
        c.exibir();
        
        Livro d = new Livro();
        d.setTitulo("Irmãos Karamazov");
        d.setAutor("Lewis Carroll");
        d.setISBN(515705);
        d.setPaginas(132);
        d.setAno(1898);
        d.setEditora("Leiturinha");
        d.setValor(45.15);
        d.venda(175);
        d.exibir();
        
        /* Livro L = new Livro();
        L.setTitulo("Que dia");
        L.exibir();
        L.setValor(18.00);
        L.venda(2); */
    }
    
}
