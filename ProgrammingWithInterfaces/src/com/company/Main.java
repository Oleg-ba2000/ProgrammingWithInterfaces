package com.company;
import com.Bulding.Build;
import com.LigtItems.LightItem;
import com.LigtItems.Lightbulb;
import com.LigtItems.Window;
import com.Room.Room;
import com.furniture.Armchair;
import com.furniture.Couch;
import com.furniture.Furniture;
import com.furniture.Table;

public class Main {

    public static void main(String[] args) {
        //Здание один
        Build build = new Build("build one");
        Room room = new Room(10,"room number One",new Window(3));
        room.AddFurniture(new Armchair("Armchair with ",2,4));

        build.AddRoomInBuild(room);
        build.GetRoom(0).AddLightItem(new Lightbulb(2000));
        build.Discribe(room.furnitureList);
        //Здание два
        Build build2 = new Build("build two");
        build2.AddRoomInBuild(new Room(3,"room number Two",new Window(3)));
        build2.GetRoom(0).AddFurniture(new Armchair("Armchair with ",2,4));
        build2.Discribe(build2.GetRoom(0).furnitureList);
    }
}
