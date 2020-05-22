package agency.akcom.tba.wa;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

// @RepositoryRestResource (collectionResourceRel = "users", path = "users")
public interface UserRepository extends DatastoreRepository<User, Long> {
  ///
  //  List<User> findByNameAuthor(String author);
  //
  //  List<User> findByYearGreaterThan(int year);
  //
  //  List<User> findByAuthorAndYear(String author, int year);

}
