package com.next.technologies.mondomainemetier.repositories;

import com.next.technologies.mondomainemetier.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
}
