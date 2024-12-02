package PNUMEAT.Backend.domain.teamMember.repository;

import PNUMEAT.Backend.domain.teamMember.entity.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {
}
