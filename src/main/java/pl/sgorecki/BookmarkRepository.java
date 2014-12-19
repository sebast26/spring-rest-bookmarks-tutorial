package pl.sgorecki;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
