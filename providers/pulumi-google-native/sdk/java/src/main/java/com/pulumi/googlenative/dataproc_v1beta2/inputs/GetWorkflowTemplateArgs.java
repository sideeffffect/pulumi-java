// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkflowTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkflowTemplateArgs Empty = new GetWorkflowTemplateArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    @Import(name="workflowTemplateId", required=true)
      private final String workflowTemplateId;

    public String workflowTemplateId() {
        return this.workflowTemplateId;
    }

    public GetWorkflowTemplateArgs(
        String location,
        @Nullable String project,
        @Nullable String version,
        String workflowTemplateId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.version = version;
        this.workflowTemplateId = Objects.requireNonNull(workflowTemplateId, "expected parameter 'workflowTemplateId' to be non-null");
    }

    private GetWorkflowTemplateArgs() {
        this.location = null;
        this.project = null;
        this.version = null;
        this.workflowTemplateId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private @Nullable String version;
        private String workflowTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.version = defaults.version;
    	      this.workflowTemplateId = defaults.workflowTemplateId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public Builder workflowTemplateId(String workflowTemplateId) {
            this.workflowTemplateId = Objects.requireNonNull(workflowTemplateId);
            return this;
        }        public GetWorkflowTemplateArgs build() {
            return new GetWorkflowTemplateArgs(location, project, version, workflowTemplateId);
        }
    }
}
