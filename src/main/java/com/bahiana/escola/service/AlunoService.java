package com.bahiana.escola.service;
import org.springframework.stereotype.Service;
import com.bahiana.escola.repository.AlunoRepository;
import com.bahiana.escola.model.Aluno;
import java.util.List;


@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com id " + id));
    }

    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno alunoAtualizado) {
        Aluno alunoExistente = alunoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com id " + id));

        alunoExistente.setNomeAluno(alunoAtualizado.getNomeAluno());
        alunoExistente.setIdadeAluno(alunoAtualizado.getIdadeAluno());
        alunoExistente.setNomeResponsavel(alunoAtualizado.getNomeResponsavel());
        alunoExistente.setTurmaAluno(alunoAtualizado.getTurmaAluno());

        return alunoRepository.save(alunoExistente);
    }

    public void deletar(Long id) {
        Aluno aluno = buscarPorId(id);
        alunoRepository.deleteById(aluno);
    }
}
