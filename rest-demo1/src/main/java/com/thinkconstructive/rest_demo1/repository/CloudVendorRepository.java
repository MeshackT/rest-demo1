package com.thinkconstructive.rest_demo1.repository;

import com.thinkconstructive.rest_demo1.model.CloudVender;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Templeton
 * Take in the id datatype and the class name
 */
public interface CloudVendorRepository extends 
        JpaRepository<CloudVender, String>{

}
