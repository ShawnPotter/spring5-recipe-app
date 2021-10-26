package guru.springframework.controllers;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRespository;
import guru.springframework.repositories.UnitOfMeasureRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by jt on 6/1/17.
 */
@Controller
public class IndexController {

    private CategoryRespository categoryRespository;
    private UnitOfMeasureRespository unitOfMeasureRespository;

    public IndexController(CategoryRespository categoryRespository, UnitOfMeasureRespository unitOfMeasureRespository)
    {
        this.categoryRespository = categoryRespository;
        this.unitOfMeasureRespository = unitOfMeasureRespository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage()
    {
        Optional<Category> categoryOptional = categoryRespository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRespository.findByDescription("Teaspoon");
        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
