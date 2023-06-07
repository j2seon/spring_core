package com.greedy.section01.advice.annotation;

import org.springframework.stereotype.Component;

@Component
public class GreedyStudent implements Student {

	@Override
	public AchievementResult study(Passion passion) throws Exception {
	
		if(passion.getScore() != 10) {
			
			throw new Exception("GreedyStudent�� ������ MAX�̾�� �մϴ�. ������ �����մϴ�!! �ٽ� ������ ������ ������!!");
		}
		
		int understandingScore = 0;				// ���ص�
		int satisfactionScore = 0; 				// ������
		double employeementRate = 0.0;			// �����
		
		int passionScore = passion.getScore();  //��������
		
		int difficulty = 10;					// ���̵�
		for(int i = 1; i <= 8; i++) {
			
			System.out.println(i + "���� ������ ������ ����ϴ�. ������ �ʹ� ��ƽ��ϴ�.");
			System.out.println("���ص��� �������� ������ ����Ͽ� �ڲ� �������ϴ�.");
			understandingScore -= difficulty * passionScore;
			satisfactionScore -= difficulty * passionScore;
			
			System.out.println("������ �ű��ϰԵ� ������� �ö󰡰� �ֽ��ϴ�.");
			employeementRate += difficulty * passionScore;
			
			if(i == 4) {
				System.out.println("��� ���� ������ ������ ���� ���� �������� ����� �մϴ�. ���� �ڷ� �Դ°��� ������ �Դ°��� �� �𸣰ڽ��ϴ�.");
				
				employeementRate += difficulty * passionScore;
			}
			
		}
		return new AchievementResult(understandingScore, satisfactionScore, employeementRate);
	}

}
