package br.com.datum.datafactory;

import br.com.datum.dto.CreateDTO;

public class ReqResDataFactory {
    public static CreateDTO create() {
        return CreateDTO.builder().
                name("morpheus").
                job("leader").
                build();
    }

    public static CreateDTO patch() {
        return CreateDTO.builder().
                name("morpheus").
                job("zion resident").
                build();
    }
}