package edu.icet.repository;

import edu.icet.entity.QuizEntity;

public interface NativeQuizRepository {
    QuizEntity findById(String id);
}
