// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualNetworkResponse {
    /**
     * can be used in vm creation/deletion
     * 
     */
    private final Boolean assignable;
    /**
     * virtual network id (privateCloudId:vsphereId)
     * 
     */
    private final String id;
    /**
     * Azure region
     * 
     */
    private final String location;
    /**
     * {VirtualNetworkName}
     * 
     */
    private final String name;
    /**
     * The Private Cloud id
     * 
     */
    private final String privateCloudId;
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private VirtualNetworkResponse(
        @OutputCustomType.Parameter("assignable") Boolean assignable,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateCloudId") String privateCloudId,
        @OutputCustomType.Parameter("type") String type) {
        this.assignable = assignable;
        this.id = id;
        this.location = location;
        this.name = name;
        this.privateCloudId = privateCloudId;
        this.type = type;
    }

    /**
     * can be used in vm creation/deletion
     * 
    */
    public Boolean getAssignable() {
        return this.assignable;
    }
    /**
     * virtual network id (privateCloudId:vsphereId)
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure region
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * {VirtualNetworkName}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Private Cloud id
     * 
    */
    public String getPrivateCloudId() {
        return this.privateCloudId;
    }
    /**
     * {resourceProviderNamespace}/{resourceType}
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean assignable;
        private String id;
        private String location;
        private String name;
        private String privateCloudId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignable = defaults.assignable;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateCloudId = defaults.privateCloudId;
    	      this.type = defaults.type;
        }

        public Builder assignable(Boolean assignable) {
            this.assignable = Objects.requireNonNull(assignable);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateCloudId(String privateCloudId) {
            this.privateCloudId = Objects.requireNonNull(privateCloudId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public VirtualNetworkResponse build() {
            return new VirtualNetworkResponse(assignable, id, location, name, privateCloudId, type);
        }
    }
}
