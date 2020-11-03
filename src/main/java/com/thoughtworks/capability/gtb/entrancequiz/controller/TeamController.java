package com.thoughtworks.capability.gtb.entrancequiz.controller;

// TODO GTB-工程实践: - 包含未使用的import
import com.thoughtworks.capability.gtb.entrancequiz.controller.dto.TeamResponse;
import com.thoughtworks.capability.gtb.entrancequiz.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class TeamController {
//    private final TeamService teamService;
//
//    public TeamController(TeamService teamService) {
//        this.teamService = teamService;
//    }
//
////    @GetMapping("/teams")
////    public ResponseEntity<List<TeamResponse>> getTeams() {
////        List<TeamResponse> teamResponses = teamService.findAll();
////        return ResponseEntity.status(HttpStatus.OK).body(teamResponses);
////    }

}
