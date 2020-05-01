package com.pruebagroovy

import grails.gorm.services.Service

@Service(Usuario)
interface UsuarioService {

    Usuario get(Serializable id)

    Usuario findByNombre(String nombre);

    List<Usuario> list(Map args)

    Long count()

    void delete(Serializable id)

    Usuario save(Usuario usuario)

}