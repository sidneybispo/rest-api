package sidneydev.tutorial.rest.api.repository; // Autor: Sidney Bispo

import org.springframework.data.repository.CrudRepository;
import sidneydev.tutorial.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
