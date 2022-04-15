// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateArgs Empty = new GetInstanceTemplateArgs();

    /**
     * A filter to retrieve the instance templates.
     * See [gcloud topic filters](https://cloud.google.com/sdk/gcloud/reference/topic/filters) for reference.
     * If multiple instance templates match, either adjust the filter or specify `most_recent`. One of `name` or `filter` must be provided.
     * 
     */
    @Import(name="filter")
      private final @Nullable String filter;

    public Optional<String> filter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * If `filter` is provided, ensures the most recent template is returned when multiple instance templates match. One of `name` or `filter` must be provided.
     * 
     */
    @Import(name="mostRecent")
      private final @Nullable Boolean mostRecent;

    public Optional<Boolean> mostRecent() {
        return this.mostRecent == null ? Optional.empty() : Optional.ofNullable(this.mostRecent);
    }

    /**
     * The name of the instance template. One of `name` or `filter` must be provided.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If `project` is not provided, the provider project is used.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String project() {
        return this.project;
    }

    public GetInstanceTemplateArgs(
        @Nullable String filter,
        @Nullable Boolean mostRecent,
        @Nullable String name,
        String project) {
        this.filter = filter;
        this.mostRecent = mostRecent;
        this.name = name;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private GetInstanceTemplateArgs() {
        this.filter = null;
        this.mostRecent = null;
        this.name = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private @Nullable Boolean mostRecent;
        private @Nullable String name;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.mostRecent = defaults.mostRecent;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public GetInstanceTemplateArgs build() {
            return new GetInstanceTemplateArgs(filter, mostRecent, name, project);
        }
    }
}
