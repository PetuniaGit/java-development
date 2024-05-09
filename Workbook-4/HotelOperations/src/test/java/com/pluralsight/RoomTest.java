package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        //arrange
        Room room=new Room(1,100,false,false);
        boolean expectedisOccupied=true;
        boolean expectedisDirty=true;
        //act
        room.checkIn();
        // assert
        boolean actualisOccupied=room.isOccupied();
        boolean actualisDirty=room.isDirty();
        assertEquals(expectedisOccupied,actualisOccupied);
        assertEquals(actualisDirty,expectedisDirty);

    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        Room room=new Room(1,100,true,false);
        boolean expectedisOccupied=false;
        //act
        room.checkOut();
        //assert
        boolean actualisOccupied=room.isOccupied();
        assertEquals(expectedisOccupied,actualisOccupied);
    }

    @org.junit.jupiter.api.Test
    void cleanroom() {
        Room room=new Room(1,100,true,false);
        boolean expectedisDirty=true;
        //act
        room.cleanroom();
        //assert
        boolean actualisDirty=room.isDirty();
        assertEquals(actualisDirty,expectedisDirty);
    }
}