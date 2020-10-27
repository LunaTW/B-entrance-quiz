package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TeamResponse;
import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.TeamRepository;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentMapper;

import java.util.List;
import java.util.Map;

public class TeamService {
    private final TeamRepository teamRepository;
    private final StudentMapper studentRepository;

    public TeamService(TeamRepository teamRepository, StudentMapper studentRepository) {
        this.teamRepository = teamRepository;
        this.studentRepository = studentRepository;
    }

//    public List<TeamResponse> findAll() {
//        // To do
//        return {};
//    }
    // To do here

}
