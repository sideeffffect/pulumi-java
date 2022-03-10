// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainMappingArgs Empty = new GetDomainMappingArgs();

    @InputImport(name="domainmappingId", required=true)
      private final String domainmappingId;

    public String getDomainmappingId() {
        return this.domainmappingId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDomainMappingArgs(
        String domainmappingId,
        String location,
        @Nullable String project) {
        this.domainmappingId = Objects.requireNonNull(domainmappingId, "expected parameter 'domainmappingId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetDomainMappingArgs() {
        this.domainmappingId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainmappingId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainmappingId = defaults.domainmappingId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder domainmappingId(String domainmappingId) {
            this.domainmappingId = Objects.requireNonNull(domainmappingId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetDomainMappingArgs build() {
            return new GetDomainMappingArgs(domainmappingId, location, project);
        }
    }
}
