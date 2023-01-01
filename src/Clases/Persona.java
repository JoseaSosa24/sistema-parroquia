
package Clases;

import java.util.Date;

/**
 *
 * @author JOSE
 */
public class Persona 
{
    //Atributos propio y privados
    private String identi,nom,apel,sexo,correo,cargo;
    private String  tel,cel;
    
    
    //Constructores

    public Persona() {}

    public Persona(String identi,String nom, String apel, String sexo, String correo,String cargo,String tel, String cel) 
    {
        this.identi = identi;
        this.nom = nom;
        this.apel = apel;
        this.sexo = sexo;
        this.correo = correo;
        this.cargo = cargo;
        this.tel = tel;
        this.cel = cel;
        
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

   

   

    

    
    
    @Override
    public String toString() {
        return "Datos: \n" 
                + "Identificaciòn: " + identi 
                + "\n Nombre: " + nom 
                + "\n Apellido: " + apel
                + "\n Sexo: " + sexo 
                + " Correo: " + correo  
                + "\n Fecha de Nacimiento"
                + "\n Telèfono: " + tel 
                + "\n Celular: "  +cel
                + "\n"+cargo;
    }
    
    

       
    
   
    
    
    
    
    
    
}//fin clase
