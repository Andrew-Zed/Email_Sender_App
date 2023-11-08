package com.andrew.ws.soap;

import jakarta.activation.DataHandler;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface FileWs {
    void upload(@WebParam(name = "file") DataHandler attachment);
    DataHandler download();

}
