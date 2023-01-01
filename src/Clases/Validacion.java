/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formularios.Login;//IMPORTANDO DESDE EL PAQUETE DE fORMULARIOS
/*import com.sun.glass.events.KeyEvent;
import com.sun.webkit.graphics.GraphicsDecoder;*/
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


/**
 *
 * @author JOSE
 */
public class Validacion extends Persona
{

    //declaración de variables
    String Nomusua;
    String conra;
    
    //constructores
    
    public Validacion() 
    { 
        
    }

    public String getNomusua() {
        return Nomusua;
    }

    public void setNomusua(String Nomusua) {
        this.Nomusua = Nomusua;
    }

    public String getConra() {
        return conra;
    }

    public void setConra(String conra) {
        this.conra = conra;
    }

    
    
    //metodos
    public Validacion(String identi, String nom, String apel, String sexo, String correo, String cargo, String tel,String cel) {
        super(identi, nom, apel, sexo, correo, cargo,tel,cel);
    }
    
    public boolean camposenblancorn(JTextField id,JTextField nom, JTextField apel, JTextField tel,JTextField cel, JTextField correo)
    {
        //JDateChooser fechana;
        return(id.getText().equals("") ||nom.getText().equals("")|| apel.getText().equals("") 
                || tel.getText().equals("") || cel.getText().equals("") || correo.getText().equals(""));

            
            //JOptionPane.showMessageDialog(rootPane, "Por favor complete los espacios en blanco", "ERROR AL REGISTRAR", JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean camposenblancorp(JTextField id,JTextField nom, JTextField apel,JTextField cel, JTextField correo)
    {
        //JDateChooser fechana;
        return(id.getText().equals("") ||nom.getText().equals("")|| apel.getText().equals("") 
                || cel.getText().equals("") || correo.getText().equals(""));

            
            //JOptionPane.showMessageDialog(rootPane, "Por favor complete los espacios en blanco", "ERROR AL REGISTRAR", JOptionPane.ERROR_MESSAGE);
    }
    
    public boolean validarregistrocampos(JTextField nomusu,JPasswordField contra)
    {
        return(nomusu.getText().equals("")||contra.getText().equals(""));
    }
    
    
    public boolean validarjcheck( JCheckBox adminis,JCheckBox secretaria, JCheckBox sacristan){
        return (adminis.isSelected()||secretaria.isSelected() || sacristan.isSelected() );
    }
    
    public boolean validarcombox(JComboBox vica, JComboBox parro)
    {
       int vic=vica.getSelectedIndex();
       int par=parro.getSelectedIndex();
       
        return ( vic==0);// retorna que no ha seleccionado ninguno
    }
    
    public boolean cantidaddedigitosid(JTextField id)
    {
        return(id.getText().length()<8 || id.getText().length()>11);   
    }//fin metodo
    
    public boolean validarcel(JTextField cel)
    {
        return cel.getText().length()>=10;
    }
    public boolean cantidadletras(String texto)
    {
        
        return (texto.length()<0 || texto.length()>10);
        
    }
    
    
    public void solotexto(char letra, java.awt.event.KeyEvent evt)
    {
        if((letra<'a'|| letra>'z') && (letra < 'A'||letra >'Z') && letra != KeyEvent.VK_BACK_SPACE && letra !=' ')
        {
          JOptionPane.showMessageDialog(null, "Sólo se permiten letras", "Mensaje", JOptionPane.ERROR_MESSAGE);
          evt.consume();
        }//finsi
        
    }
    
    public void solonumeros(char num, java.awt.event.KeyEvent evt)
    {
        if((num < '0' || num > '9')&&(num!= KeyEvent.VK_BACK_SPACE || num ==' '))
        {
            JOptionPane.showMessageDialog(null, "Sólo se permiten Números", "Señor Usuario", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }//finsi
    }//finmetodo
    
    
   
    
    public boolean catidaddedigitostel(JTextField tel)
    {
        return (tel.getText().length()<7);
    }
    
    public boolean validarsexo(JRadioButton M,JRadioButton F)
    {
        return(M.isSelected() || F.isSelected());
    }
    
    
    //validadno Ingre(Login)
    
    public boolean validarIngreso(JTextField NomUsu,JPasswordField contra)
    {
        return(NomUsu.getText().trim().equals("") || contra.getText().trim().equals(""));
    }
       
    //fecha
    public String fecha(JDateChooser jdfecha)
    {
        String dia= Integer.toString(jdfecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes= Integer.toString(jdfecha.getCalendar().get(Calendar.MONTH+1));
        String year =Integer.toString(jdfecha.getCalendar().get(Calendar.YEAR));
        String fecha=(dia+"-"+mes+"-"+year);
        return fecha;
    }
       
    //validar correo
    /*public void validaremail(JTextField email)
    {
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher((CharSequence) email.getText());
    }*/
    
    //validar campos en blanco RP
    
    public boolean camposenblancoRP(JTextField nom, JTextField apel, JTextField tel,JTextField cel)
    {
        //JDateChooser fechana;
        return(nom.getText().equals("")|| apel.getText().equals("") 
                || tel.getText().equals("") || cel.getText().equals(""));

            
            //JOptionPane.showMessageDialog(rootPane, "Por favor complete los espacios en blanco", "ERROR AL REGISTRAR", JOptionPane.ERROR_MESSAGE);
    }
    //metodo para validar correo electronio
public boolean isEmail(JTextField correo) {
Pattern pat = null;
Matcher mat = null; 
pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
mat = pat.matcher(correo.getText());
    if (mat.find()) 
    {
            System.out.println("[" + mat.group() + "]");
            return true;
    }else{
        return false;
    }   
}
  

//validando registroGrupo
public boolean camposvaciosrg(  JTextField codigo, JTextField nombregrupo)
{
    return (codigo.getText().equals("") || nombregrupo.getText().equals(""));
}
    
}//fin clase validacion
