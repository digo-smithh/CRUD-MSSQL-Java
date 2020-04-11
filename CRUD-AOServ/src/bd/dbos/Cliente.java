package bd.dbos;

/**
A classe Cliente armazena os dados necessários de um cliente.
Nela há todos os parâmetros necessários para um cliente.
Métodos dessa classe (SETTERs e GETTERs) permitem verificar e atualizar os dados.
@author Rodrigo Smith Rodrigues.
@since 2019.
*/
public class Cliente implements Cloneable
{
    private int codigo;
    private String nome;
    private String sexo;
    private String dataNascimento;
    private String telefone;
    private String cpf;
    private String email;
    private String senha;

    /**
    Seta um novo código para ser substituído na instância chamante.
    @param codCliente Inteiro que representa o código do cliente.
    @throws Exception se o código for menor do que 0.
    */
    public void setCodigo (int codCliente) throws Exception
    {
        if (codCliente <= 0)
            throw new Exception ("Codigo inválido");

        this.codigo = codCliente;
    }

    /**
    Seta um novo nome para ser substituído na instância chamante.
    @param nome String que representa o nome do cliente.
    @throws Exception se o nome não foi passado ou for uma cadeia vazia.
    */
    public void setNome (String nome) throws Exception
    {
        if (nome==null || nome.equals(""))
            throw new Exception ("Nome não fornecido");

        this.nome = nome;
    }

    /**
    Seta um novo sexo para ser substituído na instância chamante.
    @param sexo String que representa o sexo do cliente.
    @throws Exception se o sexo não foi passado ou for uma cadeia vazia.
    */
    public void setSexo (String sexo) throws Exception
    {
        if (sexo==null || sexo.equals(""))
            throw new Exception ("Sexo não fornecido");

        this.sexo = sexo;
    }

    /**
    Seta uma nova data de nascimento para ser substituída na instância chamante.
    @param dataNascimento String que representa a dataNascimento do cliente.
    @throws Exception se a dataNascimento não foi passada ou for uma cadeia vazia.
    */
    public void setDataNascimento (String dataNascimento) throws Exception
    {
        if (dataNascimento==null || dataNascimento.equals(""))
            throw new Exception ("Data de nascimento não fornecida");

        this.dataNascimento = dataNascimento;
    }

    /**
    Seta um novo telefone para ser substituído na instância chamante.
    @param telefone String que representa o telefone do cliente.
    @throws Exception se o telefone não foi passado ou for uma cadeia vazia.
    */
    public void setTelefone (String telefone) throws Exception
    {
        if (telefone==null || telefone.equals(""))
            throw new Exception ("Telefone não fornecido");

        this.telefone = telefone;
    }

    /**
    Seta um novo CPF para ser substituído na instância chamante.
    @param cpf String que representa o CPF do cliente.
    @throws Exception se o CPF não foi passado ou for uma cadeia vazia.
    */
    public void setCpf (String cpf) throws Exception
    {
        if (cpf==null || cpf.equals(""))
            throw new Exception ("CPF não fornecido");

        this.cpf = cpf;
    }

    /**
    Seta um novo email para ser substituído na instância chamante.
    @param email String que representa o email do cliente.
    @throws Exception se o email não foi passado ou for uma cadeia vazia.
    */
    public void setEmail (String email) throws Exception
    {
        if (email==null || email.equals(""))
            throw new Exception ("Email não fornecido");

        this.email = email;
    }

    /**
    Seta uma nova senha para ser substituída na instância chamante.
    @param senha String que representa a senha do cliente.
    @throws Exception se a senha não foi passada ou for uma cadeia vazia.
    */
    public void setSenha (String senha) throws Exception
    {
        if (senha==null || senha.equals(""))
            throw new Exception ("Senha não fornecida");

        this.senha = senha;
    }

    /**
    Retorna o código do cliente.
    @return Um inteiro que representa o código do cliente.
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
    Retorna o sexo do cliente.
    @return Uma String que representa o sexo do cliente.
    */
    public String getSexo ()
    {
        return this.sexo;
    }

