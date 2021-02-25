package cn.shxnzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项 目 名 称：cn.shxnzw.controller
 * 类 名 称：system-parent
 * 创 建 人：huanghao
 * 创建时间：2021/2/25 10:23 上午
 * 类 描 述： TODO
 *
 * @version: V1.8
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public @ResponseBody String index(){
        return "index";

    }
}
