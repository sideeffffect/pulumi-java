// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLaunchTemplateBlockDeviceMapping;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateCreditSpecification;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateElasticGpuSpecification;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateEnclaveOption;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateFilter;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateHibernationOption;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateIamInstanceProfile;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateInstanceMarketOption;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateMetadataOption;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateMonitoring;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateNetworkInterface;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplatePlacement;
import io.pulumi.aws.ec2.outputs.GetLaunchTemplateTagSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLaunchTemplateResult {
    /**
     * Amazon Resource Name (ARN) of the launch template.
     * 
     */
    private final String arn;
    /**
     * Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * 
     */
    private final List<GetLaunchTemplateBlockDeviceMapping> blockDeviceMappings;
    /**
     * Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     * 
     */
    private final List<GetLaunchTemplateCreditSpecification> creditSpecifications;
    /**
     * The default version of the launch template.
     * 
     */
    private final Integer defaultVersion;
    /**
     * Description of the launch template.
     * 
     */
    private final String description;
    /**
     * If `true`, enables [EC2 Instance
     * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
     * 
     */
    private final Boolean disableApiTermination;
    /**
     * If `true`, the launched EC2 instance will be EBS-optimized.
     * 
     */
    private final String ebsOptimized;
    /**
     * The elastic GPU to attach to the instance. See Elastic GPU
     * below for more details.
     * 
     */
    private final List<GetLaunchTemplateElasticGpuSpecification> elasticGpuSpecifications;
    /**
     * The enclave options of the Instance.
     * 
     */
    private final List<GetLaunchTemplateEnclaveOption> enclaveOptions;
    private final @Nullable List<GetLaunchTemplateFilter> filters;
    /**
     * The hibernation options for the instance.
     * 
     */
    private final List<GetLaunchTemplateHibernationOption> hibernationOptions;
    /**
     * The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     * 
     */
    private final List<GetLaunchTemplateIamInstanceProfile> iamInstanceProfiles;
    /**
     * The ID of the launch template.
     * 
     */
    private final String id;
    /**
     * The AMI from which to launch the instance.
     * 
     */
    private final String imageId;
    /**
     * Shutdown behavior for the instance. Can be `stop` or `terminate`.
     * (Default: `stop`).
     * 
     */
    private final String instanceInitiatedShutdownBehavior;
    /**
     * The market (purchasing) option for the instance.
     * below for details.
     * 
     */
    private final List<GetLaunchTemplateInstanceMarketOption> instanceMarketOptions;
    /**
     * The type of the instance.
     * 
     */
    private final String instanceType;
    /**
     * The kernel ID.
     * 
     */
    private final String kernelId;
    /**
     * The key name to use for the instance.
     * 
     */
    private final String keyName;
    /**
     * The latest version of the launch template.
     * 
     */
    private final Integer latestVersion;
    /**
     * The metadata options for the instance.
     * 
     */
    private final List<GetLaunchTemplateMetadataOption> metadataOptions;
    /**
     * The monitoring option for the instance.
     * 
     */
    private final List<GetLaunchTemplateMonitoring> monitorings;
    private final @Nullable String name;
    /**
     * Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     * 
     */
    private final List<GetLaunchTemplateNetworkInterface> networkInterfaces;
    /**
     * The placement of the instance.
     * 
     */
    private final List<GetLaunchTemplatePlacement> placements;
    /**
     * The ID of the RAM disk.
     * 
     */
    private final String ramDiskId;
    /**
     * A list of security group names to associate with. If you are creating Instances in a VPC, use
     * `vpc_security_group_ids` instead.
     * 
     */
    private final List<String> securityGroupNames;
    /**
     * The tags to apply to the resources during launch.
     * 
     */
    private final List<GetLaunchTemplateTagSpecification> tagSpecifications;
    /**
     * (Optional) A map of tags to assign to the launch template.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The Base64-encoded user data to provide when launching the instance.
     * 
     */
    private final String userData;
    /**
     * A list of security group IDs to associate with.
     * 
     */
    private final List<String> vpcSecurityGroupIds;

    @OutputCustomType.Constructor({"arn","blockDeviceMappings","creditSpecifications","defaultVersion","description","disableApiTermination","ebsOptimized","elasticGpuSpecifications","enclaveOptions","filters","hibernationOptions","iamInstanceProfiles","id","imageId","instanceInitiatedShutdownBehavior","instanceMarketOptions","instanceType","kernelId","keyName","latestVersion","metadataOptions","monitorings","name","networkInterfaces","placements","ramDiskId","securityGroupNames","tagSpecifications","tags","userData","vpcSecurityGroupIds"})
    private GetLaunchTemplateResult(
        String arn,
        List<GetLaunchTemplateBlockDeviceMapping> blockDeviceMappings,
        List<GetLaunchTemplateCreditSpecification> creditSpecifications,
        Integer defaultVersion,
        String description,
        Boolean disableApiTermination,
        String ebsOptimized,
        List<GetLaunchTemplateElasticGpuSpecification> elasticGpuSpecifications,
        List<GetLaunchTemplateEnclaveOption> enclaveOptions,
        @Nullable List<GetLaunchTemplateFilter> filters,
        List<GetLaunchTemplateHibernationOption> hibernationOptions,
        List<GetLaunchTemplateIamInstanceProfile> iamInstanceProfiles,
        String id,
        String imageId,
        String instanceInitiatedShutdownBehavior,
        List<GetLaunchTemplateInstanceMarketOption> instanceMarketOptions,
        String instanceType,
        String kernelId,
        String keyName,
        Integer latestVersion,
        List<GetLaunchTemplateMetadataOption> metadataOptions,
        List<GetLaunchTemplateMonitoring> monitorings,
        @Nullable String name,
        List<GetLaunchTemplateNetworkInterface> networkInterfaces,
        List<GetLaunchTemplatePlacement> placements,
        String ramDiskId,
        List<String> securityGroupNames,
        List<GetLaunchTemplateTagSpecification> tagSpecifications,
        Map<String,String> tags,
        String userData,
        List<String> vpcSecurityGroupIds) {
        this.arn = arn;
        this.blockDeviceMappings = blockDeviceMappings;
        this.creditSpecifications = creditSpecifications;
        this.defaultVersion = defaultVersion;
        this.description = description;
        this.disableApiTermination = disableApiTermination;
        this.ebsOptimized = ebsOptimized;
        this.elasticGpuSpecifications = elasticGpuSpecifications;
        this.enclaveOptions = enclaveOptions;
        this.filters = filters;
        this.hibernationOptions = hibernationOptions;
        this.iamInstanceProfiles = iamInstanceProfiles;
        this.id = id;
        this.imageId = imageId;
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        this.instanceMarketOptions = instanceMarketOptions;
        this.instanceType = instanceType;
        this.kernelId = kernelId;
        this.keyName = keyName;
        this.latestVersion = latestVersion;
        this.metadataOptions = metadataOptions;
        this.monitorings = monitorings;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.placements = placements;
        this.ramDiskId = ramDiskId;
        this.securityGroupNames = securityGroupNames;
        this.tagSpecifications = tagSpecifications;
        this.tags = tags;
        this.userData = userData;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    /**
     * Amazon Resource Name (ARN) of the launch template.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Specify volumes to attach to the instance besides the volumes specified by the AMI.
     * 
    */
    public List<GetLaunchTemplateBlockDeviceMapping> getBlockDeviceMappings() {
        return this.blockDeviceMappings;
    }
    /**
     * Customize the credit specification of the instance. See Credit
     * Specification below for more details.
     * 
    */
    public List<GetLaunchTemplateCreditSpecification> getCreditSpecifications() {
        return this.creditSpecifications;
    }
    /**
     * The default version of the launch template.
     * 
    */
    public Integer getDefaultVersion() {
        return this.defaultVersion;
    }
    /**
     * Description of the launch template.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * If `true`, enables [EC2 Instance
     * Termination Protection](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#Using_ChangingDisableAPITermination)
     * 
    */
    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }
    /**
     * If `true`, the launched EC2 instance will be EBS-optimized.
     * 
    */
    public String getEbsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * The elastic GPU to attach to the instance. See Elastic GPU
     * below for more details.
     * 
    */
    public List<GetLaunchTemplateElasticGpuSpecification> getElasticGpuSpecifications() {
        return this.elasticGpuSpecifications;
    }
    /**
     * The enclave options of the Instance.
     * 
    */
    public List<GetLaunchTemplateEnclaveOption> getEnclaveOptions() {
        return this.enclaveOptions;
    }
    public List<GetLaunchTemplateFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The hibernation options for the instance.
     * 
    */
    public List<GetLaunchTemplateHibernationOption> getHibernationOptions() {
        return this.hibernationOptions;
    }
    /**
     * The IAM Instance Profile to launch the instance with. See Instance Profile
     * below for more details.
     * 
    */
    public List<GetLaunchTemplateIamInstanceProfile> getIamInstanceProfiles() {
        return this.iamInstanceProfiles;
    }
    /**
     * The ID of the launch template.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The AMI from which to launch the instance.
     * 
    */
    public String getImageId() {
        return this.imageId;
    }
    /**
     * Shutdown behavior for the instance. Can be `stop` or `terminate`.
     * (Default: `stop`).
     * 
    */
    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }
    /**
     * The market (purchasing) option for the instance.
     * below for details.
     * 
    */
    public List<GetLaunchTemplateInstanceMarketOption> getInstanceMarketOptions() {
        return this.instanceMarketOptions;
    }
    /**
     * The type of the instance.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The kernel ID.
     * 
    */
    public String getKernelId() {
        return this.kernelId;
    }
    /**
     * The key name to use for the instance.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The latest version of the launch template.
     * 
    */
    public Integer getLatestVersion() {
        return this.latestVersion;
    }
    /**
     * The metadata options for the instance.
     * 
    */
    public List<GetLaunchTemplateMetadataOption> getMetadataOptions() {
        return this.metadataOptions;
    }
    /**
     * The monitoring option for the instance.
     * 
    */
    public List<GetLaunchTemplateMonitoring> getMonitorings() {
        return this.monitorings;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Customize network interfaces to be attached at instance boot time. See Network
     * Interfaces below for more details.
     * 
    */
    public List<GetLaunchTemplateNetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * The placement of the instance.
     * 
    */
    public List<GetLaunchTemplatePlacement> getPlacements() {
        return this.placements;
    }
    /**
     * The ID of the RAM disk.
     * 
    */
    public String getRamDiskId() {
        return this.ramDiskId;
    }
    /**
     * A list of security group names to associate with. If you are creating Instances in a VPC, use
     * `vpc_security_group_ids` instead.
     * 
    */
    public List<String> getSecurityGroupNames() {
        return this.securityGroupNames;
    }
    /**
     * The tags to apply to the resources during launch.
     * 
    */
    public List<GetLaunchTemplateTagSpecification> getTagSpecifications() {
        return this.tagSpecifications;
    }
    /**
     * (Optional) A map of tags to assign to the launch template.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The Base64-encoded user data to provide when launching the instance.
     * 
    */
    public String getUserData() {
        return this.userData;
    }
    /**
     * A list of security group IDs to associate with.
     * 
    */
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetLaunchTemplateBlockDeviceMapping> blockDeviceMappings;
        private List<GetLaunchTemplateCreditSpecification> creditSpecifications;
        private Integer defaultVersion;
        private String description;
        private Boolean disableApiTermination;
        private String ebsOptimized;
        private List<GetLaunchTemplateElasticGpuSpecification> elasticGpuSpecifications;
        private List<GetLaunchTemplateEnclaveOption> enclaveOptions;
        private @Nullable List<GetLaunchTemplateFilter> filters;
        private List<GetLaunchTemplateHibernationOption> hibernationOptions;
        private List<GetLaunchTemplateIamInstanceProfile> iamInstanceProfiles;
        private String id;
        private String imageId;
        private String instanceInitiatedShutdownBehavior;
        private List<GetLaunchTemplateInstanceMarketOption> instanceMarketOptions;
        private String instanceType;
        private String kernelId;
        private String keyName;
        private Integer latestVersion;
        private List<GetLaunchTemplateMetadataOption> metadataOptions;
        private List<GetLaunchTemplateMonitoring> monitorings;
        private @Nullable String name;
        private List<GetLaunchTemplateNetworkInterface> networkInterfaces;
        private List<GetLaunchTemplatePlacement> placements;
        private String ramDiskId;
        private List<String> securityGroupNames;
        private List<GetLaunchTemplateTagSpecification> tagSpecifications;
        private Map<String,String> tags;
        private String userData;
        private List<String> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.blockDeviceMappings = defaults.blockDeviceMappings;
    	      this.creditSpecifications = defaults.creditSpecifications;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.description = defaults.description;
    	      this.disableApiTermination = defaults.disableApiTermination;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.elasticGpuSpecifications = defaults.elasticGpuSpecifications;
    	      this.enclaveOptions = defaults.enclaveOptions;
    	      this.filters = defaults.filters;
    	      this.hibernationOptions = defaults.hibernationOptions;
    	      this.iamInstanceProfiles = defaults.iamInstanceProfiles;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.instanceInitiatedShutdownBehavior = defaults.instanceInitiatedShutdownBehavior;
    	      this.instanceMarketOptions = defaults.instanceMarketOptions;
    	      this.instanceType = defaults.instanceType;
    	      this.kernelId = defaults.kernelId;
    	      this.keyName = defaults.keyName;
    	      this.latestVersion = defaults.latestVersion;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.monitorings = defaults.monitorings;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.placements = defaults.placements;
    	      this.ramDiskId = defaults.ramDiskId;
    	      this.securityGroupNames = defaults.securityGroupNames;
    	      this.tagSpecifications = defaults.tagSpecifications;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setBlockDeviceMappings(List<GetLaunchTemplateBlockDeviceMapping> blockDeviceMappings) {
            this.blockDeviceMappings = Objects.requireNonNull(blockDeviceMappings);
            return this;
        }

        public Builder setCreditSpecifications(List<GetLaunchTemplateCreditSpecification> creditSpecifications) {
            this.creditSpecifications = Objects.requireNonNull(creditSpecifications);
            return this;
        }

        public Builder setDefaultVersion(Integer defaultVersion) {
            this.defaultVersion = Objects.requireNonNull(defaultVersion);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisableApiTermination(Boolean disableApiTermination) {
            this.disableApiTermination = Objects.requireNonNull(disableApiTermination);
            return this;
        }

        public Builder setEbsOptimized(String ebsOptimized) {
            this.ebsOptimized = Objects.requireNonNull(ebsOptimized);
            return this;
        }

        public Builder setElasticGpuSpecifications(List<GetLaunchTemplateElasticGpuSpecification> elasticGpuSpecifications) {
            this.elasticGpuSpecifications = Objects.requireNonNull(elasticGpuSpecifications);
            return this;
        }

        public Builder setEnclaveOptions(List<GetLaunchTemplateEnclaveOption> enclaveOptions) {
            this.enclaveOptions = Objects.requireNonNull(enclaveOptions);
            return this;
        }

        public Builder setFilters(@Nullable List<GetLaunchTemplateFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setHibernationOptions(List<GetLaunchTemplateHibernationOption> hibernationOptions) {
            this.hibernationOptions = Objects.requireNonNull(hibernationOptions);
            return this;
        }

        public Builder setIamInstanceProfiles(List<GetLaunchTemplateIamInstanceProfile> iamInstanceProfiles) {
            this.iamInstanceProfiles = Objects.requireNonNull(iamInstanceProfiles);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
            this.instanceInitiatedShutdownBehavior = Objects.requireNonNull(instanceInitiatedShutdownBehavior);
            return this;
        }

        public Builder setInstanceMarketOptions(List<GetLaunchTemplateInstanceMarketOption> instanceMarketOptions) {
            this.instanceMarketOptions = Objects.requireNonNull(instanceMarketOptions);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setKernelId(String kernelId) {
            this.kernelId = Objects.requireNonNull(kernelId);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setLatestVersion(Integer latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }

        public Builder setMetadataOptions(List<GetLaunchTemplateMetadataOption> metadataOptions) {
            this.metadataOptions = Objects.requireNonNull(metadataOptions);
            return this;
        }

        public Builder setMonitorings(List<GetLaunchTemplateMonitoring> monitorings) {
            this.monitorings = Objects.requireNonNull(monitorings);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkInterfaces(List<GetLaunchTemplateNetworkInterface> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setPlacements(List<GetLaunchTemplatePlacement> placements) {
            this.placements = Objects.requireNonNull(placements);
            return this;
        }

        public Builder setRamDiskId(String ramDiskId) {
            this.ramDiskId = Objects.requireNonNull(ramDiskId);
            return this;
        }

        public Builder setSecurityGroupNames(List<String> securityGroupNames) {
            this.securityGroupNames = Objects.requireNonNull(securityGroupNames);
            return this;
        }

        public Builder setTagSpecifications(List<GetLaunchTemplateTagSpecification> tagSpecifications) {
            this.tagSpecifications = Objects.requireNonNull(tagSpecifications);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setUserData(String userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }

        public Builder setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }
        public GetLaunchTemplateResult build() {
            return new GetLaunchTemplateResult(arn, blockDeviceMappings, creditSpecifications, defaultVersion, description, disableApiTermination, ebsOptimized, elasticGpuSpecifications, enclaveOptions, filters, hibernationOptions, iamInstanceProfiles, id, imageId, instanceInitiatedShutdownBehavior, instanceMarketOptions, instanceType, kernelId, keyName, latestVersion, metadataOptions, monitorings, name, networkInterfaces, placements, ramDiskId, securityGroupNames, tagSpecifications, tags, userData, vpcSecurityGroupIds);
        }
    }
}
