package livraria;


public class Principal {

    
    public static void main(String[] args) {
        
        
       
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
        c.setISBN(4267);
        c.setPaginas(1626);
        c.setAno(1878);
        c.setEditora("Leiturinha");
        c.setValor(150.15);
        c.venda(831);
        c.exibir();
        
        Livro d = new Livro();
        d.setTitulo("Irmãos Karamazov");
        d.setAutor("Fiodor Dostoievski");
        d.setISBN(515705);
        d.setPaginas(2156);
        d.setAno(1894);
        d.setEditora("Leiturinha");
        d.setValor(216.35);
        d.venda(284);
        d.exibir();
       
        Livraria i = new Livraria();
        i.show(); 
       
    }
    
}
