package com.isacode.application.service;

import com.isacode.domain.model.Persona;
import com.isacode.domain.ports.in.IPersonaUseCase;


import java.util.Optional;

public class PersonaService implements IPersonaUseCase {

    private final IPersonaUseCase personaUseCase;

    public PersonaService(IPersonaUseCase personaUseCase) {
        this.personaUseCase = personaUseCase;
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaUseCase.crearPersona(persona);
    }

    @Override
    public Optional<Persona> getPersona(Long id) {
        return personaUseCase.getPersona(id);
    }

    @Override
    public Optional<Persona> updatePersona(Long id, Persona persona) {
        return personaUseCase.updatePersona(id, persona);
    }

    @Override
    public boolean deletePersona(Long id) {
       return personaUseCase.deletePersona(id);
    }
}
