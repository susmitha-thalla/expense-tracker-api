package com.expensetracker.expense_tracker.Repository;

import com.expensetracker.expense_tracker.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
