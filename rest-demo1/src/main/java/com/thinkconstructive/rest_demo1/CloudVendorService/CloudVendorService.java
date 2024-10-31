package com.thinkconstructive.rest_demo1.CloudVendorService;

import com.thinkconstructive.rest_demo1.model.CloudVender;
import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVender cloudVendor);
    public String updateCloudVendor(CloudVender cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVender getCloudVendor(String cloudVendorId);
    public List<CloudVender> getAllCloudVendor();

    
}
