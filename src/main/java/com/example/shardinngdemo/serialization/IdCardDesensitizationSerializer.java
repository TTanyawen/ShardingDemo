package com.example.shardinngdemo.serialization;

import cn.hutool.core.util.DesensitizedUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class IdCardDesensitizationSerializer extends JsonSerializer<String> {

    @Override
    public void serialize(String idcard, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        log.info("serialize:"+idcard);
        String phoneDesensitization = DesensitizedUtil.idCardNum(idcard, 4, 4);
        jsonGenerator.writeString(phoneDesensitization);
        log.info("after serialize:"+phoneDesensitization);
    }
}
