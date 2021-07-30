package programacionoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Arlindo
 */
public class telefono {
    private String telefono;
    private double saldo;
    private String marca;
    private double tarifa=0.10;
    private double precio;
    //Definiendo los GET y SET de las propiedades 
    public String getTelefono (){
        return telefono;
    }
    
    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTarifa(){
        return tarifa;
    }
    
    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }
    
    public double getPrecio(){
    return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    //FIN
    
    //DEFINIENDO EL CONSTRUCTOR
    
    public telefono(){
        this.telefono = "00000000";
        this.saldo = 0.0;
        this.marca = "sin Marca";
        this.precio = 0.0;
    }
    //FIN DEL CONSTRUCTOR
    
    public void realizarLlamada(String telefono, int minutos){
        double saldoGastar;
        double nuevoSaldo = this.saldo;
        saldoGastar = minutos * this.tarifa;
        if(saldoGastar <= this.saldo){
            nuevoSaldo = nuevoSaldo - saldoGastar;
            this.setSaldo(nuevoSaldo);
            JOptionPane.showMessageDialog(null, "Llamada realizada con exito");
        }else{
            JOptionPane.showMessageDialog(null, "Saldo Insufiente");
        }
    }
    
    public void recargarSaldo(double cantidad){
        double nuevoSaldo;
        nuevoSaldo = this.saldo + cantidad;
        this.setSaldo(nuevoSaldo);
        JOptionPane.showMessageDialog(null, "Saldo Cargado con Exito");
    } 
    
        public void regalarSaldo(String telefonoARecargar, double regalo){
        double nuevoSaldo;
        if(regalo <= this.saldo){
        nuevoSaldo = this.saldo - regalo;
        this.setSaldo(nuevoSaldo);
        JOptionPane.showMessageDialog(null, "Saldo Regalado con Exito");
        }else{
        JOptionPane.showMessageDialog(null, "Saldo Insufiente");
        }
    } 
        
        public void cambiarTarifa(double tarifa){
        double nuevaTarifa;
        nuevaTarifa = tarifa;
        this.setTarifa(nuevaTarifa);
        JOptionPane.showMessageDialog(null, "Tarifa Cambiada Exitosamente");
    }
        public void mostrarInformacion(){
        JOptionPane.showMessageDialog(null, "Telefono: "+telefono+"\n"+"marca: "+marca+"\n"+"Precio: "+"$"+precio+"\n"+"Saldo Disponible: "+"$"+saldo+"\n"+"Tarifa Actual: "+"$"+tarifa);
        }
}
