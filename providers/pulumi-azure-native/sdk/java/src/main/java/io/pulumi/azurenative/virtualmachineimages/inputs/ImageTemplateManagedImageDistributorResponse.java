// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Distribute as a Managed Disk Image.
 * 
 */
public final class ImageTemplateManagedImageDistributorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateManagedImageDistributorResponse Empty = new ImageTemplateManagedImageDistributorResponse();

    /**
     * Tags that will be applied to the artifact once it has been created/updated by the distributor.
     * 
     */
    @InputImport(name="artifactTags")
      private final @Nullable Map<String,String> artifactTags;

    public Map<String,String> getArtifactTags() {
        return this.artifactTags == null ? Map.of() : this.artifactTags;
    }

    /**
     * Resource Id of the Managed Disk Image
     * 
     */
    @InputImport(name="imageId", required=true)
      private final String imageId;

    public String getImageId() {
        return this.imageId;
    }

    /**
     * Azure location for the image, should match if image already exists
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The name to be used for the associated RunOutput.
     * 
     */
    @InputImport(name="runOutputName", required=true)
      private final String runOutputName;

    public String getRunOutputName() {
        return this.runOutputName;
    }

    /**
     * Type of distribution.
     * Expected value is 'ManagedImage'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ImageTemplateManagedImageDistributorResponse(
        @Nullable Map<String,String> artifactTags,
        String imageId,
        String location,
        String runOutputName,
        String type) {
        this.artifactTags = artifactTags;
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.runOutputName = Objects.requireNonNull(runOutputName, "expected parameter 'runOutputName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ImageTemplateManagedImageDistributorResponse() {
        this.artifactTags = Map.of();
        this.imageId = null;
        this.location = null;
        this.runOutputName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateManagedImageDistributorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> artifactTags;
        private String imageId;
        private String location;
        private String runOutputName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateManagedImageDistributorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactTags = defaults.artifactTags;
    	      this.imageId = defaults.imageId;
    	      this.location = defaults.location;
    	      this.runOutputName = defaults.runOutputName;
    	      this.type = defaults.type;
        }

        public Builder artifactTags(@Nullable Map<String,String> artifactTags) {
            this.artifactTags = artifactTags;
            return this;
        }

        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder runOutputName(String runOutputName) {
            this.runOutputName = Objects.requireNonNull(runOutputName);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ImageTemplateManagedImageDistributorResponse build() {
            return new ImageTemplateManagedImageDistributorResponse(artifactTags, imageId, location, runOutputName, type);
        }
    }
}
