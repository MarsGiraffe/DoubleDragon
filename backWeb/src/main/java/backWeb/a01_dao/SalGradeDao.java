package backWeb.a01_dao;
// backWeb.a01_dao.SalGradeDao
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import backWeb.z01_vo.Salgrade;

// 
public class SalGradeDao {
   private Connection con;
   private PreparedStatement pstmt;
   private ResultSet rs;
   // // Product 테이블(물건명,가격,갯수) ==> 
   // 로그인 처리 메서드 정의

   
   public int addGrade(int grade, int losal, int hisal) {
        int updatecheck= 0;
        String sql = "INSERT INTO SALGRADE values(?,?,?)";
        try {
            con = DB.con();
            con.setAutoCommit(false);
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, grade);
            pstmt.setInt(2, losal);
            pstmt.setInt(3, hisal);
            updatecheck = pstmt.executeUpdate();
            if (updatecheck == 1) {
                con.commit();
                System.out.println("업데이트 성공");
            } 
        } catch (SQLException e) {
            System.out.println("DB 오류: " + e.getMessage());
            DB.rollback(con);
        } catch (Exception e) {
            System.out.println("일반 오류: " + e.getMessage());
        } finally {
            DB.close(rs, pstmt, con);
        }
        return updatecheck;
    }
      
      
      
   
   // // Product 테이블(물건명,가격,갯수) ==> 
   // 로그인 처리 메서드 정의
   public List<Salgrade> sallist() {
      List<Salgrade> slist = new ArrayList<Salgrade>();
      String sql = "SELECT * FROM SALGRADE\r\n"
            + "order by grade asc";
      //1. 연결(기본예외/자원해제)
      try {
         con = DB.con();
         // 2. 대화(sql 전달 후, 매개변수로 전달)
         pstmt = con.prepareStatement(sql);
         // 3. 결과
         rs = pstmt.executeQuery();
         // 4. (ResultSet ==> VO) ? 단일/여러개 if/while
         // Member(String id, String pass, String name, int point, String auth, Date regdate)
         while(rs.next()) {
            slist.add(new Salgrade(
               rs.getInt("grade"),
               rs.getInt("losal"),
               rs.getInt("hisal")
            ));
         }
         // 
      } catch (SQLException e) {
         System.out.println("DB:"+e.getMessage());
      }catch(Exception e) {
         System.out.println("기타:"+e.getMessage());
      }finally {
         DB.close(rs, pstmt, con);
      }
      return slist;
   }
   public static void main(String[] args) {
   
      
   }

}