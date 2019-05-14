package com.exemple.readinglist.readinglist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    private static final String reader = "reader1";
    private ReadingListRepository readingListRepository ;

    @Autowired
    ReadingListController(ReadingListRepository readingListRepository ){
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String readersBooks(Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if(readingList != null){
            model.addAttribute("books",readingList);
        }
    return "readingList";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addToReadnigList(Book book){
        System.out.print("POST");
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/readingList";
    }







}
