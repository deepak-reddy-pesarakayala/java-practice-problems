package practice;
import java.util.*;
public class TripsAndUsers {
    static class User {
        int id;
        boolean banned;
        User(int id, boolean banned) {
            this.id = id;
            this.banned = banned;
        }
    }
    static class Trip {
        int clientId;
        int driverId;
        String status;
        String date;
        Trip(int clientId, int driverId,
             String status, String date) {
            this.clientId = clientId;
            this.driverId = driverId;
            this.status = status;
            this.date = date;
        }
    }
    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User(1, false));
        users.put(2, new User(2, false));
        users.put(3, new User(3, true));
        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip(1, 2, "completed", "2013-10-01"));
        trips.add(new Trip(1, 3, "cancelled_by_driver", "2013-10-01"));
        trips.add(new Trip(2, 1, "cancelled_by_client", "2013-10-01"));
        Map<String, Integer> total = new HashMap<>();
        Map<String, Integer> cancelled = new HashMap<>();
        for (Trip trip : trips) {
            User client = users.get(trip.clientId);
            User driver = users.get(trip.driverId);
            if (client.banned || driver.banned) {
                continue;
            }
            total.put(
                    trip.date,
                    total.getOrDefault(trip.date, 0) + 1
            );
            if (!trip.status.equals("completed")) {
                cancelled.put(
                        trip.date,
                        cancelled.getOrDefault(trip.date, 0) + 1
                );
            }
        }
        for (String date : total.keySet()) {
            double rate =
                    (double) cancelled.getOrDefault(date, 0)
                            / total.get(date);
            System.out.println(
                    date + " : " +
                            String.format("%.2f", rate)
            );
        }
    }
}