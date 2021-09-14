
package com.empresa.seleccion;

import com.empresa.model.Desarrollador;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jhalejandro
 */
@Path("Aspirante")
public class AspiranterResource {

    @Context
    private UriInfo context;

    public AspiranterResource() {
    }


    static final List<Desarrollador> listaDesarrolladores = new ArrayList<>();
    
    @GET
    @Path("listar")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Desarrollador> ListarAspirantes() {
        Desarrollador d = new Desarrollador();
        d.setIdDesarrallador(1);
        d.setNombre("Juan");
        d.setApellido("Perez");
        d.setRolAspirante("Full Stack");
        listaDesarrolladores.add(d);
        return listaDesarrolladores;
    }
    
    @POST
    @Path("anadir")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Desarrollador> AnadirAspirantes(Desarrollador d) {
        listaDesarrolladores.add(d);
        return listaDesarrolladores;
    }
    
    @POST
    @Path("buscar/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Desarrollador buscarAspirante(@PathParam("id") String id) {
        Desarrollador desarrollador = new Desarrollador();
        for(Desarrollador d : listaDesarrolladores){
            if(d.getIdDesarrallador()== Integer.parseInt(id)){
                desarrollador.setIdDesarrallador(d.getIdDesarrallador());
                desarrollador.setNombre(d.getNombre());
                desarrollador.setApellido(d.getApellido());
                desarrollador.setRolAspirante(d.getRolAspirante());
            }
        }
        return desarrollador;
    }
    
    @DELETE
    @Path("eliminar/{id}")
    @Produces(MediaType.APPLICATION_JSON)

     public Response borrarAspirante(@PathParam("id") String id) {
        Desarrollador desarrollador = new Desarrollador();
        for(Desarrollador d : listaDesarrolladores){
            if(d.getIdDesarrallador()== Integer.parseInt(id)){
            listaDesarrolladores.remove(desarrollador);
            return Response.ok().build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).build();
    }
   
    
}
