package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.PacienteEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.PacienteEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    private PacienteEntityRepository daoPaciente;

    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        PacienteEntity paciente = daoPaciente.findById(username).orElse(null);

        if(paciente == null) {
            throw new UsernameNotFoundException("Username: " + username + " no existe en el sistema!");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("PACIENTE"));

        return new User(paciente.getCodPer(), paciente.getContrasenia(), true, true, true, true, authorities);
    }

}
