
package com.ap.portfolio.controller;

import com.ap.portfolio.model.Descripcion;
import com.ap.portfolio.model.Estudio;
import com.ap.portfolio.model.Progreso;
import com.ap.portfolio.model.Proyecto;
import com.ap.portfolio.model.Token;
import com.ap.portfolio.model.Trabajo;
import com.ap.portfolio.model.Usuario;
import com.ap.portfolio.service.IDescripcionService;
import com.ap.portfolio.service.IEstudioService;
import com.ap.portfolio.service.IProgresoService;
import com.ap.portfolio.service.IProyectoService;
import com.ap.portfolio.service.ITrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

        
        @Autowired
        private IDescripcionService desServ;
        @Autowired
        private ITrabajoService trabServ;
        @Autowired
        private IEstudioService estServ;
        @Autowired
        private IProgresoService proServ;
        @Autowired
        private IProyectoService proyServ;
        
        //DESCRIPCION
        @PostMapping("/new/descripcion")
        public void crearDescripcion(@RequestBody Descripcion des){
            desServ.crearDescripcion(des);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @PutMapping("/edit/descripcion")
        public void editarDescripcion(@RequestBody Descripcion des){
            desServ.editarDescripcion(des, 1);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/verDescripcion")
        //@ResponseBody
        public Descripcion verDescripcion (){
           return desServ.verDescripcion(1);
           
        }

        //TRABAJO
        @CrossOrigin(origins = "http://localhost:4200")
        @PostMapping("/new/trabajo")
        public void agregarTrabajo(@RequestBody Trabajo trab){
            trabServ.crearTrabajo(trab);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/verTrabajos")
        public List<Trabajo> verTrabajos (){
           return trabServ.verTrabajos();  
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @DeleteMapping("/borrarTrabajo/{id}")
        public void borrarTrabajo(@PathVariable int id){
            trabServ.eliminarTrabajo(id);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/buscarTrabajo/{id}")
        public Trabajo buscarTrabajo(@PathVariable int id){
           return trabServ.buscarTrabajo(id);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @PutMapping("/edit/trabajo/{id}")
        public void editarTrabajo(@RequestBody Trabajo trab, @PathVariable int id){
            trabServ.editarTrabajo(trab, id);
        }
        
        //ESTUDIO
        @CrossOrigin(origins = "http://localhost:4200")
        @PostMapping("/new/estudio")
        public void agregarEstudio(@RequestBody Estudio est){
            estServ.crearEstudio(est);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/verEstudios")
        public List<Estudio> verEstudios (){
           return estServ.verEstudios();  
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @DeleteMapping("/borrarEstudio/{id}")
        public void borrarEstudio(@PathVariable int id){
            estServ.eliminarEstudio(id);
        }
            
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/buscarEstudio/{id}")
        public Estudio buscarEstudio(@PathVariable int id){
           return estServ.buscarEstudio(id);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @PutMapping("/edit/estudio/{id}")
        public void editarEstudio(@RequestBody Estudio est, @PathVariable int id){
            estServ.editarEstudio(est, id);
        }
        
        //PROGRESO
        @CrossOrigin(origins = "http://localhost:4200")
        @PostMapping("/new/progreso")
        public void agregarProgreso(@RequestBody Progreso pro){
            proServ.crearProgreso(pro);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/verProgresos")
        public List<Progreso> verProgresos (){
           return proServ.verProgresos();  
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @DeleteMapping("/borrarProgreso/{id}")
        public void borrarProgreso(@PathVariable int id){
            proServ.eliminarProgreso(id);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/buscarProgreso/{id}")
        public Progreso buscarProgreso(@PathVariable int id){
           return proServ.buscarProgreso(id);
           
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @PutMapping("/edit/progreso/{id}")
        public void editarProgreso(@RequestBody Progreso pro, @PathVariable int id){
            proServ.editarProgreso(pro, id);
        }
        
        //PROYECTO
        @CrossOrigin(origins = "http://localhost:4200")
        @PostMapping("/new/proyecto")
        public void agregarProyecto(@RequestBody Proyecto proy){
            proyServ.crearProyecto(proy);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/verProyectos")
        public List<Proyecto> verProyectos (){
           return proyServ.verProyectos();  
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @DeleteMapping("/borrarProyecto/{id}")
        public void borrarProyecto(@PathVariable int id){
            proyServ.eliminarProyecto(id);
        }

        @CrossOrigin(origins = "http://localhost:4200")
        @GetMapping("/buscarProyecto/{id}")
        public Proyecto buscarProyecto(@PathVariable int id){
           return proyServ.buscarProyecto(id);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @PutMapping("/edit/proyecto/{id}")
        public void editarProyecto(@RequestBody Proyecto proy, @PathVariable int id){
            proyServ.editarProyecto(proy, id);
        }
        
        @CrossOrigin(origins = "http://localhost:4200")
        @PutMapping("/token")
        @ResponseBody
        public Token autorizar(@RequestBody Usuario user){
            String tok= "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6ImFkbWluIiwiaWF0IjoxNTE2MjM5MDIyfQ.vuVjQ5DpW01iyXNRNJenosW7LndiG0uDK0CpCf7uoFE" ;
            Long duration= 900_000L;
            String type="Bearer";
            
            Token token = new Token(tok,type,duration);
            if("admin@admin".equals(user.getEmail()) && "admin".equals(user.getPassword())){
                return token;
                
            }
            return null;
            
            
        }
        


}
