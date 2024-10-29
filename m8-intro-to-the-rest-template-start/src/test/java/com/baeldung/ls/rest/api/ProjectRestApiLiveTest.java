package com.baeldung.ls.rest.api;

import com.baeldung.ls.web.dto.ProjectDto;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Random;

import static org.junit.Assert.*;

public class ProjectRestApiLiveTest {

    private static final String BASE_URL = "http://localhost:8080/projects/";
    private RestTemplate restTemplate = new RestTemplate();

    @Test
    public void givenProjectExists_whenGet_thenSuccess(){
        ResponseEntity<ProjectDto> response = restTemplate.getForEntity(BASE_URL+"1", ProjectDto.class);

        assertThat(response.getStatusCodeValue(), Matchers.equalTo(200));
        assertNotNull(response.getBody());
    }

    @Test
    public void givenNewProject_whenCreate_thenSuccess() {

        ProjectDto newProject = new ProjectDto(new Random().nextLong(), "First Project", LocalDate.now());

        ResponseEntity<Void> response =  restTemplate.postForEntity(BASE_URL, newProject, Void.class);

        // parametrii metodei: url ul la care vrem sa post, obiectul pe care vrem sa il post si rezultatul pe care il asteptam
        // operatia de creare nu returneaza nimic, deci asteptam un void

        assertTrue(response.getStatusCode() == HttpStatus.OK);
    }
}
