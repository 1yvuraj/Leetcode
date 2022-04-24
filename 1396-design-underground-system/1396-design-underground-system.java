class UndergroundSystem {
    class CheckInDetail{
        String stationName;
        int t;

        public CheckInDetail(String stationName, int t){
            this.stationName = stationName;
            this.t = t;
        }
    }

    class TimeCount{
        int count;
        int t;

        public TimeCount(int count, int t){
            this.count = count;
            this.t = t;
        }
    }

    HashMap<Integer, CheckInDetail> checkInMap;
    HashMap<String, TimeCount> timeCountMap;
    public UndergroundSystem() {
         checkInMap = new HashMap<>();
        timeCountMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id,new CheckInDetail(stationName,t));   
    }
    
    public void checkOut(int id, String stationName, int t) {
        CheckInDetail checkInDetail = checkInMap.get(id);
        int timeDifference = t - checkInDetail.t;
        String stationLst = checkInDetail.stationName +","+stationName;
        TimeCount timeCount = timeCountMap.getOrDefault(stationLst,new TimeCount(0,0));
        timeCount.count+=1;
        timeCount.t +=timeDifference;
        timeCountMap.put(stationLst, timeCount);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        TimeCount timeCount = timeCountMap.get(startStation +"," + endStation);
        return (double) timeCount.t/timeCount.count;
    }
}