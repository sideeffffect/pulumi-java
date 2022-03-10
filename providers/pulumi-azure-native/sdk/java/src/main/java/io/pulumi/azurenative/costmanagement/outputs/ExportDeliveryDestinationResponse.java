// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExportDeliveryDestinationResponse {
    /**
     * The name of the container where exports will be uploaded.
     * 
     */
    private final String container;
    /**
     * The resource id of the storage account where exports will be delivered.
     * 
     */
    private final String resourceId;
    /**
     * The name of the directory where exports will be uploaded.
     * 
     */
    private final @Nullable String rootFolderPath;

    @OutputCustomType.Constructor
    private ExportDeliveryDestinationResponse(
        @OutputCustomType.Parameter("container") String container,
        @OutputCustomType.Parameter("resourceId") String resourceId,
        @OutputCustomType.Parameter("rootFolderPath") @Nullable String rootFolderPath) {
        this.container = container;
        this.resourceId = resourceId;
        this.rootFolderPath = rootFolderPath;
    }

    /**
     * The name of the container where exports will be uploaded.
     * 
    */
    public String getContainer() {
        return this.container;
    }
    /**
     * The resource id of the storage account where exports will be delivered.
     * 
    */
    public String getResourceId() {
        return this.resourceId;
    }
    /**
     * The name of the directory where exports will be uploaded.
     * 
    */
    public Optional<String> getRootFolderPath() {
        return Optional.ofNullable(this.rootFolderPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDeliveryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String resourceId;
        private @Nullable String rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDeliveryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder rootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }
        public ExportDeliveryDestinationResponse build() {
            return new ExportDeliveryDestinationResponse(container, resourceId, rootFolderPath);
        }
    }
}
