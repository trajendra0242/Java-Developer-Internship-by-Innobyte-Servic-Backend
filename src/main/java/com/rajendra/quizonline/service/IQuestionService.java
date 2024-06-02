package com.rajendra.quizonline.service;

import org.springframework.data.crossstore.ChangeSetPersister;

import com.rajendra.quizonline.model.Question;

import java.util.List;
import java.util.Optional;

/**
 * @author Simpson Alfred
 */

public interface IQuestionService {

    Question createQuestion(Question question);

    List<Question> getAllQuestions();

    Optional<Question> getQuestionById(Long id);

    List<String> getAllSubjects();

    Question updateQuestion(Long id, Question question) throws ChangeSetPersister.NotFoundException;

    void  deleteQuestion(Long id);

    List<Question> getQuestionsForUser(Integer numOfQuestions, String subject);


}
