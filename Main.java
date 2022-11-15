package com.iplproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static final int SET_ID = 0;
    public static final int SET_SEASON = 1;
    public static final int SET_CITY = 2;
    public static final int SET_DATE = 3;
    public static final int SET_TEAM1 = 4;
    public static final int SET_TEAM2 = 5;
    public static final int SET_TOSS_WINNER = 6;
    public static final int SET_TOSS_DECISION = 7;
    public static final int SET_RESULT = 8;
    public static final int SET_DL_APPLIED = 9;
    public static final int SET_WINNER = 10;
    public static final int SET_WIN_BY_RUNS = 11;
    public static final int SET_WIN_BY_WICKETS = 12;
    public static final int SET_PLAYER_OF_MATCH = 13;
    public static final int SET_VENUE = 14;
    public static final int SET_UMPIRE1 = 15;
    public static final int SET_UMPIRE2 = 16;
    public static final int SET_DELIVERY_INNING = 1;
    public static final int SET_DELIVERY_BATTING_TEAM = 2;
    public static final int SET_DELIVERY_BOWLING_TEAM = 3;
    public static final int SET_DELIVERY_OVER = 4;
    public static final int SET_DELIVERY_BALL = 5;
    public static final int SET_DELIVERY_BATSMAN = 6;
    public static final int SET_DELIVERY_NON_STRIKER = 7;
    public static final int SET_DELIVERY_BOWLER = 8;
    public static final int SET_DELIVERY_IS_SUPER_OVER = 9;
    public static final int SET_DELIVERY_WIDE_RUN = 10;
    public static final int SET_DELIVERY_BYE_RUNS = 11;
    public static final int SET_DELIVERY_LEG_BYE_RUNS = 12;
    public static final int SET_DELIVERY_NO_BALL_RUNS = 13;
    public static final int SET_DELIVERY_PENALTY_RUNS = 14;
    public static final int SET_DELIVERY_BATSMAN_RUNS = 15;
    public static final int SET_DELIVERY_EXTRA_RUNS = 16;
    public static final int SET_DELIVERY_TOTAL_RUNS = 17;
    public static final int SET_DELIVERY_PLAYER_DISMISSED = 18;
    public static final int SET_DELIVERY_DISMISSAL_KIND = 19;
    public static final int SET_DELIVERY_FIELDER = 20;

    public static void main(String[] args) {

        List<Match> matches = readMatchesData();
        List<Delivery> deliveries = readDeliveriesData();



    }

    private static List<Delivery> readDeliveriesData() {
        List<Delivery> deliveries = new ArrayList<>();
        try{
            BufferedReader readDeliveries = new BufferedReader(new FileReader("/home/shivam/Project2/deliveries.csv"));
            String line;
            while((line = readDeliveries.readLine())!=null)
            {
                List<String> lineDeliveries = new ArrayList<>(Arrays.asList(line.split(",")));
                Delivery delivery = new Delivery();
                delivery.setMatchId(lineDeliveries.get(SET_ID));
                delivery.setInning(lineDeliveries.get(SET_DELIVERY_INNING));
                delivery.setBattingTeam(lineDeliveries.get(SET_DELIVERY_BATTING_TEAM));
                delivery.setBowlingTeam(lineDeliveries.get(SET_DELIVERY_BOWLING_TEAM));
                delivery.setOver(lineDeliveries.get(SET_DELIVERY_OVER));
                delivery.setBall(lineDeliveries.get(SET_DELIVERY_BALL));
                delivery.setBatsman(lineDeliveries.get(SET_DELIVERY_BATSMAN));
                delivery.setNonStriker(lineDeliveries.get(SET_DELIVERY_NON_STRIKER));
                delivery.setBowler(lineDeliveries.get(SET_DELIVERY_BOWLER));
                delivery.setIsSuperOver(lineDeliveries.get(SET_DELIVERY_IS_SUPER_OVER));
                delivery.setWideRuns(lineDeliveries.get(SET_DELIVERY_WIDE_RUN));
                delivery.setByeRuns(lineDeliveries.get(SET_DELIVERY_BYE_RUNS));
                delivery.setLegByeRuns(lineDeliveries.get(SET_DELIVERY_LEG_BYE_RUNS));
                delivery.setNoballRuns(lineDeliveries.get(SET_DELIVERY_NO_BALL_RUNS));
                delivery.setPenaltyRuns(lineDeliveries.get(SET_DELIVERY_PENALTY_RUNS));
                delivery.setBatsmanRuns(lineDeliveries.get(SET_DELIVERY_BATSMAN_RUNS));
                delivery.setExtraRuns(lineDeliveries.get(SET_DELIVERY_EXTRA_RUNS));
                delivery.setTotalRuns(lineDeliveries.get(SET_DELIVERY_TOTAL_RUNS));
                delivery.setPlayerDismissed(lineDeliveries.get(SET_DELIVERY_PLAYER_DISMISSED));
                delivery.setDismissalKind(lineDeliveries.get(SET_DELIVERY_DISMISSAL_KIND));
                delivery.setFielder(lineDeliveries.get(SET_DELIVERY_FIELDER));

                deliveries.add(delivery);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return deliveries;
    }

    private static List<Match> readMatchesData() {
        List<Match> matches = new ArrayList<>();
        try{
            BufferedReader readMatches = new BufferedReader(new FileReader("/home/shivam/Project1/matches.csv"));
            String line;
            while((line=readMatches.readLine())!=null){
                List<String> lineMatches= new ArrayList<>(Arrays.asList(line.split(",")));
                Match match = new Match();
                match.setId(lineMatches.get(SET_ID));
                match.setSeason(lineMatches.get(SET_SEASON));
                match.setCity(lineMatches.get(SET_CITY));
                match.setDate(lineMatches.get(SET_DATE));
                match.setTeam1(lineMatches.get(SET_TEAM1));
                match.setTeam2(lineMatches.get(SET_TEAM2));
                match.setTossWinner(lineMatches.get(SET_TOSS_WINNER));
                match.setTossDecision(lineMatches.get(SET_TOSS_DECISION));
                match.setResult(lineMatches.get(SET_RESULT));
                match.setDlApplied(lineMatches.get(SET_DL_APPLIED));
                match.setWinner(lineMatches.get(SET_WINNER));
                match.setWinByRuns(lineMatches.get(SET_WIN_BY_RUNS));
                match.setWinByWickets(lineMatches.get(SET_WIN_BY_WICKETS));
                match.setPlayerOfMatch(lineMatches.get(SET_PLAYER_OF_MATCH));
                match.setVenue(lineMatches.get(SET_VENUE));
                if(lineMatches.get(SET_UMPIRE1)!=null)
                    match.setUmpire1(lineMatches.get(SET_UMPIRE1));
                if(lineMatches.get(SET_UMPIRE2)!=null)
                    match.setUmpire2(lineMatches.get(SET_UMPIRE2));
                matches.add(match);

            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return matches;
    }


}
