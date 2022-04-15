// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionInstanceGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionInstanceGroupArgs Empty = new GetRegionInstanceGroupArgs();

    /**
     * The name of the instance group.  One of `name` or `self_link` must be provided.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If `self_link` is provided, this value is ignored.  If neither `self_link`
     * nor `project` are provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The region in which the resource belongs.  If `self_link`
     * is provided, this value is ignored.  If neither `self_link` nor `region` are
     * provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> region() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * The link to the instance group.  One of `name` or `self_link` must be provided.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable String selfLink;

    public Optional<String> selfLink() {
        return this.selfLink == null ? Optional.empty() : Optional.ofNullable(this.selfLink);
    }

    public GetRegionInstanceGroupArgs(
        @Nullable String name,
        @Nullable String project,
        @Nullable String region,
        @Nullable String selfLink) {
        this.name = name;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    private GetRegionInstanceGroupArgs() {
        this.name = null;
        this.project = null;
        this.region = null;
        this.selfLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupArgs defaults) {
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

        public Builder(GetRegionInstanceGroupArgs defaults) {
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
        }        public GetRegionInstanceGroupArgs build() {
            return new GetRegionInstanceGroupArgs(name, project, region, selfLink);
        }
    }
}
