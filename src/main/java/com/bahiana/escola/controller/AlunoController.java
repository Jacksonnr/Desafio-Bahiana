package com.bahiana.escola.controller;
import com.bahiana.escola.model.Aluno;
import com.bahiana.escola.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    // GET /alunos
    @GetMapping
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

    // GET /alunos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarPorId(@PathVariable Long id) {
        Aluno aluno = alunoService.buscarPorId(id);
        return ResponseEntity.ok(aluno);
    }

    // POST /alunos
    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno aluno) {
        Aluno criado = alunoService.salvar(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(criado);
    }

    // PUT /alunos/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno atualizado = alunoService.atualizar(id, aluno);
        return ResponseEntity.ok(atualizado);
    }

    // DELETE /alunos/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        alunoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
