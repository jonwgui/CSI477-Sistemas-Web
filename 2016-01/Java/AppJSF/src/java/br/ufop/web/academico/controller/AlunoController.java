/*
 * 
 */

package br.ufop.web.academico.controller;

import br.ufop.web.academico.dao.AlunoDAO;
import br.ufop.web.academico.model.InterfaceModel;
import java.util.List;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 * 
 */

public class AlunoController implements InterfaceController {
    
    @Override
    public List<InterfaceModel> getList() {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.getList();
    }

    @Override
    public InterfaceModel get(int id) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.get(id);
    }

    @Override
    public boolean add(InterfaceModel item) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.add(item);
    }
    
}
