package io.github.zhiweicoding.csw.api;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.github.zhiweicoding.csw.models.BaseResponse;
import io.github.zhiweicoding.csw.models.BookBean;
import io.github.zhiweicoding.csw.models.FactoryBean;
import io.github.zhiweicoding.csw.services.BookService;
import io.github.zhiweicoding.csw.services.FactoryService;
import io.github.zhiweicoding.csw.support.ResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 首页
 *
 * @Created by zhiwei on 2022/3/11.
 */
@RestController
@RequestMapping(value = "/v1/api/home")
@Slf4j
public class HomeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private FactoryService factoryService;

    /**
     * 15 min cache
     *
     * @param request
     * @param fId
     * @return
     */
    @Cacheable(value = "15m", key = "#fId", unless = "#result == null")
    @PostMapping("/base")
    public
    @ResponseBody
    BaseResponse<List<BookBean>> base(HttpServletRequest request, @RequestParam("fId") int fId) {
        List<BookBean> list = bookService.list(Wrappers.<BookBean>lambdaQuery()
                .eq(BookBean::getFactoryId, fId)
                .eq(BookBean::getIsDelete, 0));
        return new ResponseFactory<List<BookBean>>().success(list);
    }

    @Cacheable(value = "30m", key = "#fId", unless = "#result == null")
    @PostMapping("/getName")
    public
    @ResponseBody
    BaseResponse<Map<String, Object>> getName(HttpServletRequest request, @RequestParam("fId") int fId) {
        Map<String, Object> resultDict = new HashMap<>();
        FactoryBean byId = factoryService.getById(fId);
        resultDict.put("factory",byId);
        return new ResponseFactory<Map<String, Object>>().success(resultDict);
    }

    /**
     * 点击
     *
     * @param request
     * @param bId
     * @return
     */
    @PostMapping("/click")
    public
    @ResponseBody
    BaseResponse<Boolean> click(HttpServletRequest request, @RequestParam("bId") int bId) {
        BookBean byId = bookService.getById(bId);
        Long readNum = byId.getReadNum();
        int i = new Random().nextInt(10);
        if (i < 1) {
            i = 1;
        }
        bookService.update(null, Wrappers.<BookBean>lambdaUpdate().set(BookBean::getReadNum, readNum + i).eq(BookBean::getBookId, bId));
        return new ResponseFactory<Boolean>().success(true);
    }

}
