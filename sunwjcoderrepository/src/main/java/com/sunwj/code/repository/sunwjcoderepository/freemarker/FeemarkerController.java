package com.sunwj.code.repository.sunwjcoderepository.freemarker;

import freemarker.template.SimpleHash;
import freemarker.template.Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2020/11/9 4:07 下午
 */
@Controller
public class FeemarkerController {

   /* @RequestMapping("/freemarker")
    public String testFreemarker(ModelMap modelMap){
        MsgBody msgBody0 = new MsgBody();
        Info info = new Info();
        info.setProdname("test0");
        info.setContain(1024);
        info.setRelay(1024);
        info.setUsed(1024);
        List<Info> infoList = new ArrayList<>();
        infoList.add(info);
        msgBody0.setInfolist(infoList);
        MsgBody msgBody1 = new MsgBody();
        Info info1 = new Info();
        info1.setProdname("test1");
        info1.setContain(1024);
        info1.setRelay(1024);
        info1.setUsed(1024);
        List<Info> infoList1 = new ArrayList<>();
        infoList1.add(info);
        msgBody1.setInfolist(infoList1);
        MsgBody msgBody2 = new MsgBody();
        Info info2 = new Info();
        info2.setProdname("test2");
        info2.setContain(1024);
        info2.setRelay(1024);
        info2.setUsed(1024);
        List<Info> infoList2 = new ArrayList<>();
        infoList2.add(info);
        msgBody2.setInfolist(infoList2);
        modelMap.addAttribute("packageuesedqry1", msgBody1);
        modelMap.addAttribute("packageuesedqry0", msgBody0);
        modelMap.addAttribute("packageuesedqry2", msgBody2);
        return "freemarker";
    }*/

    /*@RequestMapping("/test")
    public String testFreemarker1(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello dalaoyang , this is freemarker");
        return "/freemarker20201109/test";
    }*/

    /**
     *
     * @Title: toDemo
     * @Description: 跳转freemarker页面
     * @param mv
     * @return
     */
    @RequestMapping(value = "/toDemo")
    public ModelAndView toDemo(ModelAndView mv) {
        mv.addObject("name", "jack");
        mv.setViewName("freemarker");
        return mv;
    }

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name", "Freemarker");
        return "freemarker";
    }

    public static void main(String[] args) throws Exception {
        SimpleHash map=new SimpleHash();
        SimpleHash map1=new SimpleHash();
        SimpleHash map2=new SimpleHash();
        Msgbody msgbody0 = new Msgbody();
        Info info = new Info();
        info.setProdname("test0");
        info.setContain(1024);
        info.setRelay(1024);
        info.setUsed(1024);
        Infolist infoList = new Infolist();
        infoList.setInfo(info);
        msgbody0.setInfolist(infoList);
        Packageuesedqry packageuesedqry = new Packageuesedqry();
        packageuesedqry.setMsgbody(msgbody0);

        Msgbody msgbody1 = new Msgbody();
        Info info1 = new Info();
        info1.setProdname("test1");
        info1.setContain(1024);
        info1.setRelay(1024);
        info1.setUsed(1024);
        Infolist infoList1 = new Infolist();
        infoList.setInfo(info1);
        msgbody1.setInfolist(infoList1);
        Packageuesedqry packageuesedqry1 = new Packageuesedqry();
        packageuesedqry1.setMsgbody(msgbody1);

        Msgbody msgbody2 = new Msgbody();
        Info info2 = new Info();
        info2.setProdname("test2");
        info2.setContain(1024);
        info2.setRelay(1024);
        info2.setUsed(1024);
        Infolist infoList2 = new Infolist();
        infoList.setInfo(info2);
        msgbody2.setInfolist(infoList2);
        Packageuesedqry packageuesedqry2 = new Packageuesedqry();
        packageuesedqry2.setMsgbody(msgbody2);

        map.put("packageuesedqry0", packageuesedqry);
        map1.put("packageuesedqry1", packageuesedqry1);
        map2.put("packageuesedqry2", packageuesedqry2);

        String templateString="<#assign voicePackageList = (packageuesedqry0.getMsgbody().getInfolist().getInfo())!'' /><#assign gprsPackageList = (packageuesedqry2.getMsgbody().getInfolist().getInfo())!'' /><#assign smsPackageList = (packageuesedqry1.getMsgbody().getInfolist().getInfo())!'' /><databeanlist><#if (packageuesedqry0.getMsgbody().getInfolist().getInfo())?? ><#list voicePackageList as voiceInfo ><databean><type>0</type><currname>${voiceInfo.prodname}</currname><nextname></nextname><leftflow>${voiceInfo.relay}</leftflow><unit>分钟</unit><contain>${voiceInfo.contain}</contain><used>${voiceInfo.used}</used></databean></#list></#if><#if (packageuesedqry2.getMsgbody().getInfolist().getInfo())?? ><#list gprsPackageList as gprsInfo><databean><type>1</type><currname>${gprsInfo.prodname}</currname><nextname></nextname><leftflow>${(gprsInfo.relay?number / 1024)?string('0.00')}</leftflow><unit>M</unit><contain>${(gprsInfo.contain?number / 1024)?string('0.00')}</contain><used>${(gprsInfo.used?number / 1024)?string('0.00')}</used></databean>                      </#list></#if><#if (packageuesedqry1.getMsgbody().getInfolist().getInfo())??><#list smsPackageList as smsInfo><databean><type>2</type><currname>${smsInfo.prodname}</currname><nextname></nextname><leftflow>${smsInfo.relay}</leftflow><unit>条</unit><contain>${smsInfo.contain}</contain><used>${smsInfo.used}</used></databean>         </#list></#if></databeanlist>";
        StringWriter result = new StringWriter();
        StringWriter result1 = new StringWriter();
        StringWriter result2 = new StringWriter();
        Template t = new Template(null, new StringReader(templateString), null);
        Template t1 = new Template(null, new StringReader(templateString), null);
        Template t2 = new Template(null, new StringReader(templateString), null);

        t.process(map, result);
        t1.process(map1, result);
        t2.process(map2, result);
        System.out.println(result.toString());
        System.out.println(result1.toString());
        System.out.println(result2.toString());

    }
}
