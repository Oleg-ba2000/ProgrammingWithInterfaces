package com.Bulding;
import com.IAddLightItem;
import com.IAddRoom;
import com.IDescripable;
import com.IGetRoom;
import com.LigtItems.LightItem;
import com.Room.Room;
import com.furniture.Furniture;
import java.util.ArrayList;
import java.util.List;

// Главный класс здание
public class Build implements IAddRoom, IDescripable, IGetRoom
{
    String name;
    public Build(String name)
    {
        this.name = name;
    }

    public List<Room> roomsList = new ArrayList<>();
    @Override
    public void AddRoomInBuild(Room room) {
        roomsList.add(room);
    }

    @Override
    public void Discribe(List<Furniture> list)
    {
        System.out.println(name + " has");
        for (Room room:
             roomsList)
        {
            System.out.println(room.toString());
            System.out.println();
            System.out.println("Furniture:");
            for (Furniture item:
                    list)
            {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public Room GetRoom(int numberOfRoom)
    {
         return roomsList.get(numberOfRoom);
    }
}
