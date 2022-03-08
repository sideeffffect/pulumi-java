// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.azurenative.containerregistry.outputs.TokenCredentialsPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTokenResult {
    /**
     * The creation date of scope map.
     * 
     */
    private final String creationDate;
    /**
     * The credentials that can be used for authenticating the token.
     * 
     */
    private final @Nullable TokenCredentialsPropertiesResponse credentials;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource ID of the scope map to which the token will be associated with.
     * 
     */
    private final @Nullable String scopeMapId;
    /**
     * The status of the token example enabled or disabled.
     * 
     */
    private final @Nullable String status;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"creationDate","credentials","id","name","provisioningState","scopeMapId","status","systemData","type"})
    private GetTokenResult(
        String creationDate,
        @Nullable TokenCredentialsPropertiesResponse credentials,
        String id,
        String name,
        String provisioningState,
        @Nullable String scopeMapId,
        @Nullable String status,
        SystemDataResponse systemData,
        String type) {
        this.creationDate = creationDate;
        this.credentials = credentials;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.scopeMapId = scopeMapId;
        this.status = status;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The creation date of scope map.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The credentials that can be used for authenticating the token.
     * 
    */
    public Optional<TokenCredentialsPropertiesResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource ID of the scope map to which the token will be associated with.
     * 
    */
    public Optional<String> getScopeMapId() {
        return Optional.ofNullable(this.scopeMapId);
    }
    /**
     * The status of the token example enabled or disabled.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationDate;
        private @Nullable TokenCredentialsPropertiesResponse credentials;
        private String id;
        private String name;
        private String provisioningState;
        private @Nullable String scopeMapId;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scopeMapId = defaults.scopeMapId;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setCredentials(@Nullable TokenCredentialsPropertiesResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setScopeMapId(@Nullable String scopeMapId) {
            this.scopeMapId = scopeMapId;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTokenResult build() {
            return new GetTokenResult(creationDate, credentials, id, name, provisioningState, scopeMapId, status, systemData, type);
        }
    }
}
