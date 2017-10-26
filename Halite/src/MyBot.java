import hlt.*;

import java.util.ArrayList;

public class MyBot {

    public static void main(final String[] args) {
        final Networking networking = new Networking();
        final GameMap gameMap = networking.initialize("The Alexander");

        final ArrayList<Move> moveList = new ArrayList<>();
        for (;;) {
            moveList.clear();
            gameMap.updateMap(Networking.readLineIntoMetadata());

            for (final Ship ship : gameMap.getMyPlayer().getShips().values()) {
                if (ship.getDockingStatus() != Ship.DockingStatus.Undocked) {
                    continue;
                }

                for (final Planet planet : gameMap.getAllPlanets().values()) {
                    if (planet.isOwned()) {
                        continue;
                    }

                    if (ship.canDock(planet)) {
                        moveList.add(new DockMove(ship, planet));
                        break;
                    }

                    double closest = 1000;
                    if(ship.getDistanceTo(planet)<closest)
                        closest = ship.getDistanceTo(planet);
                    if(ship.getDistanceTo(planet)>closest)
                        continue;

                    final ThrustMove newThrustMove = Navigation.navigateShipToDock(gameMap, ship, planet, Constants.MAX_SPEED/2);
                    if (newThrustMove != null) {
                        moveList.add(newThrustMove);
                    }

                    break;
                }
                for (final Planet planet : gameMap.getAllPlanets().values()) {
                    Position pos = ship.getClosestPoint(planet);
                    final ThrustMove thrustMOVE = Navigation.navigateShipTowardsTarget(gameMap, ship, pos, Constants.MAX_SPEED/2, true, 100, 100);
                }
            }
            Networking.sendMoves(moveList);
        }
    }
}
