package in.nilesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nilesh.binding.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
