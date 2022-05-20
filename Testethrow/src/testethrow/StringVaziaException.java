/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testethrow;

/**
 *
 * @author aluno
 */
public class StringVaziaException extends RuntimeException {

    @Override
    public String getMessage() {
        return "A String(nome) não pode ser vazia\n";
    }

}
