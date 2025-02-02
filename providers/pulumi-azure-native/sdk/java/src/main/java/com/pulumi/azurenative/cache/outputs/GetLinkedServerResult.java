// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLinkedServerResult {
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Fully qualified resourceId of the linked redis cache.
     * 
     */
    private final String linkedRedisCacheId;
    /**
     * @return Location of the linked redis cache.
     * 
     */
    private final String linkedRedisCacheLocation;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Terminal state of the link between primary and secondary redis cache.
     * 
     */
    private final String provisioningState;
    /**
     * @return Role of the linked server.
     * 
     */
    private final String serverRole;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLinkedServerResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedRedisCacheId") String linkedRedisCacheId,
        @CustomType.Parameter("linkedRedisCacheLocation") String linkedRedisCacheLocation,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serverRole") String serverRole,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.linkedRedisCacheId = linkedRedisCacheId;
        this.linkedRedisCacheLocation = linkedRedisCacheLocation;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serverRole = serverRole;
        this.type = type;
    }

    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Fully qualified resourceId of the linked redis cache.
     * 
     */
    public String linkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }
    /**
     * @return Location of the linked redis cache.
     * 
     */
    public String linkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Terminal state of the link between primary and secondary redis cache.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Role of the linked server.
     * 
     */
    public String serverRole() {
        return this.serverRole;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String linkedRedisCacheId;
        private String linkedRedisCacheLocation;
        private String name;
        private String provisioningState;
        private String serverRole;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkedRedisCacheId = defaults.linkedRedisCacheId;
    	      this.linkedRedisCacheLocation = defaults.linkedRedisCacheLocation;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serverRole = defaults.serverRole;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder linkedRedisCacheId(String linkedRedisCacheId) {
            this.linkedRedisCacheId = Objects.requireNonNull(linkedRedisCacheId);
            return this;
        }
        public Builder linkedRedisCacheLocation(String linkedRedisCacheLocation) {
            this.linkedRedisCacheLocation = Objects.requireNonNull(linkedRedisCacheLocation);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder serverRole(String serverRole) {
            this.serverRole = Objects.requireNonNull(serverRole);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLinkedServerResult build() {
            return new GetLinkedServerResult(id, linkedRedisCacheId, linkedRedisCacheLocation, name, provisioningState, serverRole, type);
        }
    }
}
