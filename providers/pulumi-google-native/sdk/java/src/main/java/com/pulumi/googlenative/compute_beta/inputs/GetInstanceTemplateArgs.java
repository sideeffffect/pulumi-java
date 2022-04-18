// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateArgs Empty = new GetInstanceTemplateArgs();

    @Import(name="instanceTemplate", required=true)
      private final String instanceTemplate;

    public String instanceTemplate() {
        return this.instanceTemplate;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetInstanceTemplateArgs(
        String instanceTemplate,
        @Nullable String project) {
        this.instanceTemplate = Objects.requireNonNull(instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
        this.project = project;
    }

    private GetInstanceTemplateArgs() {
        this.instanceTemplate = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceTemplate;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.project = defaults.project;
        }

        public Builder instanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetInstanceTemplateArgs build() {
            return new GetInstanceTemplateArgs(instanceTemplate, project);
        }
    }
}
