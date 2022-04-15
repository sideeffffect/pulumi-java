// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * A map of default run properties for this workflow. These properties are passed to all jobs associated to the workflow.
     * 
     */
    @Import(name="defaultRunProperties")
      private final @Nullable Output<Map<String,Object>> defaultRunProperties;

    public Output<Map<String,Object>> defaultRunProperties() {
        return this.defaultRunProperties == null ? Codegen.empty() : this.defaultRunProperties;
    }

    /**
     * Description of the workflow.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Prevents exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
     * 
     */
    @Import(name="maxConcurrentRuns")
      private final @Nullable Output<Integer> maxConcurrentRuns;

    public Output<Integer> maxConcurrentRuns() {
        return this.maxConcurrentRuns == null ? Codegen.empty() : this.maxConcurrentRuns;
    }

    /**
     * The name you assign to this workflow.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public WorkflowArgs(
        @Nullable Output<Map<String,Object>> defaultRunProperties,
        @Nullable Output<String> description,
        @Nullable Output<Integer> maxConcurrentRuns,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.defaultRunProperties = defaultRunProperties;
        this.description = description;
        this.maxConcurrentRuns = maxConcurrentRuns;
        this.name = name;
        this.tags = tags;
    }

    private WorkflowArgs() {
        this.defaultRunProperties = Codegen.empty();
        this.description = Codegen.empty();
        this.maxConcurrentRuns = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> defaultRunProperties;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> maxConcurrentRuns;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRunProperties = defaults.defaultRunProperties;
    	      this.description = defaults.description;
    	      this.maxConcurrentRuns = defaults.maxConcurrentRuns;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder defaultRunProperties(@Nullable Output<Map<String,Object>> defaultRunProperties) {
            this.defaultRunProperties = defaultRunProperties;
            return this;
        }
        public Builder defaultRunProperties(@Nullable Map<String,Object> defaultRunProperties) {
            this.defaultRunProperties = Codegen.ofNullable(defaultRunProperties);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder maxConcurrentRuns(@Nullable Output<Integer> maxConcurrentRuns) {
            this.maxConcurrentRuns = maxConcurrentRuns;
            return this;
        }
        public Builder maxConcurrentRuns(@Nullable Integer maxConcurrentRuns) {
            this.maxConcurrentRuns = Codegen.ofNullable(maxConcurrentRuns);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public WorkflowArgs build() {
            return new WorkflowArgs(defaultRunProperties, description, maxConcurrentRuns, name, tags);
        }
    }
}
