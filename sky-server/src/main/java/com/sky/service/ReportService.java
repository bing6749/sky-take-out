package com.sky.service;
/*
 * @author  MaRui
 * @date  2023/8/4 15:16
 * @version 1.0
 */

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

public interface ReportService {
    TurnoverReportVO getTurnoverStatistics(LocalDate begin, LocalDate end);
}
