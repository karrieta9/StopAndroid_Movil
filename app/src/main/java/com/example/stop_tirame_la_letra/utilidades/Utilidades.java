package com.example.stop_tirame_la_letra.utilidades;

public class Utilidades {

    //campos tabla
    public static final String tabla = "usuarios";
    public static final String campo_nombre = "nombre";
    public static final String campo_pass = "password";
    public static final String campo_email = "email";
    public static final String campo_fecha = "fecha";


    public static final String query = "CREATE TABLE "+tabla+" (id INTEGER PRIMARY KEY AUTOINCREMENT, "+campo_nombre+" TEXT, "+campo_pass+" TEXT, "+campo_email+" TEXT, "+campo_fecha+" TEXT)";

}
