package edu.icet.repository;

import edu.icet.entity.PlayerEntity;
import edu.icet.entity.WordEntity;

public interface NativeWordRepository {
    WordEntity findByName(String name);

}

