package com.thinkconstructive.rest_demo1.CloudVendorService;

import com.thinkconstructive.rest_demo1.exception.CloudVendorNotFoundException;
import com.thinkconstructive.rest_demo1.model.CloudVender;
import com.thinkconstructive.rest_demo1.repository.CloudVendorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{

//    get an instance of repository
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }
    
//    create a cloud vendor using the repo
    @Override
    public String createCloudVendor(CloudVender cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully saved";
    }

    //    update a cloud vendor using the repo
    @Override
    public String updateCloudVendor(CloudVender cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully updated";

    }

    //    delete a cloud vendor using the repo
    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Successfully deleted";

    }
    
    //    get a cloud vendor using the repo
    @Override
    public CloudVender getCloudVendor(String cloudVendorId) {
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty()){
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
        }
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    //    get all cloud vendors a cloud vendor using the repo
    @Override
    public List<CloudVender> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
    
}
