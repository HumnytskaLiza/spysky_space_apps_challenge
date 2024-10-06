package pacan.svyat.Iridium;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface IridiumRepository extends JpaRepository<Iridium, String> {

    @Query(value = "SELECT MAX(epoch) FROM Iridium")
    Timestamp findMaxDate();

    @Query(value = "SELECT MIN(epoch) FROM Iridium")
    Timestamp findMinDate();

    @Query(value = "SELECT TO_TIMESTAMP(AVG(EXTRACT(epoch FROM epoch))) AS avg_date FROM public.result_iridium", nativeQuery = true)
    Timestamp findAvgDate();
}
