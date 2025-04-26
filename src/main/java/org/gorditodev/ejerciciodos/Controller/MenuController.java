package org.gorditodev.ejerciciodos.Controller;

import org.gorditodev.ejerciciodos.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MenuController {

    @GetMapping("/platos/{num_plato}")
    @ResponseBody
    public Menu traerMenu (@PathVariable int num_plato)  {
        List<Menu> listaPlatos = new ArrayList<Menu>();
        listaPlatos.add(new Menu(1, "Encebollado", 2.50, "El encebollado es un caldo de pescado, yuca, cebolla, tomate, cilantro, ají y otras especias, que es un plato típico de la gastronomía ecuatoriana. Se suele comer en la mañana, pero también se puede servir en el almuerzo o la merienda. "));
        listaPlatos.add(new Menu(2, "Ceviche", 7.50, "El ceviche es un plato típico de algunos países de América que se prepara con pescado o mariscos crudos marinados en jugo de limón o naranja agria, cebolla, sal y ajo"));
        listaPlatos.add(new Menu(3, "Bolon de chancho", 4.50, "El bolón de chicharrón es un platillo típico de la gastronomía ecuatoriana, que consiste en una bola de plátano verde machacado y relleno de chicharrón. Es un desayuno popular en Ecuador y un símbolo de la identidad culinaria del país. "));
        listaPlatos.add(new Menu(4, "Caldo de salchicha", 4.50, "La rellena de tripa de chancho es un embutido tradicional que se prepara con sangre de cerdo, grasa, carne, arroz, especias y otros ingredientes, y que se introduce en una tripa de cerdo"));
        listaPlatos.add(new Menu(5, "Yapingacho", 1.00, "El llapingacho es un plato tradicional ecuatoriano a base de papas, queso, cebolla y achiote, que se prepara en forma de tortilla frita. Es originario de la región andina central del país. "));

        for (Menu men : listaPlatos) {
            if(men.getNum() == num_plato) {
                return men;
            }
        }
        return null;
    }
}
