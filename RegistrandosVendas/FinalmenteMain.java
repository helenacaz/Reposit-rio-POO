package RegistrandosVendas;


public class FinalmenteMain {
    public static void main(String[] args) {
        Produto vaselina = new Produto(1236, "a vaselina mais lisa de todas", 12.99F, 7.50F,false );
        Vendedor joelson = new Vendedor("Joelson Pinto", 999989,"Rua da Paz, 1945");
        Venda primeira = new Venda(vaselina, joelson, 0, 2);
        primeira.calcularValor();
        primeira.calcularComissao();
        primeira.imprimir();

        Produto cacau = new Produto(6582, "cacau em natura-fruta",100.0f,80.0f,true);
        Vendedor kauahne = new Vendedor("Kauahne Borges",5521,"Rua BomDoce, 3465");
        Venda segunda = new Venda(cacau,kauahne,10,3);

        segunda.efetuarDesconto(10.0F);
        segunda.calcularValor();
        segunda.calcularComissao();
        segunda.imprimir();


        Venda terceira = new Venda(cacau,kauahne, 30, 2);

        terceira.efetuarDesconto(30.0F);
        terceira.calcularValor();
        terceira.calcularComissao();
        terceira.imprimir();

    }
}