    /**
    Retorna a data de nascimento do cliente.
    @return Uma String que representa a data de nascimento do cliente.
    */
    public String getDataNascimento ()
    {
        return this.dataNascimento;
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
    Retorna o CPF do cliente.
    @return Uma String que representa o CPF do cliente.
    */
    public String getCpf ()
    {
        return this.cpf;
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
    Retorna a senha do cliente.
    @return Uma String que representa a senha do cliente.
    */
    public String getSenha ()
    {
        return this.senha;
    }

    /**
    Constroi uma nova instância da classe Cliente.
    Esse construtor não seta nenhum valor na instância, afim de ser setato posteriormente,
    por um método de uma classe do tipo DAO.
    */
    public Cliente ()
    {}

    /**
    Constroi uma nova instância da classe Cliente.
    Para tanto, deve ser fornecido todos os dados de um cliente.
    @param codigo Inteiro que representa o código do cliente.
    @param nome String que representa o nome do cliente.
    @param sexo String que representa o sexo do cliente.
    @param dataNascimento String que representa a data de nascimento do cliente.
    @param telefone String que representa o telefone do cliente.
    @param cpf String que representa o CPF do cliente.
    @param email String que representa o e-mail do cliente.
    @param senha String que representa a senha do cliente.
    @throws Exception É lançada exceção se algum dos parâmetros forem passados de forma incorreta.
    */
    public Cliente (int codigo, String nome, String sexo, String dataNascimento, String telefone, String cpf, String email, String senha) throws Exception
    {
        this.setCodigo         (codigo);
        this.setNome       	   (nome);
        this.setSexo  		   (sexo);
        this.setDataNascimento (dataNascimento);
        this.setTelefone       (telefone);
        this.setCpf  		   (cpf);
        this.setEmail          (email);
        this.setSenha          (senha);
	}

    /**
    Gera uma representação textual da classe Cliente.
    Produz e resulta um String com todos os dados do cliente.
    @return um String contendo todo o conteúdo da classe Cliente.
    */
    public String toString ()
    {
        String ret="";

        ret+="Codigo.............: "+this.codigo         +"\n";
        ret+="Nome...............: "+this.nome           +"\n";
        ret+="Sexo...............: "+this.sexo           +"\n";
        ret+="Data de nascimento.: "+this.dataNascimento +"\n";
        ret+="Telefone...........: "+this.telefone       +"\n";
        ret+="CPF................: "+this.cpf            +"\n";
        ret+="Email..............: "+this.email          +"\n";
        ret+="Senha..............: "+this.senha          +"\n";

        return ret;
    }

    /**
    Verifica a igualdade entre duas instâncias de Cliente.
    Verifica se o Object fornecido como parâmetro representa um
    cliente igual àquele representada pela instância a qual este
    método for aplicado, resultando true em caso afirmativo,
    ou false, caso contrário.
    @param  obj o objeto a ser comparado com a instância a qual esse método
            for aplicado.
    @return true, caso o Object fornecido ao método e a instância chamante do
            método representarem agendas iguais, ou false, caso contrário.
    */
    public boolean equals (Object obj)
    {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (!(obj instanceof Cliente))
            return false;

        Cliente cli = (Cliente)obj;

        if (this.codigo!=cli.codigo)
            return false;

        if (this.nome.equals(cli.nome))
            return false;

        if (this.sexo.equals(cli.sexo))
            return false;

        if (this.dataNascimento.equals(cli.dataNascimento))
            return false;

        if (this.telefone.equals(cli.telefone))
            return false;

        if (this.cpf.equals(cli.cpf))
            return false;

        if (this.email.equals(cli.email))
            return false;

        if (this.senha.equals(cli.senha))
            return false;

        return true;
    }

    /**
    Calcula o código de espalhamento (ou código de hash) da classe Cliente.
    Calcula e resulta o código de espalhamento (ou código de hash, ou ainda o
    hashcode) da classe Cliente representada pela instância a qual o método for aplicado.
    @return o código de espalhamento da instância chamante do método.
    */
    public int hashCode ()
    {
        int ret=666;

        ret = 7*ret + new Integer(this.codigo).hashCode();
        ret += 7*ret + this.nome.hashCode();
        ret += 7*ret + this.sexo.hashCode();
        ret += 7*ret + this.dataNascimento.hashCode();
        ret += 7*ret + this.telefone.hashCode();
        ret += 7*ret + this.cpf.hashCode();
        ret += 7*ret + this.email.hashCode();
        ret += 7*ret + this.senha.hashCode();

		if (ret < 0)
			ret = -ret;

        return ret;
    }

    /**
    Copia os dados da instância atual para a instânicia passada.
    Para tanto, deve ser fornecida uma instância da classe Cliente para ser copiada.
    @param modelo a instância da classe Cliente a ser usada como modelo.
    @throws Exception se o modelo for null.
    */
    public Cliente (Cliente modelo) throws Exception
    {
        if (modelo == null)
            throw new Exception ("Cliente inválido");

        this.codigo           = modelo.codigo;
        this.nome             = modelo.nome;
        this.sexo             = modelo.sexo;
        this.dataNascimento   = modelo.dataNascimento;
        this.telefone         = modelo.telefone;
        this.cpf              = modelo.cpf;
        this.email            = modelo.email;
        this.senha            = modelo.senha;
    }

    /**
    Constroi uma cópia da instância da classe Cliente dada.
    Para tanto, chama o construtor de cópia.
    @return retorna um objeto construído com todos os dados da instância chamante.
    */
    public Object clone ()
    {
        Cliente ret=null;

        try
        {
            ret = new Cliente (this);
        }
        catch (Exception erro)
        {}

        return ret;
    }
}