/*
 * Copyright 2022 OPPO ESA Stack Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.esastack.stability.test.controller;

import io.esastack.restlight.server.core.HttpRequest;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.PostMapping;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.RequestBody;
import io.esastack.restlight.spring.shaded.org.springframework.web.bind.annotation.ResponseBody;
import lombok.Data;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author chenglu
 */
@Controller
public class StabilityController {

    /**
     * 请求和返回类型是byte[]
     */
    @PostMapping("/byte")
    @ResponseBody
    public byte[] requestByte(@RequestBody byte[] bytes) {
        return new byte[4096];
    }

    /**
     * 请求和响应是POJO，序列化方式是默认的jackson序列化
     */
    @PostMapping("/pojo")
    @ResponseBody
    public Pojo requestPojo(@RequestBody Pojo pojo) {
        return pojo;
    }

    @Data
    static class Pojo {

        int id;

        String userName;

        Integer age;

        char sex;

        Long time;

        BigDecimal amount;

        Short weight;

        Date createTime;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
