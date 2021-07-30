package programacionoo;

import javax.swing.JOptionPane;

/**
 *
 * @author Gerson Arlindo
 */
public class ProgramacionOO {

    public static void main(String[] args) {
        telefono objTelefono = new telefono();
        int continuar = 1;
        while(continuar == 1){
            Object [] opciones = {
                "Comprar telefono",
                "Recargar Saldo",
                "Regalar Saldo",
                "Cambiar Tarifa",
                "Hacer Llamada", 
                "Mostar Informacion",
                "Salir"
            };
            Object opcion = JOptionPane.showInputDialog(null, "Selecciona una Opcion", 
                    "Elegir", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opcion.toString()){
                case "Salir":
                    continuar = 0;
                    break;
                case "Comprar telefono":
                    if(!objTelefono.getTelefono().equals("00000000")){
                    JOptionPane.showMessageDialog(null, "Ya compro un telefono no?");
                    }else{
                    String telefono, marca;
                    Double precio;
                    telefono = JOptionPane.showInputDialog("Numero del telefono");
                    marca = JOptionPane.showInputDialog("Introduzca la marca");
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el Precio en dolares"));
                    
                    if(!telefono.equals("")){
                        objTelefono.setTelefono(telefono);
                        objTelefono.setMarca(marca);
                        objTelefono.setPrecio(precio);
                        JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente");
                    }
                }break;
                
                //********************Recargar Saldo**************************
                    case "Recargar Saldo":
                    if(!objTelefono.getTelefono().equals("00000000")){
                    Double cantidad;
                    cantidad = Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Recargar"));
                    objTelefono.recargarSaldo(cantidad);
                    }else{
                    JOptionPane.showMessageDialog(null, "No Ha registrado ningun telefono");
                    }
                    break;
                //********************Recargar Saldo**************************
                    
                //********************Regalar Saldo***************************
                    case "Regalar Saldo":
                    if(!objTelefono.getTelefono().equals("00000000")){
                    Double regalo;
                    String telefonoARecargar;
                    telefonoARecargar = JOptionPane.showInputDialog("Numero a Regalar");
                    regalo = Double.parseDouble(JOptionPane.showInputDialog("Cantidad a Regalar"));
                    objTelefono.regalarSaldo(telefonoARecargar, regalo);
                    }else{
                    JOptionPane.showMessageDialog(null, "No Ha registrado ningun telefono");
                    }
                    break;
                //********************Regalar Saldo***************************
                    
                //********************Cambiar Tarifa***************************
                    case "Cambiar Tarifa":
                    Double tarifa;
                    tarifa = Double.parseDouble(JOptionPane.showInputDialog("Nuevo valor de la tarifa"));
                    objTelefono.cambiarTarifa(tarifa);
                    break;
                //********************Cambiar Tarifa***************************
                    
                //********************Mostrar Informacion***************************
                    case "Mostar Informacion":
                    objTelefono.mostrarInformacion();
                    break;
                //********************Mostrar Informacion***************************
                case "Hacer Llamada":
                    if(!objTelefono.getTelefono().equals("00000000")){
                    String telefonoDestino;
                    int minutos;
                    telefonoDestino = JOptionPane.showInputDialog("Numero a llamar");
                    minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos a llamar"));
                    objTelefono.realizarLlamada(telefonoDestino, minutos);
                    }else{
                    JOptionPane.showMessageDialog(null, "No Ha registrado ningun telefono");
                    }
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias Por Visitarnos Vuelva Pronto XD");
    }
    
}
