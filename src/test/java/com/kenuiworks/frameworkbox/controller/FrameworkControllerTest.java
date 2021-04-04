package com.kenuiworks.frameworkbox.controller;



import com.kenuiworks.frameworkbox.service.FrameworkService;
import com.kenuiworks.frameworkbox.service.FrameworkServiceImpl;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
public class FrameworkControllerTest{

    @Inject
    FrameworkService frameworkService;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void deveriaRetornarNotFoundQuandoGetPorNameInexistente() {
        HttpRequest<String> request = HttpRequest.GET("/api/v1/frameworks");
        String body = client.toBlocking().retrieve(request);
        assertNotNull(body);
//        assertEquals("", body);
    }


}
