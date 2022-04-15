// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesRecipeUpdateStepArchiveExtraction {
    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    private final String artifactId;
    /**
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    private final @Nullable String destination;
    /**
     * The type of the archive to extract.
     * Possible values are `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, and `ZIP`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GuestPoliciesRecipeUpdateStepArchiveExtraction(
        @CustomType.Parameter("artifactId") String artifactId,
        @CustomType.Parameter("destination") @Nullable String destination,
        @CustomType.Parameter("type") String type) {
        this.artifactId = artifactId;
        this.destination = destination;
        this.type = type;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
    */
    public String artifactId() {
        return this.artifactId;
    }
    /**
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
    */
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * The type of the archive to extract.
     * Possible values are `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, and `ZIP`.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStepArchiveExtraction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactId;
        private @Nullable String destination;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeUpdateStepArchiveExtraction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.destination = defaults.destination;
    	      this.type = defaults.type;
        }

        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GuestPoliciesRecipeUpdateStepArchiveExtraction build() {
            return new GuestPoliciesRecipeUpdateStepArchiveExtraction(artifactId, destination, type);
        }
    }
}
