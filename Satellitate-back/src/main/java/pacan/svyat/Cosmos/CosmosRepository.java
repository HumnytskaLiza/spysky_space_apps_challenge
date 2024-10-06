package pacan.svyat.Cosmos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface CosmosRepository extends JpaRepository<Cosmos, String> {

    @Query(value = "SELECT MAX(epoch) FROM Cosmos")
    Timestamp findMaxDate();

    @Query(value = "SELECT MIN(epoch) FROM Cosmos")
    Timestamp findMinDate();

    @Query(value = "SELECT TO_TIMESTAMP(AVG(EXTRACT(epoch FROM epoch))) AS avg_date FROM public.result_cosmos", nativeQuery = true)
    Timestamp findAvgDate();
}
