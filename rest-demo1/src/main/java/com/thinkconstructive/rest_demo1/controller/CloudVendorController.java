package com.thinkconstructive.rest_demo1.controller;

import com.thinkconstructive.rest_demo1.CloudVendorService.CloudVendorService;
import com.thinkconstructive.rest_demo1.model.CloudVender;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*") // Allow only from this origin
@RestController 
// localhosit
//@RequestMapping("/cloud_vendor")
//google cloud
@RequestMapping("/vendor_cloud")

public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    
//    get a specific vendor
    @GetMapping("{vendorId}")
    public CloudVender getCloudVenderDetails(@PathVariable("vendorId") String vendorId){
       return cloudVendorService.getCloudVendor(vendorId);
    }
    
//    getting all vendors
    @GetMapping()
    public List<CloudVender> getCloudVenderDetails(){
       return cloudVendorService.getAllCloudVendor();
    }
    
//    Create a new vender
    @PostMapping
    public String createCloudVenderDetails(@RequestBody CloudVender cloudVendor){
        return cloudVendorService.createCloudVendor(cloudVendor);
    }

//    update vendor
    @PutMapping
    public String updateCloudVenderDetails(@RequestBody CloudVender cloudVendor){
        return cloudVendorService.updateCloudVendor(cloudVendor);
    }
    
//    remove/delete vendeor
    @DeleteMapping("{vendorId}")
    public String removeCloudVenderDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.deleteCloudVendor(vendorId);
        
    }
    
}
