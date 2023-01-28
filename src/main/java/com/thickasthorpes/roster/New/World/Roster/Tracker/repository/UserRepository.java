package com.thickasthorpes.roster.New.World.Roster.Tracker.repository;

import com.thickasthorpes.roster.New.World.Roster.Tracker.daos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {
}
