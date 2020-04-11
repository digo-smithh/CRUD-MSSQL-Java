package bd.dbos;

/**
A classe Produto armazena os dados necessários de um produto.
Nela há todos os parâmetros necessários para um produto.
Métodos dessa classe (SETTERs e GETTERs) permitem verificar e atualizar os dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Produto implements Cloneable
{
    private int    codigo;
    private String nome;
    private String categoria;
    private String descricao;
    private float  preco;
    private int    qtde;
 
    /**
    Seta um novo código para ser substituído na instância chamante.
    @param codigo Inteiro que representa o código do produto.
    @throws Exception se o código for menor do que 0.
    */
    public void setCodigo (int codigo) throws Exception
    {
        if (codigo <= 0)
            throw new Exception ("Codigo inválido");

        this.codigo = codigo;
    }   

    /**
    Seta um novo nome para ser substituído na instância chamante.
    @param nome String que representa o nome do produto.
    @throws Exception se o nome não foi passado ou for uma cadeia vazia.
    */
    public void setNome (String nome) throws Exception
    {
        if (nome==null || nome.equals(""))
            throw new Exception ("Nome não fornecido");

        this.nome = nome;
    }
    
    /**
    Seta uma nova categoria para ser substituída na instância chamante.
    @param categoria String que representa a categoria do produto.
    @throws Exception se a categoria não foi passada ou for uma cadeia vazia.
    */
    public void setCategoria (String categoria) throws Exception
    {
        if (categoria==null || categoria.equals(""))
            throw new Exception ("Categoria não fornecida");

        this.categoria = categoria;
    }
    
    /**
    Seta uma nova descricao para ser substituída na instância chamante.
    @param descricao String que representa a descricao do produto.
    @throws Exception se a descricao não foi passada ou for uma cadeia vazia.
    */
    public void setDescricao (String descricao) throws Exception
    {
        if (descricao==null || descricao.equals(""))
            throw new Exception ("Descrição não fornecida");

        this.descricao = descricao;
    }

    /**
    Seta um novo preço para ser substituído na instância chamante.
    @param preco Float que representa o preço do produto.
    @throws Exception se o preço for menor do que 0.
    */
    public void setPreco (float preco) throws Exception
    {
        if (preco <= 0)
            throw new Exception ("Preço inválido");

        this.preco = preco;
    }
    
    /**
    Seta uma nova quantidade em estoque para ser substituído na instância chamante.
    @param qtde Inteiro que representa a quantidade em estoque do produto.
    @throws Exception se a quantidade for menor do que 0.
    */
    public void setQtde (int qtde) throws Exception
    {
        if (preco <= 0)
            throw new Exception ("Quantidade inválida");

        this.qtde = qtde;
    }

    /**
    Retorna o código do produto.
    @return Um inteiro que representa o código do produto.
    */
    public int getCodigo ()
    {
        return this.codigo;
    }

    /**
    Retorna o nome do produto.
    @return Uma String que representa o nome do produto.
    */
    public String getNome ()
    {
        return this.nome;
    }
    
    /**
    Retorna a categoria do produto.
    @return Uma String que representa a categoria do produto.
    */
    public String getCategoria ()
    {
        return this.categoria;
    }
    
    /**
    Retorna a descricao do produto.
    @return Uma String que representa a descricao do produto.
    */
    public String getDescricao ()
    {
        return this.descricao;
    }

    /**
    Retorna o preço do produto.
    @return Um Float que representa o preço do produto.
    */
    public float getPreco ()
    {
        return this.preco;
    }
    
    /**
    Retorna a quantidade em estoque do produto.
    @return Um inteiro que representa a quantidade em estoque do produto.
    */
    public int getQtde ()
    {
        return this.qtde;
    }
    
    /**
    Constroi uma nova instância da classe Produto.
    Esse construtor não seta nenhum valor na instância, afim de ser setato posteriormente,
    por um método de uma classe do tipo DAO.
    */
    public Produto ()
    {}

    /**
    Constroi uma nova instância da classe produto.
    Para tanto, deve ser fornecido todos os dados de um cliente.
    @param codigo Inteiro que representa o código do produto.
    @param nome String que representa o nome do produto.
    @param categoria String que representa a categoria do produto.
    @param descricao String que representa a descrição do produto.
    @param preco Float que representa o preço do produto.
    @param qtde Inteiro que representa a quantidade em estoque do produto.
    @throws Exception É lançada exceção se algum dos parâmetros forem passados de forma incorreta.
    */
    public Produto (int codigo, String nome, String categoria, String descricao, float preco, int qtde) throws Exception
    {
        this.setCodigo     (codigo);
        this.setNome       (nome);
        this.setCategoria  (categoria);
        this.setDescricao  (descricao);
        this.setPreco      (preco);
        this.setQtde       (qtde);
    }

    /**
    Gera uma representação textual da classe Produto.
    Produz e resulta um String com todos os dados do produto.
    @return um String contendo todo o conteúdo da classe Produto.
    */
    public String toString ()
    {
        String ret="";

        ret+="Codigo....: "+this.codigo    +"\n";
        ret+="Nome......: "+this.nome      +"\n";
        ret+="Categoria.: "+this.categoria +"\n";
        ret+="Descricao.: "+this.descricao +"\n";
        ret+="Preco.....: "+this.preco     +"\n";
        ret+="Quantidade: "+this.qtde      +"\n";

        return ret;
    }

    /**
    Verifica a igualdade entre duas instâncias de Produto.
    Verifica se o Object fornecido como parâmetro representa um
    produto igual àquele representada pela instância a qual este
    método for aplicado, resultando true em caso afirmativo,
    ou false, caso contrário.
    @param  obj o objeto a ser comparado com a instância a qual esse método
            for aplicado.
    @return true, caso o Object fornecido ao método e a instância chamante do
            método representarem agendas iguais, ou false, caso contrário.
    */
    public boolean equals (Object obj)
    {
        if (this==obj)
            return true;

        if (obj==null)
            return false;

        if (!(obj instanceof Produto))
            return false;

        Produto prod = (Produto)obj;

        if (this.codigo!=prod.codigo)
            return false;

        if (this.nome.equals(prod.nome))
            return false;
        
        if (this.categoria.equals(prod.categoria))
            return false;
        
        if (this.descricao.equals(prod.descricao))
            return false;

        if (this.preco!=prod.preco)
            return false;
        
        if (this.qtde!=prod.qtde)
            return false;

        return true;
    }

    /**
    Calcula o código de espalhamento (ou código de hash) da classe Produto.
    Calcula e resulta o código de espalhamento (ou código de hash, ou ainda o
    hashcode) da classe Produto representada pela instância a qual o método for aplicado.
    @return o código de espalhamento da instância chamante do método.
    */
    public int hashCode ()
    {
        int ret=666;

        ret = 7*ret + new Integer(this.codigo).hashCode();
        ret = 7*ret + this.nome.hashCode();
        ret = 7*ret + this.categoria.hashCode();
        ret = 7*ret + this.descricao.hashCode();
        ret = 7*ret + new Float(this.preco).hashCode();
        ret = 7*ret + new Integer(this.qtde).hashCode();

        return ret;
    }
    
     /**
    Copia os dados da instância atual para a instânicia passada.
    Para tanto, deve ser fornecida uma instância da classe Produto para ser copiada.
    @param modelo a instância da classe Produto a ser usada como modelo.
    @throws Exception se o modelo for null.
    */
    public Produto (Produto modelo) throws Exception
    {
        if (modelo == null)
            throw new Exception ("Produto inválido");
        
        this.codigo      = modelo.codigo;
        this.nome        = modelo.nome;  
        this.categoria   = modelo.categoria;
        this.descricao   = modelo.descricao;
        this.preco       = modelo.preco;  
        this.qtde        = modelo.qtde;
    }

    /**
    Constroi uma cópia da instância da classe Produto dada.
    Para tanto, chama o construtor de cópia.
    @return retorna um objeto construído com todos os dados da instância chamante.
    */
    public Object clone ()
    {
        Produto ret=null;

        try
        {
            ret = new Produto (this);
        }
        catch (Exception erro)
        {} 

        return ret;
    }
}