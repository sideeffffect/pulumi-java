// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcEndpointServiceFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcEndpointServiceResult {
    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    private final Boolean acceptanceRequired;
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    private final String arn;
    /**
     * The Availability Zones in which the service is available.
     * 
     */
    private final List<String> availabilityZones;
    /**
     * The DNS names for the service.
     * 
     */
    private final List<String> baseEndpointDnsNames;
    private final @Nullable List<GetVpcEndpointServiceFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    private final Boolean managesVpcEndpoints;
    /**
     * The AWS account ID of the service owner or `amazon`.
     * 
     */
    private final String owner;
    /**
     * The private DNS name for the service.
     * 
     */
    private final String privateDnsName;
    private final @Nullable String service;
    /**
     * The ID of the endpoint service.
     * 
     */
    private final String serviceId;
    private final String serviceName;
    private final String serviceType;
    /**
     * A map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Whether or not the service supports endpoint policies - `true` or `false`.
     * 
     */
    private final Boolean vpcEndpointPolicySupported;

    @CustomType.Constructor
    private GetVpcEndpointServiceResult(
        @CustomType.Parameter("acceptanceRequired") Boolean acceptanceRequired,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("baseEndpointDnsNames") List<String> baseEndpointDnsNames,
        @CustomType.Parameter("filters") @Nullable List<GetVpcEndpointServiceFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("managesVpcEndpoints") Boolean managesVpcEndpoints,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("privateDnsName") String privateDnsName,
        @CustomType.Parameter("service") @Nullable String service,
        @CustomType.Parameter("serviceId") String serviceId,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("serviceType") String serviceType,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcEndpointPolicySupported") Boolean vpcEndpointPolicySupported) {
        this.acceptanceRequired = acceptanceRequired;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.baseEndpointDnsNames = baseEndpointDnsNames;
        this.filters = filters;
        this.id = id;
        this.managesVpcEndpoints = managesVpcEndpoints;
        this.owner = owner;
        this.privateDnsName = privateDnsName;
        this.service = service;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.tags = tags;
        this.vpcEndpointPolicySupported = vpcEndpointPolicySupported;
    }

    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
    */
    public Boolean acceptanceRequired() {
        return this.acceptanceRequired;
    }
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * The Availability Zones in which the service is available.
     * 
    */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The DNS names for the service.
     * 
    */
    public List<String> baseEndpointDnsNames() {
        return this.baseEndpointDnsNames;
    }
    public List<GetVpcEndpointServiceFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
    */
    public Boolean managesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }
    /**
     * The AWS account ID of the service owner or `amazon`.
     * 
    */
    public String owner() {
        return this.owner;
    }
    /**
     * The private DNS name for the service.
     * 
    */
    public String privateDnsName() {
        return this.privateDnsName;
    }
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * The ID of the endpoint service.
     * 
    */
    public String serviceId() {
        return this.serviceId;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public String serviceType() {
        return this.serviceType;
    }
    /**
     * A map of tags assigned to the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * Whether or not the service supports endpoint policies - `true` or `false`.
     * 
    */
    public Boolean vpcEndpointPolicySupported() {
        return this.vpcEndpointPolicySupported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean acceptanceRequired;
        private String arn;
        private List<String> availabilityZones;
        private List<String> baseEndpointDnsNames;
        private @Nullable List<GetVpcEndpointServiceFilter> filters;
        private String id;
        private Boolean managesVpcEndpoints;
        private String owner;
        private String privateDnsName;
        private @Nullable String service;
        private String serviceId;
        private String serviceName;
        private String serviceType;
        private Map<String,String> tags;
        private Boolean vpcEndpointPolicySupported;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptanceRequired = defaults.acceptanceRequired;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.baseEndpointDnsNames = defaults.baseEndpointDnsNames;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.managesVpcEndpoints = defaults.managesVpcEndpoints;
    	      this.owner = defaults.owner;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.service = defaults.service;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.tags = defaults.tags;
    	      this.vpcEndpointPolicySupported = defaults.vpcEndpointPolicySupported;
        }

        public Builder acceptanceRequired(Boolean acceptanceRequired) {
            this.acceptanceRequired = Objects.requireNonNull(acceptanceRequired);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder baseEndpointDnsNames(List<String> baseEndpointDnsNames) {
            this.baseEndpointDnsNames = Objects.requireNonNull(baseEndpointDnsNames);
            return this;
        }
        public Builder baseEndpointDnsNames(String... baseEndpointDnsNames) {
            return baseEndpointDnsNames(List.of(baseEndpointDnsNames));
        }
        public Builder filters(@Nullable List<GetVpcEndpointServiceFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcEndpointServiceFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder managesVpcEndpoints(Boolean managesVpcEndpoints) {
            this.managesVpcEndpoints = Objects.requireNonNull(managesVpcEndpoints);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder privateDnsName(String privateDnsName) {
            this.privateDnsName = Objects.requireNonNull(privateDnsName);
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
            this.vpcEndpointPolicySupported = Objects.requireNonNull(vpcEndpointPolicySupported);
            return this;
        }        public GetVpcEndpointServiceResult build() {
            return new GetVpcEndpointServiceResult(acceptanceRequired, arn, availabilityZones, baseEndpointDnsNames, filters, id, managesVpcEndpoints, owner, privateDnsName, service, serviceId, serviceName, serviceType, tags, vpcEndpointPolicySupported);
        }
    }
}
