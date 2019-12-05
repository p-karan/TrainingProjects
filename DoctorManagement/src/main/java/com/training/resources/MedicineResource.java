package com.training.resources;

import com.training.dao.MedicineDao;
import com.training.entity.Address;
import com.training.entity.Medicine;
import jdk.nashorn.internal.objects.annotations.Getter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/medicine")
public class MedicineResource {

    private MedicineDao dao;

    public MedicineResource() {
        dao=new MedicineDao();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMedicine(){
        Address address=new Address("Mumbai","MH",400064);
        Medicine croceen=new Medicine(101,"Croceen",56.78,address);
        return Response.status(200).entity(croceen).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addMedicine(Medicine medicine){
        Response resp=Response.status(200).entity(medicine).build();
        int rowAdded=dao.add(medicine);
        if(rowAdded==1){
            resp=Response.status(201).entity(medicine).build();
        }
        return resp;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response remove(Medicine medicine) {
        Response resp = Response.status(200).entity("Record not deleted").build();
        int rowDeleted = dao.remove(medicine.getCode());
        if (rowDeleted == 1) {
            resp = Response.status(204).entity(medicine).build();
        }
        return resp;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Medicine medicine){
        Response resp=Response.status(204).entity("Record not updated").build();
        int rowAdded=dao.update(medicine);
        if(rowAdded==1){
            resp=Response.status(200).entity(medicine).build();
        }
        return resp;
    }


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllMedicines(){
        Response resp=Response.status(204).entity("No Medicines in repository").build();
        List medicine=dao.findAll();
        if(medicine!=null){
            resp=Response.status(200).entity(medicine).build();
        }
        return resp;
    }

    @GET
    @Path("/srch/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long key){

        Response resp=Response.status(204).entity("Medicine Code not found").build();
        Medicine medicine=dao.findById(key);
        if(medicine!=null){
            resp=Response.status(200).entity(medicine).build();
        }
        return resp;
    }

}
