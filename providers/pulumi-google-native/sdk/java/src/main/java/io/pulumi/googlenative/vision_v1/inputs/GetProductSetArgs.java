// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProductSetArgs Empty = new GetProductSetArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="productSetId", required=true)
      private final String productSetId;

    public String getProductSetId() {
        return this.productSetId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetProductSetArgs(
        String location,
        String productSetId,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.productSetId = Objects.requireNonNull(productSetId, "expected parameter 'productSetId' to be non-null");
        this.project = project;
    }

    private GetProductSetArgs() {
        this.location = null;
        this.productSetId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String productSetId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.productSetId = defaults.productSetId;
    	      this.project = defaults.project;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder productSetId(String productSetId) {
            this.productSetId = Objects.requireNonNull(productSetId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetProductSetArgs build() {
            return new GetProductSetArgs(location, productSetId, project);
        }
    }
}
