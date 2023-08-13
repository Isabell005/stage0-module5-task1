package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
         fridge = new FridgeIml();
        fridgeAlgorithm.fridgeAlgorithm(fridge);
        var actionsQueue = fridge.getActionsQueue();

        assertAll(
                () -> assertEquals(3, actionsQueue.size(),
                        "I think we should use 3 actions to get 1 bottle of milk =) "),
                () -> assertTrue(FridgeIml.Actions.OPEN == actionsQueue.get(0),
                        "At first, we should open the fridge =)"),
                () -> assertTrue(FridgeIml.Actions.GET_MILK == actionsQueue.get(1),
                        "I think that the order is wrong..."),
                () -> assertTrue(FridgeIml.Actions.CLOSE == actionsQueue.get(2),
                        "Did you forget to close the fridge? =)")

    }
}
