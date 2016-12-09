package pacote.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static Date CalendarToDate(Calendar calendario){
			
		return calendario.getTime();
	}
	public static Date localDateToDate(LocalDate ld){
		return Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public static Calendar DateToCalendar(Date data){
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		return calendario;
	}
	public static LocalDate DateToLocalDate(Date data){
		try{
		Instant inst = Instant.ofEpochMilli(data.getTime());
		return  LocalDateTime.ofInstant(inst,ZoneId.systemDefault()).toLocalDate();
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	public static Date subtrairDias(Date data, long dias){
		
		LocalDate ldt = DateToLocalDate(data);
		//LocalDate hoje = LocalDate.now();
		
		return localDateToDate(ldt.minusDays(dias));
		
	}
	private static LocalDate adicionarDias(Date data, long dias){
		try {
			LocalDate local = DateToLocalDate(data);
			local.plusDays(dias);
			return local.plusDays(dias);
			
		} catch (Exception e) {
			return null;
		}
		
		
	}
	public static Date adicionarDiasDate(Date data, long dias){
		
		return   localDateToDate((adicionarDias(data, dias)));
		
		
	}
	public static Integer diferencaEntreDatas(Date dataultparto, Date dtParto) {
		/*
		 * Retorno em dias
		 * */
		System.out.println("DateUtil.diferencaEntreDatas()"+dataultparto+" - "+dtParto);
		 try{
			Long dias  =  ChronoUnit.DAYS.between(DateToLocalDate(dtParto), DateToLocalDate(dataultparto));
			return Integer.valueOf(dias.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			FacesUtil.addErrorMessage(e.getMessage());
			return 0;
		}
		
	}

}
