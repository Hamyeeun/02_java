package game;

import java.util.Scanner;

public class game {
		public static void main(String[]args) {
			
			String rps[]= {"가위","바위","보"};
			String user,com;
			Scanner sca = new Scanner(System.in);
			int ran;
			
			while(true) {
				System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
				System.out.println("가위 바위 보!>>");
				user = sca.nextLine();
				ran = (int)(Math.random()*3);
				com = rps[ran];
				if(user.equals("그만")) {
					System.out.println("게임을 종료합니다...");
					break;}
				
				if(user.equals("가위")) {
					if(rps[ran].equals("가위")) {
						System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 비겼습니다.");
						}
					else if(rps[ran].equals("바위")) {
						System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 사용자가 졌습니다.");
						}
					else if(rps[ran].equals("보")) {
						System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 사용자가 이겼습니다.");
						}

								}
				else if(user.equals("바위")) {
						if(rps[ran].equals("가위")) {
						System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 사용자가 이겼습니다.");
						}
					else if(rps[ran].equals("바위")) {
						System.out.println("사용자= "+user+", 컴퓨터 = "+com+", 비겼습니다.");
						}
					else if(rps[ran].equals("보")) {
						System.out.println("사용자= "+user+", 컴퓨터 = "+com+", 사용자가 졌습니다.");
						}
					
												}
				else if(user.equals("보")) {
						if(rps[ran].equals("가위")) {
							System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 사용자가 졌습니다.");
						}
						else if(rps[ran].equals("바위")) {
							System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 사용자가 이겼습니다.");
							}
						else if(rps[ran].equals("보")) {
							System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 비겼습니다.");
							}
										}
				// 이 부분이 다시하세요 부분!!
				else {
					if(rps[ran].equals("가위")) {
						System.out.println("사용자 = "+user+", 컴퓨터 = "+com+", 다시하세요.");
						}
					else if(rps[ran].equals("바위")) {
						System.out.println("사용자= "+user+", 컴퓨터 = "+com+", 다시하세요.");
						}
					else if(rps[ran].equals("보")) {
						System.out.println("사용자= "+user+", 컴퓨터 = "+com+", 다시하세요.");
						}
				}
					}//while 종료
			}
	}
