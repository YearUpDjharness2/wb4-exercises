package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomsTest {
    @Test
    public void room_checkIn_getOccupied(){

        Rooms room = new Rooms(1,500, false,false);
        room.checkIn();
     assertTrue(room.isDirty(), "Room should be assumed dirty after check in ");
     assertTrue(room.isOccupied(), "Room should be occupied after check in ");
        assertFalse(room.isAvailable(), "Room should not be available after check in ");
    }
    @Test
    public void room_checkOut_available(){

        Rooms room = new Rooms(1,500, false,false);
        room.checkIn();
       assertTrue(room.isDirty(), "Room should be assumed dirty after check in ");
        assertTrue(room.isOccupied(), "Room should be occupied after check in ");
        assertFalse(room.isAvailable(), "Room should not be available after check in ");
        room.checkOut();
        assertFalse(room.isOccupied(), "Room should not be occupied after check-out");
       assertFalse(room.isDirty(), "Room should not be dirty after check-out");
        assertTrue(room.isAvailable(), "Room should  be available after check-out");
    }


}