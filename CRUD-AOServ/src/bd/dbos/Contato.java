package bd.dbos;

/**
A classe Contato armazena os dados necessários de uma mensagem enviada por um cliente.
Nela há todos os parâmetros necessários para um cliente.
Métodos dessa classe (SETTERs e GETTERs) permitem verificar e atualizar os dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Contato implements Cloneable
{
    private int    codigo;
    private String nome;
    private String email;
    private String telefone;
    private String assunto;
    private String mensagem;
 
    /**
    Seta um novo código para ser substituído na instância chamante.
    @param codigo Inteiro que representa o código da mensagem.
    @throws Exception se o código for menor do que 0.
    */
    public void setCodigo (int codigo) throws Exception
    {
        if (codigo <= 0)
            throw new Exception ("Codigo invalido");

        this.codigo = codigo;
    }   

    /**
    Seta um novo nome para ser substituído na instância chamante.
    @param nome String que representa o nome do cliente.
    @throws Exception se o nome não foi passado ou for uma cadeia vazia.
    */
    public void setNome (String nome) throws Exception
    {
        if (nome==null || nome.equals(""))
            throw new Exception ("Nome nao fornecido");

        this.nome = nome;
    }
    
    /**
    Seta um novo email para ser substituído na instância chamante.
    @param email String que representa o email do cliente.
    @throws Exception se o email não foi passado ou for uma cadeia vazia.
    */
    public void setEmail (String email) throws Exception
    {
        if (email==null || email.equals(""))
            throw new Exception ("Email nao fornecido");

        this.email = email;
    }
    
    /**
    Seta um novo telefone para ser substituído na instância chamante.
    @param telefone String que representa o telefone do cliente.
    @throws Exception se o telefone não foi passado ou for uma cadeia vazia.
    */
    public void setTelefone (String telefone) throws Exception
    {
        if (telefone==null || telefone.equals(""))
            throw new Exception ("Telefone nao fornecido");

        this.telefone = telefone;
    }

    /**
    Seta um novo assunto para ser substituído na instância chamante.
    @param assunto String que representa o assunto da mensagem deixada pelo cliente.
    @throws Exception se o assunto não foi passado ou for uma cadeia vazia.
    */
    public void setAssunto (String assunto) throws Exception
    {
    	if (assunto==null || assunto.equals(""))
            throw new Exception ("Assunto nao fornecido");

        this.assunto = assunto;
    }
    
    /**
    Seta uma nova mensagem para ser substituído na instância chamante.
    @param mensagem String que representa a mensagem deixada pelo cliente.
    @throws Exception se a mensagem não foi passada ou for uma cadeia vazia.
    */
    public void setMensagem (String mensagem) throws Exception
    {
    	if (mensagem==null || mensagem.equals(""))
            throw new Exception ("Mensagem nao fornecida");

        this.mensagem = mensagem;
    }
    
    /**
    Retorna o código da mensagem.
    @return Um inteiro que representa o código da mensagem.
    */
    public int getCodigo ()
    {
        return this.codigo;
    }

    /**
    Retorna o nome do cliente.
    @return Uma String que representa o nome do cliente.
    */
    public String getNome ()
    {
        return this.nome;
    }
    
    /**
    Retorna o email do cliente.
    @return Uma String que representa o email do cliente.
    */
    public String getEmail ()
    {
        return this.email;
    }
    
    /**
    Retorna o telefone do cliente.
    @return Uma String que representa o telefone do cliente.
    */
    public String getTelefone ()
    {
        return this.telefone;
    }

    /**
    Retorna o assutno do cliente.
    @return Uma String que representa o assunto da mensagem deixada pelo cliente.
    */
    public String getAssunto ()
    {
        return this.assunto;
    }
    
    /**
    Retorna a mensagem do cliente.
    @return Uma String que representa a mensagem deixada pelo cliente.
    */
    public String getMensagem ()
    {
        return this.mensagem;
    }
    
    /**
    Constroi uma nova instância da classe Contato.
    Esse construtor não seta nenhum valor na instância, afim de ser setato posteriormente,
    por um método de uma classe do tipo DAO.
    */
    public Contato () 
    {}
    
    /**
    Constroi uma nova instância da classe Cliente.
    Para tanto, deve ser fornecido todos os dados de um cliente.
    @param codigo Inteiro que representa o código do cliente.
    @param nome String que representa o nome do cliente.
    @param email String que representa o e-mail do cliente.
    @param telefone String que representa o telefone do cliente.
    @param assunto String que representa o assunto da mensagem deixada pelo cliente.
    @param mensagem String que representa a mensagem deixada pelo cliente.
    @throws Exception É lançada exceção se algum dos parâmetros forem passados de forma incorreta.
    */
    public Contato (int codigo, String nome, String email, String telefone, String assunto, String mensagem) throws Exception
    {
        this.setCodigo     (codigo);
        this.setNome       (nome);
        this.setEmail      (email);
        this.setTelefone   (telefone);
        this.setAssunto    (assunto);
        this.setMensagem   (mensagem);
    }

    /**
    Gera uma representação textual da classe Contato.
    Produz e resulta um String com todos os dados da mensagem.
    @return um String contendo todo o conteúdo da classe Contato.
    */
    public String toString ()
    {
        String ret="";

        ret+="Codigo....: "+this.codigo   +"\n";
        ret+="Nome......: "+this.nome     +"\n";
        ret+="Email.....: "+this.email    +"\n";
        ret+="Telefone..: "+this.telefone +"\n";
        ret+="Assunto...: "+this.assunto  +"\n";
        ret+="Mensagem..: "+this.mensagem +"\n";

        return ret;
    }

    /**
    Verifica a igualdade entre duas instâncias de Contato.
    Verifica se o Object fornecido como parâmetro representa um
    contato igual àquele representada pela instância a qual este
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

        if (!(obj instanceof Contato))
            return false;

        Contato cont = (Contato)obj;

        if (this.codigo!=cont.codigo)
            return false;

        if (this.nome.equals(cont.nome))
            return false;
        
        if (this.email.equals(cont.email))
            return false;
        
        if (this.telefone.equals(cont.telefone))
            return false;

        if (this.assunto.equals(cont.assunto))
            return false;
        
        if (this.mensagem.equals(cont.mensagem))
            return false;

        return true;
    }

    /**
    Calcula o código de espalhamento (ou código de hash) da classe Contato.
    Calcula e resulta o código de espalhamento (ou código de hash, ou ainda o
    hashcode) da classe Contato representada pela instância a qual o método for aplicado.
    @return o código de espalhamento da instância chamante do método.
    */
    public int hashCode ()
    {
        int ret=666;

        ret = 7*ret + new Integer(this.codigo).hashCode();
        ret = 7*ret + this.nome.hashCode();
        ret = 7*ret + this.email.hashCode();
        ret = 7*ret + this.telefone.hashCode();
        ret = 7*ret + this.assunto.hashCode();
        ret = 7*ret + this.mensagem.hashCode();

        return ret;
    }

    /**
    Copia os dados da instância atual para a instânicia passada.
    Para tanto, deve ser fornecida uma instância da classe Contato para ser copiada.
    @param modelo a instância da classe Contato a ser usada como modelo.
    @throws Exception se o modelo for null.
    */
    public Contato (Contato modelo) throws Exception
    {
         if (modelo == null)
            throw new Exception ("Contato inválido");
         
        this.codigo      = modelo.codigo; 
        this.nome        = modelo.nome;  
        this.email       = modelo.email;
        this.telefone    = modelo.telefone;
        this.assunto     = modelo.assunto;  
        this.mensagem    = modelo.mensagem;
    }

    /**
    Constroi uma cópia da instância da classe Contato dada.
    Para tanto, chama o construtor de cópia.
    @return retorna um objeto construído com todos os dados da instância chamante.
    */
    public Object clone ()
    {
    	Contato ret=null;

        try
        {
            ret = new Contato (this);
        }
        catch (Exception erro)
        {} 

        return ret;
    }
}