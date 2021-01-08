package com.example.adminportal.controller;

import com.example.adminportal.domain.Batch;
import com.example.adminportal.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
@RequestMapping("/fruit")
public class BatchController {

    @Autowired
    private BatchService batchService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addFruit(Model model) {
        Batch batch = new Batch();
        model.addAttribute("batch", batch);
        return "addFruit";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addFruitPost(@ModelAttribute("batch") Batch batch, HttpServletRequest request) {
        batchService.save(batch);

        MultipartFile batchImage = batch.getFruitImage();

        try{
            byte[] bytes = batchImage.getBytes();
            String name = batch.getBatchId()+".png";
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File("src/main/resources/static/img/batch/"+name)));
            stream.write(bytes);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/batchList";
    }

    @RequestMapping("/batchList")
    public String batchList(Model model) {
        //List<Batch> batchList = batchService.findAll();

        return "batchList";
    }
}
