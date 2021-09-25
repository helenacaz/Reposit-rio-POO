package RegistrandosVendas;


public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int qunatidadeidetens;
    private float reais;


    public Venda(Produto produto, Vendedor vendedor, float desconto, int qunatidadeidetens){
        this.produto = produto;
        this.vendedor = vendedor;
        this.qunatidadeidetens = qunatidadeidetens;
        this.desconto = desconto;
    }
    public void efetuarDesconto(float percentualDesconto){

        float valorDesconto = this.produto.getValorVenda() * (percentualDesconto / 100);
        float novoValor = this.produto.getValorVenda() - valorDesconto;
        if (novoValor >= this.produto.getValorCusto()){
            desconto = valorDesconto;
            System.out.println("O desconto é de " + percentualDesconto + "%");
        }else{
            System.out.println("Valor não permitido de desconto");
        }
    }

    public  void calcularValor(){
        reais = (this.produto.getValorVenda() - desconto) * qunatidadeidetens;
    }

    public void calcularComissao() {

        if (!produto.isPromocao()){
            float comissao = reais * (0.15F);
            System.out.println("A comissão é de " + comissao);
        }else if(produto.isPromocao()){
            float valorComissao = reais * (0.15F);
            float comissao = valorComissao / 2;
            System.out.println("A comissao é de "  + comissao);
        }}

    public void imprimir(){
        System.out.println(vendedor.getNome() + " é o seu vendedor");
        System.out.println(produto.getDescricao() + " é o seu produto");
        System.out.println("Voce pegou: " + qunatidadeidetens + " de itens");
        System.out.println("O codigo do seu produto é: " + this.produto.getCodigo() + " A descricao do produto: " + this.produto.getDescricao());
        System.out.println("o valor de venda do seu produto por unidade é: " + this.produto.getValorVenda());
        if (produto.isPromocao()){
            System.out.println("O seu produto está em promoção :)");
            System.out.println(desconto);
        }else{
            System.out.println("O seu produto não tem promoção :(");
        }
        System.out.println("o valor da venda final é: " + reais + "\n");
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int getQunatidadeidetens() {
        return qunatidadeidetens;
    }

    public void setQunatidadeidetens(int qunatidadeidetens) {
        this.qunatidadeidetens = qunatidadeidetens;
    }

    public float getReais() {
        return reais;
    }

    public void setReais(float reais) {
        this.reais = reais;
    }
}



