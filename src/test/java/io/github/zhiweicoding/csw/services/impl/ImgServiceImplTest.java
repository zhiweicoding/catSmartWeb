package io.github.zhiweicoding.csw.services.impl;

import io.github.zhiweicoding.csw.models.ImgBean;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Created by zhiwei on 2022/4/18.
 */
@SpringBootTest
@Slf4j
public class ImgServiceImplTest {
    @Autowired
    private ImgService imgService;

    @Test
    public void searchSimple() {
        List<ImgBean> h = imgService.searchSimple(3, "红十字");
        System.out.println(h.get(0));
    }

    @Test
    public void searchComplex() {
        List<ImgBean> h = imgService.searchComplex(3, null, "红十字", null, 0, 0);
        System.out.println(h.get(0));
    }
}