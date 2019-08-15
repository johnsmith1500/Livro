package livraria;

public class Livro {
    private String Titulo;
    private String Autor;
    private int ISBN;
    private int Paginas;
    private int Ano;
    private String Editora;
    private double Valor;
    
    public void setTitulo(String titulo){
     this.Titulo = titulo;
    }
    public String getTitulo(){
        return this.getTitulo();
    }
    public void setAutor(String autor){
     this.Autor = autor;
    }
    public String getAutor(){
    return this.getAutor(); 
    }
    public void setISBN(int ISBN){
     this.ISBN = ISBN;
    }
    public int getISBN(){
    return this.getISBN(); 
    }
    public void setPaginas(int Paginas){
        this.Paginas = Paginas;
    }
     public int getPaginas(){
        return this.getPaginas();
    }
     public void setAno(){
        this.Ano = Ano;
    }
     public void setAno(int Ano){
        this.Ano = Ano;
    }
     public void setEditora(String Editora){
     this.Editora = Editora;
    }
    public String getEditora(){
        return this.getEditora();
    }
    public void setValor(double valor){
     this.Valor = Valor;
    }
    public double getValor(){
        return this.getValor();
    }
    
    public String exibir(){
        System.out.println("lIVRO:"+Titulo);
        System.out.println("AUTOR:"+Autor);
        System.out.println("ISBN:"+ISBN);
        System.out.println("PAGINAS:"+Paginas);
        System.out.println("ANO:"+Ano);
        System.out.println("EDITORA:"+Editora);
        System.out.println("VALOR:"+Valor);    
        return null;
    }
    public double venda(int qtd){
        System.out.println("Valor da venda: "+(getValor()*qtd));
        return qtd;
    }
}

