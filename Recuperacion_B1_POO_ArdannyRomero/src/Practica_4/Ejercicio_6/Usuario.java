package Practica_4.Ejercicio_6;

public class Usuario {
    private String password;

    public Usuario(String password) {
        this.password = password;
    }

    public boolean verifica_password(String password){
        if (password.length() >= 8){
            return true;}
        else {
            return false;}
    }

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}
