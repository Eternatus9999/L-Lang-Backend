package edu.icet.repository;

import edu.icet.entity.PlayerEntity;

public interface NativePlayerRepository {
    PlayerEntity findByName(String name);
}
