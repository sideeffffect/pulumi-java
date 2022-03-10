// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubnetworkArgs Empty = new GetSubnetworkArgs();

    /**
     * The name of the subnetwork. One of `name` or `self_link`
     * must be specified.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The region this subnetwork has been created in. If
     * unspecified, this defaults to the region configured in the provider.
     * 
     */
    @InputImport(name="region")
      private final @Nullable String region;

    public Optional<String> getRegion() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * The self link of the subnetwork. If `self_link` is
     * specified, `name`, `project`, and `region` are ignored.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable String selfLink;

    public Optional<String> getSelfLink() {
        return this.selfLink == null ? Optional.empty() : Optional.ofNullable(this.selfLink);
    }

    public GetSubnetworkArgs(
        @Nullable String name,
        @Nullable String project,
        @Nullable String region,
        @Nullable String selfLink) {
        this.name = name;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    private GetSubnetworkArgs() {
        this.name = null;
        this.project = null;
        this.region = null;
        this.selfLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String project;
        private @Nullable String region;
        private @Nullable String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public GetSubnetworkArgs build() {
            return new GetSubnetworkArgs(name, project, region, selfLink);
        }
    }
}
