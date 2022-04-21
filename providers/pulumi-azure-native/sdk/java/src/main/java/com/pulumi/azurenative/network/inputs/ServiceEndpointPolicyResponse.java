// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ServiceEndpointPolicyDefinitionResponse;
import com.pulumi.azurenative.network.inputs.SubnetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service End point policy resource.
 * 
 */
public final class ServiceEndpointPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServiceEndpointPolicyResponse Empty = new ServiceEndpointPolicyResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Kind of service endpoint policy. This is metadata used for the Azure portal experience.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The provisioning state of the service endpoint policy resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The resource GUID property of the service endpoint policy resource.
     * 
     */
    @Import(name="resourceGuid", required=true)
    private String resourceGuid;

    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    @Import(name="serviceEndpointPolicyDefinitions")
    private @Nullable List<ServiceEndpointPolicyDefinitionResponse> serviceEndpointPolicyDefinitions;

    public Optional<List<ServiceEndpointPolicyDefinitionResponse>> serviceEndpointPolicyDefinitions() {
        return Optional.ofNullable(this.serviceEndpointPolicyDefinitions);
    }

    /**
     * A collection of references to subnets.
     * 
     */
    @Import(name="subnets", required=true)
    private List<SubnetResponse> subnets;

    public List<SubnetResponse> subnets() {
        return this.subnets;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ServiceEndpointPolicyResponse() {}

    private ServiceEndpointPolicyResponse(ServiceEndpointPolicyResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.kind = $.kind;
        this.location = $.location;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.resourceGuid = $.resourceGuid;
        this.serviceEndpointPolicyDefinitions = $.serviceEndpointPolicyDefinitions;
        this.subnets = $.subnets;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceEndpointPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceEndpointPolicyResponse $;

        public Builder() {
            $ = new ServiceEndpointPolicyResponse();
        }

        public Builder(ServiceEndpointPolicyResponse defaults) {
            $ = new ServiceEndpointPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder resourceGuid(String resourceGuid) {
            $.resourceGuid = resourceGuid;
            return this;
        }

        public Builder serviceEndpointPolicyDefinitions(@Nullable List<ServiceEndpointPolicyDefinitionResponse> serviceEndpointPolicyDefinitions) {
            $.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
            return this;
        }

        public Builder serviceEndpointPolicyDefinitions(ServiceEndpointPolicyDefinitionResponse... serviceEndpointPolicyDefinitions) {
            return serviceEndpointPolicyDefinitions(List.of(serviceEndpointPolicyDefinitions));
        }

        public Builder subnets(List<SubnetResponse> subnets) {
            $.subnets = subnets;
            return this;
        }

        public Builder subnets(SubnetResponse... subnets) {
            return subnets(List.of(subnets));
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ServiceEndpointPolicyResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.resourceGuid = Objects.requireNonNull($.resourceGuid, "expected parameter 'resourceGuid' to be non-null");
            $.subnets = Objects.requireNonNull($.subnets, "expected parameter 'subnets' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
