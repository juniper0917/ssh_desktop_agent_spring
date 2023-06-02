package com.oslab.agent.service.server;

import com.oslab.agent.model.transfer.serverDto.AddServerDto;
import com.oslab.agent.model.transfer.serverDto.EditServerDto;
import com.oslab.agent.repository.server.ServerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@Slf4j
@RequiredArgsConstructor
public class ServerService implements ServerServiceInterface{
    private final ServerRepository serverRepository;

    public boolean addNewServer(AddServerDto addServerDto) throws SQLException {
        return serverRepository.addNewServer(addServerDto);
    }

    public boolean editServerInfo(EditServerDto editServerDto) throws SQLException{
        return serverRepository.editServerInfo(editServerDto);
    }

    public boolean deleteServer(String server_id) throws SQLException{
        return serverRepository.deleteServer(server_id);
    }
}