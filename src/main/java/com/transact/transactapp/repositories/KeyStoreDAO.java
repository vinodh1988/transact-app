package com.transact.transactapp.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.transact.transactapp.entity.KeyStore;

public interface KeyStoreDAO extends JpaRepository<KeyStore, Long> {

}
