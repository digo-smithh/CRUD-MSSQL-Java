package bd.dbos;

/**
 * A classe Designer armazena os dados necessários de um designer. Nela há todos
 * os parâmetros necessários para o cadastro de um designer. Métodos dessa
 * classe (SETTERs e GETTERs) permitem verificar e atualizar os dados.
 *
 * @author Eduardo de Almeida Migueis.
 * @author Rodrigo Smith Rodrigues.
 * @since 2020.
 */
public class Designer implements Cloneable {

    private int codigo;
    private String nome;
    private String especializacao;
    private String email;
    private String telefone;
    private String cep;
    private int numero;
    private String complemento;

    /**
     * Seta um novo código para ser substituído na instância chamante.
     *
     * @param codigo Inteiro que representa o código do designer.
     * @throws Exception se o código for menor do que 0.
     */
    public void setCodigo(int codigo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("Codigo inválido");
        }

        this.codigo = codigo;
    }

    /**
     * Seta um novo nome para ser substituído na instância chamante.
     *
     * @param nome String que representa o nome do designer.
     * @throws Exception se o cep não foi passado ou for uma cadeia vazia.
     */
    public void setNome(String nome) throws Exception {
        if (nome == null || nome.equals("")) {
            throw new Exception("Nome não fornecido");
        }

        this.nome = nome;
    }

    /**
     * Seta uma nova especializacao para ser substituído na instância chamante.
     *
     * @param especializacao String que representa a especialização do designer.
     * @throws Exception se o cep não foi passado ou for uma cadeia vazia.
     */
    public void setEspecializacao(String especializacao) throws Exception {
        if (especializacao == null || especializacao.equals("")) {
            throw new Exception("Especialização não fornecida");
        }

        this.especializacao = especializacao;
    }

    /**
     * Seta um novo email para ser substituído na instância chamante.
     *
     * @param email String que representa o email do designer.
     * @throws Exception se o cep não foi passado ou for uma cadeia vazia.
     */
    public void setEmail(String email) throws Exception {
        if (email == null || email.equals("")) {
            throw new Exception("Email não fornecido");
        }

        this.email = email;
    }

    /**
     * Seta um novo telefone para ser substituído na instância chamante.
     *
     * @param telefone String que representa o telefone do designer.
     * @throws Exception se o cep não foi passado ou for uma cadeia vazia.
     */
    public void setTelefone(String telefone) throws Exception {
        if (telefone == null || telefone.equals("")) {
            throw new Exception("Telefone não fornecido");
        }

        this.telefone = telefone;
    }

    /**
     * Seta um novo CEP para ser substituído na instância chamante.
     *
     * @param cep String que representa o cep da residência do designer.
     * @throws Exception se o cep não foi passado ou for uma cadeia vazia.
     */
    public void setCep(String cep) throws Exception {
        if (cep == null || cep.equals("")) {
            throw new Exception("CEP não fornecido");
        }

        this.cep = cep;
    }

    /**
     * Seta um novo numero para ser substituído na instância chamante.
     *
     * @param numero Inteiro que representa o numero da casa do designer.
     * @throws Exception se o numero for menor que 0.
     */
    public void setNumero(int numero) throws Exception {
        if (numero <= 0) {
            throw new Exception("Número da residência inválido");
        }

        this.numero = numero;
    }

    /**
     * Seta um novo complemento para ser substituído na instância chamante.
     *
     * @param complemento String que representa o complemento do endereco do
     * desinger.
     * @throws Exception se o complemento não foi passado ou for uma cadeia
     * vazia.
     */
    public void setComplemento(String complemento) throws Exception {
        if (complemento == null || complemento.equals("")) {
            throw new Exception("Complemento não fornecido");
        }

        this.complemento = complemento;
    }

    /**
     * Retorna o código da desda.
     *
     * @return Um inteiro que representa o código da desda.
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Retorna o nome do designer.
     *
     * @return Uma String que representa o nome do designer.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna a especialização do designer.
     *
     * @return Uma String que representa a especialização do designer.
     */
    public String getEspecializacao() {
        return this.especializacao;
    }

    /**
     * Retorna o telefone do designer.
     *
     * @return Uma String que representa o telefone do designer.
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * Retorna o email do designer.
     *
     * @return Uma String que representa o email do designer.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Retorna o cep de entrega.
     *
     * @return Uma String que representa o cep de entrega.
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * Retorna o numero da casa de entrega.
     *
     * @return Um inteiro que representa o numero da casa de entrega.
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Retorna o complemento do endereço de entrega.
     *
     * @return Uma String que representa o complemento de entrega.
     */
    public String getComplemento() {
        return this.complemento;
    }

    /**
     * Constroi uma nova instância da classe Designer. Esse construtor não seta
     * nenhum valor na instância, afim de ser setato posteriormente, por um
     * método de uma classe do tipo DAO.
     */
    public Designer() {
    }

    /**
     * Constroi uma nova instância da classe Venda. Para tanto, deve ser
     * fornecido todos os dados de uma desda.
     *
     * @param codigo Inteiro que representa o código de cadastro do designer.
     * @param nome String que representa o nome do designer.
     * @param especializacao String que representa e especialização do designer.
     * @param telefone String que representa o telefone do designer.
     * @param email String que representa o email do designer.
     * @param cep String que representa o cep da residência do designer.
     * @param numero Inteiro que representa o número da residência do designer.
     * @param complemento String que representa o complemento do endereço do designer.
     * @throws Exception É lançada exceção se algum dos parâmetros forem
     * passados de forma incorreta.
     */
    public Designer(int codigo, String nome, String especializacao, String email, String telefone, String cep, int numero, String complemento) throws Exception {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCep(cep);
        this.setNumero(numero);
        this.setComplemento(complemento);
    }

    /**
     * Gera uma representação textual da classe Designer. Produz e resulta um
     * String com todos os dados do designer.
     *
     * @return um String contendo todo o conteúdo da classe Venda.
     */
    @Override
    public String toString() {
        String ret = "";

        ret += "Codigo...........: " + this.codigo + "\n";
        ret += "Nome.............: " + this.nome + "\n";
        ret += "Especialização...: " + this.especializacao + "\n";
        ret += "Telefone.........: " + this.telefone + "\n";
        ret += "Email............: " + this.email + "\n";
        ret += "CEP..............: " + this.cep + "\n";
        ret += "Numero...........: " + this.numero + "\n";
        ret += "Complemento......: " + this.complemento + "\n";

        return ret;
    }

    /**
     * Verifica a igualdade entre duas instâncias de Designer. Verifica se o Object
     * fornecido como parâmetro representa um designer igual àquele representado
     * pela instância a qual este método for aplicado, resultando true em caso
     * afirmativo, ou false, caso contrário.
     *
     * @param obj o objeto a ser comparado com a instância a qual esse método
     * for aplicado.
     * @return true, caso o Object fornecido ao método e a instância chamante do
     * método representarem agendas iguais, ou false, caso contrário.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Designer)) {
            return false;
        }

        Designer des = (Designer) obj;

        if (this.codigo != des.codigo) {
            return false;
        }
        
        if (this.nome.equals(des.nome)) {
            return false;
        }
        
        if (this.especializacao.equals(des.especializacao)) {
            return false;
        }
        
        if (this.email.equals(des.email)) {
            return false;
        }
        
        if (this.telefone.equals(des.telefone)) {
            return false;
        }

        if (this.cep.equals(des.cep)) {
            return false;
        }

        if (this.numero != des.numero) {
            return false;
        }

        if (this.complemento.equals(des.complemento)) {
            return false;
        }

        return true;
    }

    /**
     * Calcula o código de espalhamento (ou código de hash) da classe Venda.
     * Calcula e resulta o código de espalhamento (ou código de hash, ou ainda o
     * hashcode) da classe Venda representada pela instância a qual o método for
     * aplicado.
     *
     * @return o código de espalhamento da instância chamante do método.
     */
    public int hashCode() {
        int ret = 666;

        ret = 7 * ret + new Integer(this.codigo).hashCode();
        ret = 7 * ret + this.nome.hashCode();
        ret = 7 * ret + this.especializacao.hashCode();
        ret = 7 * ret + this.email.hashCode();
        ret = 7 * ret + this.telefone.hashCode();
        ret = 7 * ret + this.cep.hashCode();
        ret = 7 * ret + new Integer(this.numero).hashCode();
        ret = 7 * ret + this.complemento.hashCode();

        return ret;
    }

    /**
     * Copia os dados da instância atual para a instânicia passada. Para tanto,
     * deve ser fornecida uma instância da classe Designer para ser copiada.
     *
     * @param modelo a instância da classe Designer a ser usada como modelo.
     * @throws Exception se o modelo for null.
     */
    public Designer(Designer modelo) throws Exception {
        this.codigo = modelo.codigo;
        this.nome = modelo.nome;
        this.especializacao = modelo.especializacao;
        this.email = modelo.email;
        this.telefone = modelo.telefone;
        this.cep = modelo.cep;
        this.numero = modelo.numero;
        this.complemento = modelo.complemento;
    }

    /**
     * Constroi uma cópia da instância da classe Designer dada. Para tanto, chama o
     * construtor de cópia.
     *
     * @return retorna um objeto construído com todos os dados da instância
     * chamante.
     */
    public Object clone() {
        Designer ret = null;

        try {
            ret = new Designer(this);
        } catch (Exception erro) {
        }

        return ret;
    }
}
