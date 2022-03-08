// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointSourceMetadataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestorePointResponse {
    /**
     * Gets the consistency mode for the restore point. Please refer to https://aka.ms/RestorePoints for more details.
     * 
     */
    private final String consistencyMode;
    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    private final @Nullable List<ApiEntityReferenceResponse> excludeDisks;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Gets the provisioning state of the restore point.
     * 
     */
    private final String provisioningState;
    /**
     * Gets the details of the VM captured at the time of the restore point creation.
     * 
     */
    private final RestorePointSourceMetadataResponse sourceMetadata;
    /**
     * Gets the creation time of the restore point.
     * 
     */
    private final @Nullable String timeCreated;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"consistencyMode","excludeDisks","id","name","provisioningState","sourceMetadata","timeCreated","type"})
    private RestorePointResponse(
        String consistencyMode,
        @Nullable List<ApiEntityReferenceResponse> excludeDisks,
        String id,
        String name,
        String provisioningState,
        RestorePointSourceMetadataResponse sourceMetadata,
        @Nullable String timeCreated,
        String type) {
        this.consistencyMode = consistencyMode;
        this.excludeDisks = excludeDisks;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sourceMetadata = sourceMetadata;
        this.timeCreated = timeCreated;
        this.type = type;
    }

    /**
     * Gets the consistency mode for the restore point. Please refer to https://aka.ms/RestorePoints for more details.
     * 
    */
    public String getConsistencyMode() {
        return this.consistencyMode;
    }
    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
    */
    public List<ApiEntityReferenceResponse> getExcludeDisks() {
        return this.excludeDisks == null ? List.of() : this.excludeDisks;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the provisioning state of the restore point.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets the details of the VM captured at the time of the restore point creation.
     * 
    */
    public RestorePointSourceMetadataResponse getSourceMetadata() {
        return this.sourceMetadata;
    }
    /**
     * Gets the creation time of the restore point.
     * 
    */
    public Optional<String> getTimeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consistencyMode;
        private @Nullable List<ApiEntityReferenceResponse> excludeDisks;
        private String id;
        private String name;
        private String provisioningState;
        private RestorePointSourceMetadataResponse sourceMetadata;
        private @Nullable String timeCreated;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consistencyMode = defaults.consistencyMode;
    	      this.excludeDisks = defaults.excludeDisks;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceMetadata = defaults.sourceMetadata;
    	      this.timeCreated = defaults.timeCreated;
    	      this.type = defaults.type;
        }

        public Builder setConsistencyMode(String consistencyMode) {
            this.consistencyMode = Objects.requireNonNull(consistencyMode);
            return this;
        }

        public Builder setExcludeDisks(@Nullable List<ApiEntityReferenceResponse> excludeDisks) {
            this.excludeDisks = excludeDisks;
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

        public Builder setSourceMetadata(RestorePointSourceMetadataResponse sourceMetadata) {
            this.sourceMetadata = Objects.requireNonNull(sourceMetadata);
            return this;
        }

        public Builder setTimeCreated(@Nullable String timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RestorePointResponse build() {
            return new RestorePointResponse(consistencyMode, excludeDisks, id, name, provisioningState, sourceMetadata, timeCreated, type);
        }
    }
}
