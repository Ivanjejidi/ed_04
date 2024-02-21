package cuentas;
/**
 * Clase para gestionar una cuenta bancaria. 
 * @author Iván
 */
public class CCuenta {

    /**
     * nos devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * nombre a asignar. 
     * @param nombre  
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * nos devuelve la cuenta 
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * cuenta a asignar.
     * @param cuenta  
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * nos devuelve el saldo
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * saldo a asignar. 
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * nos devuelve  tipoInterés
     * @return tipoInteres 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * tipo de interes a asignar.
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * constructor por defecto. 
     */
    public CCuenta()
    {
    }
  
    /**
     * constructor parametrizado. 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * metodo que nos devuelve el estado de la cuenta.
     * @return saldo 
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * metodo que nos permite ingresar saldo en la cuenta. 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * metodo que nos permite retirar saldo de la cuenta. 
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
