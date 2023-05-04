package com.kbstar.Item;

import com.kbstar.dto.ItemSearch;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SearchTest {
    @Autowired
    ItemService service;

    @Test
    void contextLoads() {
        ItemSearch is = new ItemSearch("섬촐");
        try {
            service.search(is);
        } catch (Exception e) {
            log.info("error...");
            e.printStackTrace();
        }
    }

}
