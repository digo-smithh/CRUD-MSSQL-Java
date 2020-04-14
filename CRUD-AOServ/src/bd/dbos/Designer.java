package bd.dbos;


/**
A classe Venda armazena os dados necessários de uma venda.
Nela há todos os parâmetros necessários para uma venda.
Métodos dessa classe (SETTERs e GETTERs) permitem verificar e atualizar os dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Designer implements Cloneable
{
    private int    codigo;
    private int    codCliente;
    private int    codProduto;
    private int    qtde;
    private String dataVenda;
    private String cep;
    private String endereco;
    private int    numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private float  total;
    private String pagamento;
 
    /**
    Seta um novo código para ser substituído na instância chamante.
    @param codigo Inteiro que representa o código da venda.
    @throws Exception se o código for menor do que 0.
    */
    public void setCodigo (int codigo) throws Exception
    {
        if (codigo <= 0)
            throw new Exception ("Codigo inválido");

        this.codigo = codigo;
    }   
    
    /**
    Seta um novo código para ser substituído na instância chamante.
    @param codCliente Inteiro que representa o código do cliente.
    @throws Exception se o código for menor do que 0.
    */
    public void setCodCliente (int codCliente) throws Exception
    {
        if (codCliente <= 0)
            throw new Exception ("Codigo de cliente inválido");
        
       

        this.codCliente = codCliente;
    }   
    
    /**
    Seta um novo código para ser substituído na instância chamante.
    @param codProduto Inteiro que representa o código do produto.
    @throws Exception se o código for menor do que 0.
    */
    public void setCodProduto (int codProduto) throws Exception
    {
        if (codProduto <= 0)           
            throw new Exception ("Código inválido");
        
     

        this.codProduto = codProduto;
    }   
    
    /**
    Seta uma nova quantidade para ser substituída na instância chamante.
    @param qtde Inteiro que representa quantos produtos foram vendidos.
    @throws Exception se a quantidade for menor do que 0.
    */
    public void setQtde (int qtde) throws Exception
    {
        if (qtde <= 0)
            throw new Exception ("Quantidade inválido");

        this.qtde = qtde;
    }   

    /**
    Seta uma nova data de venda para ser substituída na instância chamante.
    @param dataVenda String que representa a data da venda.
    @throws Exception se a data não foi passada ou for uma cadeia vazia.
    */
    public void setDataVenda (String dataVenda) throws Exception
    {
        if (dataVenda==null || dataVenda.equals(""))
            throw new Exception ("Data não fornecida");

        this.dataVenda = dataVenda;
    }
    
    /**
    Seta um novo CEP para ser substituído na instância chamante.
    @param cep String que representa o cep de entrega da venda.
    @throws Exception se o cep não foi passado ou for uma cadeia vazia.
    */
    public void setCep (String cep) throws Exception
    {
        if (cep==null || cep.equals(""))
            throw new Exception ("CEP não fornecido");

        this.cep = cep;
    }
    
    /**
    Seta um novo endereco para ser substituído na instância chamante.
    @param endereco String que representa o endereco de entrega da venda.
    @throws Exception se o endereco não foi passado ou for uma cadeia vazia.
    */
    public void setEndereco (String endereco) throws Exception
    {
        if (endereco==null || endereco.equals(""))
            throw new Exception ("Endereço não fornecido");

        this.endereco = endereco;
    }
    
    /**
    Seta um novo numero para ser substituído na instância chamante.
    @param numero Inteiro que representa o numero da casa de entrega da venda.
    @throws Exception se o numero for menor que 0.
    */
    public void setNumero (int numero) throws Exception
    {
        if (numero <= 0)
            throw new Exception ("Número inválido");

        this.numero = numero;
    } 
    
    /**
    Seta um novo complemento para ser substituído na instância chamante.
    @param complemento String que representa o complemento do endereco de entrega da venda.
    @throws Exception se o complemento não foi passado ou for uma cadeia vazia.
    */
    public void setComplemento (String complemento) throws Exception
    {
       if (complemento==null || complemento.equals(""))
            throw new Exception ("Complemento não fornecido");

        this.complemento = complemento;
    }
    
    /**
    Seta um novo bairro para ser substituído na instância chamante.
    @param bairro String que representa o bairro do endereco de entrega da venda.
    @throws Exception se o bairro não foi passado ou for uma cadeia vazia.
    */
    public void setBairro (String bairro) throws Exception
    {
        if (bairro==null || bairro.equals(""))
            throw new Exception ("Bairro não fornecido");

        this.bairro = bairro;
    }   
    
    /**
    Seta uma nova cidade para ser substituída na instância chamante.
    @param cidade String que representa a cidade do endereco de entrega da venda.
    @throws Exception se a cidade não foi passada ou for uma cadeia vazia.
    */
    public void setCidade (String cidade) throws Exception
    {
        if (cidade==null || cidade.equals(""))
            throw new Exception ("Cidade não fornecida");

        this.cidade = cidade;
    }   
    
    /**
    Seta um novo estado para ser substituído na instância chamante.
    @param estado String que representa o estado do endereco de entrega da venda.
    @throws Exception se o estado não foi passado ou for uma cadeia vazia.
    */
    public void setEstado (String estado) throws Exception
    {
        if (estado==null || estado.equals(""))
            throw new Exception ("Estado não fornecido");

        this.estado = estado;
    }   
    
    /**
    Seta um novo total para ser substituído na instância chamante.
    @param total Float que representa o total da venda (preço do produto * qtde).
    @throws Exception se o total for menor que 0.
    */
    public void setTotal (float total) throws Exception
    {
        if (total <= 0)
            throw new Exception ("Preço inválido");

        this.total = total;
    }
    
    /**
    Seta um novo tipo de pagamento para ser substituído na instância chamante.
    @param pagamento String que representa o método de pagamento do cliente.
    @throws Exception se o pagamento não foi passado ou for uma cadeia vazia.
    */
    public void setPagamento (String pagamento) throws Exception
    {
        if (pagamento==null || pagamento.equals(""))
            throw new Exception ("Pagamento não fornecido");

        this.pagamento = pagamento;
    }
    
    /**
    Retorna o código da venda.
    @return Um inteiro que representa o código da venda.
    */
    public int getCodigo ()
    {
        return this.codigo;
    }
    
    /**
    Retorna o código do cliente.
    @return Um inteiro que representa o código do cliente.
    */
    public int getCodCliente ()
    {
        return this.codCliente;
    }
    
    /**
    Retorna o código do produto.
    @return Um inteiro que representa o código do produto.
    */
    public int getCodProduto ()
    {
        return this.codProduto;
    }
    
    /**
    Retorna a quantidade vendida de certo produto.
    @return Um inteiro que representa a quantidade que foi vendida do produto.
    */
    public int getQtde ()
    {
        return this.qtde;
    }
    
    /**
    Retorna a data de venda.
    @return Uma String que representa a data da venda.
    */
    public String getDataVenda ()
    {
        return this.dataVenda;
    }
    
    /**
    Retorna o cep de entrega.
    @return Uma String que representa o cep de entrega.
    */
    public String getCep ()
    {
        return this.cep;
    }
    
    /**
    Retorna o endereço de entrega.
    @return Uma String que representa o endereço de entrega.
    */
    public String getEndereco ()
    {
        return this.endereco;
    }
    
    /**
    Retorna o bairro de entrega.
    @return Uma String que representa o bairro de entrega.
    */
    public String getBairro ()
    {
        return this.bairro;
    }
    
    /**
    Retorna a cidade de entrega.
    @return Uma String que representa a cidade de entrega.
    */
    public String getCidade ()
    {
        return this.cidade;
    }
    
    /**
    Retorna o estado de entrega.
    @return Uma String que representa o estado de entrega.
    */
    public String getEstado ()
    {
        return this.estado;
    }
    
    /**
    Retorna o numero da casa de entrega.
    @return Um inteiro que representa o numero da casa de entrega.
    */
    public int getNumero ()
    {
        return this.numero;
    }
    
    /**
    Retorna o complemento do endereço de entrega.
    @return Uma String que representa o complemento de entrega.
    */
    public String getComplemento ()
    {
        return this.complemento;
    }
    
    /**
    Retorna o total da venda.
    @return Um float que representa o total da venda (preço do produto * qtde).
    */
    public float getTotal ()
    {
        return this.total;
    }
    
    /**
    Retorna o método de pagamento da venda.
    @return Uma String que representa o método de pagamento escolhido pelo cliente.
    */
    public String getPagamento ()
    {
        return this.pagamento;
    }
    
    /**
    Constroi uma nova instância da classe Venda.
    Esse construtor não seta nenhum valor na instância, afim de ser setato posteriormente,
    por um método de uma classe do tipo DAO.
    */
    public Designer ()
    {}

    /**
    Constroi uma nova instância da classe Venda.
    Para tanto, deve ser fornecido todos os dados de uma venda.
    @param codigo Inteiro que representa o código da venda.
    @param codCliente Inteiro que representa o código do cliente.
    @param codProduto Inteiro que representa o código do produto.
    @param qtde Inteiro que representa a quantidade vendida de certo produto.
    @param dataVenda String que representa a data da venda.
    @param cep String que representa o cep de entrega da venda.
    @param endereco String que representa o endereço de entrega da venda.
    @param bairro String que representa o bairro de entrega da venda.
    @param numero Inteiro que representa o número da casa de entrega da venda.
    @param complemento String que representa o complemento do endereço de entrega da venda.
    @param total Float que representa o o total da venda (qtde * preço do produto).
    @param pagamento String que representa o método de pagamento escolhido pelo cliente.
    @throws Exception É lançada exceção se algum dos parâmetros forem passados de forma incorreta.
    */
    public Designer (int codigo, int codCliente, int codProduto, int qtde, String dataVenda, String cep, String endereco, 
    			  String bairro, int numero, String complemento, float total, String pagamento) throws Exception
    {
        this.setCodigo       	(codigo);
        this.setCodCliente   	(codCliente);
        this.setCodProduto   	(codProduto);
        this.setQtde        	(qtde);
        this.setDataVenda   	(dataVenda);
        this.setCep          	(cep);
        this.setEndereco        (endereco);
        this.setBairro  	(bairro);
        this.setCidade  	(bairro);
        this.setEstado  	(bairro);
        this.setNumero  	(numero);
        this.setComplemento     (complemento);
        this.setTotal       	(total);
        this.setPagamento       (pagamento);
    }
    
    /**
    Gera uma representação textual da classe Venda.
    Produz e resulta um String com todos os dados da venda.
    @return um String contendo todo o conteúdo da classe Venda.
    */
    public String toString ()
    {
        String ret="";

        ret+="Codigo.........: "+this.codigo      +"\n";
        ret+="Codigo Cliente.: "+this.codCliente  +"\n";
        ret+="Codigo Produto.: "+this.codProduto  +"\n";
        ret+="Quantidade.....: "+this.qtde        +"\n";
        ret+="Data da venda..: "+this.dataVenda   +"\n";
        ret+="CEP............: "+this.cep         +"\n";
        ret+="Endereco.......: "+this.endereco    +"\n";
        ret+="Bairro.........: "+this.bairro      +"\n";
        ret+="Cidade.........: "+this.bairro      +"\n";
        ret+="Estado.........: "+this.bairro      +"\n";
        ret+="Numero.........: "+this.numero      +"\n";
        ret+="Complemento....: "+this.complemento +"\n";
        ret+="Total..........: "+this.total       +"\n";
        ret+="Pagamento......: "+this.pagamento   +"\n";
        ret+="Quantidade.....: "+this.qtde        +"\n";

        return ret;
    }

    /**
    Verifica a igualdade entre duas instâncias de Venda.
    Verifica se o Object fornecido como parâmetro representa uma
    venda igual àquele representada pela instância a qual este
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

        if (!(obj instanceof Designer))
            return false;

        Designer ven = (Designer)obj;

        if (this.codigo!=ven.codigo)
            return false;
        
        if (this.codCliente!=ven.codCliente)
            return false;
        
        if (this.codProduto!=ven.codProduto)
            return false;
        
        if (this.qtde!=ven.qtde)
            return false;

        if (this.dataVenda.equals(ven.dataVenda))
            return false;
        
        if (this.cep.equals(ven.cep))
            return false;
        
        if (this.endereco.equals(ven.endereco))
            return false;
        
        if (this.bairro.equals(ven.bairro))
            return false;
        
        if (this.cidade.equals(ven.cidade))
            return false;
        
        if (this.estado.equals(ven.estado))
            return false;

        if (this.numero!=ven.numero)
            return false;
        
        if (this.complemento.equals(ven.complemento))
            return false;
        
        if (this.total!=ven.total)
            return false;
        
        if (this.pagamento.equals(ven.pagamento))
            return false;
        
        return true;
    }

    /**
    Calcula o código de espalhamento (ou código de hash) da classe Venda.
    Calcula e resulta o código de espalhamento (ou código de hash, ou ainda o
    hashcode) da classe Venda representada pela instância a qual o método for aplicado.
    @return o código de espalhamento da instância chamante do método.
    */
    public int hashCode ()
    {
        int ret=666;

        ret = 7*ret + new Integer(this.codigo).hashCode();
        ret = 7*ret + new Integer(this.codCliente).hashCode();
        ret = 7*ret + new Integer(this.codProduto).hashCode();
        ret = 7*ret + new Integer(this.qtde).hashCode();
        ret = 7*ret + this.dataVenda.hashCode();
        ret = 7*ret + this.cep.hashCode();
        ret = 7*ret + this.endereco.hashCode();
        ret = 7*ret + this.bairro.hashCode();
        ret = 7*ret + this.cidade.hashCode();
        ret = 7*ret + this.estado.hashCode();
        ret = 7*ret + new Integer(this.numero).hashCode();
        ret = 7*ret + this.complemento.hashCode();
        ret = 7*ret + new Float(this.total).hashCode();
        ret = 7*ret + this.pagamento.hashCode();

        return ret;
    }

    /**
    Copia os dados da instância atual para a instânicia passada.
    Para tanto, deve ser fornecida uma instância da classe Venda para ser copiada.
    @param modelo a instância da classe Venda a ser usada como modelo.
    @throws Exception se o modelo for null.
    */
    public Designer (Designer modelo) throws Exception
    {
        this.codigo          = modelo.codigo; 
        this.codCliente      = modelo.codCliente; 
        this.codProduto      = modelo.codProduto; 
        this.qtde            = modelo.qtde;   
        this.dataVenda       = modelo.dataVenda;
        this.cep             = modelo.cep;
        this.endereco        = modelo.endereco; 
        this.bairro          = modelo.bairro;
        this.cidade          = modelo.bairro;
        this.estado          = modelo.bairro;
        this.numero          = modelo.numero;
        this.complemento     = modelo.complemento;
        this.total           = modelo.total;
        this.pagamento       = modelo.pagamento;
    }

    /**
    Constroi uma cópia da instância da classe Venda dada.
    Para tanto, chama o construtor de cópia.
    @return retorna um objeto construído com todos os dados da instância chamante.
    */
    public Object clone ()
    {
        Designer ret=null;

        try
        {
            ret = new Designer (this);
        }
        catch (Exception erro)
        {} 
        
        return ret;
    }
}