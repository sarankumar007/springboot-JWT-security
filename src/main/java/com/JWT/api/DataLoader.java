package com.JWT.api;

import com.JWT.api.models.Role;
import com.JWT.api.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final RoleRepository roleRepository;

    public DataLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void run(String... args) {
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("USER"));
    }
}