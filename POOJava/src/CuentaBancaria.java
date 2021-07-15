
public class CuentaBancaria {

	//Defino atributos
	private String institucion="";
	private String beneficiario="";
	private float saldo=0;
	private long cuenta=0;
	private String producto="";
	private String direccion="";
	private String rfc="";
	
	
	
	
	
	
	//Creo un constructor: Sirven para inicializar un objetos con valores
	CuentaBancaria(String beneficiario, float saldo){
		//El this es para hacer referencia a los atibutos propios de la clase
		this.beneficiario=beneficiario;
		this.saldo=saldo;
	}
	CuentaBancaria(){
		
	}
	
	/*get obtener el valor y set para escribir el valor*/
	
	public String getInstitucion() {
		return this.institucion;
	}
	
	public void setInstitucion(String institucion) {
		this.institucion=institucion;
	}

	
	
	public String getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		if(saldo>0) {
			this.saldo = saldo;
		} else {
			//throw es para arrojar un error
			throw new IllegalArgumentException("El saldo ingresado es inválido"); 
		}
	}
	
	
	public long getCuenta() {
		return cuenta;
	}
	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}
	
	
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	
	//Defino los metodos de la clase
	public void depositos(float monto) {
		//Con this. hacemos referencia a un atributo 
		this.saldo=this.saldo+monto;
		
	}
	
	public void retiros(float monto) {
		if(monto<=this.saldo && monto>0) {
			this.saldo=this.saldo-monto;
		}
		
		
	}
	
	public float consultarSaldo() {
		return this.saldo;
		
	}
	
	public String estadoDeCuenta() {
		return "";
	}
	
	
}
