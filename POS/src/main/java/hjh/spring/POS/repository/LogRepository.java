package hjh.spring.POS.repository;

import hjh.spring.POS.model.Log;

import java.util.List;
import java.util.Map;

public interface LogRepository
{
    void saveLog(Log log);

    List<Log> getLogs(String action, String range);

    Map<String, List<Log>> groupLogsByAction(List<Log> logs);

    Map<String, Map<String, Integer>> calculateLogs(Map<String, List<Log>> groupedLogs);
}