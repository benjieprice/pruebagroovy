package com.pruebagroovy

class Usuario {

    Integer id
    String nombre
    Integer documento

    static constraints = {
        id column: 'Id_usuario', type: 'integer'
        nombre column: 'Nombre', type: 'string'
        documento column: 'Documento', type: 'integer'
    }
}
