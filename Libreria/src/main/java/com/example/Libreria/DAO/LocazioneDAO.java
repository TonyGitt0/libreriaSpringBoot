package com.example.Libreria.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Libreria.entity.Locazione;

/**
 * @author AF
 * 
 */
/**
 * Repository che modella l'entità Locazione.
 */

@Repository
public interface LocazioneDAO extends JpaRepository<Locazione, Integer> {

}
