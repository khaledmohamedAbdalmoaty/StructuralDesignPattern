package com.basePackage_khaled.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Groups implements Component{
    List<Component> componentsList=new ArrayList<>();
    public void add(Component component){
        componentsList.add(component);
    }
    @Override
    public void render(){
        for(Component component: componentsList){
            component.render();
          /*  if(shape instanceof Shape){
                ((Shape)shape).render();
            }
            else if(shape instanceof Groups){
                ((Groups)shape).render();
            }*/
        }

    }

    @Override
    public void move() {
        for(Component component: componentsList){
            component.move();
        }
    }
}
